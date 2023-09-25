package seleniumtutorials;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMakeMyTrip {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector(
				"#root > div > div.minContainer > div > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input"))
				.sendKeys("Pune");

		List<WebElement> dynamicList = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));

		for (int i = 0; i < dynamicList.size(); i++) {
			String text = dynamicList.get(i).getText();
			if (text.contains("Pune, India")) {
				dynamicList.get(i).click();
				break;
			}
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector(
				"#root > div > div.minContainer > div > div > div > div.fsw > div.fsw_inner.returnPersuasion > div:nth-child(4) > label > p.blackText.font20.code.lineHeight36"))
				.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(
				"#root > div > div.minContainer > div > div > div > div.fsw > div.fsw_inner.returnPersuasion > div:nth-child(4) > label > p.blackText.font20.code.lineHeight36"))
				.click();

		driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > p > a"))
				.click();

	}

}
