package ua.com.goit.gojava7.kickstarter.service;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.goit.gojava7.kickstarter.beans.Faq;

public class FaqValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Faq.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "question", "question.empty");	
	}
}
