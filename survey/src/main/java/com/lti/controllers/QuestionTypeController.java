package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.QuestionType;
import com.lti.services.IQuestionTypeService;

@RestController
@RequestMapping(path = "QuestionType")
@CrossOrigin
public class QuestionTypeController {
	@Autowired
	private IQuestionTypeService service1;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuestionType> viewAllQuestionType() {
		List<QuestionType> questionType = service1.findAllQuestionType();
		System.out.println(questionType);
		return questionType;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addQuestionType(@RequestBody QuestionType questionType) {
		service1.addQuestionType(questionType);
	}
}
