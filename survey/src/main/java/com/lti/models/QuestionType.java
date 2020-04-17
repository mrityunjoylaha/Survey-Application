package com.lti.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question_type")
public class QuestionType {
	

	@Id
	@Column(name ="question_type_id")
	private int questionTypeId; 
	
	@Column(name ="question_type_description")
	private int questionTypeDescription;

	
	
	public int getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public int getQuestionTypeDescription() {
		return questionTypeDescription;
	}

	public void setQuestionTypeDescription(int questionTypeDescription) {
		this.questionTypeDescription = questionTypeDescription;
	}

	public QuestionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionType(int questionTypeId, int questionTypeDescription) {
		super();
		this.questionTypeId = questionTypeId;
		this.questionTypeDescription = questionTypeDescription;
	}

	@Override
	public String toString() {
		return "QuestionType [questionTypeId=" + questionTypeId + ", questionTypeDescription=" + questionTypeDescription
				+ "]";
	} 
	
	
	
}
