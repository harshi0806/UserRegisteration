package com.userregisteration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    UserRegisteration userRegistration = new UserRegisteration();
    //This test case is used for testing first and last name
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validateName("Harshita");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        boolean result = userRegistration.validateName("Ht");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenStartWithSmallLetters_shouldReturnFalse() {
        boolean result = userRegistration.validateName("harshita");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenHaveNumbers_shouldReturnFalse() {
        boolean result = userRegistration.validateName("Harshi0806");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenHaveSpecialCharacters_shouldReturnFalse() {
        boolean result = userRegistration.validateName("H@rshita");
        Assert.assertFalse(result);
    }
}
