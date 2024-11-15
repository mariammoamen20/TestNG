package dependancy;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependancyTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @Test(priority = 1,dependsOnMethods = "method2")
    public void method1(){
        System.out.println("Method1");
    }

    @Test(priority = 0,dependsOnMethods = "method1")
    public void method2(){
        System.out.println("Method2");
        Assert.assertTrue(false);
    }

    @Test(priority = 2)
    public void method3(){
        System.out.println("Method3");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
}
