package cart;


import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class register{
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void invokeBrowser() {
		driver=new ChromeDriver();
		baseUrl="https://jpetstore.aspectran.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@Test
	public void registerNewUser() throws Exception {
		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Register Now!']")).click();
		
		driver.findElement(By.name("username")).sendKeys("testuser6");
		driver.findElement(By.name("password")).sendKeys("testuser@12");
		driver.findElement(By.name("repeatedPassword")).sendKeys("testuser@12");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testtest");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testuser1@gmail.com");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9998999999");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("Dno4Aaaaaaaa");
		driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("NearTemple");
		driver.findElement(By.name("city")).sendKeys("vizag");
		driver.findElement(By.name("state")).sendKeys("AndhraPradesh");
		driver.findElement(By.name("zip")).sendKeys("533499");
		driver.findElement(By.name("country")).sendKeys("India");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Save Account Information']")).click();
		Thread.sleep(2000);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String actualUrl="https://jpetstore.aspectran.com/account/signonForm?created=true";
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

