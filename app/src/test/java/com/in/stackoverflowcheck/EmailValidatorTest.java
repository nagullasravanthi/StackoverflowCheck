package com.in.stackoverflowcheck;

import com.in.stackoverflowcheck.unittests.ValidationUtils;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


public class EmailValidatorTest {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        //assertThat(ValidationUtils.isValidEmail("name@email.com")).isTrue();
    }
    @Test
    public void emailValidator_InCorrectEmailSimple_ReturnsFalse() {
        assertThat(ValidationUtils.isValidEmail("name@email.@.com")).isTrue();
    }

}