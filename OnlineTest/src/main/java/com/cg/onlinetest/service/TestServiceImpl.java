package com.cg.onlinetest.service;
import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.dao.TestDao;
import com.cg.onlinetest.dao.TestDaoMapImpl;
import com.cg.onlinetest.exception.OnlineTestException;
 

public class TestServiceImpl implements TestService{
	
	private TestDao testdao;
	public TestServiceImpl() {
		testdao=new TestDaoMapImpl();
	}
	

	@Override
	public Question updateQuestion(int testId, Question question) throws OnlineTestException {
		
		String testid=String.valueOf(testId);
		boolean flag=testid.matches("[0-9]{4}");
		
		if(!flag)
		{
			throw new OnlineTestException("Id should contain 4 digits");
		}
		
		
		return testdao.updateQuestion(testId, question);
	}

	 @Override
	 public Question updateQuestion1(int questionId,Question question1)throws OnlineTestException{
		  
		 String questionid=String.valueOf(questionId);
		 boolean flag=questionid.matches("[0-9]{4}");
		 
		 if(!flag)
		 {
			 throw new OnlineTestException("Question Id should contain 4 digits");
		 }
		 return testdao.updateQuestion(questionId, question1);
	 }


	@Override
	public Set<Question> findAllQuestion(int testId) throws OnlineTestException {
		 
		 Set<Question> set=testdao.findAllQuestion(testId);
		
		return set;
	}

	 
	 
	}


