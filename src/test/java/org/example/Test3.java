package org.example;

import org.testng.annotations.*;

public class Test3 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    @Parameters("Models")
    public void models(String response){
        String [] response1 = response.split(",");
        System.out.println("StringArray[0]" + response1[0]);
        System.out.println("StringArray[1]" + response1[1]);
        System.out.println("Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterTest
    public void afterTest(){
        System.out.printf("After Test");
    }
}
