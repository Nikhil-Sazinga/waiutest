package Testcases2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Admin_Feedback_Locators;

public class Admin_feedback_Testcases extends Admin_Feedback_Locators{
	
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
			
			//Check feedback  menu display
			@Test(priority =2)
			public void Check_feedback_menu_display() {
				dr.findElement(Feedback_menu).isDisplayed();
			}
			
			//Check feedback menu clickable
			@Test(priority=3)
			public void Check_feedback_menu_Clickable() throws InterruptedException {
				dr.findElement(Feedback_menu).click();
				Thread.sleep(5000);
				
			}
			
			//Check  feedback  webpage title
			@Test(priority =4)
			public void Check_feedback_webpage_title() {
				String Actual_feedback_webpage_title=dr.getTitle();
				String Expected_feedback_webpage_title="WAIU - Feedback (v-1.0.5)";
				Assert.assertEquals(Actual_feedback_webpage_title, Expected_feedback_webpage_title);		
			}
			
			
			//Check feedback page header
		    @Test(priority =5)
		    public void check_feedback_page_header() {
		    	String Actual_page_header=dr.findElement(Feedback_page_header).getText();
		    	String Expexted_page_header="Feedback";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
		    }
		    
		  //Check default option for select_status field 
		    @Test(priority =6)
		    public void Check_default_option_for_select_status_field () throws InterruptedException {
		    	Select sel=new Select(dr.findElement(select_status));
		    	sel.selectByVisibleText("Select Status");
		    	Thread.sleep(5000);
		    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();  
		    	String expected_value_in_dropdown="Select Status";		    	
		    	Assert.assertEquals(Selected_Dropdown_text, expected_value_in_dropdown);
		     }
		    
		  //Check Read option for select_status field 
		    @Test(priority =7)
		    public void Check_read_option_for_select_status_field () throws InterruptedException {
		    	Select sel=new Select(dr.findElement(select_status));
		    	sel.selectByVisibleText("Read");
		    	Thread.sleep(5000);
		    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();  
		    	String expected_value_in_dropdown="Read";		    	
		    	Assert.assertEquals(Selected_Dropdown_text, expected_value_in_dropdown);
		     }
		    
		    //Check UnRead option for select_status field 
		    @Test(priority =8)
		    public void Check_UnRead_option_for_select_status_field () throws InterruptedException {
		    	Select sel=new Select(dr.findElement(select_status));
		    	sel.selectByVisibleText("Un-Read");
		    	Thread.sleep(5000);
		    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();  
		    	String expected_value_in_dropdown="Un-Read";		    	
		    	Assert.assertEquals(Selected_Dropdown_text, expected_value_in_dropdown);
		     }
		    
		  //Check search field display
		    @Test(priority =9)
		    public void Check_search_field_button_display() {
		    	dr.findElement(Search_field).isDisplayed();
		     }
		    
		    
		  //Check search field placeholder
		    @Test(priority =10)
		    public void Check_search_field_placeholder() {
		    	dr.findElement(Search_field).isDisplayed();
		    	String Actual_placeholder_for_search_field=dr.findElement(Search_field).getAttribute("placeholder");
		    	String Expexted_placeholder_for_search_field="Search by Keyword";
		    	Assert.assertEquals(Actual_placeholder_for_search_field, Expexted_placeholder_for_search_field);
		     }
		    
	  		    
		    //Check search button display
		    @Test(priority =11)
		    public void Check_search_button_display() {
		    	dr.findElement(Search_button).isDisplayed();
		     }
		    
		    //Check searcch_button_text
		    @Test(priority =12)
		    public void Check_search_button_text() {
		    	
		    	String Actual_search_button_text=dr.findElement(Search_button).getText();
		    	String Expexted_search_button_text="Search";
		    	Assert.assertEquals(Actual_search_button_text, Expexted_search_button_text);
		     }
		    
		    //Check clear button display
		    @Test(priority =13)
		    public void clear_button_display() {		    
			dr.findElement(Clear_button).isDisplayed();
		    }
		    
		  	
		  //Check clear_button_text
		    @Test(priority =14)
		    public void Check_clear_button_text() {
		    	
		    	String Actual_search_button_text=dr.findElement(Clear_button).getText();
		    	String Expexted_search_button_text="Clear";
		    	Assert.assertEquals(Actual_search_button_text, Expexted_search_button_text);
		     }
		    
		  
		    //Check search functionality
		    @Test(priority =15)
		    public void Check_search_functionality() throws InterruptedException {
		    	Thread.sleep(5000);
		    	String Actual_text=dr.findElement(username_from_table).getText();
		    	dr.findElement(Search_field).sendKeys(Actual_text);
		    	dr.findElement(Search_button).click();
		    	Thread.sleep(5000);
		    	String expected_text=dr.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		    	Assert.assertEquals(Actual_text, expected_text);
		    	
		     } 
		    
		    //clear functionality for select status field
		    @Test(priority = 16)
		    public void clear_functionality_for_select_status_field() throws InterruptedException {
		    	dr.findElement(Clear_button).click();
		    	Thread.sleep(5000);
		    	Select se=new Select(dr.findElement(select_status));
		    	se.selectByVisibleText("Read");
		    	//String Selected_Dropdown_text_before_clear=se.getFirstSelectedOption().getText(); 
		    	dr.findElement(Clear_button).click();;
		    	Thread.sleep(3000);
		    	String default_text=se.getFirstSelectedOption().getText();
		    	//String Selected_Dropdown_text_after_clear=se.getFirstSelectedOption().getText();	    	
		    	Assert.assertEquals(default_text, "Select Status");	    	
		    }
		    
		  //clear functionality for search field
		    @Test(priority = 17)
		    public void clear_functionality_for_search_field() throws InterruptedException {
		    	
		    	String input_for_search="AAA";
		    	dr.findElement(Search_field).sendKeys(input_for_search);	
		    	dr.findElement(Clear_button).click();
		    	Thread.sleep(3000);
		    	String search_field_text_after_clear=dr.findElement(Search_field).getAttribute("placeholder");	    	
		    	Assert.assertEquals(search_field_text_after_clear, "Search by Keyword");	
		    	
		    }
		 
		    
		    //clear functionality for select status & search field
		    @Test(priority = 18)
		    public void clear_functionality_for_select_status_and_search_field() throws InterruptedException {
		    	
		    	Select se=new Select(dr.findElement(select_status));
		    	se.selectByVisibleText("Read");
		    	String Selected_Dropdown_text_before_clear_for_status_field=se.getFirstSelectedOption().getText(); 
		    	String input_for_search="AAA";
		    	dr.findElement(Search_field).sendKeys(input_for_search);	
		    	dr.findElement(Clear_button).click();
		    	Thread.sleep(3000);
		    	String Selected_Dropdown_text_after_clear_for_status_field=se.getFirstSelectedOption().getText(); 
		    	String search_field_text_after_clear=dr.findElement(Search_field).getAttribute("placeholder");
		    	Assert.assertEquals(Selected_Dropdown_text_after_clear_for_status_field, "Select Status");
		    	Assert.assertEquals(search_field_text_after_clear, "Search by Keyword");
			    
		    }
		    
		    //Check reply icon display
		    @Test(priority =19)
		    public void Check_reply_icon_display() {
		    	dr.findElement(reply_icon).isDisplayed();
		     }
		    
		  //Check reply icon clickable
		    @Test(priority =20)
		    public void Check_reply_icon_clickable() throws InterruptedException {
		    	dr.findElement(reply_icon).click();
		    	Thread.sleep(5000);
		    	dr.findElement(Back_to_list).isDisplayed();
		     }
		    
		    //Check clear button display
		    @Test(priority =21)
		    public void Check_clear_button_display() {
		    	dr.findElement(clear_button).isDisplayed();
		     }
		    
		  //Check clear button functionality
		    @Test(priority =22)
		    public void Check_clear_button_functionality() throws InterruptedException {
		    	String placeholder_before_clear=dr.findElement(replyDescription).getText();
		    	dr.findElement(replyDescription).sendKeys("Thanks for your feedback.");
		    	dr.findElement(clear_button).click();
		    	Thread.sleep(5000);
		    	String placeholder_after_clear=dr.findElement(replyDescription).getText();
		    	Assert.assertEquals(placeholder_before_clear, placeholder_after_clear);
		    	   }
		    /*
		     
		  //Check reply button functionality
		    @Test(priority =23)
		    public void Check_reply_button_functionality() throws InterruptedException {
		    	dr.findElement(replyDescription).sendKeys("Thanks for your feedback.");
		    	dr.findElement(sendreply_button).click();
		    	Thread.sleep(5000);
		    	
		    	   }
		    */
		    

}
