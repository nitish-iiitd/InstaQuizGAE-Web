package com.mnrr;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class ofyService {
	
	static{
		factory().register(EntityQuestion.class);
		factory().register(EntityQuiz.class);
		factory().register(EntityStats.class);
	}
	public static Objectify ofy()
	{
		return ObjectifyService.ofy();
	}
	public static ObjectifyFactory factory()
	{
		return ObjectifyService.factory();
	}

}
