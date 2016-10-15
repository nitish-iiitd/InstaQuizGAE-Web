package com.mnrr;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
//import com.googlecode.objectify.annotation.*;
import com.googlecode.objectify.annotation.Index;

@Entity
public class EntityQuestion {
	
	@Index String quiztitle;
	@Id String text;
	@Index String option1;
	@Index String option2;
	@Index String option3;
	@Index String option4;
	@Index int answer;
	
	public EntityQuestion(){}
	
	public EntityQuestion(String quiztitle, String text, String option1, String option2, String option3, String option4,
			int answer) {
		super();
		this.quiztitle = quiztitle;
		this.text = text;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}

	public String getQuiztitle() {
		return quiztitle;
	}

	public void setQuiztitle(String quiztitle) {
		this.quiztitle = quiztitle;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
	
}
