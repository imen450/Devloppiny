package tn.enicarthage.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.enicarthage.services.IStudentService;

@RestController
@RequestMapping("/student")

public class studentController {
	
	@Autowired
	IStudentService SS;
	
	@PostMapping("/user/enroll")
	@ResponseBody
	public void enroll(@RequestBody long id) {
		SS.enroll(id);
	}
	


}
