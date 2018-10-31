package com.test.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBTest {

	@Autowired
	@Qualifier("hikariDataSource")
	private DataSource ds;
	
	@Autowired
	private SqlSessionTemplate sst;
	@Test
	public void test() {
		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertNotNull(con);
	}
	@Test
	public void selectTest() {
		int uiNum = 1;
		assertNotNull(sst.selectOne("SQL.USERINFO.selectUserInfo", uiNum));
	}
	public void selectListTest() {
		assertEquals(1,sst.selectOne("SQL.USERINFO.selectUserInfo"));
	}
}
