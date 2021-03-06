package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Merchants_Hotel_Page_Locators extends Testbase2 {
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Merchants_menu=By.xpath("//span[contains(text(),'Merchants')]");
	public By Merchants_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Merchant_field_Label=By.xpath("//label[contains(text(),'Merchant Type')]");
	public By Merchant_field=By.id("categoryId");
	public By Status_field_Label=By.xpath("//label[contains(text(),'Status')]");
	public By Status_field=By.id("status");
	public By State_field_Label=By.xpath("//label[contains(text(),'State')]");
	public By State_field=By.id("state");
	public By City_field_Label=By.xpath("//label[contains(text(),'City')]");
	public By City_field=By.xpath("//select[@id='citie']");
	public By Search_field1=By.name("searchTerm");
	public By Search_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-restaurant[1]/form[1]/div[1]/div[5]/span[1]/i[1]");
	public By Search_button=By.xpath("//button[contains(text(),'Search')]");
	
	
	public By Clear_Button=By.xpath("//button[contains(text(),'Clear')]");
	public By Add_Merchant_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-restaurant[1]/form[1]/div[2]/div[1]/a[1]");
	public By Add_Merchant_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-restaurant[1]/form[1]/div[2]/div[1]/a[1]/i[1]");
	
	//popup box
	public By popup_box_header=By.xpath("//h6[contains(text(),'Merchant Type')]");
	public By popup_box_close_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-restaurant[1]/p-dialog[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
	
	public By Popup_dropdowm_box=By.xpath("//select[@id='categoryTYpe']");
	public By Proceed_button=By.xpath("//button[@id='btn_proceed']");
	
	//Hotel's Detail Form : Basic Information
	public By Restaurant_Detail_Form=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Hotel_Name=By.xpath("//input[@id='merchantName']");
	public By Email=By.xpath("//input[@id='email']");
	public By Description=By.xpath("//textarea[@id='description']");
	
	public By Tagline=By.xpath("//input[@id='tagline']");
	public By Website=By.xpath("//input[@id='website']");
	public By Address=By.xpath("//textarea[@id='address']");
	
	public By State=By.xpath("//select[@id='state']");
	public By City=By.xpath("//select[@id='city']");
	public By Pincode=By.xpath("//input[@id='zipCode']");
	
	public By latitude=By.xpath("//input[@id='latitude']");
	public By longitude=By.xpath("//input[@id='longitude']");
	public By Google_map_location=By.xpath("//input[@id='geoLocation']");
	
	public By Checkbox=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-restaurant[1]/div[2]/div[1]/form[1]/div[1]/div[8]/div[2]/div[1]/label[2]/span[1]");
	public By Save_and_Proceed_button=By.xpath("//button[contains(text(),'Save and Proceed')]");
	public By Save_as_Draft_button=By.xpath("//button[contains(text(),'Save as Draft')]");
	
	public By Cancel_button=By.xpath("//button[contains(text(),'Cancel')]");
	public By back_to_list_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-restaurant[1]/div[1]/div[2]/a[1]");
	
	//Hotel's Detail Form : Reastaurant Features
	public By Cuisine=By.xpath("//label[contains(text(),'Maharashtrian')]");
	public By Veg_Non_veg=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-restaurant[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]");
	public By specific_customer_services=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-restaurant[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]");
	public By Save_Proceed=By.xpath("//button[contains(text(),'Save and Proceed')]");
			
	//Hotel's Detail Form : Reastaurant Images
	public By Upload_menu_card_image=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-restaurant[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/app-file-upload[1]/div[1]/div[1]/input[1]");
	public By Save_an_Proceed=By.xpath("//button[contains(text(),'Save and Proceed')]");
	
	
	//Hotel's Detail Form : Bank Details
    public By GST_field=By.xpath("//input[@id='GSTN']");
    public By PAN_field=By.xpath("//input[@id='PAN']");
    public By Bank_name=By.xpath("//input[@id='bankName']");
    public By Account_Number=By.xpath("//input[@id='accountNumber']");
    public By IFSC=By.xpath("//input[@id='IFSC']");
    public By Contact_Name=By.xpath("//input[@id='contactPerson']");
    public By Primary_Contact_number=By.xpath("//input[@id='contactPrimary']");
    public By Secondary_Contact_number=By.xpath("//input[@id='contactSecondary']");
    public By Submit_Button=By.xpath("//button[contains(text(),'Submit')]");

	

}
