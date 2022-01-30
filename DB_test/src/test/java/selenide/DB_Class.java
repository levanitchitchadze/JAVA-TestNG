package selenide;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.*;

public class DB_Class {
    Connection conn=null;

    @Test
    public static Connection Conn() {
        Connection conn = null;

        try (FileInputStream file = new FileInputStream("src/main/resources/db.properties.properties");) {

            Properties Parameter = new Properties();
            Parameter.load(file);

            String url = Parameter.getProperty("URL");


            System.out.println(url);

            conn = DriverManager.getConnection(url);
            System.out.println(conn);


        } catch (Exception Ex) {

        }


        return conn;
    }


}
