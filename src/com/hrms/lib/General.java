package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;

	public class General extends Global{
	//Re-usable functions
	public void openApplication() {
		Log.info("*******started execution***********"); 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Salma\\Desktop\\tetsing\\chromedriver_win32\\chromedriver(12).exe");
	driver=new ChromeDriver();
	driver.navigate().to(url);
	
	System.out.println("Application opened"); //console
	Reporter.log("Application Opened");//html report
	Log.info("Application Opened");//log file
	}
	public void closeApplication() {
		driver.quit();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.xpath(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		Log.info("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	public void addEmp() {
		System.out.println("Adding new emp");
		Log.info("Add emp");
	}
	public void delEmp() {
		System.out.println("Delete emp");
		Log.info("delete emp");
	}
	}


