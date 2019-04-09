package com.automation.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	 private static ExtentReports extentReport;
     private static ExtentTest test;
     private static ExtentHtmlReporter htmlReporter;

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

     public static ExtentTest createTest(String name, String description)
     {
         test = extentReport.createTest(name, description);
         return test;
     }
}

