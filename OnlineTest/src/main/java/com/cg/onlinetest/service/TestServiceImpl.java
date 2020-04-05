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
	public boolean checkIfTestIdExists(int testId) throws OnlineTestException {
		
		String testid=String.valueOf(testId);
		boolean flag=testid.matches("[0-9]{4}");
		boolean testIdExists=false;
		
		if(flag)
		{	
			boolean result=testdao.testTestid(testId);
			if(!result)
			{
				throw new OnlineTestException("Id not found");
			}else {
				testIdExists = true;
			}
			
		}else {
			throw new OnlineTestException("Id should contain 4 digits ");
		}
		
		return testIdExists;
		
	}
	
	@Override
	public boolean checkifQuestionIdExists(int questionId, int testId) throws OnlineTestException{
		String stringQuestionId=String.valueOf(questionId);
		boolean flag=stringQuestionId.matches("[0-9]{4}");
		boolean questionIdExists=false;
		
		if(flag)
		{	
			boolean result=testdao.testQuestionId(questionId, testId);
			if(!result)
			{
				throw new OnlineTestException("Question Id not found");
			}else {
				questionIdExists = true;
			}
			
		}else {
			throw new OnlineTestException("Id should contain 4 digits ");
		}
		
		return questionIdExists;
		
	}

	 @Override
	 public Question testQuestionId(int questionId,Question question1)throws OnlineTestException{
		  
		 String questionid=String.valueOf(questionId);
		 boolean flag=questionid.matches("[0-9]{4}");
		 
		 if(!flag)
		 {
			 throw new OnlineTestException("Question Id should contain 4 digits");
		 }
		 return question1;
	 }


	@Override
	public Set<Question> findAllQuestion(int testId) throws OnlineTestException {
		 
		 Set<Question> set=testdao.findAllQuestion(testId);
		
		return set;
	}
	
	@Override
	public boolean updateQuestion(int testId, Question question) throws OnlineTestException{
		return testdao.updateQuestion(testId, question);
	}

	 
	 
	}


