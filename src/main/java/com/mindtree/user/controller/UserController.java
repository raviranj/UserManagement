package com.mindtree.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.user.service.UserService;
import com.mindtree.user.util.UserDto;

@RestController
@RequestMapping("/api/omf")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/user")
	public String createUser(@RequestBody UserDto userDto) {
		service.createUser(userDto);
		return "User Created";
	}

	@GetMapping("/user")
	public List<UserDto> findUsers() {
		return service.findUsers();
	}

	@GetMapping("/user/{id}")
	public UserDto findUser(@PathVariable("id") Long id) {
		return service.findUser(id);
	}

	@PostMapping("/user/update")
	public String updateUser(@RequestBody UserDto userDto) {
		service.updateUser(userDto);
		return "User Updated";
	}

	@PostMapping("/user/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		service.deleteUser(id);
		return "User Deleted";
	}
}
