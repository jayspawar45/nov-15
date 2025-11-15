package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v140.filesystem.model.File;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class screenshot {
	public static void main(String[] args) throws IOException
	{
		WebDriver w=new ChromeDriver();
		w.get("https://www.demo.guru99.com/test/drag_drop.html");
	//	File s=((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
		File d=((TakesScreenshot)w).getScreenshotAs(OutputType.FILE);
		Files.copy(d, new File("C:\\Users\\CDAC\\Pictures\\s.png"));	
	}
}
