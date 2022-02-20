package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//import org.openqa.selenium.support.ui.Select;
//import utils.LocalDriverManager;


public class HomePage {
    WebDriver driver; // private final WebDriver driver = LocalDriverManager.getInstance();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By productElements = By.xpath("//ul[contains(@class,'products')]//li");
    public List<WebElement> getAllProducts() {
        return driver.findElements(productElements);
    }

    public void clickOnProduct(String productName) {
        for (WebElement product : getAllProducts()) {
            if (product.getText().contains(productName)) {
                product.click();
                break;
            }
        }
    }

   public void addToCart(String productName)
   {for (WebElement product : getAllProducts()) {
       if (product.getText().contains(productName)) {
           product.findElement(By.xpath(".//a[text()='Add to cart']")).click();
           break;
       }
   }

   }
}


