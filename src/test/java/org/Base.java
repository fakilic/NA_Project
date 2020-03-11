package org;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {
        prop = new Properties();

        FileInputStream fis = new FileInputStream("C:\\Users\\HT Electronics\\EIF112\\MyFinalProject\\MyFinalProject\\src\\test\\java\\ComSelPro\\global.properties");
        prop.load(fis);

        //System.getProperty("C:\\Users\\HT Electronics\\eclipse-workspace\\NorthAmericaCucumber\\src\\Chrome\\chromedriver.exe");
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       driver.get(prop.getProperty("url"));

        return driver;
    }
}





