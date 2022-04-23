package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="Course")

public class course implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="C_ID")
	private Long id_cou;
	
	@Column(name="C_title")
	private String title_cou;
	
	@Column(name="C_descrp")
	private String description_cou;
	
	@OneToMany(cascade = CascadeType.ALL)
    private List<Feedback> feedbacks =new ArrayList<Feedback>();
	
	@Column(name="C_level")
	private String level_cou;
	
	@Column(name="C_duration")
	private String duration;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="course")
    private List<chapter> chapitres=new ArrayList<chapter>();
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private professor prof;
    
    

	public course(Long id_cou, String title_cou, String description_cou, List<Feedback> feedbacks, String level_cou,
			String duration, List<chapter> chapitres, professor prof) {
		super();
		this.id_cou = id_cou;
		this.title_cou = title_cou;
		this.description_cou = description_cou;
		this.feedbacks = feedbacks;
		this.level_cou = level_cou;
		this.duration = duration;
		this.chapitres = chapitres;
		this.prof = prof;
	}

	public Long getId_cou() {
		return id_cou;
	}

	public void setId_cou(Long id_cou) {
		this.id_cou = id_cou;
	}

	public String getTitle_cou() {
		return title_cou;
	}

	public void setTitle_cou(String title_cou) {
		this.title_cou = title_cou;
	}

	public String getDescription_cou() {
		return description_cou;
	}

	public void setDescription_cou(String description_cou) {
		this.description_cou = description_cou;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public String getLevel_cou() {
		return level_cou;
	}

	public void setLevel_cou(String level_cou) {
		this.level_cou = level_cou;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<chapter> getChapitres() {
		return chapitres;
	}

	public void setChapitres(List<chapter> chapitres) {
		this.chapitres = chapitres;
	}

	public professor getProf() {
		return prof;
	}

	public void setProf(professor prof) {
		this.prof = prof;
	}

	
    
}

