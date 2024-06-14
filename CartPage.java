package cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
   WebDriver driver;
   
   By fishLink=By.linkText("Fish");
   
   public CartPage(WebDriver driver) {
  	 this.driver=driver;
   }
   
   public void clickOnFishLink() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(fishLink).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   
}
