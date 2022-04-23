package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.enicarthage.Repository.StudentRepository;
import tn.enicarthage.entities.Feedback;
import tn.enicarthage.entities.Student;

public class StudentService implements IStudentService {
	
	@Autowired
	StudentRepository SR;

	@Override
	public List<Feedback> getFeedbackByStudent(Long id) {
		Student s = SR.findById(id).orElse(null);
		List<Feedback> feedbacks= s.getFeedbacks();
		return feedbacks;
	}

}
