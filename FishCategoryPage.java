package cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FishCategoryPage {
      WebDriver driver;
      
      By product1=By.xpath("//a[normalize-space()='FI-SW-01']");
      By product2=By.xpath("//a[normalize-space()='FI-SW-02']");
      By product3=By.xpath("//a[normalize-space()='FI-FW-01']");
      By product4=By.xpath("//a[normalize-space()='FI-FW-02']");
      
      public FishCategoryPage(WebDriver driver) {
    	  this.driver=driver;
      }
      
      public void selectProduct1() {
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.findElement(product1).click();
      }
      public void selectProduct2() {
    	  driver.findElement(product2).click();
      }
      public void selectProduct3() {
    	  driver.findElement(product3).click();
      }
      public void selectProduct4() {
    	  driver.findElement(product4).click();
      }
}
