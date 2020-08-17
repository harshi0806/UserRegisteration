package com.userregisteration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    UserRegisteration userRegistration = new UserRegisteration();
    //This test case is used for testing first name
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
    //This test case is used for testing last name
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validateName("Srivastava");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenShort_shouldReturnFalse() {
        boolean result = userRegistration.validateName("Sr");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenStartWithSmallLetters_shouldReturnFalse() {
        boolean result = userRegistration.validateName("srivastava");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenHaveNumbers_shouldReturnFalse() {
        boolean result = userRegistration.validateName("Srivastava0806");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenHaveSpecialCharacters_shouldReturnFalse() {
        boolean result = userRegistration.validateName("Srivastav@");
        Assert.assertFalse(result);
    }
    //This test case is used for testing email format
    @Test
    public void givenEmail_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validateEmail("harshitasrivastava@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_whenMissingMandotarySymbols_shouldReturnFalse() {
        boolean result = userRegistration.validateEmail("harshitasrivastavagmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_whenMissingCompulsoryPart_shouldReturnFalse() {
        boolean result = userRegistration.validateEmail("harshitasrivastava@gmail.");
        Assert.assertFalse(result);
    }
    //This test cases is used for testing mobile format
    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validateMobileNumber("91 988076521");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_whenShort_shouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("988076521");
        Assert.assertFalse(result);
    }

    //This test cases is used for testing password format
    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userRegistration.validatePassword("harshita0806");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("hars45hita");
        Assert.assertFalse(result);
    }
}
