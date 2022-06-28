package Testcases2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Admin_push_notification_Locators;

public class Admin_push_notification_Testcases extends Admin_push_notification_Locators{
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
	
	//Check push notification menu display
	@Test(priority =2)
	public void Check_push_notification_menu_display() {
		dr.findElement(pushnotification_menu).isDisplayed();
	}
	
	//Check push notification menu clickable
	@Test(priority=3)
	public void Check_push_notification_menu_Clickable() throws InterruptedException {
		dr.findElement(pushnotification_menu).click();
		Thread.sleep(5000);
		
	}
	
	//Check  push notification  webpage title
	@Test(priority =4)
	public void Check_push_notification_webpage_title() {
		String Actual_push_notification_webpage_title=dr.getTitle();
		String Expected_push_notification_webpage_title="WAIU - Push Notification (v-1.0.5)";
		Assert.assertEquals(Actual_push_notification_webpage_title, Expected_push_notification_webpage_title);		
	}
	
	
	//Check push_notification page header
    @Test(priority =5)
    public void check_offers_page_header() {
    	String Actual_page_header=dr.findElement(pushnotification_page_header).getText();
    	String Expexted_page_header="Push Notification";
    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
    }
    
    
  //Check search field display
    @Test(priority =6)
    public void Check_search_field_display() {
    	dr.findElement(Search_field).isDisplayed();
     }
    
    
  //Check search field placeholder
    @Test(priority =7)
    public void Check_search_field_placeholder() {
    	dr.findElement(Search_field).isDisplayed();
    	String Actual_placeholder_for_search_field=dr.findElement(Search_field).getAttribute("placeholder");
    	String Expexted_placeholder_for_search_field="Search Keyword";
    	Assert.assertEquals(Actual_placeholder_for_search_field, Expexted_placeholder_for_search_field);
     }
    
		    
    //Check clear button display
    @Test(priority =8)
    public void Check_clear_button_display() {
    	dr.findElement(Clear_button).isDisplayed();
     }
    
    //Check clear_button_text
    @Test(priority =9)
    public void Check_clear_button_text() {
    	
    	String Actual_clear_button_text=dr.findElement(Clear_button).getText();
    	String Expexted_clear_button_text="Clear";
    	Assert.assertEquals(Actual_clear_button_text, Expexted_clear_button_text);
     }
    
 
    //Check search functionality
    @Test(priority =10)
    public void Check_search_functionality() throws InterruptedException {
    	String input_text_for_search_field=dr.findElement(second_data_from_table).getText();
    	dr.findElement(Search_field).sendKeys(input_text_for_search_field);
    	String text_in_table_after_search=dr.findElement(first_data_from_table).getText();
    	Assert.assertEquals(input_text_for_search_field, text_in_table_after_search);
    	
     } 
    
    
  //Check clear functionality
    @Test(priority =11)
    public void Check_clear_functionality() throws InterruptedException {
    	//clear field
    	dr.findElement(Clear_button).click();
    	Thread.sleep(5000);
    	String search_placeholder_text_before_clear=dr.findElement(Search_field).getAttribute("placeholder");
     	dr.findElement(Search_field).sendKeys("Amazon"); //send input in search field
     	dr.findElement(Clear_button).click();
     	Thread.sleep(3000);
     	String search_placeholder_text_after_clear=dr.findElement(Search_field).getAttribute("placeholder");
    	Assert.assertEquals(search_placeholder_text_before_clear, search_placeholder_text_after_clear);   	
     }
    /*
    //check delete offer icon display
    @Test(priority = 12)
    public void  check_delete_offer_icon_display() {
    	dr.findElement(Add_push_notification_icon).isDisplayed();
    }*/
    
    //check add_push_notification icon display
    @Test(priority = 13)
    public void  check_add_push_notification_icon_display() {
    	dr.findElement(Add_push_notification_icon).isDisplayed();
    }
    
  //check add_push_notification_icon clickable
    @Test(priority = 14)
    public void  check_add_push_notification_icon_clickable() throws InterruptedException {
    	Thread.sleep(5000);
    	dr.findElement(Add_push_notification_icon).click();
    	Thread.sleep(5000);
    	dr.findElement(Back_to_list).isDisplayed();
    	
    }
    
    
    
    //check add_push_notification button display
    @Test(priority = 15)
    public void  check_add_push_notification_button_display() throws InterruptedException {
    	dr.findElement(Back_to_list).click();
    	Thread.sleep(5000);
    	dr.findElement(Add_push_notification_button).isDisplayed();
    }
    
  //check add_push_notification_button clickable
    @Test(priority = 16)
    public void  check_add_push_notification_button_clickable() throws InterruptedException {
    	dr.findElement(Add_push_notification_button).click();
    	Thread.sleep(5000);
    	dr.findElement(Back_to_list).isDisplayed();
    	
    }
    
    //push notification form
  //check clear button display
    @Test(priority = 17)
    public void  check_clear_button_display() {
    	dr.findElement(Clear_button).isDisplayed();
    }
    
  //check clear_button functionality
    @Test(priority = 18)
    public void  check_clear_button_functionality() throws InterruptedException {
    	//clear field
     	String title_field_placeholder_text_before_clear=dr.findElement(title_field).getAttribute("placeholder");
     	dr.findElement(title_field).sendKeys("Amazon"); //send input in search field
     	dr.findElement(Clear_button).click();
     	Thread.sleep(3000);
     	String title_field_placeholder_text_after_clear=dr.findElement(title_field).getAttribute("placeholder");
    	Assert.assertEquals(title_field_placeholder_text_before_clear, title_field_placeholder_text_after_clear);   	
    }
  
  //check save button display
    @Test(priority = 19)
    public void  check_save_button_display() {
    	dr.findElement(save_button).isDisplayed();
    }
    
  //check add_push_notification functionality for only one mobile number
    @Test(priority = 20)
    public void  check_add_push_notification_functinality_for_only_one_mobile_number() throws InterruptedException, AWTException {
    	//clear field
     	dr.findElement(title_field).sendKeys("Maintenance"); 	
     	dr.findElement(description_field).sendKeys("Today our app Maintenance between 2pm-3pm"); 	
     	dr.findElement(Phone_No_dropdown_field).click();
     	Thread.sleep(5000);
     	dr.findElement(phone_no_input_field).sendKeys("8308524493");
     	dr.findElement(select_one_mobile_no).click();
     	dr.findElement(close_icon).click();
     	Select se=new Select(dr.findElement(select_mobile_screen));
     	se.selectByVisibleText("Home");
     	
     	String imagePath = System.getProperty("user.dir") + "/Files/Menu card.jpg";
   	    dr.findElement(upload_image).sendKeys(imagePath);  
     	
     	/*
     	//upload immage   	
    	Actions act=new Actions(dr);
    	act.moveToElement(dr.findElement(upload_image));
    	act.click().build().perform();  	  	
    	
        Thread.sleep(10000);
        StringSelection s = new StringSelection("D:\\Menu card");
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
         
        //dr.findElement(save_button).click();
    }
    
    
    
  //check add_push_notification functionality for all mobile number
    @Test(priority = 21)
    public void  check_add_push_notification_functinality_for_all_mobile_number() throws InterruptedException, AWTException {
    	//clear field
     	dr.findElement(title_field).sendKeys("Maintenance"); 	
     	dr.findElement(description_field).sendKeys("Today our app Maintenance between 2pm-3pm"); 	
     	dr.findElement(Phone_No_dropdown_field).click();
     	Thread.sleep(5000);
     	dr.findElement(phone_no_input_field).sendKeys("8308524493");
     	dr.findElement(select_all_mobile_no).click();
     	dr.findElement(close_icon).click();
     	Select se=new Select(dr.findElement(select_mobile_screen));
     	se.selectByVisibleText("Home");
     	
     	String imagePath = System.getProperty("user.dir") + "/Files/images.png";
   	    dr.findElement(upload_image).sendKeys(imagePath);
     	
     	/*
     	//upload immage   	
    	Actions act=new Actions(dr);
    	act.moveToElement(dr.findElement(upload_image));
    	act.click().build().perform();  	  	
    	
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
        r.keyRelease(KeyEvent.VK_ENTER);
         */
        //dr.findElement(save_button).click();
    }
   
  
}
