package com.moon.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alibaba.fastjson.JSONObject;
import com.moon.mvc.pojo.User;
import com.moon.mvc.service.UserService;

@RestController
public class HelloWorldRestController {
	
	@Autowired
	UserService userService;
	
	
	/**
	 * 查询所有的User信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/10/17  20:27
	 */
	@RequestMapping(value = "/selectUser/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		
		List<User> userList = userService.findAllUsers();
		
		if (userList.isEmpty()) {
			
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);  // //You many decide to return HttpStatus.NOT_FOUND
		}
		
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}
	
	
	/**
	 * 通过id查找 User
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/10/17  20:37
	 */
	@RequestMapping(value = "/selectUser/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		
		System.out.println("Fetching User with id" + id);
		User user = userService.findUserById(id);
		
		if (user == null) {
			
			System.out.println("User with id " + id + "not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
	/**
	 * 新增User
	 * 
	 * @param user
	 * 
	 * @author moon  2019/10/17  20:43
	 */
	@RequestMapping(value = "/createUser/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
		
		System.out.println("Creating User为：" + JSONObject.toJSONString(user));
		
		if (userService.isUserExist(user)) {
			
			System.out.println("A User with name" + user.getName() + "already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		userService.saveUser(user);  // 新增User信息
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
		
		System.out.println("headers：" + headers);
		
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	
	/**
	  * 通过Id更新User信息
	 * 
	 * @param id
	 * @param user
	 * @return
	 * 
	 * @author moon  2019/10/21  11:06
	 */
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		
		System.out.println("Updating User" + id);
		
		User currentUser = userService.findUserById(id);
		
		if (currentUser == null) {
			
			System.out.println("User with id" + id + "not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		currentUser.setName(user.getName());
		currentUser.setAge(user.getAge());
		currentUser.setSalary(user.getSalary());
		
		userService.updateUser(currentUser);
		
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}
	
	
	/**
	  * 通过ID删除User信息
	 * 
	 * @param id
	 * @return
	 * 
	 * @author moon  2019/10/21  11:11
	 */
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
		
		System.out.println("Fetching & Deleting User with id " + id);
		
		User user= userService.findUserById(id);
		
		if (user == null) {
			
			System.out.println("Unable to delete. User with id" + id + "not found");
			
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		userService.deleteUserById(id);
		
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	
	/**
	  * 删除所有的User信息
	 * 
	 * @return
	 * 
	 * @author moon  2019/10/21  11:21
	 */
	@RequestMapping(value = "/deleteUser/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUser() {
		
		System.out.println("Deleting All Users");
		
		userService.deleteAllUser();
		
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
}
