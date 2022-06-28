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
		String expect="WAIU - Login (v-1.0.5)";
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
	public void check_username_field_visibility() {
		boolean username_field=dr.findElement(Username_field).isDisplayed();
		System.out.println("Username field is displayed :"+username_field);
	}

	@Test(priority = 4)
	public void check_password_field_visibility() {
		boolean password_field=dr.findElement(Password_field).isDisplayed();
		System.out.println("Password field is displayed :"+password_field);
	}
	
	@Test(priority = 5)
	public void check_Login_button_visibility() {
		boolean log_in_button=dr.findElement(LogIn_Button).isDisplayed();
		System.out.println("Login button is displayed :"+log_in_button);
	}
	
	@Test(priority = 6)
	public void check_Forgot_password_link_visibility() {
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
	
	
	//forgot password page
	//check forgot password page header
	@Test(priority = 8)
	public void forgot_password_page_header_visibility() {
		String forgot_password_page_header_text=dr.findElement(forgot_password_page_header_ele).getText();
		String Expected_header="Forgot Password";
		Assert.assertEquals(forgot_password_page_header_text, Expected_header);
	}
	
	//check username field display
	@Test(priority = 9)
	public void check_username_field_exist_on_forgotpswd_page() {
		dr.findElement(Username_field_on_forgot_page).isDisplayed();
	}
	
	//check username field placeholder
		@Test(priority = 10)
		public void check_username_field_placeholder_text() {
			String username_field_placeholder=dr.findElement(Username_field_on_forgot_page).getAttribute("placeholder");
			String Expected_username_field_placeholder="username";
			Assert.assertEquals(username_field_placeholder, Expected_username_field_placeholder);
		}
		
		//check username field contain required mesg on forgot pswd page
		@Test(priority =11 )
		public void check_username_field_contain_required_mesg_on_forgot_pswd_page() throws InterruptedException {
			Thread.sleep(7000);
			//dr.findElement(Username_field_on_forgot_page).click();			
			dr.findElement(Forgot_Button).click();
			Thread.sleep(3000);
			String username_required_mesg=dr.findElement(user_name_required_msg_on_forgot_page).getText();
			String expe="User name is required.";
			Assert.assertEquals(username_required_mesg, expe);
		}
	
		//check forgot button Visibility
		@Test(priority = 12)
		public void check_forgot_button_Visibility() {
			dr.findElement(Forgot_Button).isDisplayed();
		}
		
		//check login link Visibility
		@Test(priority = 13)
		public void check_login_link_Visibility() {
		dr.findElement(login_link).isDisplayed();
		}
				
		//check login link clickable
		@Test(priority = 14)
		public void check_login_link_clickable() throws InterruptedException {
		dr.findElement(login_link).click();
		Thread.sleep(5000);
		String login_pge_header=dr.findElement(Login_Page_header).getText();
		String expe="Sign In";
		Assert.assertEquals(login_pge_header, expe);
		dr.findElement(ForgotPassword_link).click();
		}
		
		
		//forgot pwsd if username which does not exist
		@Test(priority = 15)
		public void check_forgot_functinality_for_user_does_not_exist() throws InterruptedException {
		Thread.sleep(7000);
		dr.findElement(Username_field_on_forgot_page).clear();
		dr.findElement(Username_field_on_forgot_page).sendKeys("wwww123#$%#^");
		dr.findElement(Forgot_Button).click();
		String forgot_pswd_page_header=dr.findElement(forgot_password_page_header_ele).getText();
		String expe="Forgot Password";
		Assert.assertEquals(forgot_pswd_page_header, expe);
		}
		
		
		//check forgot functionality
		@Test(priority = 16)
		public void check_forgot_functinality() throws InterruptedException {	
		dr.findElement(Username_field_on_forgot_page).clear();
		Thread.sleep(5000);
		dr.findElement(Username_field_on_forgot_page).sendKeys(username);
		dr.findElement(Forgot_Button).click();
		Thread.sleep(7000);
		String email_send_reset_link_message=dr.findElement(email_send_reset_link_message_element).getText();
		String expe="Check Your Registered Email and Proceed.";
	    Assert.assertEquals(email_send_reset_link_message, expe);
				}
		/*
		//set password page
		//check set password page header 
		@Test(priority = 17)
		public void Check_set_password_page_header() throws InterruptedException{
			dr.get(reset_password_url);
			Thread.sleep(7000);
			String expected="Set Password";
			String atual=dr.findElement(set_password_page_header).getText();
			Assert.assertEquals(expected, atual);		
		}  */
				
	    //check password field Visibility
	    @Test(priority = 18)
		public void check_pasword_field_Visibility() throws InterruptedException {
	    	dr.get(reset_password_url);
			Thread.sleep(7000);
	    dr.findElement(psw_field).isDisplayed();
			}
				
		//check password field placeholder
		@Test(priority = 19)
		public void check_pswd_field_placeholder_text_for_setpswd() {
		String pwd_field_placeholder=dr.findElement(psw_field).getAttribute("placeholder");
	    String Expected_pswd_field_placeholder="Password";
		Assert.assertEquals(pwd_field_placeholder, Expected_pswd_field_placeholder);
			}
	
		 //check confirm password field Visibility
	    @Test(priority = 20)
		public void check_confirm_pasword_field_Visibility() {
	    dr.findElement(confirm_pswd_field).isDisplayed();
			}
				
		//check confirm password field placeholder
		@Test(priority = 21)
		public void check_confirm_pswd_field_placeholder_text_for_setpswd() {
		String confirm_pwd_field_placeholder=dr.findElement(confirm_pswd_field).getAttribute("placeholder");
	    String Expected_confirm_pswd_field_placeholder="Confirm Password";
		Assert.assertEquals(confirm_pwd_field_placeholder, Expected_confirm_pswd_field_placeholder);
			}		
		
		
		//check login link Visibility
		@Test(priority = 22)
		public void check_login_link_Visibilityon_setpassword_page() {
		dr.findElement(login_link).isDisplayed();
		}		

		//check login link clickable
		@Test(priority = 23)
        public void check_login_link_clickable_on_resetpassword_page() throws InterruptedException {
		dr.findElement(login_link).click();
		Thread.sleep(5000);
		String login_pge_header=dr.findElement(Login_Page_header).getText();
		String expe="Sign In";
		Assert.assertEquals(login_pge_header, expe);
		
		}	
		
		
		//check set password button visibility
	    @Test(priority = 24)
		public void check_set_password_button_visibility() throws InterruptedException {
	    	dr.get(reset_password_url);
	   // dr.findElement(ForgotPassword_link).click();
	   // Thread.sleep(5000);
	   // dr.findElement(Username_field_on_forgot_page).sendKeys(username);	
	   // dr.findElement(Forgot_Button).click();
	    Thread.sleep(7000);
		dr.findElement(reset_password_button).isDisplayed();
		}		
		
		//check set password button text
		@Test(priority = 25)
		public void check_set_password_button_text() {
			String actual_set_password_button_text=dr.findElement(reset_password_button).getText();
			String expected_set_password_button_text="Submit Password";			
		  }
		
	
		//check pwd field contain required mesg on set pswd page
		@Test(priority =26 )
		 void check_pwd_field_contain_required_mesg_on_set_pswd_page() throws InterruptedException {
		 dr.findElement(psw_field).click();
		 dr.findElement(reset_password_button).click();
		 Thread.sleep(4000);
		 String pwd_required_mesg=dr.findElement(pwd_field_contain_required_mesg).getText();
		 String expe="Password is required.";
		 Assert.assertEquals(pwd_required_mesg, expe);
			}
				
		
		//check cnfrm pwd field contain required mesg on set pswd page
				@Test(priority =27 )
				 void check_cnfrm_pwd_field_contain_required_mesg_on_set_pswd_page() throws InterruptedException {
				 dr.findElement(confirm_pswd_field).click();
				 dr.findElement(reset_password_button).click();
				 Thread.sleep(4000);
				 String cnfrm_pwd_required_mesg=dr.findElement(cnfrm_pwd_field_contain_required_mesg).getText();
				 String expe="Confirm Password is required.";
				 Assert.assertEquals(cnfrm_pwd_required_mesg, expe);
					}
		
		//check pwd field contain length message
		@Test(priority =28 )
		 public void check_pwd_field_contain_length_mesg_on_set_pswd_page() throws InterruptedException {
		// dr.findElement(confirm_pswd_field).clear();
		 Thread.sleep(5000);
		 dr.findElement(psw_field).sendKeys("1234567");
		 dr.findElement(reset_password_button).click();
		 Thread.sleep(7000);
		 String pwd_length_msg=dr.findElement(pwd_field_contain_length_msg).getText();
		 String expe="Password cannot be less than 8 characters";
		 Assert.assertEquals(pwd_length_msg, expe);
					}		
		/*		
		//check password do not match error msg
		@Test(priority = 29)
		public void check_cnfrm_pswd_contain_password_do_not_match_error_msg() throws InterruptedException {
			dr.get(url);
			Thread.sleep(5000);
			 //dr.findElement(psw_field).clear();
			 dr.findElement(psw_field).sendKeys(new_password);
			 dr.findElement(confirm_pswd_field).sendKeys("123");
			 dr.findElement(reset_password_button).click();
			 Thread.sleep(5000);
			 String pwd_not_match_error_msg=dr.findElement(pswd_not_match).getText();
			 String expe="Passwords do not match.";
			 Assert.assertEquals(pwd_not_match_error_msg, expe);
		}  */
		
		
		//check reset password functionality
		@Test(priority = 30)
		public void check_set_password_functinality() throws InterruptedException {
			dr.findElement(psw_field).clear();
			dr.findElement(confirm_pswd_field).clear();
			Thread.sleep(5000);
			dr.findElement(psw_field).sendKeys(new_password);
			dr.findElement(confirm_pswd_field).sendKeys(new_password);
			dr.findElement(reset_password_button).click();
			Thread.sleep(5000);
			String loginpage_header=dr.findElement(Login_Page_header).getText();
			String Expect="Sign In";
			Assert.assertEquals(loginpage_header, Expect);
		}
		
		
		//try to login with old password
		@Test(priority = 31)
		public void check_try_to_login_with_old_password() throws InterruptedException {
			Thread.sleep(5000);
			dr.findElement(Username_field).sendKeys(username);
			dr.findElement(Password_field).sendKeys("55555555");
			dr.findElement(LogIn_Button).click();
			Thread.sleep(5000);
			String invalid_unme_pwd_msg=dr.findElement(invalid_usrnme_or_pswd_msg_element).getText();
			String expect="Invalid Username or Password!";
			Assert.assertEquals(invalid_unme_pwd_msg, expect);
		}
		
		//login with new password
		@Test(priority = 32)
		public void check_login_with_new_password() throws InterruptedException {			
			Thread.sleep(6000);
			dr.findElement(Username_field).clear();
			dr.findElement(Password_field).clear();
			Thread.sleep(5000);
			dr.findElement(Username_field).sendKeys(username);		
			dr.findElement(Password_field).sendKeys("12345678");
			dr.findElement(LogIn_Button).click();
			Thread.sleep(5000);
			dr.findElement(dashboard_menu).isDisplayed();
			
		}
		
		//set again old password from reset page
		@Test(priority = 33)
		public void set_again_old_password_from_reset_page() throws InterruptedException {
			dr.get(reset_password_url);
			Thread.sleep(7000);			
			dr.findElement(psw_field).sendKeys(old_password);
			dr.findElement(confirm_pswd_field).sendKeys(old_password);
			dr.findElement(reset_password_button).click();
			Thread.sleep(5000);
			String loginpage_header=dr.findElement(Login_Page_header).getText();
			String Expect="Sign In";
			Assert.assertEquals(loginpage_header, Expect);
			
		}
		
		/*
		//set again old password from profile page
		@Test(priority = 33)
		public void set_again_old_password_from_profile_page() throws InterruptedException {
			Thread.sleep(5000);
			dr.findElement(Right_top_corner_profile_name).click();
			Thread.sleep(5000);
			dr.findElement(Profile_submenu).click();
			Thread.sleep(5000);
			dr.findElement(new_pswd).sendKeys(old_password);
			dr.findElement(cnfrm_pswd).sendKeys(old_password);
			dr.findElement(Save_button).click();
			Thread.sleep(3000);
			dr.findElement(Right_top_corner_profile_name).click();
			Thread.sleep(8000);
			dr.findElement(logout_option).click();
			Thread.sleep(7000);
			dr.findElement(LogIn_Button).isDisplayed();
		}   */
		
	
		
	//login page
	//check username field contain required mesg
	@Test(priority =34 )
	public void check_username_field_contain_required_mesg() throws InterruptedException {
		
		Thread.sleep(5000);
		dr.findElement(Username_field).click();
		dr.findElement(LogIn_Button).click();
		String username_required_mesg=dr.findElement(username_field_contain_required_mesg).getText();
		String expe="Username is required.";
		Assert.assertEquals(username_required_mesg, expe);
	}
	
	//check password field contain required mesg
		@Test(priority =35)
		public void check_password_field_contain_required_mesg() throws InterruptedException {
			dr.findElement(Password_field).click();
			dr.findElement(LogIn_Button).click();
			Thread.sleep(5000);
			String password_required_mesg=dr.findElement(passsword_field_contain_required_mesg).getText();
			String expe="Password is required.";
			Assert.assertEquals(password_required_mesg, expe);
		}
		
       //click_on_login_button_if_username_and_password_field_empty
		@Test(priority = 36)
		public void click_on_login_button_if_username_and_password_field_empty() throws InterruptedException{
				
				Thread.sleep(5000);
				dr.findElement(LogIn_Button).click();
				Thread.sleep(4000);
				String Actual_login_page_header=dr.findElement(Login_Page_header).getText();
				String Expected_login_page_header="Sign In";
				Assert.assertEquals(Actual_login_page_header, Expected_login_page_header);			
		}	
		
		//click_on_login_button_if_username_filled_and_password_field_empty
				@Test(priority = 37)
				public void click_on_login_button_if_username_filled_and_password_field_empty() throws InterruptedException{
						
						Thread.sleep(5000);
						dr.findElement(Username_field).sendKeys(username);
						dr.findElement(LogIn_Button).click();
						Thread.sleep(4000);
						String Actual_login_page_header=dr.findElement(Login_Page_header).getText();
						String Expected_login_page_header="Sign In";
						Assert.assertEquals(Actual_login_page_header, Expected_login_page_header);			
				}	
				
				//click_on_login_button_if_username_empty_and_password_filled
				@Test(priority = 38)
				public void click_on_login_button_if_username_empty_and_password_filled() throws InterruptedException{
						
						Thread.sleep(5000);
						dr.findElement(Username_field).clear();
						Thread.sleep(5000);
						dr.findElement(Password_field).sendKeys(old_password);
						Thread.sleep(4000);
						dr.findElement(LogIn_Button).click();
						Thread.sleep(7000);
						String Actual_login_page_header=dr.findElement(Login_Page_header).getText();
						String Expected_login_page_header="Sign In";
						Assert.assertEquals(Actual_login_page_header, Expected_login_page_header);			
				}	
		
		
	//login with valid data
	@Test(priority = 39)
	public void Login_with_valid_data() throws InterruptedException{
		
		Thread.sleep(5000);
		dr.findElement(Username_field).clear();
		dr.findElement(Password_field).clear();
		Thread.sleep(5000);
		dr.findElement(Username_field).sendKeys(username);
		dr.findElement(Password_field).sendKeys(old_password);
		dr.findElement(LogIn_Button).click();
		Thread.sleep(6000);
		/*String actual=dr.findElement(dashboard_menu).getText();
		String exppected="Dashboard";
		if(actual.equals(exppected)) {
			System.out.println("Login sucessfully");
		}else {
			System.out.println("Login unsucess");
		}*/
	}	
	
	
}
	
