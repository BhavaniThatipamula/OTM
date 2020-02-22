package com.cg.onlinetest.pl;
import java.util.InputMismatchException;
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
		int testId=0;
	     
	    int questionId=0;
		 
		
		
		while(choice!=3)
		{
			try
			{
		   System.out.println("1.updateQuestion");	   
		   System.out.println("2.View Question ");
		   System.out.println("3.Exit ");
		   System.out.println("Enter the choice"); 
		   choice=scanner.nextInt(); 
		    
		    
		    
		    switch(choice)
		    {
		    case 1:
		    	
		    	 
		    		 String []questionOptions = new String[10];
		    	    System.out.println("Enter the 4 digit testId");
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
		    		 System.out.println("updated questionId is "+questionId);
		  
		    		 System.out.println("update the question options");
		    		 scanner.nextLine();
		    		 for(int i=1;i<=4;i++)
		    		 {
		    		 System.out.println(questionOptions[i]);
		    		 }
		    		 
		    		 
		    		 System.out.println("updated questiontitle is " +questiontitle);
		    		 System.out.println("updated questionanswer is " +questionanswer);
		    		 System.out.println("updated questionmarks is " +questionmarks);
		    		 
		    	     break;
		     
		    	   
		    case  2 :  
		    	      System.out.println(" Enter Test Id ");
		    	   testId= scanner.nextInt();
		    	      
		    	
		    		set=testservice.findAllQuestion(testId);
		    		for(Question ts : set)
		    		{
		    			System.out.println(ts);
		    		}
		    		
		    	
		    	
		    	break; 	   
		    case 3:
		    	
		    	 System.out.println("exit");
		    	
		    }
		    
		    
		    	 
		    }
		
		catch(InputMismatchException e) {
     	   scanner.nextLine();
 		   System.err.println("Id Should contain only digits but not alphabets"); 
 		   
 	   }
		catch(OnlineTestException e)
  	  {
  		System.err.println(e.getMessage());
  	  }
		catch(Exception e)
    	{
    		System.err.println(e.getMessage());
    	}
		}
	} 
		}

	


