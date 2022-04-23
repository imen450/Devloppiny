package tn.enicarthage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.course;
import tn.enicarthage.services.CourseService;

@RestController
@RequestMapping("/course")

public class CourseController {
	
	@Autowired
	CourseService CS;
	
	@PostMapping("/Add_Course")
	@ResponseBody
	public void addCourse(@RequestBody course c) {
		 CS.insert(c);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void RemoveCourse(@PathVariable("id") Long id) {

		CS.delete(id);
	}
	@GetMapping("/All_Courses")
	public void getAllUser() {
		CS.getAllCourse();
	}
}
