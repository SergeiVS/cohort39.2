package application.service.validation.rule;

import application.service.exception.ValidationException;
import application.core.dto.AddToDoRequest;
import application.service.validation.ValidationRule;

public class ToDoNameMaxLengthValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName().length() > 20) {
           throw new ValidationException("ToDo name length must be less that 20 but actual name length is " + request.getName().length());
        }
    }
}
