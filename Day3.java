package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// TestCase 1
		// <h2 name="contactme" id = "three" class="section_header">CONTACT US</h2>
		// Xpath , CSS selector

		// tagName:

		WebElement headTwo = driver.findElement(By.cssSelector("h2"));
		String q1 = headTwo.getText();
		System.out.println(q1);

		// class
		WebElement headTwob = driver.findElement(By.cssSelector(".section_header"));
		String q2 = headTwo.getText();
		System.out.println(q2);

		// id
		// <form action="contact_us.php" method="post" id="contact_form">

//		WebElement headTwoc = driver.findElement(By.cssSelector("#contact_form"));
//		boolean pre = headTwoc.isDisplayed();
//		System.out.println(pre);

		// anyAttribute
		// tagName[attribute = "value"]

		WebElement headThreeD = driver.findElement(By.cssSelector("<h2[name=\"contactme\"]"));
		String q3 = headTwo.getText();
		System.out.println(q3);
		if (q3.equals("CONTACT US")) {
			System.out.println("Testcase 1 pass");
		} else {
			System.out.println("Testcase 1 fail");
		}

		// Testcase2 (happy path)

		// Arrange

		// Action

		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("anisha");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("tuladhar");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("anisha.kansakar@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello i am learning selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();

		// Assertion

		boolean q4 = driver.findElement(By.cssSelector("h1")).isDisplayed();
		if (q4) {
			System.out.println("Testcase 2 pass");
		} else {
			System.out.println("Testcase 2 fail");
		}

		// test Case 3 (In-correct email address)

		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("anisha");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("tuladhar");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("anisha.kansakargmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello i am learning selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		boolean q5 = driver.findElement(By.cssSelector("body")).isDisplayed();

		if (q5) {
			System.out.println("test case 3 pass");

		} else {
			System.out.println("test case 3 fail");
		}

		// test case 4
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("anisha");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("tuladhar");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("anisha.kansakar@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("hello i am learning selenium");
		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
		String q6 = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();
		System.out.println(q6);

		if (q6.isEmpty()) {
			System.out.println("test case 4 pass");
		} else {
			System.out.println("test case 4 fail");
		}

	}

}
