package acti.driver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	public static WebDriver driver; // this driver create globally because give the access all the project.
	Properties prop; // this property create globally because give the access others.

	// this methods to upload the file
	
	public DriverManager() {
		
		try {
			File file = new File("./src/test/resources/acti/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} 
		catch (Exception e)
		{
			System.out.println("unable to load properties file...please check" + e.getMessage());
		}
	}

	// this methods to handle the browser

	public void init_driver() {
		String brows = prop.getProperty("browser");

		if (brows.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/acti/browser/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (brows.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/acti/browser/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (brows.trim().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/test/resources/acti/browser/msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			// System.out.println("please check the properties file for suported browser
			// types");
			System.err.println("please check the properties file for suported browser types"); // to see the err in red
																								// color
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);// for the complete page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// for the element
		get_url();

	}

	public void get_url() {
		String url = prop.getProperty("url");
		driver.get(url);
	}

	public static void quit_browser() {
		driver.close();
	}

}
