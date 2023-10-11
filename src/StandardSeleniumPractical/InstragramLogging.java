package StandardSeleniumPractical;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstragramLogging {

	public static void main(String[] args) {
			//setting up thirdparty properties in the class file
					System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Janaka Sajith\\\\eclipse-workspace\\\\StandardSelenium\\\\ThirdParty resouce files\\\\Chorme Driver\\\\V117.exe");
					
					//define the web driver
					WebDriver  driver = new ChromeDriver();
					
					//call the chrome browser and make the interface maximize in the pc
					driver.manage().window().maximize();

					//call the url in the browser
					driver.get("https://www.instagram.com/");
		

	}

}
 