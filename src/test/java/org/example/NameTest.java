package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class NameTest extends Helper{
    @Test
    public void check_if_name_contains_special_character1() {
        String actualResult = Name.checkName("Mariam@");
        String expectedResult = "Please enter valid name";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void check_if_name_contains_special_character2() {
        String actualResult = Name.checkName("Mariam.");
        String expectedResult = "Please enter valid name";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void check_if_name_contains_special_character3() {
        String actualResult = Name.checkName("Mariam123");
        String expectedResult = "Please enter valid name";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void check_if_name_contains_special_character4() {
        String actualResult = Name.checkName(" Mariam.");
        String expectedResult = "Please enter valid name";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void check_if_name_is_correct() {
        String actualResult = Name.checkName("Mariam");
        String expectedResult = "Mariam";
        Assert.assertEquals(actualResult, expectedResult);
    }

}
