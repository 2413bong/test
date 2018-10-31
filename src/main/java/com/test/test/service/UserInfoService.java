package com.test.test.service;

import java.util.List;

import com.test.test.vo.Userinfo;

public interface UserInfoService {
	public List<Userinfo> getUserinfoList(Userinfo userinfo);
	public Userinfo getUserinfo(int uiNum);
	public int insertUserinfo(Userinfo userinfo);
	public int deleteUserinfo(int userinfoNumber);
	public int updateUserinfo(Userinfo userinfo);
}
