package Testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Login_Page_Locators;

public class Login_page_Testcases extends Login_Page_Locators{
	
	@Test(priority =0)
	public void open_url() throws InterruptedException {
		dr.get(url);
		Thread.sleep(7000);
	}
	
	@Test(priority = 1)
	public void check_webpage_title() {
		String actual=dr.getTitle();
		System.out.println("Login web page Title :"+actual);
		String expect="WAIU - Login (v-1.0.6)";
		Assert.assertEquals(actual, expect);
				
	}
	
	
	@Test(priority = 2)
	public void Check_login_page_header() throws InterruptedException{
		
		//Thread.sleep(8000);
		String expected="Sign In";
		String atual=dr.findElement(Login_Page_header).getText();
		Assert.assertEquals(expected, atual);		
	}
	
	
	@Test(priority = 3)
	public void check_username_field_exist() {
		boolean username_field=dr.findElement(Username_field).isDisplayed();
		System.out.println("Username field is displayed :"+username_field);
	}

	@Test(priority = 4)
	public void check_password_field_exist() {
		boolean password_field=dr.findElement(Password_field).isDisplayed();
		System.out.println("Password field is displayed :"+password_field);
	}
	
	@Test(priority = 5)
	public void check_Login_button_exist() {
		boolean log_in_button=dr.findElement(LogIn_Button).isDisplayed();
		System.out.println("Login button is displayed :"+log_in_button);
	}
	
	@Test(priority = 6)
	public void check_Forgot_password_link_exist() {
		boolean forgot_password_link=dr.findElement(ForgotPassword_link).isDisplayed();
		System.out.println("Forgot password link is displayed :"+forgot_password_link);
		System.out.println("Text of forgot password link :"+dr.findElement(ForgotPassword_link).getText());
	}
	
	@Test(priority = 7)
	public void check_forgot_password_link_is_active() throws InterruptedException {
		dr.findElement(ForgotPassword_link).click();
		Thread.sleep(5000);
		boolean header_text=dr.findElement(forgot_password_page_header_ele).isDisplayed();
		System.out.println("Forgot password page header : "+dr.findElement(forgot_password_page_header_ele).getText());
		System.out.println(dr.findElement(forgot_password_page_header_ele).getText());
		
	}
	
	
	@Test(priority = 8)
	public void Login_with_valid_data() throws InterruptedException{
		
		dr.navigate().back();		
		dr.findElement(Username_field).sendKeys("bluefire");
		dr.findElement(Password_field).sendKeys("bluefire@123");
		dr.findElement(LogIn_Button).click();
		Thread.sleep(6000);
		String actual=dr.findElement(dashboard_menu).getText();
		String exppected="Dashboard";
		if(actual.equals(exppected)) {
			System.out.println("Login sucessfully");
		}else {
			System.out.println("Login unsucess");
		}
	}	

}
	
