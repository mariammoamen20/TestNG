package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Array;

public class DataProviderClass {
    @DataProvider(name = "testData")
    public Object[][] getTestData() {
        return new Object[][]{
                {"Mariam", 26},
                {"Menna", 22},
                {"Anas", 21},
                {"Ahmed", 16},
        };
    }
    // 20 23 85
    @DataProvider(name = "testData2")
    public Object[][] getNumbers() {
        return new Object[][]{
                {26},
                {30},
                {40}
        };
    }
    @Test(dataProvider = "testData2")
    public void testData1(int number1) {
        System.out.println("Number" + number1  );
    }

    @Test(dataProvider = "testData")
    public void testData(String name , int age){
        System.out.println("Name " + name + " age " + age);
    }
}
