package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.QuestionsDetails;
import com.lti.services.IQuestionsDetailsService;

@RestController
@RequestMapping(path = "QuestionDetails")
@CrossOrigin
public class QuestionsDetailsController {
	@Autowired
	private IQuestionsDetailsService service1;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuestionsDetails> viewAllQuestionsDetails() {
		List<QuestionsDetails> questionsDetails = service1.findAllQuestionsDetails();
		System.out.println(questionsDetails);
		return questionsDetails;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addQuestionsDetails(@RequestBody QuestionsDetails questionsDetails) {
		service1.addQuestionsDetails(questionsDetails);
	}
}
