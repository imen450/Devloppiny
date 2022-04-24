package tn.enicarthage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Feedback;
import tn.enicarthage.services.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	IStudentService SS;
	
	@GetMapping("/Feedbacks_Student/{id_Student}")
	public List<Feedback> Feedback_By_Student(@PathVariable("id_Student") long id){
		List<Feedback> list=SS.getFeedbackByStudent(id);
		return list;
	}
}
