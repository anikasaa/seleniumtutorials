package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		// getText()

		WebElement el = driver.findElement(By.cssSelector(".section_header"));
		String txt = el.getText();
		System.out.println(txt);

		// getTagName()

		String txt2 = el.getTagName();
		System.out.println(txt2);

		// getAttribute()

		String txt3 = el.getAttribute("class");
		System.out.println(txt3);

		// getSize()
		driver.manage().window().maximize();
		Dimension a = el.getSize();
		System.out.println(a);

		// getSize()

		Dimension b = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).getSize();
		System.out.println(b);

		String txt4 = el.getCssValue("font-size");
		String txt5 = el.getCssValue("font-family");
		String txt6 = el.getCssValue("color");

		System.out.println(txt4);
		System.out.println(txt5);
		System.out.println(txt6);

		Point q = el.getLocation();
		System.out.println(q);
		
		driver.quit();
		
		

	}

}
