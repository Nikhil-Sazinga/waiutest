package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Login_Page_Locators extends Testbase2{
	
	public By Login_Page_header=By.xpath("//h1[contains(text(),'Sign In')]");
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By Hide_icon=By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/i[1]");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	public By ForgotPassword_link=By.tagName("a");
	public By dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By forgot_password_page_header_ele=By.xpath("//h1[contains(text(),'Forgot Password')]");
	

}
