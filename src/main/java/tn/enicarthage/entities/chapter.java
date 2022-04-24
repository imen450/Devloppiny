package tn.enicarthage.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Chapter")

public class chapter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_chap;
	
	@Column(name="Ch_Label")
	private String Label_chap;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private course course;
	
	
	public chapter(long id_chap, String label_chap, tn.enicarthage.entities.course course) {
		super();
		this.id_chap = id_chap;
		this.Label_chap = label_chap;
		this.course = course;
	}
	public chapter() {
		this.id_chap = this.getId_chap();
		this.Label_chap = this.getLabel_chap();
		this.course = this.getCourse();
	}

	public course getCourse() {
		return course;
	}

	public void setCourse(course course) {
		this.course = course;
	}

	public long getId_chap() {
		return id_chap;
	}

	public void setId_chap(long id_chap) {
		this.id_chap = id_chap;
	}

	public String getLabel_chap() {
		return Label_chap;
	}

	public void setLabel_chap(String lbael_chap) {
		Label_chap = lbael_chap;
	}
	

}
