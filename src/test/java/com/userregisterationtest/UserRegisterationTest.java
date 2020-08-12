package com.userregisterationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    UserRegistration registeration = new UserRegistration();
    @Test
    public void enterFirstName_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkFirstName();
        Assert.assertTrue(result);
    }

    @Test
    public void enterFirstName_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkFirstName();
        Assert.assertFalse(result);
    }

    @Test
    public void enterLastName_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkLastName();
        Assert.assertTrue(result);
    }

    @Test
    public void enterLastName_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkLastName();
        Assert.assertFalse(result);
    }

    @Test
    public void enterEmail_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkValidEmail();
        Assert.assertTrue(result);
    }

    @Test
    public void enterEmail_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkValidEmail();
        Assert.assertFalse(result);
    }

    @Test
    public void enterMobileNumber_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkMobileFormat();
        Assert.assertTrue(result);
    }

    @Test
    public void enterMobileNumber_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkMobileFormat();
        Assert.assertFalse(result);
    }
}
