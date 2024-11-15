package org.example;

import org.testng.annotations.Test;

public class Group1 {

    @Test(groups = "regression")
    public void b(){
        System.out.println("B");
    }

    @Test(groups = {"regression,sanity"})
    public void a(){
        System.out.println("A");
    }

}
