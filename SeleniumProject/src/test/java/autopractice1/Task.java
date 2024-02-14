package autopractice1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();

		//WebDriver Methods & WebElements Commands

		//Get Url
		driver.get("https://testautomationpractice.blogspot.com/");

		//using manage window maximize
		Thread.sleep(5000);
		driver.manage().window().maximize();


		//using navigate refresh webpage
		Thread.sleep(3000);
		driver.navigate().refresh();

		//Current Url
		String currrentUrl =driver.getCurrentUrl();
		System.out.println("actual url is "+ currrentUrl);

		//Get Title
		String title = 	driver.getTitle();
		System.out.println("actual title is" +title);

		//findelement & sendkeys
		//Using findElement method to send user data using sendkeys
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("priyanka");  

		//click operation
		WebElement clickOperation =	driver.findElement(By.xpath("//input[@id='female']"));
		clickOperation.click();

		//is Selected
		clickOperation.isSelected();
		System.out.println("click operation status" +clickOperation.isSelected());   

		//clear   
		WebElement name1 = driver.findElement(By.id("name"));
		name1.sendKeys("priyanka");
		name1.clear();  


		//Get Text
		String text = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println(text);



		//isEnabled   & is Displayed
		WebElement checkBox = driver.findElement(By.id("sunday"));
		checkBox.isEnabled();
		System.out.println("checkbox status" +checkBox.isEnabled());





		//close
		driver.close();
		//driver.quit();


	}
}
