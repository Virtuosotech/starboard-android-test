
package general;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.ByteArrayInputStream;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codeborne.selenide.testng.TextReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.qameta.allure.Allure;

public class Base

{
	public TextReport report = new TextReport();

	public static DesiredCapabilities cap = new DesiredCapabilities();

	public static AndroidDriver<MobileElement> driver;

	public static void Home(AndroidDriver<MobileElement> driver) throws Exception

	{
		// Confirm that you are on Home screen
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Home']")))
				.click();

		// Wait to load the screen For Home
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Home']")));
	}

	@BeforeSuite
	public void LoginTOApplication() throws Exception {

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

		cap.setCapability(MobileCapabilityType.NO_RESET, true); // It will always clear the caches
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability("appium:uiautomator2ServerLaunchTimeout", 60000);
		cap.setCapability("appium:uiautomator2ServerInstallTimeout", 60000);
		cap.setCapability("appium:enforceXPath1", true);
		// cap.setCapability(MobileCapabilityType.DEVICE_NAME,"a1e5e8e3");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/"), cap);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		
		// Open Gmail
		driver.activateApp("com.google.android.gm");
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='SKIP']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Add an email address']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Google']"))).click();
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Sign in']")));
		
		driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='']")).sendKeys("pandyapurvish1707@gmail.com");
		driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Show password']")));
		
		driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='']")).sendKeys("jayshreekrishna@78");
		driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click();
		
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Don’t turn on']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='I agree']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Accept']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Purvish Pandya']"))).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='TAKE ME TO GMAIL']")).click();
		
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='TAKE ME TO GMAIL']"))).click();	
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='SKIP']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='TAKE ME TO GMAIL']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='SKIP']"))).click();
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='TAKE ME TO GMAIL']"))).click();
		
		driver.activateApp("com.google.android.gm");
		
		
		  driver.startActivity(new
		  Activity("com.impossible_research.sandbox.starboard",
		  "com.impossible_research.sandbox.starboard.ui.splash.view.SplashActivity"));
		  
		  try {
		  
		  System.out.println("Installed App found"); WebDriverWait wait1 = new
		  WebDriverWait(driver, 10);
		  
		  WebElement div1 = wait1.until(ExpectedConditions.elementToBeClickable(
		  By.xpath("//android.widget.TextView[@text='Sign in using your 5 digit pin.']"
		  )));
		  
		  if (div1.isDisplayed()) {
		  
		  // Click on 1
		  driver.findElement(By.xpath("//android.widget.TextView[@text='1']")).click();
		  
		  // Click on 2
		  driver.findElement(By.xpath("//android.widget.TextView[@text='2']")).click();
		  
		  // Click on 3
		  driver.findElement(By.xpath("//android.widget.TextView[@text='3']")).click();
		  
		  // Click on 4
		  driver.findElement(By.xpath("//android.widget.TextView[@text='4']")).click();
		  
		  // Click on 5
		  driver.findElement(By.xpath("//android.widget.TextView[@text='5']")).click();
		  
		  WebDriverWait wait = new WebDriverWait(driver, 50);
		  
		  WebElement div = wait.until(
		  ExpectedConditions.elementToBeClickable(By.xpath(
		  "//android.widget.TextView[@text='Home']")));
		  
		  } }
		  
		  catch (Exception e)
		  
		  { System.out.println(e); Allure.addAttachment("AllureSelenide", new
		  ByteArrayInputStream(((TakesScreenshot)
		  driver).getScreenshotAs(OutputType.BYTES)));
		  
		  }
		  
		  Home(driver);
		 
	}

	@AfterSuite
	public void TearDown() throws Exception

	{
		
		//driver.terminateApp("com.impossible_research.sandbox.starboard");

		Reporter.log("==========Application closed==========", true);

	}

}
