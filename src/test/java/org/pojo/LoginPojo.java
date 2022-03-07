package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.helper.HelperClass;

public class LoginPojo extends HelperClass{

	//1.Default constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	//2.Find & declare webelement as private
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//*[@id='email']"),
		@FindBy(xpath="//*[@id='username']")
		
	})
	
	private WebElement txtEmail;
	
	@CacheLookup
	@FindBys({
		@FindBy(xpath="//*[@id='pass']"),
		@FindBy(xpath="//*[@placeholder='Password']")
	})
	
	private WebElement txtPass;
	
	@FindBy(id="loginbutton")
	private WebElement btnLogin;
	
	@FindBy(id="login")
	private WebElement btnLogin1;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//*[@id='location']"),
		@FindBy(xpath="//*[text()='- Select Location -']")
	})
	
	private WebElement location1;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//*[@name='hotels']"),
		@FindBy(xpath="//*[text()='- Select Location -']")
	})
	
	private WebElement hotel;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//*[@name='room_nos']"),
		@FindBy(xpath="//*[text()='- Select Location -']")
	})
	
	private WebElement roomNo;
	

	@CacheLookup
	@FindAll({
		@FindBy(xpath="//*[@name='adult_room']"),
		@FindBy(xpath="//*[text()='- Select Location -']")
	})
	
	private WebElement adult;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getLoc() {
		return location1;
	}
	public WebElement hotelName() {
		return hotel;
	}
	public WebElement roomNo() {
		return roomNo;
	}
	public WebElement adultNo() {
		return adult;
	}
	public WebElement submit() {
		return submit;

	}
	public WebElement aLogin() {
	return btnLogin1;
	
	
}}
