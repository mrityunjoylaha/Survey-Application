package com.lti.dao;

import java.util.List;

import com.lti.models.AnswerDetails;

public interface IAnswerDetailsDao {
	//Select details
			public List<AnswerDetails> readAllAnswerDetails();
			
			
			//Insert details
			public void createAnswerDetails(AnswerDetails answerDetails);
}
