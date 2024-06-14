package cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
     WebDriver driver;
     
     By cartIcon=By.name("img_cart");
     
     public HomePage(WebDriver driver) {
    	 this.driver=driver;
     }
     
     public void clickOnCartIcon() {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 driver.findElement(cartIcon).click();
     }  
}
