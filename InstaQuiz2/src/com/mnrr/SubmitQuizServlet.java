package com.mnrr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class SubmitQuizServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//ArrayList<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();

		String quiztitle = request.getParameter("quiztitle").toString();


		System.out.println(quiztitle);
		List<EntityQuestion> questions = ofyService.ofy().load().type(EntityQuestion.class).list();

		List<EntityQuestion> selquestions = new ArrayList<EntityQuestion>();
		for(int i=0;i<questions.size();i++)
		{
			if(questions.get(i).getQuiztitle().equals(quiztitle))
			{
				System.out.println(i);
				selquestions.add(questions.get(i));

			}
		}

		int correct=0;
		int wrong = selquestions.size();

		for(Integer i=0;i<selquestions.size();i++)
		{
			String answer = request.getParameter(i.toString()).toString();
			if(Integer.parseInt(answer) == selquestions.get(i).getAnswer())
			{
				correct++;
				wrong--;
			}
		}


		EntityStats stat = ofyService.ofy().load().type(EntityStats.class).id(quiztitle).now();		
		int totstud = stat.getTotal_students() + 1;
		float avg = (stat.getAverage()*(totstud-1) + correct)/totstud;
		int blavg = stat.getStudents_belavg();
		int abavg = stat.getStudents_abvavg();
		if(correct >= avg)
		{
			abavg++;
		}
		else
		{
			blavg++;
		}
		

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Entity e=null;
		try {
			e = datastore.get(KeyFactory.createKey("EntityStats", quiztitle));
		} catch (EntityNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//new Entity("EntityQuiz",quiztitle);
		e.setProperty("total_students",totstud);
		e.setProperty("average",avg);
		e.setProperty("students_belavg",blavg);
		e.setProperty("students_abvavg",abavg);
		datastore.put(e);



		//request.setAttribute("questions",selquestions);
		request.setAttribute("correct",correct);
		request.setAttribute("total",selquestions.size());
		request.getRequestDispatcher("/displayResultStudent.jsp").forward(request, response);
	}
}
