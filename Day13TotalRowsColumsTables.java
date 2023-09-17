package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13TotalRowsColumsTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		// Getting total number of tables
		List<WebElement> tb1 = driver.findElements(By.xpath("//*[table]"));

		System.out.println(tb1.size());

		// getting total number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		int totalRows = rows.size();
		System.out.println(rows.size());

		// getting total number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
		int totalColumns = columns.size();
		System.out.println(columns.size());

		int sum = 0;
		for (int i = 2; i <= totalRows; i++) {
			System.out.println(i);
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[3]")).getText();
			System.out.println(text);
			sum = sum + Integer.parseInt(text);
		}

		System.out.println(sum);

		// find the name Michael in table 1

		for (int i = 2; i <= totalRows; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[1]")).getText();
			System.out.println(text);
			if (text.equals("Michael")) {
				System.out.println("test case pass");
				break;
			}
		}

	}

}
