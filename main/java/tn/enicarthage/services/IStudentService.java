package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Feedback;

public interface IStudentService {

	public boolean enroll(Long idCourse);
	public List<Feedback> getFeedbackByStudent(Long id);
}
