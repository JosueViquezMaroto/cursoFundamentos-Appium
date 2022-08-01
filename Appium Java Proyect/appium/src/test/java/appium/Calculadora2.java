package appium;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculadora2 {
	By search = By.xpath("//*[@content-desc='Buscar']");
	By cajabus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.EditText");
	By sele = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
	WebDriver driver;
	@BeforeClass
	public void SetUp() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();		
			caps.setCapability(CapabilityType.PLATFORM_NAME,"Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,"EVA-L09");
			caps.setCapability(MobileCapabilityType.UDID,"MWS0216524015948");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
			caps.setCapability("appPackage","com.android.calculator2");
			caps.setCapability("appActivity","com.android.calculator2.Calculator");
			caps.setCapability("noReset", true);
			caps.setCapability("noSign", true);
			caps.setCapability("autoGrantPermissions", true);
			URL url= new URL("http://127.0.0.1:443/wb/hub");
			driver = new RemoteWebDriver(url,caps);
			}
			catch(Exception e) 
			{
				System.out.println("Error en la clase "+ e);
			}		
		}	
//	@Test
//	public void test() {	
//		try {
//			driver.findElement(search).click();
//			driver.findElement(cajabus).sendKeys("XXXXXXX");
//			driver.findElement(sele).click();
//			WebDriver augment = new Augmenter().augment(driver);
//			File srcfile = ((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(srcfile, new File("test1.png"));					
//			}
//			catch(Exception e) 
//			{
//				System.out.println("Error en la clase "+ e);
//			}
//		}	
		@AfterClass
		public void testend() throws Exception{
			driver.quit();
		}	
}
