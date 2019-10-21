package com.in.stackoverflowcheck;


import android.content.res.Resources;

import androidx.test.core.app.ApplicationProvider;

import com.in.stackoverflowcheck.unittests.ValidationUtils;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static com.google.common.truth.Truth.assertThat;

@RunWith(RobolectricTestRunner.class)
public class WelcomeActivityTest {
    private Resources resources;

    @Before
    public void setup() {
       // DatabaseHelper.init(ApplicationProvider.getApplicationContext());
        resources = ApplicationProvider.getApplicationContext().getResources();
    }

    @Test
    public void dummyTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertThat(ValidationUtils.isValidEmail("name@email.com")).isTrue();
    }

    @Test
    public void util_isEmptyTest() {
        assertThat(ValidationUtils.isEmpty("name@email.com")).isFalse();
        assertThat(ValidationUtils.isEmpty("")).isTrue();
        assertThat(ValidationUtils.isEmpty(null)).isTrue();
    }

}