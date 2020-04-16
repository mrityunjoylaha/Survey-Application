package com.lti.dao;

import java.util.List;

import com.lti.models.QuestionsDetails;

public interface IQuestionsDetailsDao {
	//Select details
			public List<QuestionsDetails> readAllQuestionsDetails();
			
			
			//Insert details
			public void createQuestionsDetails(QuestionsDetails questionsDetails);
}
