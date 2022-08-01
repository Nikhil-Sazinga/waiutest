package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Login_Page_Locators extends Testbase2{
	public String reset_password_url="https://portal-dev.waiu.co.in/resetPassword?token=3645e9e627f8a8f4df5ef2bc5ad4b15a37add2bb0bb2398f91730dbd82196223b006acc3086ae99df17e9c52c111b996c18386910fa93cde25678c410a7e7fa7";
	public By Login_Page_header=By.xpath("//h1[contains(text(),'Sign In')]");
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By Hide_icon=By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/i[1]");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	public By ForgotPassword_link=By.tagName("a");
	public By dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By forgot_password_page_header_ele=By.xpath("//h1[contains(text(),'Forgot Password')]");
	public By username_field_contain_required_mesg=By.xpath("//p[contains(text(),'Username is required.')]");
	public By passsword_field_contain_required_mesg=By.xpath("//p[contains(text(),'Password is required.')]");
	
	//forgot page
	public By Username_field_on_forgot_page=By.xpath("//input[@id='username']");
	public By user_name_required_msg_on_forgot_page=By.xpath("//p[contains(text(),'User name is required.')]");
	public By Forgot_Button=By.xpath("//button[contains(text(),'Forgot')]");
	public By email_send_reset_link_message_element=By.xpath("//div[contains(text(),'Check Your Registered Email and Proceed.')]");
	public By login_link=By.xpath("//a[contains(text(),'Login')]");
	
	//Set password
	public By set_password_page_header=By.xpath("//h1[contains(text(),'Set Password')]");
	public By psw_field=By.xpath("//input[@id='password']");
	public By confirm_pswd_field=By.xpath("//input[@id='confirmPassword']");
	public By reset_password_button=By.xpath("//button[contains(text(),'Submit Password')]");
	public By pwd_field_contain_required_mesg=By.xpath("//p[contains(text(),'Password is required.')]");
	public By pwd_field_contain_length_msg=By.xpath("//p[contains(text(),'Password cannot be less than 8 characters')]");
	public By cnfrm_pwd_field_contain_required_mesg=By.xpath("//p[contains(text(),'Confirm Password is required.')]");
	public By pswd_not_match=By.xpath("//p[contains(text(),'Passwords do not match.')]");
	public String username="Ramesh";
	public String old_password="12345678";
	public String new_password="87654321";
	public By invalid_usrnme_or_pswd_msg_element=By.xpath("//p[contains(text(),'Invalid Username or Password!')]");
	
	//profile page change password section
	public By Right_top_corner_profile_name=By.xpath("//a[@class='dropdown-toggle nav-link username']");
	public By Profile_icon=By.xpath("(//i[@class='fa fa-user'])[1]");
	
	//Profile submenu
	public By Profile_submenu=By.xpath("(//a[@class='dropdown-item'])[1]");
	
    public By new_pswd=By.xpath("//input[@id='password']");
	
	public By cnfrm_pswd=By.xpath("//input[@id='confirmPassword']");
	public By Save_button=By.xpath("//button[contains(text(),'Save')]");
	public By logout_option=By.xpath("//app-header/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[2]");
}
