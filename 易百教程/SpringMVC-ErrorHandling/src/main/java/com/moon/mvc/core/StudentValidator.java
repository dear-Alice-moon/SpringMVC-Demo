package com.moon.mvc.core;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.moon.mvc.pojo.Student;

@Component
public class StudentValidator implements Validator {
	
	public boolean supports(Class<?> clazz) {
		
		return Student.class.isAssignableFrom(clazz);
	}
	
	
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name", "Field name is required");
	}

}
