package selenide;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Param_Test {

    @Test
    public void Config(){
        startMaximized=true;
        holdBrowserOpen=true;
        open("https://demoqa.com/automation-practice-form");


    }

    @Test
    @Parameters({"FirstN","LastName","MobileNumber"})
    public void Registration( @Optional("") String FirstN,@Optional("") String LastName,@Optional("") String MobileNumber){
        $("input#firstName").sendKeys(FirstN);
        $("input#lastName").sendKeys(LastName);
        $("input[type='radio'][value='Female']").doubleClick();
        $("input#userNumber").sendKeys(MobileNumber);

        System.out.println("სტუდენტის სახელი :"+FirstN);

    }

}
