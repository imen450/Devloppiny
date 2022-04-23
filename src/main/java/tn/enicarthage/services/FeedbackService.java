package tn.enicarthage.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tn.enicarthage.Repository.FeedbackRepository;
import tn.enicarthage.entities.Feedback;

public class FeedbackService implements IFeedbackService {
	
	@Autowired
	FeedbackRepository FR;

	@Override
	public Feedback insert(Feedback feed) {
		return FR.save(feed);
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
