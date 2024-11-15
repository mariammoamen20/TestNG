package org.example;

import org.testng.annotations.Test;

public class Test1 {
    @Test(priority = 0)
    public void b(){
        System.out.println("B");
    }

    @Test(priority = 1)
    public void a(){
        System.out.println("A");
    }

}
