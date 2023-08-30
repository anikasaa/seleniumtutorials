package seleniumtutorials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day2Program1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//Finding elements
		
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement emailAdd = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement reset = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		
		//Writing on it
		
		firstName.sendKeys("Anisha");
		lastName.sendKeys("tuladhar");
		emailAdd.sendKeys("anisha.kansakar@gmail.com");
		message.sendKeys("i am learning selenium");
		
		
		//Clear method
		//firstName.clear();                                           
		
		//Click button
		//reset.click();
		
		//getText Method
		
		WebElement heading = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String S1 = heading.getText();
		System.out.println(S1);
		
		
		
		
		
				
		
		
	
		
		

	}

}
