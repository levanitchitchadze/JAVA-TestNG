package selenide;

import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTests {

    @Test(priority = 1)
    public void SelenideTests(){
        startMaximized=true;
        //ბროუზერს არ ვთიშავ ტესტის ბოლოს
        holdBrowserOpen=true;
        //open("http://the-internet.herokuapp.com/checkboxes");

    }

}
