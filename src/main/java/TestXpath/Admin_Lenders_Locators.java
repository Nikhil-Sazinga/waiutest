package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Lenders_Locators extends Testbase2{
    public String invalid_website="aa";
    public String invalid_contactNo="123456789";
    public String invalid_email="aa";
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Lenders_menu=By.xpath("//span[contains(text(),'Lenders')]");
	public By Lenders_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Add_Lender_button=By.xpath("//a[@class='btn btn-secondary btn-sm']");
	public By Add_Lender_icon=By.xpath("//i[@class='fa fa-plus']");
    public By Edit_Lender=By.xpath("//tbody/tr[1]/td[7]/span[1]/i[1]");
    public By View_Lender=By.xpath("//tbody/tr[1]/td[7]/span[2]/i[1]");
    //view lender page
    public By view_lender_page_header=By.xpath("//h5[@class='page-title']");
    public By Back_to_list_button_on_viewlender=By.xpath("//a[@class='btn btn-secondary btn-sm']");
   
    //edit lender page
    public By lender_name_Field_on_editpage=By.xpath("//input[@id='name']");
    public By lender_name_Field_on_viewpage=By.xpath("//input[@id='name']");
    public By edit_lender_page_header=By.xpath("//h5[@class='page-title']");
    public By Back_to_list_button=By.xpath("//a[@class='btn btn-secondary btn-sm']");
    public By Update_button=By.xpath("//button[contains(text(),'Update')]");
    
    //Add lender page
    public By Add_Lender_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    public By lender_name=By.xpath("//input[@id='name']");
    public By Description=By.xpath("//textarea[@id='description']");
    public By termAndCondition=By.xpath("//textarea[@id='termAndCondition']");
    //logo upload file
    public By logo_upload_file=By.name("myfile");
    public By website=By.xpath("//input[@id='website']");
    public By contact_peson=By.xpath("//input[@id='contactPerson']");
    public By contactNumberPrimary=By.xpath("//input[@id='contactNumberPrimary']");
    public By contactNumberSecondry=By.xpath("//input[@id='contactNumberSecondry']");
    public By email=By.xpath("//input[@id='email']");
    public By API_key=By.xpath("//input[@id='apiKey']");
    public By apiSecret=By.xpath("//input[@id='apiSecret']");
    public By save_button=By.xpath("//button[contains(text(),'Save')]");
    
    public By lender_name_mandatory_element=By.xpath("//small[contains(text(),'Lender Name is required.')]");
    public By description_mandatory_element=By.xpath("//small[contains(text(),'Description is required.')]");
    public By termscondtion_mandatory_element=By.xpath("//small[contains(text(),'Terms And Conditions are required.')]");
    public By website_mandatory_element=By.xpath("//small[contains(text(),'Web site required.')]");
    public By website_properformat_element=By.xpath("//small[contains(text(),'Web site should be in proper format')]");
  
    public By ContactPerson_mandatory_element=By.xpath("//small[contains(text(),'Contact Person required.')]");
    public By PrimaryContactNo_mandatory_element=By.xpath("//small[contains(text(),'Primary Contact No. is required.')]");
    public By PrimaryContactNo_10_digit_required_element=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-lender[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/small[1]");
    public By SecondaryContactNo_mandatory_element=By.xpath("//small[contains(text(),'Secondary Contact No. is required.')]");
    public By SecondaryContactNo_10_digit_required_element=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-lender[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/small[1]");
    public By email_mandatory_element=By.xpath("//small[contains(text(),'Email ID is required.')]"); 
    public By valid_email_element=By.xpath("//small[contains(text(),'Please enter valid Email Id')]");
    public By API_key_mandatory_element=By.xpath("//small[contains(text(),'Api Key is required.')]");
    public By API_secret_mandatory_element=By.xpath("//small[contains(text(),'Api Secret is required.')]");
}
