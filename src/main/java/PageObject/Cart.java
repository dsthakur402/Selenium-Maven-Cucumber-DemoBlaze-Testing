package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {


    private WebDriver driver;

    private By Product = By.xpath("//a[text()='Samsung galaxy s6']");
    private By Add_To_cart = By.xpath("//a[@class='btn btn-success btn-lg']");
    private By cart = By.xpath("//a[@id='cartur']");
    private By place_Order_btn = By.xpath("//button[@class='btn btn-success']");
    private By name_texfield = By.xpath("//input[@id='name']");
    private By country_textfield = By.xpath("//input[@id='country']");
    private By city_textfield = By.xpath("//input[@id='city']");
    private By card_number = By.xpath("//input[@id='card']");
    private By card_month = By.xpath("//input[@id='month']");
    private By card_year = By.xpath("//input[@id='year']");
    private By purchase_btn = By.xpath("//button[text()='Purchase']");



    public Cart(WebDriver driver) {
        this.driver = driver;
    }
    public void click_product(){

        WebElement element = driver.findElement(Product);
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }
//        WebElement element = driver.findElement(Product);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        element.click();

    }
    public void add_cart(){
        driver.findElement(Add_To_cart).click();
    }
    public void Cart_btn(){
        driver.findElement(cart).click();
    }
    public void place_order(){
        driver.findElement(place_Order_btn).click();
    }
    public void enter_name(){
        driver.findElement(name_texfield).sendKeys("Amit");
    }
    public void enter_country() {
        driver.findElement(country_textfield).sendKeys("India");
    }
    public void enter_city() {
        driver.findElement(city_textfield).sendKeys("Gurugram");
    }
    public void enter_cardNo(){
        driver.findElement(card_number).sendKeys("4111 1111 1111 1111");
    }
    public void enter_cardMonth(){
        driver.findElement(card_month).sendKeys("09");
    }
    public void enter_cardYear(){
        driver.findElement(card_year).sendKeys("2030");
    }
    public void click_purchase_button(){
        driver.findElement(purchase_btn).click();
    }
}
