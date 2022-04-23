package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Feedback;

public interface IStudentService {

	public List<Feedback> getFeedbackByStudent(Long id);
}
