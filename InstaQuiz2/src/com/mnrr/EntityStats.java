package com.mnrr;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class EntityStats {

	@Id String quiztitle;
	@Index int total_students;
	@Index int students_belavg;
	@Index int students_abvavg;
	@Index float average;
	
	public EntityStats(){}

	public EntityStats(String quiztitle, int total_students, int students_belavg, int students_abvavg, float average) {
		super();
		this.quiztitle = quiztitle;
		this.total_students = total_students;
		this.students_belavg = students_belavg;
		this.students_abvavg = students_abvavg;
		this.average = average;
	}

	public String getQuiztitle() {
		return quiztitle;
	}

	public void setQuiztitle(String quiztitle) {
		this.quiztitle = quiztitle;
	}

	public int getTotal_students() {
		return total_students;
	}

	public void setTotal_students(int total_students) {
		this.total_students = total_students;
	}

	public int getStudents_belavg() {
		return students_belavg;
	}

	public void setStudents_belavg(int students_belavg) {
		this.students_belavg = students_belavg;
	}

	public int getStudents_abvavg() {
		return students_abvavg;
	}

	public void setStudents_abvavg(int students_abvavg) {
		this.students_abvavg = students_abvavg;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}
	
	
	
	
	
	
	
}
