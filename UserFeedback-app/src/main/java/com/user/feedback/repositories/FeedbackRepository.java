package com.user.feedback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.user.feedback.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}
