package com.userregisterationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    UserRegistration registeration = new UserRegistration();
    @Test
    //Check pattern if matches first name
    public void enterFirstName_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkFirstName();
        Assert.assertTrue(result);
    }

    @Test
    //Check pattern if does not matches first name
    public void enterFirstName_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkFirstName();
        Assert.assertFalse(result);
    }

    @Test
    //Check pattern if matches last name
    public void enterLastName_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkLastName();
        Assert.assertTrue(result);
    }

    @Test
    //Check pattern if not matches with last name
    public void enterLastName_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkLastName();
        Assert.assertFalse(result);
    }

    @Test
    //Check pattern if matches with email
    public void enterEmail_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkValidEmail();
        Assert.assertTrue(result);
    }

    @Test
    //Check pattern if not matches with email
    public void enterEmail_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkValidEmail();
        Assert.assertFalse(result);
    }

    @Test
    //Check pattern if matches with format of mobile number
    public void enterMobileNumber_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkMobileFormat();
        Assert.assertTrue(result);
    }

    @Test
    //Check pattern if not matches with format of mobile number
    public void enterMobileNumber_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkMobileFormat();
        Assert.assertFalse(result);
    }
    @Test
    //Check pattern if matches with password format
    public void enterPassword_WhenCorrect_ShouldReturnTrue() {
        boolean result = registeration.checkPassword();
        Assert.assertTrue(result);
    }

    @Test
    //Check pattern if matches with password format
    public void enterPassword_WhenWrong_ShouldReturnFalse(){
        boolean result = registeration.checkPassword();
        Assert.assertFalse(result);
    }
}
