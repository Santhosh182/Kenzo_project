package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjectManager.Pom;
import com.kenzoBaseClass.Base_Kenzo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KenzoStepdefinitions extends Base_Kenzo {
	public static WebDriver driver = browser_configuration("Chrome");
	public static Pom p = new Pom(driver);
@BeforeClass
	@Given("User login with URL")
	public void user_login_with_url() {
		getUrl("https://www.kenzo.com/");
	}
@Test(dependsOnMethods= {"user_login_with_url()"})
	@Given("User Accepting the cookies link")
	public void user_accepting_the_cookies_link() {
		wait_implicit();
		clickOnElement(p.getLp().getAccept_cookies());
		System.out.println("Successfully Accepted Cookies");
	}

	@When("User navigating to international page link")
	public void user_navigating_to_international_page_link() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElement(p.getLp().getInternational_btn());
		System.out.println("Successfully checked into International Website");
	}

	@When("User landed on hompepage and navigate to usericon")
	public void user_landed_on_hompepage_and_navigate_to_usericon() {
		clickOnElement(p.getHp().getLogin_btn());
	}

	@When("^user entered UserId (.+) in the email_id field$")
	public void user_entered_user_id_in_the_email_id_field(String UserId) {
		inputValues(p.getHp().getEmail_id(), UserId);
	}

	@Then("user clicked on continue button")
	public void user_clicked_on_continue_button() {
		clickOnElement(p.getHp().getContinue_btn());
		System.out.println("Successfully entered login button");
	}

	@Then("^user entered password (.+) in the password field$")
	public void user_entered_passowrd_in_the_password_field(String passowrd) {
		inputValues(p.getHp().getPassword(), passowrd);
	}

	@Then("user submitted to login")
	public void user_submitted_to_login() {
		clickOnElement(p.getHp().getLogged_in());
	}

	@Then("user validating the warning caption")
	public void user_validating_the_warning_caption() {
		WebElement error_msg = p.getHp().getError_msg();
		String captured_msg = error_msg.getText();
		assertEquals(captured_msg, "This field needs 8 to 255 characters");
		System.out.println("assertion completed");
	}
	@When("user entered Men sneakers")
	public void user_entered_men_sneakers() {
	  wait_explicit_visible(p.getHp().getMenCat(), "visible");
		mouseAction("movetoelement", p.getHp().getMenCat());
		wait_explicit_visible(p.getHp().getMenSneakers(), "visible");
	   clickOnElement(p.getHp().getMenSneakers());
	}
	@When("user chosing the colour from the given option")
	public void user_chosing_the_colour_from_the_given_option() {
	 clickOnElement(p.getSp().getCamelClr());
	}
	@When("user chose the respective shoe")
	public void user_chose_the_respective_shoe() {
	   wait_explicit_visible(p.getSp().getShoeElem(), "Visible");
		clickOnElement(p.getSp().getShoeElem());
	}
	@Then("user directed to Add to cart page")
	public void user_directed_to_add_to_cart_page() {
	 System.out.println("Successfully directed to CartPage");
	}
	@When("user selected respective colour")
	public void user_selected_respective_colour() {
	 clickOnElement(p.getSp().getShoeClr());
	}
	@Then("user selected respective size")
	public void user_selected_respective_size() {
	List <WebElement> listshoeSize = p.getSp().getShoeSize();
	 for (int i = 0; i < listshoeSize.size(); i++)
	 {
		String listOfClr = listshoeSize.get(i).getText();
		if (listOfClr.equalsIgnoreCase("42")) {
			
		}
	}
	}
	
	@When("user clicked on the cartbtn")
	public void user_clicked_on_the_cartbtn() {
		wait_explicit_visible(p.getSp().getShoeElem(), "Visible");
		clickOnElement(p.getCb().getCartBtn());
	}
	@Then("user clicked on ContinueCart Btn")
	public void user_clicked_on_continue_cart_btn() {
		
		wait_explicit_visible(p.getSp().getShoeElem(), "Visible");
clickOnElement(p.getCb().getContinueBtn());
	    
	}
}

