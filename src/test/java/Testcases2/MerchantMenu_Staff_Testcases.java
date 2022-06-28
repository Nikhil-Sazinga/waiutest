package Testcases2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.MerchantMenu_Staff_Locators;

public class MerchantMenu_Staff_Testcases extends MerchantMenu_Staff_Locators {
	
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
			
			
			//Check Merchant menu display
			@Test(priority =1)
			public void Check_Merchant_menu_display() {
				dr.findElement(Merchant_menu).isDisplayed();
			}
			
			//Check Merchant menu clickable
			@Test(priority =2)
			public void Check_Merchant_menu_clickable() throws InterruptedException {
				Thread.sleep(5000);
				dr.findElement(Merchant_menu).click();
				Thread.sleep(5000);
			}
			
			
			//Check Staff menu display
			@Test(priority =3)
			public void Check_Staff_menu_display() {
				dr.findElement(Staff_menu).isDisplayed();
			}
			
			
			//Check Staff menu clickable
			@Test(priority=4)
			public void Check_Staff_menu_Clickable() throws InterruptedException {
				dr.findElement(Staff_menu).click();
				Thread.sleep(5000);
				
			}
			
			
			
			//Check  Merchant-Staff webpage title
			@Test(priority =5)
			public void Check_Staff_webpage_title() {
				String Actual_Staff_webpage_title=dr.getTitle();
				String Expected_Staff_webpage_title="WAIU - Staff Members (v-1.0.5)";
				Assert.assertEquals(Actual_Staff_webpage_title, Expected_Staff_webpage_title);		
			}
			
			
			//Check Merchant-Staff page header
		    @Test(priority =6)
		    public void check_Merchant_Staff_page_header() {
		    	String Actual_page_header=dr.findElement(Staff_Page_Header).getText();
		    	String Expexted_page_header="Staff Members";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
		    }
		    
		  //Check Restaurant_List_field label text
		    @Test(priority =7)
		    public void Restaurant_List_field_label_txt() {
		    	String State_field_label_actaul_text=dr.findElement(Restaurant_List_Label).getText();
		    	String Expected_label="Restaurant List";
		    	Assert.assertEquals(State_field_label_actaul_text, Expected_label);
		    }
		    
		    //Check_Restaurant_List_field_display
		    @Test(priority =8)
		    public void Check_Restaurant_List_field_displayed() {
		    	dr.findElement(Restaurant_List_dropdown_field).isDisplayed();
		     }
		    
		    
		    
		  //Check Restaurant_List_field clickable & select option
			@Test(priority =9)
			public void Check_State_field_clickable_and_select_option() throws InterruptedException {
				Thread.sleep(5000);
				//dr.findElement(Restaurant_List_dropdown_field).click();
				dr.findElement(Restaurant_List_dropdown_arrow).click();
				Thread.sleep(5000);
				dr.findElement(dropdown_value).click();
				
			}
			
			//Edit_staff_icon display
			@Test(priority =10)
			public void Edit_staff_icon_display() throws InterruptedException {
				Thread.sleep(5000);
				dr.findElement(edit_staff).isDisplayed();
			}
			
			
			//Edit_staff icon clickable
			@Test(priority =11)
			public void Edit_staff_icon_clickable() throws InterruptedException {
				Thread.sleep(5000);
				dr.findElement(edit_staff).click();
				Thread.sleep(5000);
				String Actual_Update_staff_page_header_text=dr.findElement(Staff_Member_Details_header).getText();
				String Expected_Update_staff_page_header_text="Staff Member Details";
				Assert.assertEquals(Actual_Update_staff_page_header_text, Expected_Update_staff_page_header_text);
				
			}
			
			//Update staff webpage tile 
			@Test(priority = 12)
			public void Update_staff_webpage_tile() {
				String actual_webtiltle=dr.findElement(Staff_Member_Details_header).getText();
				String Expected_webtiltle="Staff Member Details";
				Assert.assertEquals(actual_webtiltle, Expected_webtiltle);
				
			}
			
			//back to list button display
			@Test(priority =13)
			public void back_to_list_button_display() {
				dr.findElement(back_to_list_button).isDisplayed();
				
			}
			
			

			//Update button display
			@Test(priority =14)
			public void Update_button_display() throws InterruptedException {
				JavascriptExecutor jss = (JavascriptExecutor) dr;
				Thread.sleep(5000);
		        jss.executeScript("window.scrollBy(0,1000)");
				dr.findElement(Update_button).isDisplayed();
				jss.executeScript("window.scrollBy(0,-1000)");
				Thread.sleep(5000);
				dr.findElement(back_to_list_button).click();
				
			}
		
			//(Update staff)Edit_staff functionality
			@Test(priority =15)
			public void Edit_staff_functinality() throws InterruptedException {
				Thread.sleep(5000);
				dr.findElement(Restaurant_List_dropdown_arrow).click();
				Thread.sleep(5000);
				dr.findElement(dropdown_value).click();
				Thread.sleep(5000);
				dr.findElement(edit_staff).click();
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) dr;
		        js.executeScript("window.scrollBy(0,1000)");
				dr.findElement(Update_button).click();
				Thread.sleep(5000);
				String Actual_page_header=dr.findElement(Staff_Page_Header).getText();
		    	String Expexted_page_header="Staff Members";
		    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
				
			}
	
			
}
