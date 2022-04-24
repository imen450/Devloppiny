package tn.enicarthage.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.Repository.CourseRepository;
import tn.enicarthage.Repository.FeedbackRepository;
import tn.enicarthage.entities.Feedback;
import tn.enicarthage.entities.Student;
import tn.enicarthage.entities.course;
@Service
public class FeedbackService implements IFeedbackService {
	
	@Autowired
	FeedbackRepository FR;
	@Autowired
	CourseRepository CR;

	@Override
	public Feedback insert(Feedback feed,long id_course) {
		course c= CR.findById(id_course).get();
		Long id=feed.getId();
		String feedback=feed.getFeedback();
		Student student =feed.getStudent();
		Feedback f=new Feedback(id,feedback,student);
		c.getFeedbacks().add(f);
		return FR.save(f);
	}
	@Override
	public boolean delete(long feedId) {
		FR.deleteById(feedId);;
		return true;
	}
	@Override
	public Feedback update(long feedId,Feedback feed ) {
		Feedback f = new Feedback();
		Optional<Feedback> f2 = this.FR.findById(feedId);
		if (f2.isPresent()) {
			Feedback finded = f2.get();
			finded = feed;
			f = this.FR.save(finded);
		}
		return f;
		
	}

}
