package tn.enicarthage.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Feedback;
import tn.enicarthage.services.IFeedbackService;

@RestController
@RequestMapping("/Feedback")

public class FeedbackController {
	

	@Autowired
	IFeedbackService FS;
	
	@PostMapping("/Add_Feedback/{id_course}")
	@ResponseBody
	public Feedback addFeedback(@RequestBody Feedback f,@PathVariable("id_cou") long id) {
		 return FS.insert(f, id);
	}
	@PutMapping("/modify_Feedback/{id_Feed}")
	@ResponseBody
	public Feedback ModifyFeed(@PathVariable("id_cou")long feedId,@RequestBody Feedback feed ) {
		return FS.update(feedId, feed);
	}
	@DeleteMapping("/delete/{id_feed}")
	@ResponseBody
	public boolean delete(@PathVariable("id_feed") long feedId) {
		return FS.delete(feedId);
	}
}
