package com.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.UserEntity;
import com.user.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/addUser")
	public String saveContact(@RequestBody UserEntity userEntity) {
		userRepository.save(userEntity);
		return "User saved by Id: " + userEntity.getUserId();
	}
	
	@GetMapping("/getUsers")
	public List<UserEntity> getUser(){
		return userRepository.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<UserEntity> getUserById(@PathVariable int id){
		return userRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		return "User has been deleted by Id: " + id;
	}
	
	
	
	
}
