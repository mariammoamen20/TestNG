package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test2 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite2");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite2");
    }

}
