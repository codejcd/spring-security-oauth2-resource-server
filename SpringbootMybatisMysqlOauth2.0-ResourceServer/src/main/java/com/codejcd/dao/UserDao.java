package com.codejcd.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.codejcd.entity.User;

@Repository
public class UserDao {
	private final static String NAMESPACE = "com.codejcd.mapper.UserMapper.";
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSessionTemplate sqlSession;
	  
	   public List<User> selectUserList() {
	    	return sqlSession.selectList(NAMESPACE + "selectUserList");
	   }
}
