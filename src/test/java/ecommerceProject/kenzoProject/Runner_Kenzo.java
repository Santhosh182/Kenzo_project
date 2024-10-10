package ecommerceProject.kenzoProject;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageObjectManager.Pom;
import com.PageObjectModel.HomePage;
import com.PageObjectModel.LandingPage;
import com.kenzoBaseClass.Base_Kenzo;
import com.sun.tools.sjavac.Log;

public class Runner_Kenzo extends Base_Kenzo {
	public static WebDriver driver = browser_configuration("Chrome");
	public static Pom p = new Pom(driver);
//	public static LandingPage lp = new LandingPage(driver);
//	public static HomePage hp = new HomePage(driver);

	public static void main(String[] args) {
		try {
			// _____________________________ Cookies Page____________________
			getUrl("https://www.kenzo.com/");
			wait_implicit();
			clickOnElement(p.getLp().getAccept_cookies());
			System.out.println("Successfully Accepted Cookies");

			// _____________________ Country Selector_______________________
			Thread.sleep(3000);
			clickOnElement(p.getLp().getInternational_btn());
			System.out.println("Successfully checked into International Website");
			// _______________________ Incorrect Login details_____________________
			// driver.findElement(By.xpath("(//button[@aria-Label='Login'])[2]")).click();
			clickOnElement(p.getHp().getLogin_btn());
			inputValues(p.getHp().getEmail_id(), "abc@gmail.com");
			clickOnElement(p.getHp().getContinue_btn());
			System.out.println("Successfully entered login button");
//			clickOnElement(p.getHp().getPassword());
			inputValues(p.getHp().getPassword(), "abc123");
			// Log.info("Successfully enterred the Password");
			clickOnElement(p.getHp().getLogged_in());
			WebElement error_msg = p.getHp().getError_msg();
			String captured_msg= error_msg.getText();
			assertEquals(captured_msg, "This field needs 8 to 255 characters");
			System.out.println("assertion completed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			tear_down();
		}
	}
}
