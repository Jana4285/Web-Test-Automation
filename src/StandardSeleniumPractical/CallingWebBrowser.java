package StandardSeleniumPractical;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CallingWebBrowser {

	public static void main(String[] args) {
		//setting up third party properties in the class file
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Janaka Sajith\\eclipse-workspace\\StandardSelenium\\ThirdParty resouce files\\Chorme Driver\\V117.exe");
		 
		 //define the webDriver
		 WebDriver driver = new ChromeDriver();
		 
		 //call the Chrome browser and make the interface maximize in the laptop screen
		 driver.manage().window().maximize();
		 
		 //calling the web URL
		 driver.get("https://www.topjobs.lk/");
		 
		 driver.get("https://drive.google.com/drive/u/0/folders/1TbLLJsK4i6qrSQpUjVnMQgzXZXACch8o");
		 driver.get("https://www.youtube.com/watch?v=9k6tYlKfE8I");
	}

}
