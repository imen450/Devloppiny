package tn.enicarthage.services;


import tn.enicarthage.entities.Feedback;

public interface IFeedbackService {

	public Feedback insert(Feedback feed,long id_course);
	public boolean delete(long feedId);
	public Feedback update(long feedId,Feedback feed);
}
