package com.cg.onlinetest.dao;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.bean.Test;
import com.cg.onlinetest.exception.OnlineTestException;


public class TestDaoMapImpl implements TestDao{
	 
	
	private Map<Integer,Test> testmap;
	 
	 
	public TestDaoMapImpl(){
		 
		
		testmap=new HashMap<Integer,Test>();
		Question q1=new Question(5001,"What is JVM",1,10.0);
		Question q2=new Question(5002,"What is JDBC",1,10.0);
		Question q3=new Question(6001,"Describe Table",1,10.0);
		Set<Question> set1=new HashSet<Question>();
		Set<Question> set2=new HashSet<Question>();
		set1.add(q1);
		set1.add(q2);
		set2.add(q3);
		Test test1 = new Test(1001,"Java MCQ",LocalTime.now(),set1,100,0,q1,LocalDateTime.now(), null);
		Test test2 = new Test(1002,"PHP MCQ",LocalTime.now(),set2,100,0,q1,LocalDateTime.now(),null);
		testmap.put(1001, test1);
		testmap.put(1002, test2);
		
	}

	
	@Override
	public boolean updateQuestion(int testId, Question question) throws OnlineTestException
	{
		//System.out.println(" Inside Dao "+testId);
		Test test= testmap.get(testId);
	    Set<Question>  set = test.getTestQuestions();
	    set.removeIf(p -> p.getQuestionId() == question.getQuestionId() ? true :false);
	    set.add(question);
	    return true;

	}


	@Override
	public Set<Question> findAllQuestion(int testId) throws OnlineTestException {
		
		 boolean flag=testmap.containsKey(testId);
		 Set<Question>  set1 = new HashSet<Question>();
		 if(flag==true)
		 {
			Test test= testmap.get(testId);
		    set1 = test.getTestQuestions();
		 }
		return set1;
	}


	@Override
	public boolean testTestid(int testId) throws OnlineTestException {
	
		boolean flag=false;
		flag=testmap.containsKey(testId);
		return flag;
	}
	
	@Override
	public boolean testQuestionId(int questionId, int testId) throws OnlineTestException {
	
		boolean flag=false;
		Test test=testmap.get(testId);
		Set<Question> questions=test.getTestQuestions();
		Optional<Question> option = questions.stream().filter(q->questionId==q.getQuestionId()).findAny();
		if(option.isPresent()) flag=true;
		return flag;
	}

}
