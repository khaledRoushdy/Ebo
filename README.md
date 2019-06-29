[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.khaledroushdy/ebo/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.khaledroushdy/ebo)

# Ebo

Ebo is a test framework that is wrapper for some libraries like apache poi,selenium and extentreport.It helps the automation engineers to write less code with high maintainability.

## Installation

The framework is available to be downloaded from [here](https://search.maven.org/artifact/com.github.khaledroushdy/ebo/1.1/jar)
Use the package manager [maven](https://maven.apache.org/download.cgi) to install ebo.

```bash
mvn install
```

## Create Pages
If you want to create pages using ebo framework, you can use [Pages Automation Tool](http://spooky-root.surge.sh/).After you entered all the required fields.You will need to import the json file and template of the java class file into your project.
This is a sample of a the template that you will get from Pages Automation Tool.

```bash
package com.automation.pages;

import com.github.khaledroushdy.elements.*;
import com.github.khaledroushdy.clickableelements.*;
import com.github.khaledroushdy.elements.inputelements.*;
import com.github.khaledroushdy.selectelements.*;
import com.github.khaledroushdy.elements.readableelements.*;
import com.github.khaledroushdy.jsonParser.ElementParser;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;

public class EboLoginPage{

	/*This path of the json file that you downloaded from Pages Automation tool, you can either create this path in your project or 
	 change the path of the file from here.
	*/
	private ElementParser elementParser = new ElementParser("src/main/resources/objectRepository/EboLoginPage.json");
	private Driver driver;
	private ExtentTest test;

	public EboLoginPage(Driver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public EboLoginPage(Driver driver) {
		this.driver = driver;
	}

	private Textbox eboTextbox() {
		Textbox eboTextbox= (Textbox) ElementFactory.createElement(ElementTypes.TEXTBOX,elementParser, driver,"eboTextbox");
		return eboTextbox;
	}

	private Button eboButton() {
		Button eboButton= (Button) ElementFactory.createElement(ElementTypes.BUTTON,elementParser, driver,"eboButton");
		return eboButton;
	}
}
```

You can edit your EboLoginPage class by adding a method called login
```
public void login(String username) {
		eboTextbox().enterText(username);
		eboButton().clickOnIt();
	}
```
All the methods that are related to the textbox will be shown and then when you type eboButton all the methods that are related to the 
Button will be shown.

If you want to log all the action done by the web elements you can add the login method like this
```
public void login(String username) {
		// the output in the report will be "username has been entered into ebo
		// textbox".
		eboTextbox().enterText(username, "ebo textbox", test);
		// the output in the report will be be "ebo button has been clicked
		eboButton().clickOnIt("ebo button", test);
	}

 ``` 

There are several types of web elements that can be found in Pages Automation Tool like (Button,textbox,textarea,span,div..etc)

## Create Tests
You can write your tests using TestNG or JUnit

In the below this a sample of how your tests should look like
```
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.TestName;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.browser.DriverTypes;
import com.github.khaledroushdy.report.ExtentManager;

public class SmokeTests {

	private EboLoginTest eboLoginTest;
	private Driver driver; // wrapper driver that can log all the actions done by it.
	private ExtentReports extentReport;
	private ExtentTest test;

	@BeforeAll
	public void oneTimeSetup() {
		// If you want to have a fancy report you should write this line.
		extentReport = ExtentManager.getExtent("your path for your file", "regression report.html");
	}

	@Before
	public void setUp() {
		// This is a the driver that the pages will use
		driver = new Driver(DriverTypes.Chrome, "path of your chrome driver");
	}

	@Test
	public void loginTestUsingTheReport() {
		test = extentReport.createTest("name of your test", "description of what your test does");
		driver.goToUrl("your url");
		eboLoginPage = new eboLoginPage(driver, test);
		eboLoginPage.login("my username");
	}

	@Test
	public void loginTestWithoutUsingTheReport() {
		driver.goToUrl("your url");
		eboLoginPage = new eboLoginPage(driver);
		eboLoginPage.login("my username");
	}

	@After
	public void tearDown() {
		driver.closeSingleWindow(); // close the driver
	}

	@AfterClass
	public void oneTimeTearDown() {
	  extentReport.flush();  //close the report
	}
  
```
## Data driven using excel
If you want to read your data that are stored in a excel file ,then your excel sheet should look like this
[![excelPic.png](https://i.postimg.cc/L4NZs4Py/excelPic.png)](https://postimg.cc/Wtq4WvXr)

To get the data from the excel you can get using ExcelTestParser api which has 3 methods  <br />
GetCellValue() which return a specific cell value.  <br />
GetSpecificTestCase() which returns a specific test case.  <br />
GetAllTestCases() which returns all the test cases.  <br />
```
@Test
	public void getDataFromExcel() throws IOException {

		ExcelTestParser testParser = new ExcelTestParser("path of the excel sheet");
		String username = testParser.getCellValue("name of the sheet", "the name of the test case", "column name")
				.toString(); 	
		Map<Object, Object> testCase=testParser.getSpecificTestCase("name of the sheet", "name of the test case");// get a specific test case
		HashMap<String, HashMap<String, String>>allTestCase= testParser.getAllTestCases("name of the sheet"); //get all the test cases
	}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[Apache Version 2.0](https://www.apache.org/licenses/LICENSE-2.0) 
