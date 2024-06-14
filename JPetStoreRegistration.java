package Capstone_project;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JPetStoreRegistration {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void invokeBrowser() {
		driver=new ChromeDriver();
		baseUrl="https://petstore.octoperf.com/actions/Catalog.action";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@Test
	public void registerNewUser() throws Exception {
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.linkText("Register Now!")).click();
		
		driver.findElement(By.name("username")).sendKeys("test_user");
		driver.findElement(By.name("password")).sendKeys("testuser@12");
		driver.findElement(By.name("repeatedPassword")).sendKeys("testuser@123");
		driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("testuser@gmail.com");
		driver.findElement(By.cssSelector("input[name='account.phone']")).sendKeys("9999999999");
		driver.findElement(By.cssSelector("input[name='account.address1']")).sendKeys("Dno4Aaaaaaaa");
		driver.findElement(By.cssSelector("input[name='account.address2']")).sendKeys("NearTemple");
		driver.findElement(By.name("account.city")).sendKeys("vizag");
		driver.findElement(By.name("account.state")).sendKeys("AndhraPradesh");
		driver.findElement(By.name("account.zip")).sendKeys("533409");
		driver.findElement(By.name("account.country")).sendKeys("India");
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[value='Save Account Information']")).click();
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String actualUrl="https://petstore.octoperf.com/actions/Catalog.action";
		System.out.println(actualUrl);
		if(currentUrl.equals(actualUrl)) {
			System.out.println("RegistrationTest passed");
		}
		else {
			System.out.println("Registration failed");
		}
	}
	
	@After
	public void close() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
