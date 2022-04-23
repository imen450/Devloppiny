package tn.enicarthage.entities;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student extends user {

	private static final long serialVersionUID = 1L;
	
	@Column(name="university")
	private String university;
	
	@Column(name="Diplome")
	private String diplome;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="student")
	private List<Feedback> feedbacks ;
	

	public Student(String university, String diplome, List<Feedback> feedbacks) {
		super();
		this.university = university;
		this.diplome = diplome;
		this.feedbacks = feedbacks;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
	
	
	

}
