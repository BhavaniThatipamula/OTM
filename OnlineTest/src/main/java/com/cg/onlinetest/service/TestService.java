package com.cg.onlinetest.service;

import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;

public interface TestService {
	


	//public Question testTestId(int testId,Question question)throws OnlineTestException;
	public Question testQuestionId(int questionId,Question question1)throws OnlineTestException;
	public Set<Question>  findAllQuestion(int testId) throws OnlineTestException;
	public boolean checkIfTestIdExists(int testId) throws OnlineTestException;
	public boolean checkifQuestionIdExists(int questionId, int testId) throws OnlineTestException;
	public boolean updateQuestion(int testId, Question question) throws OnlineTestException;

}
