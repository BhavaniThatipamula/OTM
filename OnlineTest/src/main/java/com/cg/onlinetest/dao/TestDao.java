package com.cg.onlinetest.dao;


import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;

public interface TestDao {
	
	public Question updateQuestion(int testId,Question question) throws OnlineTestException;
	public Set<Question>  findAllQuestion(int testId) throws OnlineTestException;

}
