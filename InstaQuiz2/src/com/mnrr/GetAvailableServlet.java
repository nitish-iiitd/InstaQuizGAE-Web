package com.mnrr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

@SuppressWarnings("serial")
public class GetAvailableServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//ArrayList<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();

		//List<EntityQuiz> quizzes = new ArrayList<EntityQuiz>();
		List<EntityQuiz> quizzes = ofyService.ofy().load().type(EntityQuiz.class).list();
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Filter propertyFilter =	new FilterPredicate("code", FilterOperator.GREATER_THAN, 0);
		Query q = new Query("EntityQuiz").setFilter(propertyFilter);
		List<Entity> results = datastore.prepare(q.setKeysOnly()).asList(FetchOptions.Builder.withDefaults());

		System.out.println("results:"+results.size());
		
//		for(int i=0;i<results.size();i++)
//		{
//			System.out.println(results.get(i).getKind());
//			String quiztitle = results.get(i).getProperty("quiztitle").toString();
//			String username = results.get(i).getProperty("username").toString();
//			String code = results.get(i).getProperty("code").toString();
//			EntityQuiz quiz = new EntityQuiz(																				username,quiztitle,code);
//			quizzes.add(quiz);
//		}
//		
//		for (Entity entity : results)
//		{
//			quizzes.add(new EntityQuiz(entity));
//		}
		
		System.out.println("quizzes:"+quizzes.size());
		
		request.setAttribute("quizzes",quizzes);
		request.getRequestDispatcher("/publish.jsp").forward(request, response);
	}
}
