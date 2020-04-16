package com.lti.services;

import java.util.List;

import com.lti.models.QuestionsDetails;

public interface IQuestionsDetailsService {
	public  List<QuestionsDetails> findAllQuestionsDetails();
	
	
	public void addQuestionsDetails(QuestionsDetails questionsDetails);
}
