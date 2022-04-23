package tn.enicarthage.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="professor")

public class professor extends user {
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="Grade")
	private String grade_prof;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="prof")
	private List<course> courses;

	
	public professor(String grade_prof, List<course> courses) {
		super();
		this.grade_prof = grade_prof;
		this.courses = courses;
	}


	public List<course> getCourses() {
		return courses;
	}


	public void setCourses(List<course> courses) {
		this.courses = courses;
	}


	public String getGrade_prof() {
		return grade_prof;
	}


	public void setGrade_prof(String grade_prof) {
		this.grade_prof = grade_prof;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
