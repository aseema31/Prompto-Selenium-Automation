package main.java.com.infolob.container.common.utilities;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

public class Logger {
	 public static void analyzeLog(WebDriver driver) {
	        LogEntries logEntries = driver.manage().logs().get("browser");
	        for (LogEntry entry : logEntries) {
	            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	            //do something useful with the data
	        }
	 }

}
