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
	
	public By select_by_column_name_=By.xpath("//select[@id='searchColumn']");
	
	public By Search_field=By.name("searchTerm");
	
	public By Search_button=By.xpath("//button[contains(text(),'Search')]");
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	
	public By text_for_search_field=By.xpath("//tbody/tr[1]/td[2]");
	public By view_customer_icon=By.xpath("//i[@class='fa fa-eye ng-star-inserted']");
	
	public By back_to_list_button=By.xpath("//a[@class='btn btn-secondary btn-sm btn']");

}
