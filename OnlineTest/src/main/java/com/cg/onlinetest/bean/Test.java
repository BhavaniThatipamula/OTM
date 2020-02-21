
package com.cg.onlinetest.bean;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Test
{
	
	private int testId;
    private String testTitle;
    private LocalTime testDuration; 
    Set<Question> testQuestions;
    private double testTotalMarks;
    private double testMarksScored;
    Question currentQuestion;
    LocalDateTime startTime;
    LocalDateTime endTime;
    
     
    
	public Test(int testId, String testTitle, LocalTime testDuration, Set<Question> testQuestions, float testTotalMarks,
			float testMarksScored, Question currentQuestion, LocalDateTime startTime, LocalDateTime endTime) 
	{
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.currentQuestion = currentQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public Test() 
	{
		super();
	}
	
	
	public int getTestId() 
	{
		return testId;
	}

	public void setTestId(int testId) 
	{
		this.testId = testId;
	}
	public String getTestTitle() 
	{
		return testTitle;
	}
	public void setTestTitle(String testTitle) 
	{
		this.testTitle = testTitle;
	}
	public LocalTime getTestDuration() 
	{
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) 
	{
		this.testDuration = testDuration;
	}
	public Set<Question> getTestQuestions()
	{
		return testQuestions;
	}
	public void setTestQuestions(Set<Question> testQuestions) 
	{
		this.testQuestions = testQuestions;
	}
	public double getTestTotalMarks() 
	{
		return testTotalMarks;
	}
	public void setTestTotalMarks(float testTotalMarks)
	{
		this.testTotalMarks = testTotalMarks;
	}
	public double getTestMarksScored() 
	{
		return testMarksScored;
	}
	public void setTestMarksScored(float testMarksScored)
	{
		this.testMarksScored = testMarksScored;
	}
	public Question getCurrentQuestion() 
	{
		return currentQuestion;
	}
	public void setCurrentQuestion(Question currentQuestion) 
	{
		this.currentQuestion = currentQuestion;
	}
	public LocalDateTime getStartTime() 
	{
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) 
	{
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() 
	{
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) 
	{
		this.endTime = endTime;
	}
}
    
 