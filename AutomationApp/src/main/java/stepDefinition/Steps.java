package stepDefinition;

import java.util.concurrent.TimeUnit;
import pages.Impl.WebPagesImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Step Definition
 * 
 * @author Ravi Kumar Yakkatela
 * 
 */

public class Steps extends WebPagesImpl {

	@Given("^Open chrome browser and launch the appliation URL$")
	public void open_chrome_browser_and_launch_the_appliation_URL() throws Throwable {
		driver = createDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
	}

	@Given("^Login using username \"(.*?)\" and password \"(.*?)\"$")
	public void login_using_username_and_password(String username, String pwd) throws Throwable {
		login(username, pwd);
	}

	@When("^User searched with keyword \"(.*?)\" in the global search$")
	public void user_searched_with_keyword_in_the_global_search(String searchKeyWord) throws Throwable {
		enterSerachCriteria(searchKeyWord);
	}

	@Then("^User select the \"(.*?)\" cost item$")
	public void user_select_the_cost_item(String price) throws Throwable {
		selectSortBy(price);
	}

	@Then("^User adds selected item to cart$")
	public void user_adds_selected_item_to_cart() throws Throwable {
		addItemToCart();
	}

	@Then("^User check out the cart and complete the transaction$")
	public void user_check_out_the_cart_and_complete_the_transaction() throws Throwable {
		checkoutAndPayment();
	}

	@And("^User loggoff and close the browser$")
	public void userLoggoffAndCloseTheBrowser() throws Throwable {
		loggoffAndCloseBrowser();
	}
}
