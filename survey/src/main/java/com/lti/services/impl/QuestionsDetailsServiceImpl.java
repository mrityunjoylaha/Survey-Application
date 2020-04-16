package com.lti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IQuestionsDetailsDao;
import com.lti.models.QuestionsDetails;
import com.lti.services.IQuestionsDetailsService;


@Service("service1")
public class QuestionsDetailsServiceImpl implements IQuestionsDetailsService {
	@Autowired
	private IQuestionsDetailsDao dao;
	
	@Override
	public List<QuestionsDetails> findAllQuestionsDetails() {
		return dao.readAllQuestionsDetails();
	}

	@Override
	public void addQuestionsDetails(QuestionsDetails questionsDetails) {
		dao.createQuestionsDetails(questionsDetails);
		
	}

}
