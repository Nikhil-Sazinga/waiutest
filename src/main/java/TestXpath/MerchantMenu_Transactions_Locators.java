package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class MerchantMenu_Transactions_Locators extends Testbase2 {
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	
	public By Merchant_menu=By.xpath("//span[text()='Merchant']");
	public By Transactions_menu=By.xpath("//span[contains(text(),'Transactions')]");
	
	public By Transactions_Page_Header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	
	public By Start_Date_Label=By.xpath("//label[contains(text(),'Start Date')]");
	public By Start_Date=By.xpath("//input[@id='startDate']");
	public By End_Date_Label=By.xpath("//label[contains(text(),'End Date')]");
	public By End_Date=By.xpath("//input[@id='endDate']");
	public By State_Label=By.xpath("//label[contains(text(),'State')]");
	public By State=By.xpath("//select[@id='states']");
	public By City_Label=By.xpath("//label[contains(text(),'City')]");
	public By City=By.xpath("//select[@id='cities']");
	public By Transaction_Types_Label=By.xpath("//label[contains(text(),'Transaction Types')]");
	public By Transaction_Types=By.xpath("//select[@id='transcationType']");
	public By Status_Label=By.xpath("//label[contains(text(),'Status')]");
	public By Status=By.xpath("//select[@id='status']");
	public By Merchants_Label=By.xpath("//label[contains(text(),'Merchants')]");
	public By Merchants=By.xpath("//select[@id='merchant']");
	public By Lenders_Label=By.xpath("//label[contains(text(),'Lenders')]");
	public By Lenders=By.xpath("//select[@id='lender']");
	public By Customer_Name_Label=By.xpath("//label[contains(text(),'Customer Name')]");
	public By Customer_Name=By.cssSelector("input[name='searchCustomer']");
	
	//label[contains(text(),'Serach by keyword')]
	public By Serach_by_keyword_Label=By.xpath("//label[contains(text(),'Search by keyword')]");
	public By Serach_field=By.cssSelector("input[name='searchTerm']");
	public By Settelment_Label=By.xpath("//label[contains(text(),'Settlement')]");
	public By Settelment=By.xpath("//select[@id='settlement']");
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	
    public By take_data_from_table_for_search_functinality_verify=By.xpath("//tbody/tr[1]/td[2]/span[1]");

}
