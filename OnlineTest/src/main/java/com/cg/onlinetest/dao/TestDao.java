package com.cg.onlinetest.dao;


import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;

public interface TestDao {
	
	public boolean updateQuestion(int testId, Question question) throws OnlineTestException;
	public boolean testTestid(int testId) throws OnlineTestException;
	public Set<Question>  findAllQuestion(int testId) throws OnlineTestException;
	public boolean testQuestionId(int questionId, int testId) throws OnlineTestException;

}
