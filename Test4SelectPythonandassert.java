package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4SelectPythonandassert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		Select python = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-1")));
		python.selectByVisibleText("Python");
		
		

		
		String selectedOption = python.getFirstSelectedOption().getText();
        if (selectedOption.equals("Python")) {
            System.out.println("Python has been selected.");
        } else {
            System.out.println("Python has not been selected");
        }
		
		

	}

}
