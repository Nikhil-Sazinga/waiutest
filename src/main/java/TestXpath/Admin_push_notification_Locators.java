package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_push_notification_Locators extends Testbase2{
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By pushnotification_menu=By.xpath("//span[contains(text(),'Push Notifications')]");
	public By pushnotification_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Search_field=By.cssSelector("input[placeholder=\"Search Keyword\"]");
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	
	
	public By second_data_from_table=By.xpath("//tbody/tr[2]/td[2]");	
	public By first_data_from_table=By.xpath("//tbody/tr[1]/td[2]");		

	public By Add_push_notification_button=By.xpath("//a[@class='btn btn-secondary btn-sm float-right']");
	public By Add_push_notification_icon=By.xpath("//i[@class='fa fa-plus']");
	public By delete_offer_icon=By.xpath("//tbody/tr[1]/td[6]/span[1]/i[1]");

	//push notification form
	public By Notification_form_header=By.xpath("//h5[contains(text(),'Notification Details')]");
	public By title_field=By.xpath("//input[@id='title']");
	public By description_field=By.xpath("//textarea[@id='description']");
	public By Phone_No_dropdown_field=By.xpath("//div[contains(text(),'Select Phone No.')]");
	public By phone_no_input_field=By.xpath("//body/div[1]/div[1]/div[2]/input[1]");
	public By select_all_mobile_no=By.xpath("//body/div[1]/div[1]/div[1]/div[2]");
	public By select_one_mobile_no=By.xpath("//body/div[1]/div[1]/div[1]/div[2]");
	public By close_icon=By.xpath("//body/div[1]/div[1]/button[1]/span[1]");
	
	public By select_mobile_screen=By.xpath("//select[@id='mobileRoute']");
	
	public By upload_image=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-notification[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[2]/app-file-upload[1]/div[1]/div[1]/input[1]");

	public By resetclear_button=By.xpath("//button[@id='reset']");
	public By save_button=By.xpath("//button[@id='submit']");

    public By Back_to_list=By.xpath("//a[@class='btn btn-secondary btn-sm']");

}
