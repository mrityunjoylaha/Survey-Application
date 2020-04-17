package com.lti.dao;

import java.util.List;

import com.lti.models.QuestionType;

public interface IQuestionTypeDao {
	//Select details
	public List<QuestionType> readAllQuestionType();
	
	
	//Insert details
	public void createQuestionType(QuestionType questionType);
}
