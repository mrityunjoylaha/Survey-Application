package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.AnswerDetails;
import com.lti.services.IAnswerDetailsService;

@RestController
@RequestMapping(path = "AnswerDetails")
@CrossOrigin
public class AnswerDetailsController {
	@Autowired
	private IAnswerDetailsService service2;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AnswerDetails> viewAllAnswerDetails() {
		List<AnswerDetails> answerDetails = service2.findAllAnswerDetails();
		System.out.println(answerDetails);
		return answerDetails;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addAnswerDetails(@RequestBody AnswerDetails answerDetails) {
		service2.addAnswerDetails(answerDetails);
		
	}
}
