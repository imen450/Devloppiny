package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Feedback;
import tn.enicarthage.entities.course;
import tn.enicarthage.entities.professor;

public interface ICourseService {
	public course insert(course course);
	public void insertchapterInCourse(Long id_course);
	public List<course> getAllCourse();
	public void delete(long courseId);
	public boolean update(course course);
	public List<course> searchCourseByName(String name);
	List<course> findAllByProfesor(professor profesor);
	List<Feedback> affihcerFeedbacks(Long id_course);
}
