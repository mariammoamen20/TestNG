package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Parameters({"browser", "version"})
    @Test
    public void parameter(String browser , String version){
        System.out.println("Open " + browser + " Version " + version);
    }

}
