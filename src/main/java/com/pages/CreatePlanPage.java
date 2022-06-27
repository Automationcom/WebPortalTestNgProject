package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePlanPage {
	WebDriver driver;
	
	public CreatePlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="searchbox")WebElement insertText;
	@FindBy(xpath="/html/body/div[1]/div/div/h1") WebElement text;
	@FindBy(xpath="//button[@class='btn']") WebElement browserbutton;
	
	
	//To check Browser button 
public boolean  browseBtn() {
		browserbutton.isDisplayed();
		return true;
	}
	
	public boolean textFieldbar() {
		insertText.isDisplayed();
		return true;
	}
	
	public void textenterd() {
		insertText.sendKeys("PDF files only ");
	}
	
public String  vaidatetheText() {
		
		return text.getText();
		
	}


	
	
	
}
