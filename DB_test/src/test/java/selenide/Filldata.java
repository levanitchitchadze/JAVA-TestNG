package selenide;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.io.*;
import com.codeborne.selenide.*;
import com.codeborne.selenide.*;
import com.codeborne.selenide.ex.SoftAssertionError;
import com.codeborne.selenide.testng.SoftAsserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class Filldata {


    @Test
    public void Select(){

        try {
            Connection conn= DB_Class.Conn();

            Statement state= conn.createStatement();
            ResultSet result=state.executeQuery("select top 5 * from [students].[dbo].[students]");

            while (result.next()){
                open("https://demoqa.com/automation-practice-form");
                System.out.println(result.getString("firstName"));

                $("#firstName").sendKeys(result.getString("firstName"));
                $("#lastName").sendKeys(result.getString("lastName"));
                $("#userNumber").sendKeys(result.getString("phone"));


            }


        }catch (Exception ex){
            System.out.println(ex);
        }

    }


}
