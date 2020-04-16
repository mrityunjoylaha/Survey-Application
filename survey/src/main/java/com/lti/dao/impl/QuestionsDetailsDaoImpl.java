package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IQuestionsDetailsDao;
import com.lti.models.QuestionsDetails;
import com.lti.models.Registration;

@Repository
public class QuestionsDetailsDaoImpl implements IQuestionsDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<QuestionsDetails> readAllQuestionsDetails() {
		String jpql = "From QuestionsDetails";
		TypedQuery<QuestionsDetails> tquery = entityManager.createQuery(jpql, QuestionsDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createQuestionsDetails(QuestionsDetails questionsDetails) {
		entityManager.persist(questionsDetails);
		
	}
}
