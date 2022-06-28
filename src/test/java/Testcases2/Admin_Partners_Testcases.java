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

import TestXpath.Admin_Partners_Locators;

public class Admin_Partners_Testcases extends Admin_Partners_Locators{
	
	//Login
		@Test(priority = 0)
		public void Login() throws InterruptedException {
			dr.get(url);
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
		
		//Check Partners menu display
		@Test(priority =2)
		public void Check_Partners_menu_display() {
			dr.findElement(Partners_menu).isDisplayed();
		}
		
		//Check Partners menu clickable
		@Test(priority=3)
		public void Check_Partners_menu_Clickable() throws InterruptedException {
			dr.findElement(Partners_menu).click();
			Thread.sleep(5000);
			
		}
		
		//Check  Partners webpage title
		@Test(priority =4)
		public void Check_Partners_webpage_title() {
			String Actual_Merchants_webpage_title=dr.getTitle();
			String Expected_Merchants_webpage_title="WAIU - Partners List (v-1.0.5)";
			Assert.assertEquals(Actual_Merchants_webpage_title, Expected_Merchants_webpage_title);		
		}
		
		
		//Check Partners page header
	    @Test(priority =5)
	    public void check_Partners_page_header() {
	    	String Actual_page_header=dr.findElement(Partners_pege_header).getText();
	    	String Expexted_page_header="Partners List";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }
	    
	    
	    //Check Add partner button display
	    @Test(priority =7)
	    public void Check_Add_partner_button_display() {
	    	dr.findElement(Add_Partner_button).isDisplayed();
	     }
	    
	    //Check Add partner icon display
	    @Test(priority =8)
	    public void Check_Add_partner_icon_display() {
	    	dr.findElement(Add_Partner_icon).isDisplayed();
	     }
	    
	    //Check Text of Add partner button
	    @Test(priority =9)
	    public void text_of_Add_partner_button() {
	    
		String Actual_text_add_partner_button=dr.findElement(Add_Partner_button).getText();
		String expected_text_add_partner_button="Add Partner";
		Assert.assertEquals(Actual_text_add_partner_button,expected_text_add_partner_button);
	    }
	    
	  //Check view partner icon display
	    @Test(priority =10)
	    public void view_partner_icon_display() {
	    dr.findElement(View_partner).isDisplayed();
	    }
	    
	  //Check view partner icon clickable
	    @Test(priority =11)
	    public void view_partner_icon_clickable() throws InterruptedException {
	    dr.findElement(View_partner).click();
	    Thread.sleep(5000);
	    String Actual_text=dr.findElement(View_partner_page_header).getText();
	    String Expected_text="Add Partner";
	    Assert.assertEquals(Actual_text, Expected_text);
	    }
	    
	  //Check Back_to_list_button display on view partner page
	    @Test(priority = 12)
	    public void check_Back_to_list_button_display(){
	    	dr.findElement(Back_to_list_button).isDisplayed();
	    }
	    
	  //Check Back_to_list_button clickable on view partner page
	    @Test(priority = 13)
	    public void check_Back_to_list_button_clickable(){
	    	dr.findElement(Back_to_list_button).click();
	    }
	    
	    
	  //Check edit partner icon display
	    @Test(priority = 14)
	    public void check_edit_partner_icon_display() throws InterruptedException{
	    	Thread.sleep(7000);
	    	dr.findElement(Edit_partner).isDisplayed();
	    }
	    
	  //Check edit partner icon clickable 
	    @Test(priority = 15)
	    public void check_edit_partner_icon_clickable() throws InterruptedException{
	    	dr.findElement(Edit_partner).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(edit_partner_page_header).getText();
		    String Expected_text="Add Partner";
		    Assert.assertEquals(Actual_text, Expected_text);
	    	
	    }
	    
	    
	  //Check cancel button display
	    @Test(priority = 16)
	    public void check_Cancel_button_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    	JavascriptExecutor jss = (JavascriptExecutor) dr;
			//jss.executeScript("window.scrollBy(0,1000)");	    	
	    	jss.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    	//jss.executeScript("arguments[0].scrollIntoView();", dr.findElement(Cancel_button));
	    	Thread.sleep(3000);
	    	dr.findElement(Cancel_button).isDisplayed();
	    }
	    
	  //Check cancel button clickable 
	    @Test(priority = 17)
	    public void check_cancel_button_clickable() throws InterruptedException{
	    	
	    	dr.findElement(Cancel_button).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(Partners_pege_header).getText();
		    String Expected_text="Partners List";
		    Assert.assertEquals(Actual_text, Expected_text);
	    	
	    }
	    
	   
	  //Check Update button display
	    @Test(priority = 18)
	    public void check_Update_button_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    	dr.findElement(Edit_partner).click();
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	    	js.executeScript("arguments[0].scrollIntoView();", dr.findElement(Update_button));
			//js.executeScript("window.scrollBy(0,1000)");
	    	dr.findElement(Update_button).isDisplayed();
	    }
	    
	  //Check Update button clickable 
	    @Test(priority = 19)
	    public void check_Update_button_clickable() throws InterruptedException{
	    	
	    	dr.findElement(Update_button).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(Partners_pege_header).getText();
		    String Expected_text="Partners List";
		    Assert.assertEquals(Actual_text, Expected_text);
	    	
	    }
	    
	    
	    //Check Add partner icon display
	    @Test(priority = 20)
	    public void check_Add_Partner_icon_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    		dr.findElement(Add_Partner_icon).isDisplayed();
	    }
	    
	  //Check Add partner icon clickable 
	    @Test(priority = 21)
	    public void check_Add_partner_icon_clickable() throws InterruptedException{
	    	
	    	dr.findElement(Add_Partner_icon).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(Add_partner_page_header).getText();
		    String Expected_text="Add Partner";
		    Assert.assertEquals(Actual_text, Expected_text);
		    dr.findElement(back_to_list).click();	    	
	    }
	    	    
	    
	  //Check Add partner button display
	    @Test(priority = 22)
	    public void check_Add_Partner_button_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    		dr.findElement(Add_Partner_button).isDisplayed();
	    }
	    
	  //Check Add partner button clickable 
	    @Test(priority = 23)
	    public void check_Add_partner_button_clickable() throws InterruptedException{
	    	
	    	dr.findElement(Add_Partner_button).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(Add_partner_page_header).getText();
		    String Expected_text="Add Partner";
		    Assert.assertEquals(Actual_text, Expected_text);
	    	
	    }
	    
	    //Check Cancel button display on add partner page
	    @Test(priority = 24)
	    public void check_cancel_button_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	    	js.executeScript("arguments[0].scrollIntoView();", dr.findElement(cancel_button));
			//jsss.executeScript("window.scrollBy(0,1000)");
	    		dr.findElement(cancel_button).isDisplayed();
	    }
	    
	  //Check cancel button clickable on add partner page
	    @Test(priority = 25)
	    public void check_cancel_button_clickable_on_add_partner_page() throws InterruptedException{
	    	dr.findElement(cancel_button).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(Partners_pege_header).getText();
		    String Expected_text="Partners List";
		    Assert.assertEquals(Actual_text, Expected_text);
	    	
	    }
	    
	    //Check search field visibility
	    @Test(priority = 26)
	    public void check_search_field_visibility() {
	    	dr.findElement(search_field).isDisplayed();	    	
	    }
	    
	  //Check search field placeholder
	    @Test(priority = 28)
	    public void check_search_field_placeholder() {
	    	String Actual_placeholder=dr.findElement(search_field).getAttribute("placeholder");	
	    	Assert.assertEquals(Actual_placeholder, "Search Keyword");
	    }
	    
	  //Check clear button visibility
	    @Test(priority = 29)
	    public void check_clear_button_visibility() {
	    	dr.findElement(clear_button).isDisplayed();	    	
	    }
	    
	  //Check clear button text
	    @Test(priority = 30)
	    public void clear_button_text() {
	    	String Actual_placeholder=dr.findElement(clear_button).getText();	
	    	Assert.assertEquals(Actual_placeholder, "Clear");
	    }
	    
	  //Check search functionality
	    @Test(priority = 31)
	    public void search_functionality() throws InterruptedException {
	    	String search_input=dr.findElement(input_for_search_from_table_element).getText();
	    	dr.findElement(search_field).sendKeys(search_input);
	    	Thread.sleep(5000);
	    	String search_result=dr.findElement(result_for_search_from_table_element).getText();	    	
	    	Assert.assertEquals(search_input, search_result);
	    }
	    
	  	    
	    //Check clear functionality
	    @Test(priority = 32)
	    public void check_clear_functionality() throws InterruptedException {
	    	dr.navigate().refresh();
	    	Thread.sleep(7000);
	    	String search_input=dr.findElement(input_for_search_from_table_element).getText();
	    	dr.findElement(search_field).sendKeys(search_input);
	    	Thread.sleep(5000);
	    	dr.findElement(clear_button).click();
	    	Thread.sleep(5000);
	    	String Actual_text=dr.findElement(search_field).getAttribute("placeholder");    	
	    	Assert.assertEquals(Actual_text, "Search Keyword");
	    }
	    
	    //check on add partner page mandatory field contain mandatory message 
	    @Test(priority = 33)
	    public void check_on_add_partner_page_mandatory_field_contain_mandatory_message() throws InterruptedException {
	    	dr.findElement(Add_Partner_button).click();
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
			js.executeScript("window.scrollBy(0,1000)");
	    	dr.findElement(Save_and_Proceed_button).click();
	    	Thread.sleep(5000);	    	
	    	String Actual_partnertype_required_msg=dr.findElement(partner_type_mandatory_element).getText();
	    	Assert.assertEquals(Actual_partnertype_required_msg, "Partner Type is required.");
	    	String Actual_partnername_required_msg=dr.findElement(partner_name_mandatory_element).getText();
	    	Assert.assertEquals(Actual_partnername_required_msg, "Partner Name required.");
	    	String Actual_contactname_required_msg=dr.findElement(contact_name_mandatory_element).getText();
	    	Assert.assertEquals(Actual_contactname_required_msg, "Contact Name required.");
	    	String Actual_contactnumber_required_msg=dr.findElement(contactnumber_mandatory_element).getText();
	    	Assert.assertEquals(Actual_contactnumber_required_msg, "Contact Number is required.");
	    	dr.findElement(contact_number).sendKeys(invalid_contactNo);
	    	Thread.sleep(4000);
	    	String Actual_ContactNo_10_digit_msg=dr.findElement(contactnumber_10_digit_Required_element).getText();
	    	Assert.assertEquals(Actual_ContactNo_10_digit_msg, "Please Enter 10 digit Mobile Number."); 	    	
	    	String Actual_email_required_msg=dr.findElement(email_mandatory_element).getText();
	    	Assert.assertEquals(Actual_email_required_msg, "Email is required.");
	    	dr.findElement(email).sendKeys(invalid_email);
	    	Thread.sleep(4000);
	    	String Actual_validemail_msg=dr.findElement(valid_email_element).getText();
	    	Assert.assertEquals(Actual_validemail_msg, "Please enter valid Email Partner Address");
	    	String Actual_address_required_msg=dr.findElement(Address_mandatory_element).getText();
	    	Assert.assertEquals(Actual_address_required_msg, "Address is required.");
	     	String Actual_state_required_msg=dr.findElement(state_mandatory_element).getText();
	    	Assert.assertEquals(Actual_state_required_msg, "State is required.");
	    	
	    	String Actual_city_required_msg=dr.findElement(city_mandatory_element).getText();
	    	Assert.assertEquals(Actual_city_required_msg, "City is required.");
	    	
	    	  }
	    
	    
	    //Check Add partner functionality for invalid input
	    @Test(priority = 34)
	    public void check_Add_partner_functionality_for_invalid_input() throws InterruptedException, AWTException{
	    	dr.navigate().refresh();
	    	Thread.sleep(7000);
	    	Select sel=new Select(dr.findElement(partner_type));
	    	sel.selectByVisibleText("Corporate Office");
	    	dr.findElement(partner_name).sendKeys("ICICI Bank");
	    	dr.findElement(contact_name).sendKeys("Anand");
	    	dr.findElement(contact_number).sendKeys("111111111");
	    	
	    	dr.findElement(email).sendKeys("ab@ab");
	    	dr.findElement(GST_number).sendKeys("22AAAAA0000A1Z");
	    	dr.findElement(Registration_ID).sendKeys("  ");
	    	
	    	dr.findElement(Address).sendKeys("Flat No.11");
	    	Select sel1=new Select(dr.findElement(state));
	    	sel1.selectByVisibleText("Maharashtra");
	    	Thread.sleep(7000);
	    	Select sel2=new Select(dr.findElement(city));
	    	sel2.selectByVisibleText("Pune");
	    	dr.findElement(pincode).sendKeys("41051");
	    	
	    	JavascriptExecutor j = (JavascriptExecutor) dr;
			j.executeScript("window.scrollBy(0,1000)");
			
	    	dr.findElement(discount).sendKeys("11");
	    	Select sel3=new Select(dr.findElement(status));
	    	sel3.selectByVisibleText("Active");
	    	
	    	String imagePath = System.getProperty("user.dir") + "/Files/images.png";
	    	 dr.findElement(upload_file).sendKeys(imagePath);
	    	
	    	/*
	    	//upload partner logo file
	    	Actions act=new Actions(dr);
	    	act.moveToElement(dr.findElement(upload_file));
	    	act.click().build().perform();  	  	
	    	
	        Thread.sleep(10000);
	        StringSelection s = new StringSelection("D:\\images.png");
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
	        r.keyRelease(KeyEvent.VK_ENTER);
	        */
	        Thread.sleep(5000);
	        dr.findElement(Save_and_Proceed_button).click();
	        Thread.sleep(5000);
	        String Actual_page_header=dr.findElement(Add_partner_page_header).getText();
	    	String Expexted_page_header="Add Partner";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }
	    
	    
	    //check logo file size message
	    @Test(priority =35)
	    public void check_logo_file_size_message() throws InterruptedException, AWTException {
	    	dr.navigate().refresh();
	    	Thread.sleep(5000);
	    	
	    	String imagePath = System.getProperty("user.dir") + "/Files/more than 2MB.jpg";
	    	 dr.findElement(upload_file).sendKeys(imagePath);
	    	
	    	/*
	    	//upload partner logo file
	    	Actions act=new Actions(dr);
	    	act.moveToElement(dr.findElement(upload_file));
	    	act.click().build().perform();  	  	
	    	
	        Thread.sleep(5000);
	        //StringSelection s = new StringSelection("Files\\more than 2MB.jpg");
	        StringSelection s = new StringSelection("D:\\more than 2MB.jpg");
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
	        r.keyRelease(KeyEvent.VK_ENTER);
	        */
	        Thread.sleep(5000);
	        String Actual_file_size_message=dr.findElement(file_size_message).getText();
	    	String Expexted_message="Upload the file of size below 2Mb.";
	    	Assert.assertEquals(Actual_file_size_message, Expexted_message);
	        
	    	
	    }
	    
	    
	    
	  //Check save & proceed button display on add partner page
	    @Test(priority = 36)
	    public void check_save_and_proceed_button_display() throws InterruptedException{
	    	dr.navigate().refresh();
	    	Thread.sleep(5000);
	    	//dr.findElement(Add_Partner_button).click();
	    	JavascriptExecutor jsss = (JavascriptExecutor) dr;
			jsss.executeScript("window.scrollBy(0,1000)");
	    		dr.findElement(Save_and_Proceed_button).isDisplayed();
	    		//JavascriptExecutor jsss = (JavascriptExecutor) dr;
				jsss.executeScript("window.scrollBy(0,-1000)");
	    }
	    
	    
	    
	  //Check Add partner functionality for valid input
	    @Test(priority = 37)
	    public void check_Add_partner_functionality_for_valid_input() throws InterruptedException, AWTException{
	    	Thread.sleep(7000);
	    	Select sel=new Select(dr.findElement(partner_type));
	    	sel.selectByVisibleText("Corporate Office");
	    	dr.findElement(partner_name).sendKeys("ICICI Bank");
	    	dr.findElement(contact_name).sendKeys("Anand");
	    	dr.findElement(contact_number).sendKeys("1111111112");
	    	
	    	dr.findElement(email).sendKeys("ab@ab.com");
	    	dr.findElement(GST_number).sendKeys("GSTN1201020291");
	    	dr.findElement(Registration_ID).sendKeys("121314");
	    	
	    	dr.findElement(Address).sendKeys("Flat No.11");
	    	Select sel1=new Select(dr.findElement(state));
	    	sel1.selectByVisibleText("Maharashtra");
	    	Thread.sleep(7000);
	    	Select sel2=new Select(dr.findElement(city));
	    	sel2.selectByVisibleText("Pune");
	    	dr.findElement(pincode).sendKeys("410512");
	    	
	    	JavascriptExecutor j = (JavascriptExecutor) dr;
			j.executeScript("window.scrollBy(0,1000)");
			
	    	dr.findElement(discount).sendKeys("11");
	    	Select sel3=new Select(dr.findElement(status));
	    	sel3.selectByVisibleText("Active");
	    	
	    	String imagePath = System.getProperty("user.dir") + "/Files/images.png";
	    	 dr.findElement(upload_file).sendKeys(imagePath);
	    	
	    	/*
	    	//upload partner logo file
	    	Actions act=new Actions(dr);
	    	act.moveToElement(dr.findElement(upload_file));
	    	act.click().build().perform();  	  	
	    	
	        Thread.sleep(5000);
	        StringSelection s = new StringSelection("D:\\images.png");
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
	        r.keyRelease(KeyEvent.VK_ENTER);
	        */
	        Thread.sleep(5000);
	        dr.findElement(Save_and_Proceed_button).click();
	        Thread.sleep(5000);
	        String Actual_page_header=dr.findElement(Partners_pege_header).getText();
	    	String Expexted_page_header="Partners List";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }  

}
