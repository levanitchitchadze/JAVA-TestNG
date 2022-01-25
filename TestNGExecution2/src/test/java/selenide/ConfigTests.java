package selenide;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
public class ConfigTests {

    @BeforeTest
    public void Config(){
        startMaximized=true;
        holdBrowserOpen=true;

    }
}
