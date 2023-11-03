package StandardSeleniumPractical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementAutomation {
	
	//this is the file
	
	public static void main(String[] args) throws InterruptedException{
		
	//Declaring thechrome driver path
		String ChromeDriverPath="C:\\Users\\Janaka Sajith\\eclipse-workspace\\StandardSelenium\\ThirdParty resouce files\\Chorme Driver\\V117.exe";
	
	//set System property for chrome Driver
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Janaka Sajith\\eclipse-workspace\\StandardSelenium\\ThirdParty resouce files\\Chorme Driver\\V117.exe");
	 
	 //define the webDriver
	 WebDriver driver = new ChromeDriver();
	 
	 //call the Chrome browser and make the interface maximize in the laptop screen
	 driver.manage().window().maximize();
	 
	 //calling the web URL
	 driver.get("file:///C:/Users/Janaka%20Sajith/Downloads/Selenium%20Web%20Controllers%20(1).html"); 
	 
	 WebElement Option1RadioButton= driver.findElement(By.id("vfb-7-1"));
	 WebElement Option2RadioButton= driver.findElement(By.id("vfb-7-2"));
	 WebElement Option3RadioButton= driver.findElement(By.id("vfb-7-3"));
	 
	 //triger the action for given option automation
	 
	 Option2RadioButton.click();
	 
	 
	 //sample logic
	if(Option2RadioButton.isSelected())
	 {
		 System.out.println("I have selected the Option 2 button");
	 }
	 else {
		 System.out.println("I hav selected another option");
	 }
	
	//identify the Webelement- checkbox
	 WebElement CheckBox1=driver.findElement(By.id("vfb-6-0"));
	 WebElement CheckBox2=driver.findElement(By.id("vfb-6-1"));
	 WebElement CheckBox3=driver.findElement(By.id("vfb-6-2"));
	 
	 //triger the action for CheckBox Operation
	 
	 CheckBox1.click();
	 CheckBox2.click();
	 
	 //sample logic
	 if(CheckBox1.isSelected() && CheckBox2.isSelected())
	 {
		 System.out.println("I have selected Checkbox 1 and Check box 2");
	 }
	 else {
		 System.out.println("I have selected another Checkbox");
	 }
		 
	//identify the WebElement-Combo box 
		 Select  fruits = new Select(driver.findElement(By.id("fruits")));
		 
	//1st method to identify the value - ByVisibleText with action
		 fruits.selectByVisibleText("Banana");
		 System.out.println("I selected the Banana from the visible Text");
		 
	//2nd method to identify the value -ByIndex with action
		 fruits.selectByIndex(8);
		 System.out.println("I selected the Lemmon by Index");
		 
	//identify the WebElement -DropDown
		 
		 Select country= new Select(driver.findElement(By.name("country")));
	
		// Triger the action
		 country.selectByVisibleText("AUSTRALIA");
		 System.out.println("I have selected  AUSTRALIA");
		 
		 //take 6 seconds brake to the server
		 Thread.sleep(6000);		
		 
		 // identify the Webelement -Submit button
		 WebElement Button= driver.findElement(By.name("submit"));
		 //triger the action
		 Button.click();
		 System.out.println("I selected the Button");
		 
		 //identify the WebElement-Text Box
		 WebElement TextBox=driver.findElement(By.name("userName"));
		 //triger the action
		 TextBox.sendKeys("sample Text Has been Added");
		 
		//identify the LinkText -HyperLink
		 driver.findElement(By.linkText("your destination")).click();
		System.out.println("I used your destination");
		 
		 //retreving the number of column in the  table
		 List <WebElement> columns= driver.findElements(By.xpath("//html/body/table/tbody/tr"));
		 System.out.println("Column Count " + columns.size());
		 
		 //retreiwing the number of rows in the table
		 List<WebElement> rows=driver.findElements(By.xpath("//html/body/table/tbody/tr[2]"));
		 System.out.println("Rows Count " + rows.size());
		 
		//Retrieving a cell value
			WebElement baseTable = driver.findElement(By.tagName("table"));
			WebElement tableRowText = baseTable.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]"));
			String cellValue = tableRowText.getText();
			System.out.println("The cell value is: "+ cellValue);
 
	 }
	 }
