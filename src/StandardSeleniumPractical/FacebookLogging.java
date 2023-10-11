package StandardSeleniumPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogging {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Janaka Sajith\\eclipse-workspace\\StandardSelenium\\ThirdParty resouce files\\Chorme Driver\\V117.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 //call the Chrome browser and make the interface maximize in the laptop screen
		 driver.manage().window().maximize();
		 
		//call the url in the browser
			//driver.get("https://google.com/");
			//find web element using xpath
			//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Facebook.com" + Keys.ENTER);
			//clcik the first search result
			//WebElement firstsearchresult = driver.findElement(By.xpath("/html/body/div[6]/div/div[9]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
			//firstsearchresult.click();
			//waiting for the load results
			//Thread.sleep(3000);
			//click the search results the start in Facebook - log in or sign up
			//driver.findElement(By.linkText("Facebook - log in or sign up")).click();
			
			//call the url in the browser
			driver.get("https://www.facebook.com/");
					
			//set expected result and actual result
			String expected_title = "Facebook – log in or sign up";
			String actual_title = driver.getTitle();
			
			//set 3 second break for the loading
			Thread.sleep(3000);
			
			//check whether the correct web page is loaded
			if (expected_title.equals(actual_title)) {
				//find the username textbox by id
				WebElement username = driver.findElement(By.id("email"));
				username.sendKeys("janaka1");//type "nadun1" on the text box
				
				//find the password textbox by id
				WebElement password = driver.findElement(By.id("pass"));
				password.sendKeys("test123");//Enter this password on password text box
				
				//find the login button by name
				WebElement login_button = driver.findElement(By.name("login"));
				login_button.click();//Enter the submit button	
				
				//set the expected url and actual url
				String expected_url = "https://www.facebook.com/recover/initiate/?lara_product=www_first_password_failure";
				String actual_url = driver.getCurrentUrl();
				
				//set 3 second break for the loading
				Thread.sleep(3000);
				
				//check the whether if the correct url is showing
				if (expected_url.equals(actual_url)) {
					System.out.println("Pass the first case");
				
					//go back to the previous page
					driver.navigate().back();
					
					//set 3 second break for the loading
					Thread.sleep(3000);
					
					//clear the loaded result and again enter the user name
					WebElement username1 = driver.findElement(By.id("email"));
					username1.clear();
					username1.sendKeys("0712309059");
					
					//again enter the password
					WebElement password1 = driver.findElement(By.id("pass"));
					password1.sendKeys("nadun@509JND");
					
					//again enter the login button
					WebElement login_button1 = driver.findElement(By.name("login"));
					login_button1.click();
					
					//set expected result and actual result
					String expected_title1 = "Facebook";
					String actual_title1 = driver.getTitle();
					
					//set 3 second break for the loading
					Thread.sleep(3000);
					
					//check whether the correct web page is loaded
					if (expected_title1.equals(actual_title1)) {
						System.out.println("Pass the second case");
						//close the browser
						driver.close();
					}
				}else {
					System.out.println("Pass the second case");
				}	
			}else {
					System.out.println("Failed the first case");
			}
		

	}

}
