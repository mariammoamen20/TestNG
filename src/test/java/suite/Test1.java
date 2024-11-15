package suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @Test

    public void test() {
        System.out.println("Test");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

}
