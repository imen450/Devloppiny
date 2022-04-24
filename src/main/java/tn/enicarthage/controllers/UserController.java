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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.user;
import tn.enicarthage.services.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserService US;
	
	@PostMapping("/Add_user")
	@ResponseBody
	public void adduser(@RequestBody user u) {
		US.create(u);
	}

	@DeleteMapping("/user/{id}")
	@ResponseBody
	public void RemoveUser(@PathVariable("id") long id) {

		US.delete(id);
	}
	@GetMapping("/users")
	public List<user> getAllUser() {
		List<user> list=US.getAllUser();
		return list;
	}
	@PutMapping("/modify_User")
	@ResponseBody
	public void update(@RequestBody user user ) {
		US.update(user);
	}
	@GetMapping("/user/{id}")
	public user FindUser(@PathVariable("id") long id) {
		return US.search(id);
	}
}
