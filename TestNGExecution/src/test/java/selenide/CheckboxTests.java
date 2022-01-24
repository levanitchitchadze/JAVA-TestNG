package selenide;

import com.beust.jcommander.Parameter;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Configuration.*;

public class CheckboxTests {


    @Test
    @Parameters({ "baseUrl" })
    public void Checkbox(String baseUrl){
        System.out.println("გაეშვა CT");

    }
}



