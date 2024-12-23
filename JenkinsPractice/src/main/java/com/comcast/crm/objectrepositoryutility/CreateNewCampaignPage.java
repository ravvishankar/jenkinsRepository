package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage {
	WebDriver driver;
	public CreateNewCampaignPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="campaignname")
	private WebElement campaignName;
	
	@FindBy (xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement selectProduct;
	
	@FindBy (xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}
	

}
