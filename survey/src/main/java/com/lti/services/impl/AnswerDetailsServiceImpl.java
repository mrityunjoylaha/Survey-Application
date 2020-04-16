package com.lti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IAnswerDetailsDao;
import com.lti.models.AnswerDetails;
import com.lti.services.IAnswerDetailsService;

@Service("service2")
public class AnswerDetailsServiceImpl implements IAnswerDetailsService {
	@Autowired
	private IAnswerDetailsDao dao;
	
	@Override
	public List<AnswerDetails> findAllAnswerDetails() {
		return dao.readAllAnswerDetails();
	}

	@Override
	public void addAnswerDetails(AnswerDetails answerDetails) {
		dao.createAnswerDetails(answerDetails);
		
	}

}
