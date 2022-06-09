package testingpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://www.leafground.com/pages/Alert.html");
		
		
		WebElement alertbox=ob.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert=ob.switchTo().alert();
		alert.accept();
		
		
		WebElement confirmbox=ob.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert confirmalert=ob.switchTo().alert();
		confirmalert.accept();
		
		WebElement promptbox=ob.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
	Alert promptalert=ob.switchTo().alert();
	promptalert.sendKeys("Keep Learning");
	promptalert.accept();

	}

}
