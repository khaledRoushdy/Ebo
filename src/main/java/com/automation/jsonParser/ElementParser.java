package com.automation.jsonParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ElementParser {

	private Map<String, By> elements;

	public ElementParser(String fileName) {
		elements = new HashMap<String, By>();
		ArrayList<JsonWebElement> webElements = deserializeWebElements(fileName);
		addElementsToMap(webElements);
	}

	public By getElementByName(String name) {
		return elements.get(name);
	}

	private void addElementsToMap(ArrayList<JsonWebElement> webElementItems) {
		for (JsonWebElement webElement : webElementItems) {
			By locator = LocatorFactory.createLocator(webElement);
			elements.put(webElement.getName(), locator);
		}
	}

	private ArrayList<JsonWebElement> deserializeWebElements(String fileName) {
		ArrayList<JsonWebElement> elements = new ArrayList<JsonWebElement>();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			// pojos = objectMapper.readValue(fileName, WebElement[].class);
			// String userDataJSON = "[{\"value\":\"value11\",\"name\": \"value12\",\"locator\":\"value13\"},"
             //        + "{\"value\": \"value21\",\"name\":\"value22\",\"locator\": \"value23\"}]";
			InputStream is = new FileInputStream(fileName);
			//elements = objectMapper.readValue(userDataJSON, new TypeReference<List<WebElement>>() {
			//});
			elements = objectMapper.readValue(is, new TypeReference<List<JsonWebElement>>() {
			});

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elements;
	}
}
