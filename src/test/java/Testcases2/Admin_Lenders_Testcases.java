package Testcases2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Admin_Lenders_Locators;

public class Admin_Lenders_Testcases extends Admin_Lenders_Locators {

	
	//Login
			@Test(priority = 0)
			public void Login() throws InterruptedException {
				dr.get(url);
				Thread.sleep(6000);
				dr.findElement(Username_field).sendKeys("Ramesh");
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
			
			/*
			//Check admin menu display
			@Test(priority = 0)
			public void Check_Admin_menu_display() {
				dr.findElement(Admin_menu).isDisplayed();
			}
			*/
	
	//Check admin menu clickable
			@Test(priority =1)
			public void Check_Admin_menu_clickable() throws InterruptedException {
				dr.findElement(Admin_menu).click();
				Thread.sleep(5000);
			}
			
			//Check Lenders  menu display
			@Test(priority =2)
			public void Check_Lenders_menu_display() {
				dr.findElement(Lenders_menu).isDisplayed();
			}
			
			//Check Lenders menu clickable
			@Test(priority=3)
			public void Check_Lenders_menu_Clickable() throws InterruptedException {
				dr.findElement(Lenders_menu).click();
				Thread.sleep(5000);
				
			}
			
			
			//Check  Lenders  webpage title
			@Test(priority =4)
			public void Check_Lenders_webpage_title() {
				String Actual_Lenders_webpage_title=dr.getTitle();
				String Expected_Lenders_webpage_title="WAIU - Lenders (v-1.0.5)";
				Assert.assertEquals(Actual_Lenders_webpage_title, Expected_Lenders_webpage_title);		
			}
			
			
			//Check Lenders page header
		    @Test(priority =5)
		    public void check_Lenders_page_header() {
		    	String Actual_page_header=dr.findElement(Lenders_pege_header).getText();
		    	String Expexted_page_header="Lenders";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
		    }
		    
		    
		    //Check Add lender button display
		    @Test(priority =7)
		    public void Check_Add_lender_button_display() {
		    	dr.findElement(Add_Lender_button).isDisplayed();
		     }
		    
		    //Check Add lender icon display
		    @Test(priority =8)
		    public void Check_Add_lender_icon_display() {
		    	dr.findElement(Add_Lender_icon).isDisplayed();
		     }
		    
		    //Check Text of Add lender button
		    @Test(priority =9)
		    public void text_of_Add_lender_button() {
		    
			String Actual_text_add_partner_button=dr.findElement(Add_Lender_button).getText();
			String expected_text_add_partner_button="Add Lender";
			Assert.assertEquals(Actual_text_add_partner_button,expected_text_add_partner_button);
		    }
		    
		  		    
		  //Check edit lender icon display
		    @Test(priority = 10)
		    public void check_edit_lender_icon_display() throws InterruptedException{
		    	Thread.sleep(7000);
		    	dr.findElement(Edit_Lender).isDisplayed();
		    }
		    
		  //Check edit lender icon clickable 
		    @Test(priority = 11)
		    public void check_edit_lensder_icon_clickable() throws InterruptedException{
		    	dr.findElement(Edit_Lender).click();
		    	Thread.sleep(7000);
		    	String Actual_text=dr.findElement(edit_lender_page_header).getText();
		    	String lender_name=dr.findElement(lender_name_Field_on_editpage).getAttribute("value");
			    String Expected_text="Lender View: "+lender_name;
			    Assert.assertEquals(Actual_text, Expected_text);
		    	
		    }
		    
		   		    
		  //Check Update button display
		    @Test(priority = 12)
		    public void check_Update_button_display() throws InterruptedException{
		    	Thread.sleep(5000);
		    	JavascriptExecutor js = (JavascriptExecutor) dr;
				js.executeScript("window.scrollBy(0,1000)");
		    	dr.findElement(Update_button).isDisplayed();
		    }
		    
		  //Check Update button clickable 
		    @Test(priority = 13)
		    public void check_Update_button_clickable() throws InterruptedException{
		    	
		    	dr.findElement(Update_button).click();
		    	Thread.sleep(7000);
		    	String Actual_text=dr.findElement(Lenders_pege_header).getText();
			    String Expected_text="Lenders";
			    Assert.assertEquals(Actual_text, Expected_text);
		    	
		    }
		    
		    
		    //Check view lender icon display
		    @Test(priority = 14)
		    public void check_view_lender_icon_visibility() throws InterruptedException{
		    	Thread.sleep(7000);
		    	dr.findElement(View_Lender).isDisplayed();
		    }
		    
		  //Check view lender icon clickable 
		    @Test(priority = 15)
		    public void check_view_lenser_icon_clickable() throws InterruptedException{
		    	dr.findElement(View_Lender).click();
		    	Thread.sleep(7000);
		    	dr.findElement(view_lender_page_header).isDisplayed();
			    dr.findElement(Back_to_list_button_on_viewlender).click();
		    	
		    }
		    
		    //Check Add lender icon display
		    @Test(priority = 16)
		    public void check_Add_lender_icon_display() throws InterruptedException{
		    	Thread.sleep(5000);
		    		dr.findElement(Add_Lender_icon).isDisplayed();
		    }
		    
		  //Check Add lender icon clickable 
		    @Test(priority = 17)
		    public void check_Add_lender_icon_clickable() throws InterruptedException{
		    	
		    	dr.findElement(Add_Lender_icon).click();
		    	Thread.sleep(7000);
		    	String Actual_text=dr.findElement(Add_Lender_page_header).getText();
			    String Expected_text="Lender View";
			    Assert.assertEquals(Actual_text, Expected_text);
			    dr.findElement(Back_to_list_button).click();	    	
		    }  
		    	    
		    
		   //Check Add lender button clickable 
		    @Test(priority = 18)
		    public void check_Add_lender_button_clickable() throws InterruptedException{
		    	
		    	dr.findElement(Add_Lender_button).click();
		    	Thread.sleep(7000);
		    	String Actual_text=dr.findElement(Add_Lender_page_header).getText();
			    String Expected_text="Lender View";
			    Assert.assertEquals(Actual_text, Expected_text);
		    	
		    }
		    
		    
		    
		  //Check save button display on add lender page
		    @Test(priority = 19)
		    public void check_save_button_display() throws InterruptedException{
		    	JavascriptExecutor jsss = (JavascriptExecutor) dr;
				jsss.executeScript("window.scrollBy(0,1000)");
		    		dr.findElement(save_button).isDisplayed();
		    		jsss.executeScript("window.scrollBy(0,-1000)");
		    }
		    
		    
		   
		    //Check mandatory field contain message
		    @Test(priority = 20)
		    public void check_add_lender_form_field_contain_mandatory_message() throws InterruptedException {
		    	JavascriptExecutor js = (JavascriptExecutor) dr;
				js.executeScript("window.scrollBy(0,850)");
				Thread.sleep(5000);
		    	dr.findElement(save_button).click();
		    	String Actual_lendername_required_msg=dr.findElement(lender_name_mandatory_element).getText();
		    	Assert.assertEquals(Actual_lendername_required_msg, "Lender Name is required.");
		    	String Actual_Description_required_msg=dr.findElement(description_mandatory_element).getText();
		    	Assert.assertEquals(Actual_Description_required_msg, "Description is required.");
		    	String Actual_termscondtion_required_msg=dr.findElement(termscondtion_mandatory_element).getText();
		    	Assert.assertEquals(Actual_termscondtion_required_msg, "Terms And Conditions are required.");
		    	String Actual_website_required_msg=dr.findElement(website_mandatory_element).getText();
		    	Assert.assertEquals(Actual_website_required_msg, "Web site required.");
		    	dr.findElement(website).sendKeys(invalid_website);
		    	Thread.sleep(4000);
		    	String Actual_website_proper_format=dr.findElement(website_properformat_element).getText();
		    	Assert.assertEquals(Actual_website_proper_format, "Web site should be in proper format");
		    	String Actual_contactperson_required_msg=dr.findElement(ContactPerson_mandatory_element).getText();
		    	Assert.assertEquals(Actual_contactperson_required_msg, "Contact Person required.");
	        	String Actual_PrimaryContactNo_required_msg=dr.findElement(PrimaryContactNo_mandatory_element).getText();
		    	Assert.assertEquals(Actual_PrimaryContactNo_required_msg, "Primary Contact No. is required.");
		    	dr.findElement(contactNumberPrimary).sendKeys(invalid_contactNo);
		    	Thread.sleep(4000);
		    	String Actual_PrimaryContactNo_10_digit_msg=dr.findElement(PrimaryContactNo_10_digit_required_element).getText();
		    	Assert.assertEquals(Actual_PrimaryContactNo_10_digit_msg, "Please Enter 10 digit Mobile Number.");   	
		    	String Actual_secondaryContactNo_required_msg=dr.findElement(SecondaryContactNo_mandatory_element).getText();
		    	Assert.assertEquals(Actual_secondaryContactNo_required_msg, "Secondary Contact No. is required.");
		    	dr.findElement(contactNumberSecondry).sendKeys(invalid_contactNo);
		    	Thread.sleep(4000);
		    	String Actual_secondaryContactNo_10_digit_msg=dr.findElement(SecondaryContactNo_10_digit_required_element).getText();
		    	Assert.assertEquals(Actual_secondaryContactNo_10_digit_msg, "Please Enter 10 digit Mobile Number.");
		    	Thread.sleep(5000);
		    	String Actual_email_required_msg=dr.findElement(email_mandatory_element).getText();
		    	Assert.assertEquals(Actual_email_required_msg, "Email ID is required.");
		    	dr.findElement(email).sendKeys(invalid_email);
		    	String Actual_validemail_msg=dr.findElement(valid_email_element).getText();
		    	Assert.assertEquals(Actual_validemail_msg, "Please enter valid Email Id");		    	
		    	String Actual_APIKey_required_msg=dr.findElement(API_key_mandatory_element).getText();
		    	Assert.assertEquals(Actual_APIKey_required_msg, "Api Key is required.");
		    	
		    	String Actual_API_secretkey_required_msg=dr.findElement(API_secret_mandatory_element).getText();
		    	Assert.assertEquals(Actual_API_secretkey_required_msg, "Api Secret is required.");
		    	
		    }
		    
		    
		   
		  //Check Add lender functionality
		    @Test(priority = 21)
		    public void check_Add_lender_functionality() throws InterruptedException, AWTException{
		        JavascriptExecutor js = (JavascriptExecutor) dr;
				js.executeScript("window.scrollBy(0,-850)");
				dr.findElement(Back_to_list_button_on_viewlender).click();
		    	Thread.sleep(7000);
		    	dr.findElement(Add_Lender_button).click();
		    	Thread.sleep(5000);
		    	 	dr.findElement(lender_name).sendKeys("AXIS Bank");
		    	dr.findElement(Description).sendKeys("Vijay");
		    	dr.findElement(termAndCondition).sendKeys("1111111112");
		    	//upload logo file
    	//Actions act=new Actions(dr);
    	//act.moveToElement(dr.findElement(logo_upload_file));
    	//act.click().build().perform(); 
    	
    	String imagePath = System.getProperty("user.dir") + "/Files/images.png";
    	 dr.findElement(logo_upload_file).sendKeys(imagePath);
    	
    	
    	/*
        Thread.sleep(10000);
        StringSelection s = new StringSelection("D:\\images");
        // Clipboard copy
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);        
        
        // Robot object creation
        Robot r = new Robot();
        
        //pressing enter
        r.keyPress(KeyEvent.VK_ENTER);
        //releasing enter
        r.keyRelease(KeyEvent.VK_ENTER);
        //pressing ctrl+v
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        //releasing ctrl+v
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        //pressing enter
        r.keyPress(KeyEvent.VK_ENTER);
        //releasing enter
        r.keyRelease(KeyEvent.VK_ENTER);   */
		    	dr.findElement(website).sendKeys("www.google.com");
		    	dr.findElement(contact_peson).sendKeys("Ajit");
		    	dr.findElement(contactNumberPrimary).sendKeys("1111111112");
		    	dr.findElement(contactNumberSecondry).sendKeys("1111111113");
		    	dr.findElement(email).sendKeys("ad@ad.com");
		    	
		    	JavascriptExecutor j = (JavascriptExecutor) dr;
				j.executeScript("window.scrollBy(0,1000)");
				
		    	dr.findElement(API_key).sendKeys("707H78D1QUE1SANHIN3V");
		    	dr.findElement(apiSecret).sendKeys("44jbdfJ");
		    	
		    	dr.findElement(save_button).click();
		        Thread.sleep(5000);
		        String Actual_page_header=dr.findElement(Lenders_pege_header).getText();
		    	String Expexted_page_header="Lenders";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);  
		    }
		    

}
