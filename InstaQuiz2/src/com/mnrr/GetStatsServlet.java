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
public class GetStatsServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//ArrayList<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();
		//String quiztitle = request.getParameter("quiztitle");
		String quiztitle = request.getParameter("quiztitle");
		System.out.println(quiztitle);
		
		EntityStats stat = ofyService.ofy().load().type(EntityStats.class).id(quiztitle).now();				
		request.setAttribute("stats",stat);
		request.getRequestDispatcher("/displayResultFaculty.jsp").forward(request, response);
	}
}
