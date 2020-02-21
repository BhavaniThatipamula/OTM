package com.cg.onlinetest.service;

import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;

public interface TestService {
	


	public Question updateQuestion(int testId,Question question)throws OnlineTestException;
	public Question updateQuestion1(int questionId,Question question1)throws OnlineTestException;
	public Set<Question>  findAllQuestion(int testId) throws OnlineTestException;

}
