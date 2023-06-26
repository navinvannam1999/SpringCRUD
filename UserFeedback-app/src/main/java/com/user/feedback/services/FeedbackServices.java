package com.user.feedback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.feedback.entities.Feedback;
import com.user.feedback.repositories.FeedbackRepository;


@Service
public class FeedbackServices {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepository.findAll();
	}
}
