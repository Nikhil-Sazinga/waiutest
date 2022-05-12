package Testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Profile_Page_Locators;
import Utilities.Testbase2;

public class Profile_Page_Testcases extends Profile_Page_Locators{
	
	//Login
			@Test(priority = 0)
			public void Login() throws InterruptedException {
				dr.get(url);
				Thread.sleep(6000);
				dr.findElement(Username_field).sendKeys("bluefire");
				dr.findElement(Password_field).sendKeys("bluefire@123");
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
			public void Right_top_corner_profile_display() {
				dr.findElement(Right_top_corner_profile_name).isDisplayed();
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
				String Expected_Merchants_webpage_title="WAIU - Partners List (v-1.0.6)";
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
		    @Test(priority =10)
		    public void view_partner_icon_clickable() {
		    dr.findElement(View_partner).click();
		    }
		    
		    

}
