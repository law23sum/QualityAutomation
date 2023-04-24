
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class UITests {

	@Test
	public void SysInfoTest() throws Exception {
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"cd C:\\Program Files (x86)\\Windows Application Driver & WinAppDriver.exe\"");
		Thread.sleep(5000);

		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "C:\\Windows\\System32\\msinfo32.exe");
		RemoteWebDriver driver = new WiniumDriver(new URL("http://localhost:9999"), appCapabilities);

		driver.findElement(By.id("Help")).click();
		driver.findElement(By.id("About System Info...")).click();

		driver.quit();
	}

	@Test
	public void CalculatorTest() throws Exception {
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"cd C:\\Program Files (x86)\\Windows Application Driver & WinAppDriver.exe\"");
		Thread.sleep(5000);

		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		RemoteWebDriver driver;
		driver = new WiniumDriver(new URL("http://localhost:9999"), appCapabilities);

		driver.findElement(By.id("5")).click();
		driver.findElement(By.id("Plus")).click();
		driver.findElement(By.id("3")).click();
		driver.findElement(By.id("Equals")).click();

		driver.quit();
	}
}