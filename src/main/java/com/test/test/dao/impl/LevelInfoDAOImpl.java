package com.test.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.test.dao.LevelInfoDAO;
import com.test.test.vo.LevelInfo;


@Repository
public class LevelInfoDAOImpl implements LevelInfoDAO{

	@Autowired
	private SqlSession ss;
	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		return ss.selectList("SQL.LEVELINFO.selectLevelInfoList",li);
	}
	@Override
	public int insertLevelInfo(LevelInfo li) {
		return ss.insert("SQL.LEVELINFO.insertLevelInfo",li);
	}
	@Override
	public int deleteLevelInfo(int linum) {
		return ss.delete("SQL.LEVELINFO.deleteLevelInfo", linum);
	}
	@Override
	public int updateLevelInfo(LevelInfo li) {
		return ss.delete("SQL.LEVELINFO.updateLevelInfo", li);
	}
	@Override
	public LevelInfo getLevelInfoList(Integer linum) {
		return ss.selectOne("SQL.LEVELINFO.selectLevelInfo",linum);
	}
	@Override
	public int getLinum() {
		return ss.selectOne("SQL.LEVELINFO.selectliNum");
	}

}
