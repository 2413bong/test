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


@Controller
public class UserInfoController {

	@Autowired
	private UserInfoService uis;

	@GetMapping(value="/userinfo")
	public @ResponseBody List<Userinfo> UserInfoList(@ModelAttribute Userinfo userinfo) {
	return uis.getUserinfoList(null);
	}

	@GetMapping(value="/userinfo/{uinum}")
	public @ResponseBody Userinfo SelectUser(@PathVariable Integer uiNum) {
	return uis.getUserinfo(uiNum);
	}
	
	@PostMapping(value="/userinfo")
	@ResponseBody 
	public Integer insertUserInfo(@RequestBody Userinfo userinfo) {

	return uis.insertUserinfo(userinfo);

	}

	@PutMapping(value="/userinfo/{uiNum}")
	@ResponseBody 
	public Integer updateUserInfo(@RequestBody Userinfo userinfo,@PathVariable Integer uiNum) {

	userinfo.setUiNum(uiNum);

	return uis.updateUserinfo(userinfo);

	}

	@DeleteMapping(value="/userinfo/{uiNum}")
	@ResponseBody 
	public String deleteUserInfo(@PathVariable int userinfoNumber) {

	return uis.deleteUserinfo(userinfoNumber)+"";

	}

	

}
