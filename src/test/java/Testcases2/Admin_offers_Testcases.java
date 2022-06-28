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

import TestXpath.Admin_Offers_Locators;

public class Admin_offers_Testcases extends Admin_Offers_Locators{

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
		
		//Check offers  menu display
		@Test(priority =2)
		public void Check_offers_menu_display() {
			dr.findElement(Offers_menu).isDisplayed();
		}
		
		//Check offers menu clickable
		@Test(priority=3)
		public void Check_offers_menu_Clickable() throws InterruptedException {
			dr.findElement(Offers_menu).click();
			Thread.sleep(5000);
			
		}
		
		//Check  offers  webpage title
		@Test(priority =4)
		public void Check_offers_webpage_title() {
			String Actual_offers_webpage_title=dr.getTitle();
			String Expected_offers_webpage_title="WAIU - Offers (v-1.0.5)";
			Assert.assertEquals(Actual_offers_webpage_title, Expected_offers_webpage_title);		
		}
		
		
		//Check offers page header
	    @Test(priority =5)
	    public void check_offers_page_header() {
	    	String Actual_page_header=dr.findElement(Offers_page_header).getText();
	    	String Expexted_page_header="Offers";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }
	    
	  //Check search field display
	    @Test(priority =6)
	    public void Check_search_field_button_display() {
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
	    
	  //Check search functinality
	    @Test(priority =8)
	    public void Check_search_functionality() throws InterruptedException {
	      	String input_fot_search_field_from_table=dr.findElement(record_from_table).getText();
	      	dr.findElement(Search_field).sendKeys(input_fot_search_field_from_table);
	      	Thread.sleep(4000);
	    	String After_search_record_from_table=dr.findElement(record_from_table).getText();
	    	Assert.assertEquals(input_fot_search_field_from_table, After_search_record_from_table);
	     }
	    
	  //Check search functinality for data not exist
	    @Test(priority =9)
	    public void Check_search_functionality_record_does_not_exist() throws InterruptedException {
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(4000);
	      	dr.findElement(Search_field).sendKeys("wrwr");
	      	Thread.sleep(4000);
	    	String no_data_found_message=dr.findElement(no_data_found_element).getText();
	    	Assert.assertEquals(no_data_found_message, "No data found.");
	    	dr.findElement(Clear_button).click();
	     }
	    
	  //Check clear button visibility
	    @Test(priority =10)
	    public void Check_clear_button_visibility() {
	    	dr.findElement(Clear_button).isDisplayed();
	     }
	    
	  //Check clear button text
	    @Test(priority =11)
	    public void Check_clear_button_text() {	    	
	    	String Actual_text_for_clear_button=dr.findElement(Clear_button).getText();
	    	String Expexted_text_for_clear_button="Clear";
	    	Assert.assertEquals(Actual_text_for_clear_button, Expexted_text_for_clear_button);
	     }
	    
	  //Check clear button functinality
	    @Test(priority =12)
	    public void Check_clear_button_functinality() {	
	    	dr.findElement(Search_field).sendKeys("offer");
	    	dr.findElement(Clear_button).click();
	    	String Actual_text_in_search_field=dr.findElement(Search_field).getAttribute("placeholder");
	    	String Expexted_text_in_search_field="Search Keyword";
	    	Assert.assertEquals(Actual_text_in_search_field, Expexted_text_in_search_field);
	     }
	    
	    
	    //Check Add offer button display
	    @Test(priority =13)
	    public void Check_Add_offer_button_display() {
	    	dr.findElement(Add_Offer_button).isDisplayed();
	     }
	    
	    //Check Add offer icon display
	    @Test(priority =14)
	    public void Check_Add_offer_icon_display() {
	    	dr.findElement(Add_Offer_icon).isDisplayed();
	     }
	    
	    //Check Text of Add offer button
	    @Test(priority =15)
	    public void text_of_Add_offer_button() {
	    
		String Actual_text_add_offer_button=dr.findElement(Add_Offer_button).getText();
		String expected_text_add_offer_button="Add Offer";
		Assert.assertEquals(Actual_text_add_offer_button,expected_text_add_offer_button);
	    }
	    
	  	
	    
	  //Check add offer icon clickable 
	    @Test(priority = 16)
	    public void check_add_offer_icon_clickable() throws InterruptedException{
	    	dr.findElement(Add_Offer_icon).click();
	    	Thread.sleep(7000);
	    	
	    	String Actual_page_header=dr.findElement(Add_offer_pagge_header).getText();
	    	String Expexted_page_header="Add Offer";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    	dr.findElement(Back_to_list).click();
	    }
	    
	    //check_view_offer_icon_display
	    @Test(priority = 17)
	    public void check_view_offer_icon_display() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(view_offer_icon).isDisplayed();
	    	
	    }
	    
	    
	  //check_view_offer_icon_clickable
	    @Test(priority = 18)
	    public void check_view_offer_icon_clickable() {
	    	dr.findElement(view_offer_icon).click();
	    	String Actual_add_page_header=dr.findElement(view_offer_page_header).getText();
	    	String Expexted_page_header="View Offer";
	    	Assert.assertEquals(Actual_add_page_header, Expexted_page_header);
	    	dr.findElement(Back_to_list).click();
	    	
	    }
	    
	    
	   	//Add offer page
	    //Check add offer button clickable 
	    @Test(priority = 19)
	    public void check_add_offer_button_clickable() throws InterruptedException{
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Offer_button).click();
	    	Thread.sleep(7000);	    	
	    	String Actual_add_page_header=dr.findElement(Add_offer_pagge_header).getText();
	    	String Expexted_page_header="Add Offer";
	    	Assert.assertEquals(Actual_add_page_header, Expexted_page_header);
	    	
	    }
	    
	    
	    //Add offer page
	  //Check  Add offers  webpage title
	  		@Test(priority =20)
	  		public void Check_Add_offers_webpage_title() {
	  			String Actual_offers_webpage_title=dr.getTitle();
	  			String Expected_offers_webpage_title="WAIU - Add Offer (v-1.0.5)";
	  			Assert.assertEquals(Actual_offers_webpage_title, Expected_offers_webpage_title);		
	  		}
	  		
  		    
	    
	  //Check clear button display
	    @Test(priority = 21)
	    public void check_clear_button_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
			js.executeScript("window.scrollBy(0,1000)");
	    	dr.findElement(clear_button).isDisplayed();
	    }
	    
	  //Check save button display
	    @Test(priority = 22)
	    public void check_save_button_display() throws InterruptedException{
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
			js.executeScript("window.scrollBy(0,1000)");
	    	dr.findElement(Save_button).isDisplayed();
	    }
	    
	  //Check clear button clickable 
	    @Test(priority = 23)
	    public void check_clear_button_clickable() throws InterruptedException{
	    	
	    	dr.findElement(clear_button).click();
	    	Thread.sleep(7000);
	    	String Actual_text=dr.findElement(offer_Name).getAttribute("placeholder");
		    String Expected_text="Offer Name";
		    Assert.assertEquals(Actual_text, Expected_text);	    	
	    }
	    
	    //Check mandatory field contain field required message
	    @Test(priority = 24)
	    public void Check_mandatory_field_contain_field_required_message() throws InterruptedException {
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
			//js.executeScript("window.scrollBy(0,)");
	    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(5000);
	    	dr.findElement(Save_button).click();
	    	String Actual_offer_required_msg=dr.findElement(Offer_Code_mandatory_element).getText();
	    	Assert.assertEquals(Actual_offer_required_msg, "Offer Code is required.");
	    	String Actual_ProductName_required_msg=dr.findElement(Product_Name_mandatory_element).getText();
	    	Assert.assertEquals(Actual_ProductName_required_msg, "Product Name is required.");
	    	String Actual_url_required_msg=dr.findElement(url_mandatory_element).getText();
	    	Assert.assertEquals(Actual_url_required_msg, "URL is required.");
	    	String Actual_background_required_msg=dr.findElement(background_color_mandatory_element).getText();
	    	Assert.assertEquals(Actual_background_required_msg, "Background Color is required.");
         	String Actual_button_text_mandatry_msg=dr.findElement(button_text_mandatory_element).getText();
	    	Assert.assertEquals(Actual_button_text_mandatry_msg, "Button is required.");	    	
	    	String Actual_totalquantity_required_msg=dr.findElement(Total_Quantity_mandatory_element).getText();
	    	Assert.assertEquals(Actual_totalquantity_required_msg, "Total Quantity is required.");       	
	    	String Actual_image_required_msg=dr.findElement(offer_image_mandatory_element).getText();
	    	Assert.assertEquals(Actual_image_required_msg, "Offer image is required.");
	    	js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	    	dr.findElement(Back_to_list).click();
	    }
	    
	    
	    //Check add offer functionality
	    @Test(priority = 25)
	    public void check_Add_offer_functinality() throws InterruptedException, AWTException{
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Offer_button).click();
	    	Thread.sleep(5000);
	    		dr.findElement(offer_Name).sendKeys("Diwali sale");
	    		dr.findElement(offer_code).sendKeys("1234");
	    		dr.findElement(productName).sendKeys("Mobiles");
	    		dr.findElement(offer_description).sendKeys("Buy & Save upto 50%.");
	    		
	    		dr.findElement(start_date).sendKeys("02/10/2022");
	    		dr.findElement(end_date).sendKeys("11/10/2022");
	    		dr.findElement(redirect_url).sendKeys("www.googl.com");
	    		JavascriptExecutor js = (JavascriptExecutor) dr;
				//js.executeScript("window.scrollBy(0,)");
		    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    		
	    		//JavascriptExecutor jss = (JavascriptExecutor) dr;
				//jss.executeScript("window.scrollBy(0,1000)");
	    		
	    		dr.findElement(perUserLimit).sendKeys("2");
	    		dr.findElement(totalQuantity).sendKeys("50");
	    		Select sel=new Select(dr.findElement(selectmobilescreen));
	    		sel.selectByVisibleText("Home");
	    		
	    		dr.findElement(button_text).sendKeys("Good offer");
	    		
	    		String imagePath = System.getProperty("user.dir") + "/Files/Menu card.jpg";
	        	dr.findElement(offer_image).sendKeys(imagePath);
	    		
	    		/*
	    		//upload image
	    		//upload logo file
	        	Actions act=new Actions(dr);
	        	act.moveToElement(dr.findElement(offer_image));
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
	    		
	            //dr.findElement(Save_button).click();
	            Thread.sleep(5000);
	            JavascriptExecutor j1 = (JavascriptExecutor) dr;
				j1.executeScript("window.scrollBy(0,1000)");
				
				//click on save button
				//dr.findElement(Save_button).click();
	    }
	    
	    
	    	
}
