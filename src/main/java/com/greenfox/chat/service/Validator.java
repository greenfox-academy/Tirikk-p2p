package com.greenfox.chat.service;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class Validator {

  public static String getMissingFields(BindingResult bindingResult) {
    StringBuilder missingFields = new StringBuilder();
    for (FieldError error : bindingResult.getFieldErrors()) {
      missingFields.append(error.getField());
      if (bindingResult.getFieldErrors().indexOf(error) < bindingResult.getFieldErrors().size() - 1) {
        missingFields.append(", ");
      }
    }
    return missingFields.toString();
  }
}
