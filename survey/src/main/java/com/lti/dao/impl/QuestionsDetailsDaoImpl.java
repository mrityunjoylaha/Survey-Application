package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IQuestionsDetailsDao;
import com.lti.models.QuestionsDetails;

@Repository
public class QuestionsDetailsDaoImpl implements IQuestionsDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<QuestionsDetails> readAllQuestionsDetails() {
		String jpql = "SELECT  q.questionDescription, a.answerDescription \r\n" + 
				"FROM \r\n" + 
				"QuestionsDetails q \r\n" + 
				"inner Join \r\n" + 
				"AnswerDetails a \r\n" + 
				"on q.questionDetailsId = a.id ";
				
//		TypedQuery<QuestionsDetails> tquery = entityManager.createQuery(jpql, QuestionsDetails.class);
		Query query=entityManager.createQuery(jpql);
		System.out.println(query);
		return query.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createQuestionsDetails(QuestionsDetails questionsDetails) {
		entityManager.persist(questionsDetails);
		
	}
}
