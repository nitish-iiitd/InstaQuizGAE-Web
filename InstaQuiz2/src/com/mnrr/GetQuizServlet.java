package com.mnrr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GetQuizServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//ArrayList<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();

		String quizcode = request.getParameter("quizcode").toString();
		String quiztitle="";
		List<EntityQuiz> quizzes = ofyService.ofy().load().type(EntityQuiz.class).list();
		EntityQuiz quiz=null;
		
		System.out.println(quizzes.size());
		
		for(int i=0;i<quizzes.size();i++)
		{
			if(quizzes.get(i).getCode().equals(quizcode))
			{
				quiztitle = quizzes.get(i).getQuiztitle();
				quiz = quizzes.get(i);
				break;
			}
		}
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
		System.out.println(selquestions.size());
		request.setAttribute("quiz",quiz);
		request.setAttribute("questions",selquestions);
		request.getRequestDispatcher("/displayQuiz.jsp").forward(request, response);
	}
}
