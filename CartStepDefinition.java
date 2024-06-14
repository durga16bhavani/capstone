package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cart.CartPage;
import cart.FishCategoryPage;
import cart.HomePage;
import cart.ProductsPageOfFish1;
import cart.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDefinition {
    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    CartPage cartPage;
    FishCategoryPage fishCategoryPage;
    ProductsPageOfFish1  productsPageOfFish1;
    
    @Given("The user is on the JPetStore SignInpage")
    public void userIsOnTheJPetStoreSignInpage() throws InterruptedException{
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://jpetstore.aspectran.com/");
    	Thread.sleep(2000);
    	signInPage=new SignInPage(driver);
    }
    
    @When("The user signs in with username and password")
    public void userSignsInWithUsernameAndPassword()throws InterruptedException {
    	signInPage.clickOnSignIn();	
    	Thread.sleep(2000);
    	signInPage.enterUsername();
    	signInPage.enterPassword();
    	Thread.sleep(2000);
    	signInPage.clickLogin();	
    }
    
    @And("The user clicks on the cart image")
    public void clicksOnTheCartImage() throws InterruptedException {
    	homePage=new HomePage(driver);
    	Thread.sleep(2000);
        homePage.clickOnCartIcon();   	
    }
    
    @Then("The user should be redirected to the view cart page")
    public void redirectedToViewCartPage() {
    	String currentUrl=driver.getCurrentUrl();
    	assert currentUrl.contains("viewCart");
    }
    
    @When("The user clicks on Fish")
    public void clicksOnFish() throws InterruptedException{
    	cartPage=new CartPage(driver);
    	Thread.sleep(2000);
    	cartPage.clickOnFishLink();
    }
    
    @Then("The user should redirected to the fish category page")
    public void  redirectedToFishCategory() {
    	String currentUrl=driver.getCurrentUrl();
    	assert currentUrl.contains("FISH");
    }
    
    @When("The user clicks on product id")
    public void clicksOnProductId() throws InterruptedException{
    	fishCategoryPage=new FishCategoryPage(driver);
    	Thread.sleep(2000);
    	fishCategoryPage.selectProduct1();
    }
    
    @Then("The user should be redirected to the items page of that product")
    public void redirectedToItemsPage() {
    	String currentUrl=driver.getCurrentUrl();
    	assert currentUrl.contains("FI-SW-01");
    }
    
    @When("The user clicks on add to cart button which is next to item price")
    public void clickOnAddToCart() throws InterruptedException {
    	productsPageOfFish1=new ProductsPageOfFish1(driver);
    	Thread.sleep(2000);
    	productsPageOfFish1.addItem1();
    }
    
    @Then("The product should be added to the cart and redirected to view cart page")
    public void redirectedToViewCart() {
    	String currentUrl=driver.getCurrentUrl();
    	assert currentUrl.contains("viewCart");
    }
}
