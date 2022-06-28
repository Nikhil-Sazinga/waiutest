package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Partners_Locators extends Testbase2{
	
	public String  invalid_email="aa";
	public String invalid_contactNo="123456789";
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Partners_menu=By.xpath("//span[contains(text(),'Partners')]");
	public By Partners_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Add_Partner_button=By.xpath("//a[@class='btn btn-secondary btn-sm float-right']");
	public By Add_Partner_icon=By.xpath("//i[@class=\"fa fa-plus\"]");
    public By Edit_partner=By.xpath("//span[@class='cursor ng-star-inserted']");
    public By search_field=By.xpath("//input[@placeholder='Search Keyword']");
    public By clear_button=By.xpath("//button[contains(text(),'Clear')]");
    public By input_for_search_from_table_element=By.xpath("//tbody/tr[2]/td[2]");
    public By result_for_search_from_table_element=By.xpath("//tbody/tr[1]/td[2]");
  
    //Viiew partner field
    public By View_partner=By.xpath("(//i[@class='fa fa-eye ng-star-inserted'])[1]");
    public By back_to_list=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-partner[1]/div[1]/a[1]");
    public By View_partner_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    public By Partner_type_field=By.xpath("//select[@id='typeId']");
    public By Back_to_list_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-partner[1]/div[1]/a[1]");

    //edit partner page
    public By edit_partner_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    //public By Back_to_list_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-partner[1]/div[1]/a[1]");
    public By Cancel_button=By.xpath("//button[contains(text(),'Cancel')]");
    public By Update_button=By.xpath("//button[contains(text(),'Update')]");
    
    //Add partner page
    public By Add_partner_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    public By partner_type=By.xpath("//select[@id='typeId']");
    public By partner_name=By.xpath("//input[@id='partnerName']");
    public By contact_name=By.xpath("//input[@id='contactPersonName']");
    public By contact_number=By.xpath("//input[@id='contactPersonMobile']");
    public By email=By.xpath("//input[@id='email']");
    public By GST_number=By.xpath("//input[@id='tagline']");
    public By Registration_ID=By.xpath("//input[@id='partnerRegNumber']");
    public By Address=By.xpath("//textarea[@id='partnerAddress']");
    public By state=By.xpath("//select[@id='state']");
    public By city=By.xpath("//select[@id='city']");
    public By pincode=By.xpath("//input[@id='zipCode']");
    public By discount=By.xpath("//input[@id='discountInPercentage']");
    public By status=By.xpath("//select[@id='isActive']");
    public By upload_file=By.name("myfile");
    public By file_size_message=By.xpath("//div[contains(text(),'Upload the file of size below 2Mb.')]");
    public By cancel_button=By.xpath("//button[contains(text(),'Cancel')]");
    public By Save_and_Proceed_button=By.xpath("//button[contains(text(),'Save and Proceed')]");
    
    //mandatory error message on add partner page
    public By partner_type_mandatory_element=By.xpath("//small[contains(text(),'Partner Type is required.')]");
    public By partner_name_mandatory_element=By.xpath("//small[contains(text(),'Partner Name required.')]");
    public By contact_name_mandatory_element=By.xpath("//small[contains(text(),'Contact Name required.')]");
    public By contactnumber_mandatory_element=By.xpath("//small[contains(text(),'Contact Number is required.')]");
    public By contactnumber_10_digit_Required_element=By.xpath("//small[contains(text(),'Please Enter 10 digit Mobile Number.')]");   
    public By email_mandatory_element=By.xpath("//small[contains(text(),'Email is required.')]");   
    public By valid_email_element=By.xpath("//small[contains(text(),'Please enter valid Email Partner Address')]");    
    public By Address_mandatory_element=By.xpath("//small[contains(text(),'Address is required.')]");
    public By state_mandatory_element=By.xpath("//small[contains(text(),'State is required.')]");
    public By city_mandatory_element=By.xpath("//small[contains(text(),'City is required.')]");
    
    
}
