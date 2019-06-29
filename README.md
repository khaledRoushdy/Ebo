[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.khaledroushdy/ebo/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.khaledroushdy/ebo)

# Ebo

Ebo is a test framework that helps automation engineers/developers to write less code with high maintainability. Ebo uses libraries like Selenium-java, Extentreports, Jackson-databind and Apache POI.

## Installation

The framework is available to be downloaded from [here](https://search.maven.org/artifact/com.github.khaledroushdy/ebo/1.1/jar)
Use the package manager [maven](https://maven.apache.org/download.cgi) to install ebo by running.

```bash
mvn install
```
## Usage

If i want to write automated tests for this website
[![Demo-Website.png](https://i.postimg.cc/nVT1GWFS/Demo-Website.png)](https://postimg.cc/9zRTWJqy)

**The First Sceanrio:** </br>
**Title:** Successful login </br>
**Steps:** </br>I will navigate to the url of https://s1.demo.opensourcecms.com/wordpress/wp-login.php. </br>
       I will enter valid username and password. </br> 
       Then i will click the login button. </br>
**Expected results:** The home page is opened. </br>

**The Second Scenario:** </br>
**Title:** Invalid login </br>
**Steps:** </br> I will navigate to the url of https://s1.demo.opensourcecms.com/wordpress/wp-login.php. </br>
	I will enter invalid username and password. </br>
	Then i will click the login button. </br>
**Expected Results:** An error message is shown "Invalid username." </br>	

## Create Login Page
If you want to create pages using Ebo framework, you can use [Pages Automation Tool](http://spooky-root.surge.sh/). 
After you inspect the username textbox and get it's id then you will add it like this.</br>
[![username-Demo-Website.png](https://i.postimg.cc/fLy4Crtc/username-Demo-Website.png)](https://postimg.cc/Lqc06vV5)
Then you will inspect the password textbox and get it'id and you will add it like this.</br>
[![password-Demo-Website.png](https://i.postimg.cc/c4Zp5Cn1/password-Demo-Website.png)](https://postimg.cc/0rWXz8nh)
Then you will inspect the login button and get it's name and you will add like this.</br>
[![login-Button-Demo-Website.png](https://i.postimg.cc/y8xrwZYK/login-Button-Demo-Website.png)](https://postimg.cc/68s0ZTvb)
Then you will inspect the error message for that will be used in the second sceanrio and you will add like this using it's css
[![errormessage-Demo-Site.png](https://i.postimg.cc/YScfbGvb/errormessage-Demo-Site.png)](https://postimg.cc/Yv3WSSfW)

</br>
This is how all the web elements are added in Pages Automation Tool.</br>
[![login-Json-Download.png](https://i.postimg.cc/WzJ0GssQ/login-Json-Download.png)](https://postimg.cc/PvTLhsp4)
<br/>
When you select "Download WebElements Page" button you will have to enter a name for your file i will name it "LoginPage"

This is a sample of the template that you will get from Pages Automation Tool and where you should put your json file.

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

You can edit your EboLoginPage class by adding any method that will use your web elements
```
public void login(String username) {
		eboTextbox().enterText(username);
		eboButton().clickOnIt();
	}
```
When you type eboTextbox then all the methods of this Textbox will be shown
[![ebo-Textbox-Methods.png](https://i.postimg.cc/8Cr1bk1V/ebo-Textbox-Methods.png)](https://postimg.cc/nspbFJjd)

and when you type eboButton then all the methods of this Button will be shown.
[![ebo-Button-Methods.png](https://i.postimg.cc/jjRXH26D/ebo-Button-Methods.png)](https://postimg.cc/k2hK9npC)

If you want to log all the actions done by the web elements you can use the methods that take ExtentTest as a parameter
```
public void login(String username) {
		// the output in the report will be "username has been entered into ebo
		// textbox".
		eboTextbox().enterText(username, "ebo textbox", test);
		// the output in the report will be be "ebo button has been clicked
		eboButton().clickOnIt("ebo button", test);
	}

 ``` 

There are several types of web elements that can be found in Pages Automation Tool like (Button, Textbox, Textarea, Span, Div..etc).

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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.github.khaledroushdy.browser.Driver;
import com.github.khaledroushdy.browser.DriverTypes;
import com.github.khaledroushdy.report.ExtentManager;

public class SmokeTests {

	private EboLoginTest eboLoginTest;
	private Driver driver; // wrapper driver that can log all the actions done by the web elements and will be used in the pages.
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
If you want to read your data that are stored in excel file then your excel sheet should look like this
[![excelPic.png](https://i.postimg.cc/L4NZs4Py/excelPic.png)](https://postimg.cc/Wtq4WvXr)

To get the data from the excel you can get it using ExcelTestParser API which has 3 methods  <br />
GetCellValue() which return a specific cell value.  <br />
GetSpecificTestCase() which returns a specific test case.  <br />
GetAllTestCases() which returns all the test cases.  <br />
```
	@Test
	public void getDataFromExcel() throws IOException {
		ExcelTestParser testParser = new ExcelTestParser("path of the excel sheet");
		//get a specific cell value.
		String username = testParser.getCellValue("name of the sheet", "the name of the test case", "column name")
				.toString();
		// get a specific test case.
		Map<Object, Object> testCase = testParser.getSpecificTestCase("name of the sheet", "name of the test case");
		//get all the test cases.
		HashMap<String, HashMap<String, String>> allTestCase = testParser.getAllTestCases("name of the sheet"); 
	}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[Apache Version 2.0](https://www.apache.org/licenses/LICENSE-2.0) 
