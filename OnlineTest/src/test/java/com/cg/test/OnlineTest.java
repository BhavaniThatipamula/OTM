package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.dao.TestDao;
import com.cg.onlinetest.dao.TestDaoMapImpl;

class OnlineTest {
	
	TestDao dao=null;
	@BeforeEach
	public void updateQuestion() {
		dao=new TestDaoMapImpl();
	}

	@Test
	public void testUpdateQuestion() throws Exception{
		 
		
		Question q1=new Question(5001,"What is JVM",1,10.0);
		Question q2=dao.updateQuestion(1001, q1);
		assertEquals(5001,q2.getQuestionId());
		 
		
	}
	
	@Test
	public void testFindAllQuestion() throws Exception{
		
		Question q1=new Question(5001,"What is JVM",1,10.0);
		Question q2=new Question(5002,"What is JDBC",1,10.0);
		Question q3=dao.updateQuestion(1001, q1);
		Set<Question> set=dao.findAllQuestion(1001);
		int a=set.size();
		assertEquals(2,a);
		
	}
	

}
