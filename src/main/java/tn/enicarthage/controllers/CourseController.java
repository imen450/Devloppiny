package tn.enicarthage.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Feedback;
import tn.enicarthage.entities.course;
import tn.enicarthage.entities.professor;
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

	@DeleteMapping("/delete/{id_cou}")
	@ResponseBody
	public void RemoveCourse(@PathVariable("id_cou") long id) {

		CS.delete(id);
	}
	@GetMapping("/All_Courses")
	public List<course> getAllCourses() {
		List<course> list= CS.getAllCourse();
		return list;
	}
	
	@PostMapping("/Add_Chapter/{id_cou}")
	public void AddChapterInCourse(@PathVariable("id_cou") long id) {
		CS.insertchapterInCourse(id);
	}
	@GetMapping("/search-cours")
	@ResponseBody
	public List<course> SearchCourseByName(@RequestParam("title") String name){
		List<course> searchedCours=CS.searchCourseByName(name);
		return searchedCours;
	}
	@PutMapping("/modify_Course")
	@ResponseBody
	public boolean Modify(@RequestBody course course) {
		return CS.update(course);
	}
	@GetMapping("/Courses_By_Professor")
	@ResponseBody
	public List<course> Find_Courses_By_Profesor(@RequestBody professor profesor){
		List<course> searchedCours=CS.findAllByProfesor(profesor);
		return searchedCours;
	}
	@GetMapping("/Feedbacks/{id_cou}")
	public List<Feedback> Find_Feedbacks(@PathVariable("id_cou") long id_course){
		List<Feedback> Feedbacks =CS.afficherFeedbacks(id_course);
		return Feedbacks;
	}
	
	
	
}
