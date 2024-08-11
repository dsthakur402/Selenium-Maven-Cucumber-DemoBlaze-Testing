package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuperAdminPageObject {

    private WebDriver driver;

    private By User_name = By.xpath("//input[@placeholder='Enter username']");
    private By Password = By.xpath("//input[@placeholder='Enter password']");
    private By login_button = By.xpath("//div[text()='Log In']");


    private By search_ggogle = By.xpath("//*[@jsaction='paste:puy29d;']");
    private By Click_link = By.xpath("(//*[text()='Java Tutorial - GeeksforGeeks']");
    private By java = By.xpath("//*[text()='java']");

    public SuperAdminPageObject(WebDriver driver){
        this.driver = driver;
    }
   public void search(String java){
       driver.findElement(search_ggogle).sendKeys(java);
   }
   public void click_link(){
        driver.findElement(Click_link).click();
   }
   public void click_java(){
        driver.findElement(java).click();
   }

//    public SuperAdminPageObject(WebDriver driver){
//        this.driver = driver;
//    }
//    public void enter_username(String username) {
//        driver.findElement(User_name).sendKeys(username);
//
//    }
//    public void enter_password(String password) {
//        driver.findElement(Password).sendKeys(password);
//    }
//
//    public void click_On_login() {
//        driver.findElement(login_button).click();
//    }
}
