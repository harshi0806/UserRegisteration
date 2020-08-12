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
}
