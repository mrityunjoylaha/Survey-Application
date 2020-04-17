package com.lti.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="answer_details")
public class AnswerDetails {
	@Id
//	@Column(name ="answer_id")
	private int answerId; 
	
//	@Column(name ="question_details_id")
//	private int questionDetailsId;
	
//	@Column(name ="answer_description")
	private String answerDescription; 
	
//	@Column(name ="question_type")
	private String questionType;
	
//	@Column(name ="created_datetime")
	@DateTimeFormat
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime createdDateTime; 
	
//	@Column(name ="updated_datetime")
	@DateTimeFormat
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime updatedDateTime;
	
//	@Column(name ="is_active")
	private boolean isActive;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswerDescription() {
		return answerDescription;
	}

	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public AnswerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerDetails(int answerId, String answerDescription, String questionType, LocalDateTime createdDateTime,
			LocalDateTime updatedDateTime, boolean isActive) {
		super();
		this.answerId = answerId;
		this.answerDescription = answerDescription;
		this.questionType = questionType;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "AnswerDetails [answerId=" + answerId + ", answerDescription=" + answerDescription + ", questionType="
				+ questionType + ", createdDateTime=" + createdDateTime + ", updatedDateTime=" + updatedDateTime
				+ ", isActive=" + isActive + "]";
	}

	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="question_details_id")
//	private QuestionsDetails questionsDetails;



	
	
	
}
