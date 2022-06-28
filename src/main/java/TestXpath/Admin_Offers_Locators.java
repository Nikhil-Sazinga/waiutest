package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Offers_Locators extends Testbase2{
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Offers_menu=By.xpath("//span[contains(text(),'Offers')]");
	public By Offers_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By No_data_found_message=By.xpath("//td[contains(text(),'No data found.')]");
	public By Search_field=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-offers[1]/div[1]/div[1]/input[1]");
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	public By Add_Offer_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-offers[1]/div[1]/div[3]/a[1]");
	public By Add_Offer_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-offers[1]/div[1]/div[3]/a[1]/i[1]");
    public By Back_to_list=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-offer[1]/div[1]/a[1]");
    public By view_offer_icon=By.xpath("//tbody/tr[1]/td[7]/span[1]/i[1]");
    public By view_offer_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    //add offer page
    public By Add_offer_pagge_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    public By offer_Name=By.xpath("//input[@id='offerName']");
    public By offer_code=By.xpath("//input[@id='code']");
    public By productName=By.xpath("//input[@id='productName']");
    public By offer_description=By.xpath("//textarea[@id='description']"); 
    public By perUserLimit=By.xpath("//input[@id='perUserLimit']");
    public By totalQuantity=By.xpath("//input[@id='totalQuantity']");
    
    public By selectmobilescreen=By.xpath("//select[@id='mobileRouteName']"); 
    public By start_date=By.xpath("//input[@id='fromDate']");
    public By end_date=By.xpath("//input[@id='toDate']");
    
    
    public By redirect_url=By.xpath("//input[@id='urlName']");
    public By button_text=By.xpath("//input[@id='buttonText']");
    //upload image
    public By offer_image=By.name("myfile");
    public By clear_button=By.xpath("//button[contains(text(),'Clear')]");
    public By Save_button=By.xpath("//button[contains(text(),'Save')]");
    
  
    public By record_from_table=By.xpath("//tbody/tr[1]/td[3]");
    public By no_data_found_element=By.xpath("//td[contains(text(),'No data found.')]");
    
    public By Offer_Code_mandatory_element=By.xpath("//small[contains(text(),'Offer Code is required.')]");
    public By Product_Name_mandatory_element=By.xpath("//small[contains(text(),'Product Name is required.')]");
    public By url_mandatory_element=By.xpath("//small[contains(text(),'URL is required.')]");
    public By background_color_mandatory_element=By.xpath("//small[contains(text(),'Background Color is required.')]");
    public By button_text_mandatory_element=By.xpath("//small[contains(text(),'Button is required.')]");
  
    public By Total_Quantity_mandatory_element=By.xpath("//small[contains(text(),'Total Quantity is required.')]");
    public By offer_image_mandatory_element=By.xpath("//small[contains(text(),'Offer image is required.')]");
    
}
