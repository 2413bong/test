package com.test.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.test.service.UserInfoService;
import com.test.test.vo.Userinfo;


public class UserInfoController2 {

	@Autowired
	private UserInfoService uis;

	@GetMapping(value="/userinfo")
	public @ResponseBody String SelectUserList(@ModelAttribute Userinfo userinfo) {
	uis.getUserinfoList(null);
	return "selectUser";
	}
	@GetMapping(value="/userinfo/{uinum}")
	public @ResponseBody String SelectUser(@PathVariable Integer uiNum) {
	uis.getUserinfo(uiNum);
	return "selectUser";
	}

	@PostMapping(value="/userinfo")
	@ResponseBody 
	public String insertUserList(@RequestBody Userinfo userinfo) {
	 uis.insertUserinfo(userinfo);
	 return "insertUser";
	}

	@PostMapping(value="/userinfo/{uinum}")
	@ResponseBody 
	public String insertUser(@RequestBody Userinfo userinfo) {
	uis.insertUserinfo(userinfo);
	return "404error";
	}
	
	@PutMapping(value="/userinfo")
	@ResponseBody 
	public String updateUserList(@RequestBody Userinfo userinfo,@PathVariable Integer uiNum) {
	userinfo.setUiNum(uiNum);
	 uis.updateUserinfo(userinfo);
	 return "updateUser";
	}
	@PutMapping(value="/userinfo/{uiNum}")
	@ResponseBody 
	public String updateUser(@RequestBody Userinfo userinfo,@PathVariable Integer uiNum) {
	userinfo.setUiNum(uiNum);
	 uis.updateUserinfo(userinfo);
	 return "updateUser";
	}

	@DeleteMapping(value="/userinfo")
	@ResponseBody 
	public String deleteUserList(@PathVariable int userinfoNumber) {
	 uis.deleteUserinfo(userinfoNumber);
	 return "deleteUser";
	}
	
	@DeleteMapping(value="/userinfo/{uiNum}")
	@ResponseBody 
	public String deleteUser(@PathVariable int userinfoNumber) {
	uis.deleteUserinfo(userinfoNumber);
	return "deleteUser";
	}

	

}
