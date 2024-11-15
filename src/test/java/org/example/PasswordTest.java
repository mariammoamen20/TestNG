package org.example;

import junit.framework.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class PasswordTest extends Helper{
    String password = "";

    @Test
    public void check_if_password_less_than_6() {
        password = "12345";
        String expectedResult = "Invalid password! Please try again";
        String actualResult = Password.checkPassword(password);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void check_if_password_more_than_8() {
        password = "123456789";
        String expectedResult = "Invalid password! Please try again";
        String actualResult = Password.checkPassword(password);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void check_if_password_contains_spaces(){
        password = "12345 678";
        String expectedResult = "Invalid password! Please try again";
        String actualResult = Password.checkPassword(password);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void check_correct_password(){
        password = "12345678";
        String expectedResult = password;
        String actualResult = Password.checkPassword(password);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
   public void check_if_password_is_empty(){
      password = " ";
        String expectedResult = "Invalid password! Please try again";
        String actualResult = Password.checkPassword(password);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
