package com.automation.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	 private static ExtentReports extentReport;
     private static ExtentTest test;
     private static ExtentHtmlReporter htmlReporter;

 	/**
 	 * gets an instance of the report.
 	 * 
 	 * @param filePath is the path of the file.
 	 * @param fileName is the name of the file.
 	 * @return the instance of the extent report.
 	 */
     public static ExtentReports getExtent(String filePath,String fileName)
     {
         if (extentReport != null)
             return extentReport; // avoid creating new instance of html file
         extentReport = new ExtentReports();
         extentReport.attachReporter(GetHtmlReporter(filePath,fileName));
         return extentReport;
     }

     private static ExtentHtmlReporter GetHtmlReporter(String filePath,String fileName)
     {
    	 String file = filePath+"\\"+fileName;
         htmlReporter = new ExtentHtmlReporter(file);
         // make the charts visible on report open
         htmlReporter.config().setChartVisibilityOnOpen(true);
         htmlReporter.config().setDocumentTitle("Regression report");
         htmlReporter.config().setReportName("Regression cycle");
         return htmlReporter;
     }

     /**
  	 * creates an instance of the test.
  	 * 
  	 * @param name is the name of the test case.
  	 * @param description is a description of what the test case can do.
  	 * @return the instance of the test.
  	 */
     public static ExtentTest createTest(String name, String description)
     {
         test = extentReport.createTest(name, description);
         return test;
     }
}

