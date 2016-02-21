package ua.com.goit.gojava7.kickstarter.service.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.goit.gojava7.kickstarter.domains.Payment;

public class PaymentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Payment.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "ownerName", "ownerName.empty");
		Payment payment = (Payment) target;
		
		if (String.valueOf(payment.getCreditCardNumber()).matches("\\d{16}")) {
			errors.reject("creditCardNumber", "invalid number");
		}
		
		if (payment.getPledge() < 0) {
			errors.reject("pledge", "invalid pledge");
		}
	}
}
