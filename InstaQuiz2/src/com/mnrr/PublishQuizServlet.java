package com.mnrr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class PublishQuizServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//ArrayList<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();
		//String quiztitle = request.getParameter("quiztitle");
		String quiztitle = request.getParameter("quiztitle");
		
		// creating entry in EntityStats
		EntityStats quesstat=new EntityStats(quiztitle,0,0,0,0);
		ofyService.ofy().save().entity(quesstat);
		
		
		System.out.println(quiztitle);
		EntityQuiz quiz = ofyService.ofy().load().type(EntityQuiz.class).id(quiztitle).now();		
		Random r = new Random();
		Integer code  = r.nextInt((9999 - 1000) + 1) + 1000;		
		quiz.setCode(code.toString());
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Entity e=null;
		try {
			e = datastore.get(KeyFactory.createKey("EntityQuiz", quiztitle));
		} catch (EntityNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//new Entity("EntityQuiz",quiztitle);
		e.setProperty("code",code.toString());
		datastore.put(e);
		
		
		request.setAttribute("code",code.toString());
		request.setAttribute("quiztitle",quiztitle);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
