package com.script;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helper.Helper;
import com.pages.Pages;

public class MainScript {

	public static void main(String[] args) {
		Pages page=new Pages();
		Helper help=new Helper();
		page.file();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari.subramani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(page.getToolsQA_ALERT());
		
		XSSFSheet sheet = help.sheet();
		
		
		int cell=help.find(sheet,page.getGiven_Data());
	    int row=help.findXPath(sheet, page.getHeader_Data());
	    help.alert(sheet, driver, cell, row);

	}

}
