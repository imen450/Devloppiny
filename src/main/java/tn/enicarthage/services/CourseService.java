package tn.enicarthage.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.Repository.ChapterRepository;
import tn.enicarthage.Repository.CourseRepository;
import tn.enicarthage.entities.Feedback;
import tn.enicarthage.entities.chapter;
import tn.enicarthage.entities.course;
import tn.enicarthage.entities.professor;
@Service
public class CourseService implements ICourseService {
	
	@Autowired
	CourseRepository cor;
	
	@Autowired
	ChapterRepository CR;
	
	private static final Logger L = LogManager.getLogger(CourseService.class);
	

	@Override
	public course insert(course course) {
		return cor.save(course);
	}

	@Override
	public void insertchapterInCourse(long id_course) {
		chapter chap = new chapter() ;
		course cou = cor.findById(id_course).orElse(null);
		cou.getChapitres().add(chap);
		cor.save(cou);
		
	}

	@Override
	public List<course> getAllCourse() {
		List<course> courses=(List<course>)cor.findAll();
		for(course cour :courses)
			L.info("course :" + cour);
		return courses;
	}
	@Override
	public void delete(long courseId) {
		cor.deleteById(courseId);
	}

	@Override
	public boolean update(course course) {
		cor.save(course);
		return true;
	}

	@Override
	public List<course> searchCourseByName(String name) {
		List<course> courses =cor.findAll();
		List<course> coursesName = new ArrayList<course>();
		for(course cour:courses) {
			if (name == cour.getTitle_cou()) {
					
					coursesName.add(cour);
		}
				
		}
		return coursesName;
	}

	@Override
	public List<course> findAllByProfesor(professor profesor) {
		List<course> courses= profesor.getCourses();
		return courses;
	}

	@Override
	public List<Feedback> afficherFeedbacks(long id_course) {
		course cou = cor.findById(id_course).orElse(null);
		List<Feedback> feedbacks= cou.getFeedbacks();
		return feedbacks;
	}

}
