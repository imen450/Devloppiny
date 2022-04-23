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

import tn.enicarthage.entities.user;
import tn.enicarthage.services.IUserService;

@RestController
@RequestMapping("/user")

public class userControllers {
	
	@Autowired
	IUserService US;
	
	@PostMapping("/Add_user")
	@ResponseBody
	public void adduser(@RequestBody user u) {
		US.create(u);
	}

	@DeleteMapping("/user/{id}")
	@ResponseBody
	public void RemoveUser(@PathVariable("id") Long id) {

		US.delete(id);
	}
	@GetMapping("/users")
	public void getAllUser() {
		US.getAllUser();
	}
}
