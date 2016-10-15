package com.mnrr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SaveQuestionServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String quiztitle = request.getParameter("quiztitle").toString();
		String question = request.getParameter("question").toString();
		String op1 = request.getParameter("op1").toString();
		String op2 = request.getParameter("op2").toString();
		String op3 = request.getParameter("op3").toString();
		String op4 = request.getParameter("op4").toString();
		String answer = request.getParameter("answer").toString();

		EntityQuiz quiz= ofyService.ofy().load().type(EntityQuiz.class).id(quiztitle).now();
		if(quiz==null)
		{
			quiz = new EntityQuiz("admin",quiztitle,"0");
			ofyService.ofy().save().entity(quiz);
		}
		EntityQuestion ques=new EntityQuestion(quiztitle, question, op1, op2,op3,op4,Integer.parseInt(answer));
		ofyService.ofy().save().entity(ques);
		request.setAttribute("quiztitle",quiztitle);
		request.getRequestDispatcher("/create.jsp").forward(request, response);
	}
}
