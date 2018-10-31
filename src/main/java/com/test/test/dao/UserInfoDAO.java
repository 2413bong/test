package com.test.test.dao;

import java.util.List;

import com.test.test.vo.Userinfo;

public interface UserInfoDAO {

	public List<Userinfo> getUserinfoList(Userinfo userinfo);
	public Userinfo getUserinfo(int uiNum);
	public int insertUserinfo(Userinfo userinfo);
	public int deleteUserinfo(int userinfoNumber);
	public int updateUserinfo(Userinfo userinfo);
}
