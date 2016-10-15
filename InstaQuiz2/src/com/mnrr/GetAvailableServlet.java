package com.mnrr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GetAvailableServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//ArrayList<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();

		List<EntityQuiz> quizzes = ofyService.ofy().load().type(EntityQuiz.class).list();

		
		System.out.println(quizzes.size());
		request.setAttribute("quizzes",quizzes);
		request.getRequestDispatcher("/publish.jsp").forward(request, response);
	}
}
