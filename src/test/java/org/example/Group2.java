package org.example;

import org.testng.annotations.Test;

public class Group2 {
    @Test(groups = "sanity")
    public void c(){
        System.out.println("B");
    }

    @Test(groups = {"regression,sanity"})
    public void d(){
        System.out.println("A");
    }
    @Test(groups = "regression")
    public void e(){
        System.out.println("E");
    }
}
