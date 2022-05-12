package Testcases2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Users_Page_Locators;

public class Users_Page_Testcases extends Users_Page_Locators{
	
	//login
		@Test(priority =0)
		public void login() throws InterruptedException {
			dr.get(url);
			Thread.sleep(5000);
			dr.findElement(By.xpath("//input[@id='userName']")).sendKeys("bluefire");
			  dr.findElement(By.id("password")).sendKeys("bluefire@123");
			  dr.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			  Thread.sleep(5000);
			  String actual=dr.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).getText();
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
		
		//Check Users menu display
		@Test(priority =2)
		public void Check_users_menu_display() {
			dr.findElement(Users_menu).isDisplayed();
		}
		
		//Check Users menu clickable
		@Test(priority=3)
		public void Check_users_menu_Clickable() throws InterruptedException {
			dr.findElement(Users_menu).click();
			Thread.sleep(5000);
			
		}
		
		
		//Check Check user webpage title
		@Test(priority =4)
		public void Check_user_webpage_title() {
			String Actual_User_webpage_title=dr.getTitle();
			System.out.println("Users web page title : "+Actual_User_webpage_title);
			String Expected_User_webpage_title="WAIU - Users (v-1.0.6)";
			Assert.assertEquals(Actual_User_webpage_title, Expected_User_webpage_title);		
		}
		
		
		//Check Check user page header
	    @Test(priority =5)
	    public void check_Users_page_header() {
	    	String Actual_page_header=dr.findElement(Users_pege_header).getText();
	    	String Expexted_page_header="Users";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }
	    
	    //Check Roles_field_label_text
	    @Test(priority =6)
	    public void Roles_field_label_text() {
	    	String Roles_field_label_actaul_text=dr.findElement(Roles_field_label_text).getText();
	    	String Expected_label="Roles";
	    	Assert.assertEquals(Roles_field_label_actaul_text, Expected_label);
	    }
	    
	    //Check_Roles_field_display
	    @Test(priority =7)
	    public void Check_Roles_field_display() {
	    	dr.findElement(Roles_field).isDisplayed();
	     }
	    
	    
	    //Check Search field Display
	    @Test(priority = 8)
	    public void Search_field_Display() {
	    	dr.findElement(Search_field).isDisplayed();
	    }
	    
	    //Check search field is editable
	    @Test(priority = 9)
	    public void  Search_field_editable() throws InterruptedException {
	    	Thread.sleep(7000);
	    	dr.findElement(Search_field).clear();
	    	Thread.sleep(7000);
	    	String input_for_searh_field="AAA";
	    	/*
	    	dr.findElement(Search_field).sendKeys(input_for_searh_field);
	    	Thread.sleep(10000);
	    	String Text_in_Searh_field=dr.findElement(Search_field).getAttribute("placeholder");
	    	System.out.println("Text in search field :"+Text_in_Searh_field);
	    	Assert.assertEquals(input_for_searh_field, Text_in_Searh_field);
	    	*/
	    }
	    
	    
	    
	    //Check Search field placeholder
	    @Test(priority = 10)
	    public void Search_field_Placeholder() throws InterruptedException {
	    	Thread.sleep(10000);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(7000);
	    	String Search_placeholder_Actual_text= dr.findElement(Search_field).getAttribute("placeholder");
	    	System.out.println("Search field placeholder :"+Search_placeholder_Actual_text);
	    	String Search_placeholder_Expected_text="Search Keyword";
	    	Assert.assertEquals(Search_placeholder_Actual_text, Search_placeholder_Expected_text);
	    }
	    
	   
	    
	    
	    //Check Clear functinality for roles field
	    @Test(priority = 11)
	    public void Clear_functinality_for_roles_field() throws InterruptedException {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Super Admin");
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();   //
	    	String expected_value_in_dropdown="Super Admin";
	    	System.out.println("Seleted option Text in Roles dropdown :"+Selected_Dropdown_text);
	    	//Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	    	System.out.println("Seleted option Text in Roles dropdown before use of clear functinality:"+Selected_Dropdown_text);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text_After_clear=sel.getFirstSelectedOption().getText();
	    	System.out.println("Text in Roles dropdown after use of clear functinality : "+Selected_Dropdown_text_After_clear);
	    	Assert.assertNotEquals(Selected_Dropdown_text, Selected_Dropdown_text_After_clear);
	    }
	    
	  //Check Clear functinality for Search field
	    @Test(priority = 12)
	    public void Clear_functinality_for_Search_field() throws InterruptedException {
	    	Thread.sleep(10000);
	    	dr.findElement(Search_field).sendKeys("admin");
	    	Thread.sleep(5000);
	    	String input_text_in_search_field="admin";
	    	String Get_text_from_Search_field=dr.findElement(Search_field).getText();
	    	System.out.println("Text in search field before use of clear : "+Get_text_from_Search_field);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(10000);
	    	String Get_text_from_Search_field_after_clear=dr.findElement(Search_field).getText();
	    	System.out.println("Text in search field after use of clear : "+Get_text_from_Search_field_after_clear);
	    	Assert.assertNotEquals(Get_text_from_Search_field, Get_text_from_Search_field_after_clear);
	    	
	    }
	    
	    //Clear_functinality_for_roles_and_Search_field
	    @Test(priority = 13)
	    public void Clear_functinality_for_roles_and_Search_field() throws InterruptedException {
	    	Thread.sleep(5000);
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Super Admin");
	    	dr.findElement(Search_field).sendKeys("admin");
	    	dr.findElement(Clear_button).click();
	    	
	    	String Selected_Dropdown_text_Roles_before_clear=sel.getFirstSelectedOption().getText();   //
	    	System.out.println("Seleted option Text in Roles dropdown before use of clear functinality:"+Selected_Dropdown_text_Roles_before_clear);
	    	String Get_text_from_Search_field_before_clear=dr.findElement(Search_field).getText();
	    	System.out.println("Text in search field before use of clear : "+Get_text_from_Search_field_before_clear);
	    	
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text_Roles_After_clear=sel.getFirstSelectedOption().getText();   //
	    	System.out.println("Seleted option Text in Roles dropdown before use of clear functinality:"+Selected_Dropdown_text_Roles_After_clear);
	    	String Get_text_from_Search_field_After_clear=dr.findElement(Search_field).getText();
	    	System.out.println("Text in search field before use of clear : "+Get_text_from_Search_field_After_clear);
	    	if(Selected_Dropdown_text_Roles_before_clear!=Selected_Dropdown_text_Roles_After_clear && Get_text_from_Search_field_before_clear!=Get_text_from_Search_field_After_clear)
	    	{
	    		System.out.println("Test Pass : both fields clear");
	    	}	
	    	else {System.out.println("Test Fail : both fields not clear");}
	    	
	    	
	    }
	    
	    
	    
	  //Check Roles_dropdown_clickable_and_select_value_from_dropdown
	    @Test(priority =14)
	    public void Check_Roles_dropdown_clickable_and_select_value_from_dropdown() {
	    	//dr.findElement(Roles_field).click();
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Select a Role");
	    	String default_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Select a Role";
	    	System.out.println("Default option Text displayed in Roles dropdown :"+default_Dropdown_text);
	    	Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	  //Check Select_SuperAdmin_Option_from_dropdown
	    @Test(priority =15)
	    public void Select_SuperAdmin_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Super Admin");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Super Admin";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	   	
	    }
	    
	  //Check Select_Admin_Option_from_dropdown
	    @Test(priority =16)
	    public void Select_Admin_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Admin");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Admin";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	  //Check Select_Back_Office_Option_from_dropdown
	    @Test(priority =17)
	    public void Select_Back_Office_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Back Office");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Back Office";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	  //Check Select_Support_Option_from_dropdown
	    @Test(priority =18)
	    public void Select_Support_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Support");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Support";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  
	    }
	    
	  //Check Select_Merchant_Option_from_dropdown
	    @Test(priority =19)
	    public void Select_Merchant_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Merchant");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Merchant";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	  //Check Select_Staff_Option_from_dropdown
	    @Test(priority =20)
	    public void Select_Staff_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Staff");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Staff";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	  //Check Select_Customer_Option_from_dropdown
	    @Test(priority =21)
	    public void Select_Customer_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Customer");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Customer";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	  //Check Select_Partner_Option_from_dropdown
	    @Test(priority =22)
	    public void Select_Partner_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Partner");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Partner";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	    @Test(priority = 23)
	    public void Check_records_displayed() throws InterruptedException {
	    	Thread.sleep(10000);
	    	
	    	if(dr.findElement(pagination_element).isDisplayed()) {
	    		
	    		if(dr.findElement(table_records_edit_icon).isDisplayed()) {
	    		System.out.println("Records are available for Super Admin role");
	    	      }
	    		else {
	    			String No_data_found_text=dr.findElement(No_Data_found_element).getText();
	    			System.out.println("Records are not available for Super Admin role : " +No_data_found_text);
	    		 }
	    		}
	        }
	    
	    //Check_Add Users button display
	    @Test(priority = 24)
	    public void Add_Users_button_display() {
	    	dr.findElement(Add_Users_button).isDisplayed();
	    }
	    
	  //Check_Add Users icon display
	    @Test(priority = 25)
	    public void Add_Users_icon_display() {
	    	dr.findElement(Add_Users_Icon).isDisplayed();
	    }
	    
	  //Check_Add Users button functinality
	    @Test(priority = 26)
	    public void Check_Add_Users_button_Functionality() throws InterruptedException {
	    	dr.findElement(Add_Users_button).click();
	    	Thread.sleep(5000);
	    	String Actual_user_profile_header=dr.findElement(User_profile_header).getText();
	    	String Expected_text="User Profile";
	    	Assert.assertEquals(Actual_user_profile_header, Expected_text);
	    	dr.findElement(Back_To_List).click();
	    }
	    
	    
	  //Check_Add Users icon functinality
	    @Test(priority = 27)
	    public void Check_Add_Users_icon_Functionality() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Users_Icon).click();
	    	Thread.sleep(5000);
	    	String Actual_user_profile_header=dr.findElement(User_profile_header).getText();
	    	String Expected_text="User Profile";
	    	Assert.assertEquals(Actual_user_profile_header, Expected_text);
	    	dr.findElement(Back_To_List).click();
	    }
	    
	    
	  //Check_back to list button display
	    @Test(priority = 28)
	    public void Back_to_list_button_display() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Users_Icon).click();
	    	Thread.sleep(5000);
	    	dr.findElement(Back_To_List).isDisplayed();
	    }
	    
	    
	  //Check back to list button functinality
	    @Test(priority = 29)
	    public void Back_to_list_button_clickable() throws InterruptedException {
	    	dr.findElement(Back_To_List).click();
	    	Thread.sleep(5000);
	    	String Users_page_header=dr.findElement(Users_pege_header).getText();
	    	String expected_text_of_User_page_header="Users";
	    	Assert.assertEquals(Users_page_header, expected_text_of_User_page_header);
	    	
	    }
	    
	    //Check edit User icon display
	    @Test(priority = 30)
	    public void edit_User_icon_display() {
	    	dr.findElement(Edit_user_icon).isDisplayed();
	    }
	    
	    //Check edit user icon functionality
	    @Test(priority = 31)
	    public void edit_user_icon_functionality() throws InterruptedException {
	     dr.findElement(Edit_user_icon).click();
	     Thread.sleep(5000);
	     String User_Profile_header_Text=dr.findElement(User_profile_header).getText();
	     String Expected_Text="User Profile";
	     Assert.assertEquals(User_Profile_header_Text, Expected_Text);
	    }
	    
	    
	    //Check Back to list button display on User profile page
	    @Test(priority =32)
	    public void Back_to_list_button_on_User_Profile_Page() {
	    	dr.findElement(Back_To_List).isDisplayed();
	    }
	    
	  //Check Back to list button functionality on User profile page
	    @Test(priority =33)
	    public void Check_Back_to_list_button_Functinality_on_User_Profile_Page() throws InterruptedException {
	    	dr.findElement(Back_To_List).click();
	    	Thread.sleep(5000);
	    	String Actual_Users_Page_Header=dr.findElement(Users_pege_header).getText();
	    	String Expected_Users_Page_Header="Users";
	    	Assert.assertEquals(Actual_Users_Page_Header, Expected_Users_Page_Header);
	    }
	    
	    
	    //Check Add user functionality on User Profile page
	    @Test(priority =34)
	    public void Add_new_user() throws InterruptedException {
	    	dr.get("https://portal-dev.waiu.co.in/admin/user");
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Users_button).click();
	    	Thread.sleep(5000);
	    	dr.findElement(User_Name).sendKeys("Ajay");
	    	dr.findElement(First_Name).sendKeys("Ajay");
	    	dr.findElement(Last_Name).sendKeys("Dighe");
	    	dr.findElement(Email).sendKeys("ae@ae.com");
	    	dr.findElement(Phone_Number).sendKeys("1111111115");
	    	Select Select_Role=new Select(dr.findElement(Role));
	    	Select_Role.selectByVisibleText("Back Office");
	    	Select Select_State=new Select(dr.findElement(State));
	    	Select_State.selectByVisibleText("Maharashtra");
	    	Select Select_City=new Select(dr.findElement(City));
	    	Thread.sleep(5000);
	    	Select_City.selectByVisibleText("Pune");
	    	dr.findElement(Zipcode).sendKeys("411005");
	    	dr.findElement(Date).sendKeys("02-02-2000");
	    	dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String User_page_header=dr.findElement(Users_pege_header).getText();
	    	String Expected_User_page_header="Users";
	    	Assert.assertEquals(User_page_header, Expected_User_page_header);
	    	
	    }
	    
	   
	    
	    
	    //Check edit user functionality
	    @Test(priority = 35)
	    public void Update_button_functionality_on_User_Profile_page() throws InterruptedException {
	    	Thread.sleep(10000);
	    	dr.findElement(Search_field).sendKeys("Ajay");
	    	Thread.sleep(10000);
	    	dr.findElement(Edit_user_icon).click();
	    	Thread.sleep(4000);
	    	Select Select_City=new Select(dr.findElement(City));
	    	Thread.sleep(7000);
	    	Select_City.selectByVisibleText("Ale");
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	        js.executeScript("window.scrollBy(0,1000)");
	    	
	    	dr.findElement(Update_user).click();
	    	Thread.sleep(7000);
	    	String User_page_header=dr.findElement(Users_pege_header).getText();
	    	String Expected_User_page_header="Users";
	    	Assert.assertEquals(User_page_header, Expected_User_page_header);
	     
	     
	    }
	    
	    
	    
	    @Test(priority=36)
	    public void Search_button_display() {
	    	dr.findElement(Search_button).isDisplayed();
	    }
	    
	    @Test(priority=37)
	    public void search_functionality() throws InterruptedException {
	    	String Actaual_take_text_for_search_from_table=dr.findElement(first_row_user_name).getText();
	    	dr.findElement(Search_field).sendKeys(Actaual_take_text_for_search_from_table);
	    	dr.findElement(Search_button).click();
	    	Thread.sleep(7000);
	    	String Expected_take_text_for_search_from_table=dr.findElement(first_row_user_name).getText();
	    Assert.assertEquals(Actaual_take_text_for_search_from_table, Expected_take_text_for_search_from_table);
	    	
	    	
	       }

}
