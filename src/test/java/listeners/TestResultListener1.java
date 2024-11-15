package listeners;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(ClassListener1.class)
public class TestResultListener1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass ");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod ");
    }

    @Test
    public void test1() {
        Assert.assertTrue(true);
        System.out.println("Test 1 ");
    }

    @Test
    public void test2() {
        Assert.assertTrue(false);
        System.out.println("Test 2 ");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod ");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass ");
    }
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Before Suit ");
    }
}
