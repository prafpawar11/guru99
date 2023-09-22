package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {

	protected static WebDriver driver;
	protected static Properties prop;

	public BaseClass() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir")+"\\src\\main\\java\\Config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void iniliazation(String browsername) {

		if (browsername.equals("chrome")) {
			

			driver = new ChromeDriver();
		} 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
