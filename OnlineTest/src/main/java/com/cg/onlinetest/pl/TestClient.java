package com.cg.onlinetest.pl;
import java.util.Scanner;
import java.util.Set;

import com.cg.onlinetest.bean.Question;
import com.cg.onlinetest.exception.OnlineTestException;
import com.cg.onlinetest.service.TestService;
import com.cg.onlinetest.service.TestServiceImpl;

public class TestClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 
		TestService testservice=new TestServiceImpl();
		 
		Question question=new Question();
		 
		
		Set<Question> set=null;
		int choice=0;
		while(choice!=9)
		{
		   System.out.println("1.addTest");
		   System.out.println("2.updateTest");
		   System.out.println("3.deleteTest");
		   System.out.println("4.assignTest");
		   System.out.println("5.addQuestion");
		   System.out.println("6.updateQuestion");
		   System.out.println("7.deleteQuestion");
		   System.out.println("8.View Question ");
		   System.out.println("9.Exit ");
		   System.out.println("Enter the choice");
		   choice=scanner.nextInt(); 
		    
		    int testId=0;
		     
		    int questionId=0;
		    
		    switch(choice)
		    {
		    case 6:
		    	
		    	   try
		    	   {
		    		 String []questionOptions = new String[10];
		    	    System.out.println("Enter the testId");
		    	    int testid=scanner.nextInt();
		    	    
		    	   
		    	   
		    		 
		    		System.out.println("Enter the question id to update");
		    		questionId=scanner.nextInt();
		    		
		    		
		    		System.out.println("Enter the 4 question options");
		    		for(int i=0;i<=4;i++)
		    		{
		    			questionOptions[i]=scanner.nextLine();
		    		}
		    		System.out.println("Enter the question title");
		    		String questiontitle=scanner.nextLine();
		    		System.out.println("Enter the question answer");
		    		int questionanswer=scanner.nextInt();
		    		System.out.println("Enter the question marks");
		    		double questionmarks=scanner.nextDouble();
		    		
		    		
		    		 question.setQuestionId(questionId);
		    		 question.setQuestionOptions(questionOptions);
		    		 question.setQuestionTitle(questiontitle);
		    		 question.setQuestionAnswer(questionanswer);
		    		 question.setQuestionMarks(questionmarks);
		    		 
		    		 
		    		 question=testservice.updateQuestion(testid, question);
		    		 System.out.println("updated questionId is " +questionId);
		    		 System.out.println("Enter the question options");
		    		 for(int i=0;i<4;i++)
		    		 {
		    		 System.out.println(questionOptions[i]);
		    		 }
		    		 
		    		 
		    		 System.out.println("updated questiontitle is " +questiontitle);
		    		 System.out.println("updated questionanswer is " +questionanswer);
		    		 System.out.println("updated questionmarks is " +questionmarks);
		    		 
		    		 
		    		}
		    		 
		    		
		    	catch(OnlineTestException e)
		    	  {
		    		System.err.println(e.getMessage());
		    	  }
		    	   break;
		     
		    	   
		    case  8 :  
		    	      System.out.println(" Enter Test Id ");
		    	   testId= scanner.nextInt();
		    	      
		    	try
		    	{
		    		set=testservice.findAllQuestion(testId);
		    		for(Question ts : set)
		    		{
		    			System.out.println(ts);
		    		}
		    		
		    	}
		    	catch(Exception e)
		    	{
		    		System.err.println(e.getMessage());
		    	}
		    	break; 	   
		    case 9:
		    	
		    	 System.out.println("exit");
		    	
		   
		    	 
		    }
		   
		}

	}

}
