package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
//    @Test
//    public void softAssert(){
//        SoftAssert softAssert = new SoftAssert();
//        System.out.println("Open the browser");
//        boolean actualResult = false;
//        softAssert.assertTrue(actualResult);
//        System.out.println("Close the browser");
//    }
    @Test
    public void testArray (){
        System.out.println("test array");
        SoftAssert softAssert = new SoftAssert();
        ClassDemo classDemo = new ClassDemo();
        int[] actualResult = classDemo.getArray();
        int[] expectedResult = {1,2,3,4};
       // Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
