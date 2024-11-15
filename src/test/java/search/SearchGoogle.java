package search;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SearchGoogleListeners.class)
public class SearchGoogle {

    @DataProvider(name = "searchwords")
    public Object[][] getSearchWords() {
        return new Object[][]{
                {"Shein"},
                {"Amazon"},
                {"Noon"},
                {"Souq"},
        };
    }

    @Test(dataProvider =  "searchwords")
    public void search(String word){
        System.out.println("Enter " + word);
    }
}
