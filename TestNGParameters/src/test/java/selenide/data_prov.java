package selenide;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class data_prov {

    @Test
    public void Config(){
        System.out.println("\n");
    }

    @DataProvider
    public Object[][] DPMethod(){
        return new Object[][]
                {{"Tiko","Mzhavanadze","599213412"},{"Irina","Inashvili","574834495"},{"Alina","Tkabladze","591023153"}};

    }

    @Test(dataProvider ="DPMethod" )
    public void Registration(String FN,String LN,String MN){
        open("https://demoqa.com/automation-practice-form");
        System.out.println(FN+"  "+LN+"  "+MN);
        $("input#firstName").sendKeys(FN);
        $("input#lastName").sendKeys(LN);
        $("input[type='radio'][value='Female']").doubleClick();
        $("input#userNumber").sendKeys(MN);
    }



}
