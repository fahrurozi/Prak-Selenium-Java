import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void chromeTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        WebElement shiftingContentMenu = driver.findElement(By.linkText("Example 1: Menu Element"));
        shiftingContentMenu.click();
//        driver.quit();
    }

//    @Test
//    public void edgeTest( ){
//        List<String> listData = new ArrayList<>();
//
//        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
//        EdgeDriver driver = new EdgeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        List<WebElement> listLi = driver.findElementsByTagName("li");
//
//        for (WebElement lis : listLi) {
//            listData.add(lis.getText());
//            System.out.println(lis.getText());
//        }
//        System.out.println(listData);
//
//        driver.quit();
//    }
//
//    @Test
//    public void firefoxTest(){
//        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.com/");
//        String title = driver.getTitle();
//        System.out.println(title);
//        driver.quit();
//    }

}