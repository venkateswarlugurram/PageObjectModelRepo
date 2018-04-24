package Com.cps.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import Com.cps.Utill.TestUtil;

public class CPSBankingURL {
	public static WebDriver driver;
	public 	static Properties prop;

	public CPSBankingURL() {

		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					"C:\\Users\\ACER\\eclipse-workspace\\CPSBankingFreamWork\\src\\main\\java\\Com\\com\\cps\\config\\Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void intialization() {
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("URL");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {

			System.setProperty("webdriver.gecko.driver",
					"E:\\Selenium drivers\\geckodriver-v0.20.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver",
					"E:\\Selenium drivers\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(url);
		String title = driver.getTitle();
		Assert.assertEquals(title, "CPS BANK", "titles are not matched testcase fail");
	}
}
