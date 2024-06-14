package cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageOfFish1 {
  WebDriver driver;
  By item1=By.xpath("//tbody/tr[2]/td[5]/a[1]");
  By item2=By.xpath("//tbody/tr[3]/td[5]/a[1]");
  
  public ProductsPageOfFish1(WebDriver driver) {
	  this.driver=driver;
  }
  
  public void addItem1() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(item1).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  public void addItem2() {
	  driver.findElement(item2).click();
  }
  
}
