package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IQuestionTypeDao;
import com.lti.models.QuestionType;

@Repository
public class QuestionTypeDaoImpl implements IQuestionTypeDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<QuestionType> readAllQuestionType() {
		String jpql = "From QuestionType";
		TypedQuery<QuestionType> tquery = entityManager.createQuery(jpql, QuestionType.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createQuestionType(QuestionType questionType) {
		entityManager.persist(questionType);

	}

}
