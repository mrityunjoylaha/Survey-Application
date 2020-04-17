package com.lti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IQuestionTypeDao;
import com.lti.models.QuestionType;
import com.lti.services.IQuestionTypeService;

@Service("service3")
public class QuestionTypeServiceImpl implements IQuestionTypeService {
	@Autowired
	private IQuestionTypeDao dao;
	

	@Override
	public List<QuestionType> findAllQuestionType() {
		return dao.readAllQuestionType();
	}

	@Override
	public void addQuestionType(QuestionType questionType) {
		dao.createQuestionType(questionType);
	}

}
