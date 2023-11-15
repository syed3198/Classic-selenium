package winium;
//syed before running this file,Don't forget to change screen resolution
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class AutomateCalculator {

	public static void main(String[] args) throws InterruptedException, IOException {
		Process p = Runtime.getRuntime()
				.exec("C:\\Users\\user\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
		Thread.sleep(20000);
		System.out.println(p.pid());
		

		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		Thread.sleep(8000);
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		
		

		driver.findElement(By.name("Five")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Two")).click();
		driver.findElement(By.name("Equals")).click();
		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		System.out.println("Result after addition is: " + output);
		Thread.sleep(2000);
		driver.findElement(By.name("Close Calculator")).click();

		int pid = (int) p.pid();
		Runtime.getRuntime().exec("taskkill /pid " + pid + " /f");

		/*
		 * driver.findElement(By.id("15")).sendKeys("sdfghjkqwertyuiozxcvbnm");
		 * Thread.sleep(3000); driver.findElement(By.name("File")).click(); Actions act
		 * = new Actions(driver); Thread.sleep(3000); WebElement e =
		 * driver.findElement(By.id("3"));
		 * act.moveToElement(e).click().build().perform(); WebElement element =
		 * driver.findElement(By.id("1001")); element.clear(); element.sendKeys("test");
		 * driver.findElement(By.id("1")).click();
		 * driver.findElement(By.id("Microsoft.Windows.Explorer")).click();
		 * driver.findElement(By.name("Downloads")).click();
		 * driver.findElement(By.id("0")).getAttribute("Name");
		 */

	}

}
