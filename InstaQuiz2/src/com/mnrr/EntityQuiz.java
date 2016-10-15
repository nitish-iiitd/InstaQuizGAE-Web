package com.mnrr;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class EntityQuiz {
	
	@Index String username;
	@Id String quiztitle;
	@Index String code;
	
	public EntityQuiz(){}
	
	public EntityQuiz(String username, String quiztitle, String code) {
		super();
		this.username = username;
		this.quiztitle = quiztitle;
		this.code = code;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getQuiztitle() {
		return quiztitle;
	}

	public void setQuiztitle(String quiztitle) {
		this.quiztitle = quiztitle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
	
	
}
