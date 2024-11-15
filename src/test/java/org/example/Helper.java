package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Helper {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("========Before Method 1=====");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("========After Method 1=====");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("========Before Class 1=====");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("========After Class 1 =====");
    }
}
