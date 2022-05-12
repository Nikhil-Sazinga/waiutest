package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class MerchantMenu_Customer_Locators extends Testbase2{
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	
	public By Merchant_menu=By.xpath("//span[text()='Merchant']");
	public By Customer_menu=By.xpath("//span[contains(text(),'Customer')]");
	
	public By Customers_Page_Header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	
	
	public By State_Label=By.xpath("//label[contains(text(),'State')]");
	public By State=By.xpath("//select[@id='state']");
	public By City_Label=By.xpath("//label[contains(text(),'City')]");
	public By City=By.xpath("//select[@id='city']");
	
	public By Start_Date_Label=By.xpath("//label[contains(text(),'Start Date')]");
	public By Start_Date=By.xpath("//input[@id='startDate']");
	public By End_Date_Label=By.xpath("//label[contains(text(),'End Date')]");
	public By End_Date=By.xpath("//input[@id='endDate']");
	
	public By Search_field=By.name("search");
	public By Search_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-merchant[1]/app-customer[1]/form[1]/div[1]/div[5]/span[1]/i[1]");
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	
	public By text_for_search_field=By.xpath("//tbody/tr[1]/td[2]");

}
