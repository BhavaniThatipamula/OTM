package com.cg.onlinetest.bean;

	public class Question {
		
		// fields
		int questionId ; 
	    String []questionOptions = new String[10];
		String questionTitle ;
		int questionAnswer ;
		double questionMarks ;
		int chosenAnswer ;
		double marksScored ;
		
		
		public Question(int questionId, String[] questionOptions, String questionTitle, int questionAnswer,
				double questionMarks, int chosenAnswer, double marksScored) {
			super();
			this.questionId = questionId;
			this.questionOptions = questionOptions;
			this.questionTitle = questionTitle;
			this.questionAnswer = questionAnswer;
			this.questionMarks = questionMarks;
			this.chosenAnswer = chosenAnswer;
			this.marksScored = marksScored;
		}
		
		
		public Question() {
			super();
		}
		


		public Question(int questionId, String questionTitle, int questionAnswer, double questionMarks) {
			super();
			this.questionId = questionId;
			this.questionTitle = questionTitle;
			this.questionAnswer = questionAnswer;
			this.questionMarks = questionMarks;
		}


		// setters and getters
		
		public int getQuestionId() {
			return questionId;
		}
		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}
		public String[] getQuestionOptions() {
			return questionOptions;
		}
		public void setQuestionOptions(String[] questionOptions) {
			this.questionOptions = questionOptions;
		}
		public String getQuestionTitle() {
			return questionTitle;
		}
		public void setQuestionTitle(String questionTitle) {
			this.questionTitle = questionTitle;
		}
		public int getQuestionAnswer() {
			return questionAnswer;
		}
		public void setQuestionAnswer(int questionAnswer) {
			this.questionAnswer = questionAnswer;
		}
		public double getQuestionMarks() {
			return questionMarks;
		}
		public void setQuestionMarks(double questionmarks) {
			this.questionMarks = questionmarks;
		}
		public int getChosenAnswer() {
			return chosenAnswer;
		}
		public void setChosenAnswer(int chosenAnswer) {
			this.chosenAnswer = chosenAnswer;
		}
		public double getMarksScored() {
			return marksScored;
		}
		public void setMarksScored(double marksScored) {
			this.marksScored = marksScored;
		}


		@Override
		public String toString() {
			return "Question [questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionAnswer="
					+ questionAnswer + ", questionMarks=" + questionMarks + "]";
		}


	}



