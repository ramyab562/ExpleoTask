package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/workspace/ExpleoTask/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
		    String projectPath = System.getProperty("user.dir");
		    System.out.println("projectPath is : "+projectPath);
		    String chromeDriverLocation = projectPath+"/src/test/resources/drivers/chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
}
