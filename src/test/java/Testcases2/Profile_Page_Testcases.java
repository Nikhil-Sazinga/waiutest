package Testcases2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Profile_Page_Locators;
import Utilities.Testbase2;

public class Profile_Page_Testcases extends Profile_Page_Locators{
	
	//Login
			@Test(priority = 0)
			public void Login() throws InterruptedException {
				dr.get("https://portal-dev.waiu.co.in/login");
				Thread.sleep(6000);
				dr.findElement(Username_field).sendKeys("rameshtk");
				dr.findElement(Password_field).sendKeys("12345678");
				dr.findElement(LogIn_Button).click();
				Thread.sleep(6000);
				String actual=dr.findElement(Dashboard_menu).getText();
				String exppected="Dashboard";
				if(actual.equals(exppected)) {
					System.out.println("Login sucessfully");
				}else {
					System.out.println("Login unsucess");
				}
				
			}
			
			
			//Check Right_top_corner_profile display
			@Test(priority = 1)
			public void Right_top_corner_profile_visibility() {
				dr.findElement(Right_top_corner_profile_name).isDisplayed();
			}
			
			
			
			//Check Right_top_corner_profile_name clickable
			@Test(priority =2)
			public void Check_Right_top_corner_profile_name_clickable() throws InterruptedException {
				dr.findElement(Right_top_corner_profile_name).click();
				Thread.sleep(5000);
				dr.findElement(Profile_submenu).click();
				Thread.sleep(5000);
				String Actual_page_header=dr.findElement(Profile_pege_header).getText();
		    	String Expexted_page_header="User Profile";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
			}
			
			//Check Profile_icon visibility
			@Test(priority =3)
			public void Check_Profile_icon_visibility() {
				dr.findElement(Profile_icon).isDisplayed();
			}
			
			//Check Profile_icon clickable
			@Test(priority=4)
			public void Check_Profile_icon_Clickable() throws InterruptedException {
				dr.findElement(Dashboard_menu).click();
				Thread.sleep(5000);
				dr.findElement(Profile_icon).click();
				Thread.sleep(5000);
				dr.findElement(Profile_icon_in_submenu).click();
				Thread.sleep(5000);
				String Actual_page_header=dr.findElement(Profile_pege_header).getText();
		    	String Expexted_page_header="User Profile";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
			}
			
			//Check  profile webpage title
			@Test(priority =5)
			public void Check_profile_webpage_title() {
				String Actual_profile_webpage_title=dr.getTitle();
				String Expected_profile_webpage_title="WAIU - User Profile (v-1.0.5)";
				Assert.assertEquals(Actual_profile_webpage_title, Expected_profile_webpage_title);		
			}
			
			
			//Check profile page header
		    @Test(priority =6)
		    public void check_profile_page_header() {
		    	String Actual_page_header=dr.findElement(Profile_pege_header).getText();
		    	String Expexted_page_header="User Profile";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
		    }
		    
		    
		    //Check profile_form_title visibility
		    @Test(priority =7)
		    public void Check_profile_form_title_display() {
		    	dr.findElement(user_details_title).isDisplayed();
		     }
		    
		    //Check profile_form_title text
		    @Test(priority =8)
		    public void Check_profile_form_title_text() {
		    	String Actual_text=dr.findElement(user_details_title).getText();
		    	String Expected_text="Users Details";
		    	Assert.assertEquals(Actual_text, Expected_text);
		     }
		    
		  //Check update button visibility
		    @Test(priority =9)
		    public void Check_update_button_visibility() {
		    	dr.findElement(Update_button).isDisplayed();
		     }
		    
		    //Check update button text
		    @Test(priority =10)
		    public void Check_update_button_text() {
		    	String Actual_text=dr.findElement(Update_button).getText();
		    	String Expected_text="Update";
		    	Assert.assertEquals(Actual_text, Expected_text);
		     }
		    
		    
		    //Check Update functionality without change in any field 
		    @Test(priority =11)
		    public void update_functinality_without_change() throws InterruptedException {
		    dr.findElement(Update_button).click();
		    Thread.sleep(5000);
		   	String Actual_update_profile_msg=dr.findElement(profile_Update_mesg).getText();
			String expected_update_profile_msg="user updated sucessfully";
			Assert.assertEquals(Actual_update_profile_msg,expected_update_profile_msg);
		    }
		    
		    //Check Update functionality change in any field 
		    @Test(priority =12)
		    public void update_functinality() throws InterruptedException {
		    dr.navigate().refresh();
		    Thread.sleep(7000);
		    dr.findElement(zipcode).clear();
		    dr.findElement(zipcode).sendKeys("444444");
		    dr.findElement(Update_button).click();
		    Thread.sleep(5000);
		   	String Actual_update_profile_msg=dr.findElement(profile_Update_mesg).getText();
			String expected_update_profile_msg="user updated sucessfully";
			Assert.assertEquals(Actual_update_profile_msg,expected_update_profile_msg);
		    }
		    
		  //Check username, email, phone number, role field disabled
		    @Test(priority =13)
		    public void Check_username_email_phonenumber_role_field_disabled() throws InterruptedException {
		    	dr.findElement(username_field).sendKeys("abc");
		    	 
		        String fieldNameVal = dr.findElement(username_field).getAttribute("value");
		        if(fieldNameVal.contentEquals("abc")){
		        System.out.println("Field is editable");
		        }
		        else{
		        System.out.println("Field is non editable :" + fieldNameVal);
		        }
		        
		        //email
		        dr.findElement(email_field).sendKeys("abc");
		        String fieldNameVal1 = dr.findElement(email_field).getAttribute("value");
		        if(fieldNameVal1.contentEquals("abc")){
		        System.out.println("Field is editable");
		        }
		        else{
		        System.out.println("Field is non editable :" + fieldNameVal1);
		        }
		        
		      //phonenumber
		        dr.findElement(phoneNo_field).sendKeys("abc");
		        String fieldNameVal2 = dr.findElement(phoneNo_field).getAttribute("value");
		        if(fieldNameVal2.contentEquals("abc")){
		        System.out.println("Field is editable");
		        }
		        else{
		        System.out.println("Field is non editable :" + fieldNameVal2);
		        }
		        
		      //role
		        dr.findElement(role_field).sendKeys("abc");
		        String fieldNameVal3 = dr.findElement(role_field).getAttribute("value");
		        if(fieldNameVal1.contentEquals("abc")){
		        System.out.println("Field is editable");
		        }
		        else{
		        System.out.println("Field is non editable :" + fieldNameVal3);
		        }
		        
		    /*	
     	   	Boolean username=dr.findElement(Username_field).isEnabled();
     	   	Assert.assertEquals(username, false);
			//Assert.assertEquals(username,false);
			
			Boolean email=dr.findElement(email_field).isEnabled();
			Assert.assertEquals(email, false);
			//Assert.assertEquals(email,false);
			
			Boolean phoneno=dr.findElement(phoneNo_field).isEnabled();
			Assert.assertEquals(phoneno, false);
			
			Boolean role=dr.findElement(role_field).isEnabled();
			Assert.assertEquals(role, false);
			*/
		    }
		    
		    
		    
		    
		  //check on profile page mandatory field contain mandatory message 
		    @Test(priority = 14)
		    public void check_on_add_partner_page_mandatory_field_contain_mandatory_message() throws InterruptedException {
		    	Thread.sleep(5000);
		    	//JavascriptExecutor js = (JavascriptExecutor) dr;
				//js.executeScript("window.scrollBy(0,1000)");
		    	dr.findElement(firstname_field).clear();
		    	Thread.sleep(4000);
		    	String Actual_firstname_required_msg=dr.findElement(first_name_mandatory_element).getText();
		    	Assert.assertEquals(Actual_firstname_required_msg, "First Name is required.");
		    	dr.findElement(lastname_field).clear();
		    	Thread.sleep(4000);
		    	String Actual_lastname_required_msg=dr.findElement(last_name_mandatory_element).getText();
		    	Assert.assertEquals(Actual_lastname_required_msg, "Last Name is required.");
		    	
		    	JavascriptExecutor js = (JavascriptExecutor) dr;
				js.executeScript("window.scrollBy(0,1000)");
		    	
		    	Select sel=new Select(dr.findElement(state_field));
		    	sel.selectByVisibleText("Select State");
		    	Thread.sleep(4000);
		    	String Actual_state_required_msg=dr.findElement(state_mandatory_element).getText();
		    	Assert.assertEquals(Actual_state_required_msg, "State is required.");
		    	
		    	//Select sel1=new Select(dr.findElement(city_field));
		    	//sel1.selectByVisibleText("Select State");
		    	String Actual_city_required_msg=dr.findElement(city_mandatory_element).getText();
		    	Assert.assertEquals(Actual_city_required_msg, "City is required.");
		    	
		    	dr.findElement(zipcode).clear();
		    	Thread.sleep(4000);
		    	String Actual_zipcode_required_msg=dr.findElement(zipcode_mandatory_element).getText();
		    	Assert.assertEquals(Actual_zipcode_required_msg, "Zipcode is required.");
		    	
		    	dr.findElement(birthdate).clear();
		    	Thread.sleep(4000);
		    	String Actual_birthdate_required_msg=dr.findElement(birth_date_mandatory_element).getText();
		    	Assert.assertEquals(Actual_birthdate_required_msg, "Birth Date is required.");
    	
	  	  }
		    
		    
		   /* 
		  //Check password section title display
		    @Test(priority =13)
		    public void password_section_title_display() {
		    dr.findElement(passwrd_section_title).isDisplayed();
		    }
		    
		  //Check password section title text
		    @Test(priority =14)
		    public void password_section_title_text() {
		    	String Actual_password_section_title_text=dr.findElement(passwrd_section_title).getText();
				String expected_password_section_title_text="Password";
				Assert.assertEquals(Actual_password_section_title_text,expected_password_section_title_text);
		    }
		    
		  //Check new password label visibility
		    @Test(priority =15)
		    public void New_password_label_visibility() {
		    dr.findElement(new_pswd_label).isDisplayed();
		    }
		    
		  //Check new password label text 
		    @Test(priority =16)
		    public void New_password_label_text() {
		    String actual_New_password_label_text=dr.findElement(new_pswd_label).getText();
		    String Expected="New Password";
		    Assert.assertEquals(actual_New_password_label_text,Expected);
		    }
		    
		    //Check new password field visibility
		    @Test(priority =17)
		    public void New_password_field_visibility() {
		    dr.findElement(new_pswd).isDisplayed();
		    }
		    
		  //Check new password field placeholder
		    @Test(priority =18)
		    public void new_password_field_placeholder() {
		    	String Actual_new_password_field_placeholder=dr.findElement(new_pswd).getAttribute("placeholder");
				String expected_new_password_field_placeholder="New Password";
				Assert.assertEquals(Actual_new_password_field_placeholder,expected_new_password_field_placeholder);
		    }
		    
		    //Check cnfrm password label visibility
		    @Test(priority =19)
		    public void cnfrm_password_label_visibility() {
		    dr.findElement(cnfrm_pswd_label).isDisplayed();
		    }
		    
		  //Check cnfrm password label text 
		    @Test(priority =20)
		    public void cnfrm_password_label_text() {
		    String actual_cnfrm_password_label_text=dr.findElement(cnfrm_pswd_label).getText();
		    String Expected="Confirm Password";
		    Assert.assertEquals(actual_cnfrm_password_label_text,Expected);
		    }
		    
		    
		  //Check confirm password field display
		    @Test(priority =21)
		    public void confirm_password_field_display() {
		    dr.findElement(cnfrm_pswd).isDisplayed();
		    }
		    
		  //Check confirm password field placeholder
		    @Test(priority =22)
		    public void confirm_password_field_placeholder() {
		    	String Actual_confirm_password_field_placeholder=dr.findElement(cnfrm_pswd).getAttribute("placeholder");
				String expected_confirm_password_field_placeholder="Confirm Password";
				Assert.assertEquals(Actual_confirm_password_field_placeholder,expected_confirm_password_field_placeholder);
		    }
		    
		    //Check password change functionality
		    @Test(priority =23)
		    public void password_change_functionality() throws InterruptedException {
		    	Thread.sleep(7000);
		    dr.findElement(new_pswd).sendKeys("87654321");
		    dr.findElement(cnfrm_pswd).sendKeys("87654321");
		    dr.findElement(Save_button).click();
		    Thread.sleep(7000);
		    dr.findElement(login_page_title).isDisplayed();
		    }
		    
		  //Check login with old password
		    @Test(priority =24)
		    public void login_with_old_password() throws InterruptedException {
		    dr.findElement(Username_field).sendKeys("rameshtk");
			dr.findElement(Password_field).sendKeys("12345678");
		    dr.findElement(login_button).click();
		    Thread.sleep(7000);
		    String Actual_label_wrong_pswd=dr.findElement(label_for_wrong_pswrd).getText();
		    String Expect_label_wrong_pswd="Invalid Username or Password!";
		    Assert.assertEquals(Actual_label_wrong_pswd, Expect_label_wrong_pswd);
		    }
		    
		  //Check login with new changed password
		    @Test(priority =25)
		    public void login_with_new_change_password() throws InterruptedException {
		    dr.navigate().refresh();
		    Thread.sleep(7000);
		    dr.findElement(Username_field).sendKeys("rameshtke");
			dr.findElement(Password_field).sendKeys("87654321");
		    dr.findElement(login_button).click();
		    Thread.sleep(7000);
		    String Actual_dashbord_header=dr.findElement(Dashboard_header).getText();
		    String Expect_dashbord_header="Dashboard";
		    Assert.assertEquals(Actual_dashbord_header, Expect_dashbord_header);
		    }
   
		    
		  //Again set old password
		    @Test(priority =26)
		    public void Again_set_old_password() throws InterruptedException {
		    	Thread.sleep(5000);
				dr.findElement(Profile_icon).click();
				Thread.sleep(5000);
				dr.findElement(Profile_icon_in_submenu).click();
				Thread.sleep(5000);
		    dr.findElement(new_pswd).sendKeys("12345678");
		    dr.findElement(cnfrm_pswd).sendKeys("12345678");
		    dr.findElement(Save_button).click();
		    Thread.sleep(7000);
		    dr.findElement(login_page_title).isDisplayed();
		    }
		    */
		    
		    //Check Web Application menu visibility
		    @Test(priority = 15)
		    public void Check_Web_Application_menu_visibility() throws InterruptedException {
		    	Thread.sleep(6000);						
		    	dr.findElement(Web_Application_menu).isDisplayed();
		    }
		    
		  //Check Web Application-->profile menu visibility
		    @Test(priority = 16)
		    public void Check_Web_Application_profile_menu_visibility() {
		    	dr.findElement(profile_menu).isDisplayed();
		    }
		    
		  //navigate to profile page using menu options
		    @Test(priority =17)
		    public void navigate_to_profile_page_using_menu() throws InterruptedException {
		    	Thread.sleep(5000);
		    	dr.findElement(Dashboard_menu).click();
		    	Thread.sleep(5000);
		    	dr.findElement(Web_Application_menu).click();
		    	Thread.sleep(7000);
		    	dr.findElement(profile_menu).click();
		    	Thread.sleep(5000);
		    dr.findElement(Profile_pege_header).isDisplayed();
		    }

}
