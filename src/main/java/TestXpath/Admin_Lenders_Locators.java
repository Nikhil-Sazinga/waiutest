package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Lenders_Locators extends Testbase2{

	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Lenders_menu=By.xpath("//span[contains(text(),'Lenders')]");
	public By Lenders_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Merchant_field_Label=By.xpath("//label[contains(text(),'Merchant Type')]");
	
}
