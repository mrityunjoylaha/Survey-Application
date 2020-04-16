package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IAnswerDetailsDao;
import com.lti.models.AnswerDetails;
import com.lti.models.Registration;

@Repository
public class AnswerDetailsDaoImpl implements IAnswerDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<AnswerDetails> readAllAnswerDetails() {
		String jpql = "From AnswerDetails";
		TypedQuery<AnswerDetails> tquery = entityManager.createQuery(jpql, AnswerDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createAnswerDetails(AnswerDetails answerDetails) {
		entityManager.persist(answerDetails);
		
	}
}
