package com.lti.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions_details")
public class QuestionsDetails {
	@Id
	@Column(name ="question_details_id")
	private int questionDetailsId; 
	
	@Column(name ="form_id")
	private String formId;
	
	@Column(name ="question_type")
	private String questionType;
	
	@Column(name ="question_seq_no")
	private int questionSeqNo;
	
	@Column(name ="question_description")
	private String questionDescription;
	
	@Column(name ="question_type_id")
	private int questionTypeId;
	
	@Column(name ="parent_question_id")
	private int parentQuestionId;
	
	@Column(name ="child_question_id")
	private int childQuestionId;
	
	@Column(name ="created_datetime")
	private LocalDateTime createdDateTime;
	
	@Column(name ="updated_datetime")
	private LocalDateTime updatedDateTime;
	
	@Column(name ="isactive")
	private boolean isActive;

	public int getQuestionDetailsId() {
		return questionDetailsId;
	}

	public void setQuestionDetailsId(int questionDetailsId) {
		this.questionDetailsId = questionDetailsId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public int getQuestionSeqNo() {
		return questionSeqNo;
	}

	public void setQuestionSeqNo(int questionSeqNo) {
		this.questionSeqNo = questionSeqNo;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public int getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public int getParentQuestionId() {
		return parentQuestionId;
	}

	public void setParentQuestionId(int parentQuestionId) {
		this.parentQuestionId = parentQuestionId;
	}

	public int getChildQuestionId() {
		return childQuestionId;
	}

	public void setChildQuestionId(int childQuestionId) {
		this.childQuestionId = childQuestionId;
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

	public QuestionsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionsDetails(int questionDetailsId, String formId, String questionType, int questionSeqNo,
			String questionDescription, int questionTypeId, int parentQuestionId, int childQuestionId,
			LocalDateTime createdDateTime, LocalDateTime updatedDateTime, boolean isActive) {
		super();
		this.questionDetailsId = questionDetailsId;
		this.formId = formId;
		this.questionType = questionType;
		this.questionSeqNo = questionSeqNo;
		this.questionDescription = questionDescription;
		this.questionTypeId = questionTypeId;
		this.parentQuestionId = parentQuestionId;
		this.childQuestionId = childQuestionId;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "QuestionsDetails [questionDetailsId=" + questionDetailsId + ", formId=" + formId + ", questionType="
				+ questionType + ", questionSeqNo=" + questionSeqNo + ", questionDescription=" + questionDescription
				+ ", questionTypeId=" + questionTypeId + ", parentQuestionId=" + parentQuestionId + ", childQuestionId="
				+ childQuestionId + ", createdDateTime=" + createdDateTime + ", updatedDateTime=" + updatedDateTime
				+ ", isActive=" + isActive + "]";
	}
	
	
}
