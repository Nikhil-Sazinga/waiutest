package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class MerchantMenu_Staff_Locators extends Testbase2{

	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	
	public By Merchant_menu=By.xpath("//span[text()='Merchant']");
	public By Staff_menu=By.xpath("//span[contains(text(),'Staff')]");
	
	public By Staff_Page_Header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	
	
	public By Restaurant_List_Label=By.xpath("//label[contains(text(),'Restaurant List')]");
	public By Restaurant_List_dropdown_field=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-merchant[1]/app-staff[1]/div[1]/div[1]/div[1]/p-autocomplete[1]/span[1]/input[1]");
	public By Restaurant_List_dropdown_arrow=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-merchant[1]/app-staff[1]/div[1]/div[1]/div[1]/p-autocomplete[1]/span[1]/button[1]/span[1]");
	public By dropdown_value=By.xpath("//span[contains(text(),'Tenten Restaurant')]");
	public By edit_staff=By.xpath("//tbody/tr[1]/td[7]/span[1]/i[1]");
	 
	//
	public By Staff_Member_Details_header =By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By back_to_list_button =By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-merchant[1]/app-staff-details[1]/div[1]/div[2]/a[1]");
	public By Update_button=By.xpath("//button[contains(text(),'Update')]");
	
	
	
}
