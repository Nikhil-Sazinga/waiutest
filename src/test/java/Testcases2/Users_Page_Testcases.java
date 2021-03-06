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
			dr.findElement(By.xpath("//input[@id='userName']")).sendKeys("Ramesh");
			  dr.findElement(By.id("password")).sendKeys("12345678");
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
			String Expected_User_webpage_title="WAIU - Users (v-1.0.18)";
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
	    
	    
	  //Check_select_column_name_field_visibility
	    @Test(priority =8)
	    public void Check_select_column_name_field_visibility() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(select_columnname_field).isDisplayed();
	     }
	    
	    
	  //Check placeholder text of select_column_name_field
	    @Test(priority =9)
	    public void placeholder_text_of_select_column_name_field() throws InterruptedException {
	    Thread.sleep(5000);	
	    Select sel=new Select(dr.findElement(select_columnname_field));
	    String Actual_text_in_select_columnname_field=sel.getFirstSelectedOption().getText();
	    //System.out.println("Placeholder of Search columnname field :"+Actual_text_in_search_columnname_field+":");
		String expected_text_in_select_columnname_field="Select Column Name";
		//System.out.println("Default Text displayed in Search :"+Actual_text_in_search_columnname_field);
		Assert.assertEquals(Actual_text_in_select_columnname_field,expected_text_in_select_columnname_field);
	    }
	    
	  //Check search functionality for User Name option
	    @Test(priority =10)
	    public void Check_search_functionality_for_User_Name_option() throws InterruptedException {
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(select_columnname_field));
	    sel.selectByVisibleText("User Name");
	    Thread.sleep(5000);
	    String input_in_search=dr.findElement(user_name_search_input_from_table).getText();
	    System.out.println("user name from table : "+input_in_search);
	    dr.findElement(Search_field).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(user_name_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    
	  //Check search functionality for First_Name option
	    @Test(priority =11)
	    public void Check_search_functionality_for_firstName_option() throws InterruptedException {
	    dr.findElement(Clear_button).click();
	    Thread.sleep(5000);	
	    Select sel1=new Select(dr.findElement(select_columnname_field));
	    sel1.selectByVisibleText("Select Column Name");
	    Select sel=new Select(dr.findElement(select_columnname_field));
	    sel.selectByVisibleText("First Name");
	    Thread.sleep(5000);
	    String input_in_search=dr.findElement(first_name_search_input_from_table).getText();
	    dr.findElement(Search_field).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(first_name_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    
	  //Check search functionality for Last Name option
	    @Test(priority =12)
	    public void Check_search_functionality_for_Last_Name_option() throws InterruptedException {
	    dr.findElement(Clear_button).click();
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(select_columnname_field));
	    sel.selectByVisibleText("Last Name");
	    Thread.sleep(5000);
	    String input_in_search=dr.findElement(last_name_search_input_from_table).getText();
	    dr.findElement(Search_field).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(last_name_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	  //Check search functionality for Mobile No. option
	    @Test(priority =13)
	    public void Check_search_functionality_for_Mobile_No_option() throws InterruptedException {
	    dr.findElement(Clear_button).click();
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(select_columnname_field));
	    sel.selectByVisibleText("Mobile No.");
	    Thread.sleep(5000);
	    String input_in_search=dr.findElement(mobile_no_search_input_from_table).getText();
	    dr.findElement(Search_field).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(mobile_no_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    
	  //Check search functionality for email option
	    @Test(priority =14)
	    public void Check_search_functionality_for_email_option() throws InterruptedException {
	    dr.findElement(Clear_button).click();
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(select_columnname_field));
	    sel.selectByVisibleText("Email");
	    Thread.sleep(5000);
	    String input_in_search=dr.findElement(email_search_input_from_table).getText();
	    dr.findElement(Search_field).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(email_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	      
	    
	    //Check Search field Display
	    @Test(priority = 15)
	    public void Search_field_Display() throws InterruptedException {
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(5000);
	    	dr.findElement(Search_field).isDisplayed();
	    }
	    
	    
	  //Check Search field placeholder
	    @Test(priority = 16)
	    public void Search_field_Placeholder() throws InterruptedException {
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(7000);
	    	String Search_placeholder_Actual_text= dr.findElement(Search_field).getAttribute("placeholder");
	    	//System.out.println("Search field placeholder :"+Search_placeholder_Actual_text);
	    	String Search_placeholder_Expected_text="Search Keyword";
	    	Assert.assertEquals(Search_placeholder_Actual_text, Search_placeholder_Expected_text);
	    }
	    
	    //Check search field is editable
	    @Test(priority = 17)
	    public void  Search_field_editable() throws InterruptedException {
	    	Thread.sleep(5000);	    	
	    	String input_for_searh_field="AAA";
	    	dr.findElement(Search_field).sendKeys(input_for_searh_field);
	    	Thread.sleep(5000);
	    	String Text_in_Searh_field=dr.findElement(Search_field).getAttribute("value");
	    	System.out.println("Text in search field :"+Text_in_Searh_field);
	    	Assert.assertEquals(input_for_searh_field, Text_in_Searh_field);
	    }
	    
	    //check search functinality for record which does not exist
	    @Test(priority = 18)
	    public void  Search_functinality_record_which_does_not_exist() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(5000);
	    	String input_for_searh_field="ZYX";
	    	dr.findElement(Search_field).sendKeys(input_for_searh_field);
	    	dr.findElement(Search_button).click();
	    	Thread.sleep(5000);
	    	String actual_message=dr.findElement(no_data_found_mesg_element).getText();
	    	String expected_message="No data found.";
	    	//System.out.println("Text in search field :"+Text_in_Searh_field);
	    	Assert.assertEquals(actual_message, expected_message);
	    }
	    
	    
	    //Search button display
	    @Test(priority=19)
	    public void check_search_button_visibility() {
	    	dr.findElement(Search_button).isDisplayed();
	    }
 
	    //Check Clear functinality for roles field
	    @Test(priority = 20)
	    public void Clear_functinality_for_roles_field() throws InterruptedException {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Admin");
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();   //
	    	String expected_value_in_dropdown="Admin";
	    	System.out.println("Seleted option Text in Roles dropdown :"+Selected_Dropdown_text);
	    	//Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	    	System.out.println("Seleted option Text in Roles dropdown before use of clear functinality:"+Selected_Dropdown_text);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text_After_clear=sel.getFirstSelectedOption().getText();
	    	System.out.println("Text in Roles dropdown after use of clear functinality : "+Selected_Dropdown_text_After_clear);
	    	Assert.assertNotEquals(Selected_Dropdown_text, Selected_Dropdown_text_After_clear);
	    }
	    
	  //Check Clear functionality for Search field
	    @Test(priority = 21)
	    public void Clear_functinality_for_Search_field() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Search_field).sendKeys("admin");
	    	Thread.sleep(5000);
	    	String input_text_in_search_field="admin";
	    	String Get_text_from_Search_field=dr.findElement(Search_field).getAttribute("value");
	    	//System.out.println("Text in search field before use of clear : "+Get_text_from_Search_field);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(10000);
	    	String Get_text_from_Search_field_after_clear=dr.findElement(Search_field).getAttribute("placeholder");
	    	//System.out.println("Text in search field after use of clear : "+Get_text_from_Search_field_after_clear);
	    	Assert.assertNotEquals(Get_text_from_Search_field, Get_text_from_Search_field_after_clear);
	    	
	    }
	    
	    //Clear_functinality_for_roles_and_Search_field
	    @Test(priority = 22)
	    public void Clear_functinality_for_roles_and_Search_field() throws InterruptedException {
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(5000);
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Admin");
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
	    	String Get_text_from_Search_field_After_clear=dr.findElement(Search_field).getAttribute("placeholder");
	    	System.out.println("Text in search field before use of clear : "+Get_text_from_Search_field_After_clear);
	    	if(Selected_Dropdown_text_Roles_before_clear!=Selected_Dropdown_text_Roles_After_clear && Get_text_from_Search_field_before_clear!=Get_text_from_Search_field_After_clear)
	    	{
	    		System.out.println("Test Pass : both fields clear");
	    	}	
	    	else {System.out.println("Test Fail : both fields not clear");}
	    	
	    	
	    }
	    
	    
	    
	  //Check Roles_dropdown_clickable_and_select_value_from_dropdown
	    @Test(priority =21)
	    public void Check_Roles_dropdown_clickable_and_select_value_from_dropdown() {
	    	//dr.findElement(Roles_field).click();
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Select Role");
	    	String default_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Select Role";
	    	System.out.println("Default option Text displayed in Roles dropdown :"+default_Dropdown_text);
	    	Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    /*
	  //Check Select_SuperAdmin_Option_from_dropdown
	    @Test(priority =22)
	    public void Select_SuperAdmin_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Super Admin");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Super Admin";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);	   	
	    }*/
	    
	    /*
	  //Check filter for SuperAdmin Option
	    @Test(priority =23)
	    public void Check_filter_for_SuperAdmin_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Super Admin");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_text_in_role_column=dr.findElement(role_column_result).getText();
	    	//System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_text_in_role_column);   	
	    }*/
	    
	  //Check Select_Admin_Option_from_dropdown
	    @Test(priority =24)
	    public void Select_Admin_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Admin");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Admin";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);	  	
	    }
	    
	    
	  //Check filter for Admin Option
	    @Test(priority =25)
	    public void Check_filter_for_Admin_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Admin");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_text_in_role_column=dr.findElement(role_column_result).getText();
	    	//System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_text_in_role_column);   	
	    }
	    
	    
	  //Check Select_Back_Office_Option_from_dropdown
	    @Test(priority =26)
	    public void Select_Back_Office_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Back Office");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Back Office";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	    /*
	  //Check filter for back office Option
	    @Test(priority =27)
	    public void Check_filter_for_backoffice_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Back Office");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_text_in_role_column=dr.findElement(role_column_result).getText();
	    	//System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_text_in_role_column);   	
	    }*/
	    
	  //Check Select_Support_Option_from_dropdown
	    @Test(priority =28)
	    public void Select_Support_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Support");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Support";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  
	    }
	    
	  //Check filter for support Option
	    @Test(priority =29)
	    public void Check_filter_for_support_Option() throws InterruptedException {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Support");
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_text_in_role_column=dr.findElement(role_column_result).getText();
	    	//System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_text_in_role_column);   	
	    }
	    
	    
	  //Check Select_Staff_Option_from_dropdown
	    @Test(priority =30)
	    public void Select_staff_Option() throws InterruptedException {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Staff");
	    	Thread.sleep(5000);
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Staff";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	    
	  //Check filter for Staff Option
	    @Test(priority =31)
	    public void Check_filter_for_staff_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Staff");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_text_in_role_column=dr.findElement(role_column_result).getText();
	    	//System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_text_in_role_column);   	
	    }
	    
	 
	    
	  //Check Select_Customer_Option_from_dropdown
	    @Test(priority =32)
	    public void Select_Customer_Option() {
	    	Select sel=new Select(dr.findElement(Roles_field));
	    	sel.selectByVisibleText("Customer");
	    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
	    	String expected_value_in_dropdown="Customer";
	    	System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
	    	Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	  	
	    }
	    
	    
		  //Check filter for Customer Option
		    @Test(priority =33)
		    public void Check_filter_for_Customer_Option() throws InterruptedException {
		    	Select sel=new Select(dr.findElement(Roles_field));
		    	sel.selectByVisibleText("Customer");
		    	Thread.sleep(5000);
		    	String Selected_Dropdown_text=sel.getFirstSelectedOption().getText();
		    	String expected_text_in_role_column=dr.findElement(role_column_result).getText();
		    	//System.out.println("Selected option Text displayed in Roles dropdown :"+Selected_Dropdown_text);
		    	Assert.assertEquals(Selected_Dropdown_text,expected_text_in_role_column);   	
		    }
	    
	 
	    /*
	    @Test(priority = 34)
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
	        }*/
	    
	    //Check_Add Users button display
	    @Test(priority = 35)
	    public void Add_Users_button_display() {
	    	dr.findElement(Add_Users_button).isDisplayed();
	    }
	    
	  //Check_Add Users icon display
	    @Test(priority = 36)
	    public void Add_Users_icon_display() {
	    	dr.findElement(Add_Users_Icon).isDisplayed();
	    }
	    
	  //Check_Add Users button functinality
	    @Test(priority = 37)
	    public void Check_Add_Users_button_Functionality() throws InterruptedException {
	    	dr.findElement(Add_Users_button).click();
	    	Thread.sleep(5000);
	    	String Actual_user_profile_header=dr.findElement(User_profile_header).getText();
	    	String Expected_text="User Profile";
	    	Assert.assertEquals(Actual_user_profile_header, Expected_text);
	    	dr.findElement(Back_To_List).click();
	    }
	    
	    
	  //Check_Add Users icon functinality
	    @Test(priority = 38)
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
	    @Test(priority = 39)
	    public void Back_to_list_button_display() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Users_Icon).click();
	    	Thread.sleep(5000);
	    	dr.findElement(Back_To_List).isDisplayed();
	    }
	    
	    
	  //Check back to list button functinality
	    @Test(priority = 40)
	    public void Back_to_list_button_clickable() throws InterruptedException {
	    	dr.findElement(Back_To_List).click();
	    	Thread.sleep(5000);
	    	String Users_page_header=dr.findElement(Users_pege_header).getText();
	    	String expected_text_of_User_page_header="Users";
	    	Assert.assertEquals(Users_page_header, expected_text_of_User_page_header);
	    	
	    }
	    
	    //Check edit User icon display
	    @Test(priority = 41)
	    public void edit_User_icon_display() {
	    	dr.findElement(Edit_user_icon).isDisplayed();
	    }
	    
	    //Check edit user icon functionality
	    @Test(priority = 42)
	    public void edit_user_icon_functionality() throws InterruptedException {
	     dr.findElement(Edit_user_icon).click();
	     Thread.sleep(5000);
	     String User_Profile_header_Text=dr.findElement(User_profile_header).getText();
	     String Expected_Text="User Profile";
	     Assert.assertEquals(User_Profile_header_Text, Expected_Text);
	    }
	    
	    
	    //Check Back to list button display on  User profile page
	    @Test(priority =43)
	    public void Back_to_list_button_on_User_Profile_Page() {
	    	dr.findElement(Back_To_List).isDisplayed();
	    }
	    
	  //Check Back to list button functionality on  User profile page
	    @Test(priority =44)
	    public void Check_Back_to_list_button_Functinality_on_User_Profile_Page() throws InterruptedException {
	    	dr.findElement(Back_To_List).click();
	    	Thread.sleep(5000);
	    	String Actual_Users_Page_Header=dr.findElement(Users_pege_header).getText();
	    	String Expected_Users_Page_Header="Users";
	    	Assert.assertEquals(Actual_Users_Page_Header, Expected_Users_Page_Header);
	    }
	    
 
	  //Check edit user functionality
	    @Test(priority = 45)
	    public void Update_button_functionality_on_User_Profile_page() throws InterruptedException {
	    	
	    	Select sel=new Select(dr.findElement(select_columnname_field));
		    sel.selectByVisibleText("First Name");
		    Thread.sleep(5000);
		    dr.findElement(Search_button).click();    	
	    	Thread.sleep(5000);
	    	dr.findElement(Edit_user_icon).click();
	    	Thread.sleep(4000);
	    	Select Select_State=new Select(dr.findElement(State));
	    	Select_State.selectByVisibleText("Maharashtra");
	    	Select Select_City=new Select(dr.findElement(City));
	    	Thread.sleep(5000);
	    	
	    	Select_City.selectByVisibleText("Ale");
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	        js.executeScript("window.scrollBy(0,1000)");
	    	
	    	dr.findElement(Update_user).click();
	    	Thread.sleep(7000);
	    	String User_page_header=dr.findElement(Users_pege_header).getText();
	    	String Expected_User_page_header="Users";
	    	Assert.assertEquals(User_page_header, Expected_User_page_header);
	     
	     
	    }
	    
	    //check updated data succssfully save & reflected on users home page
	    @Test(priority = 46)
	    public void updated_data_succssfully_save_and_reflected_on_users_home_page() throws InterruptedException {
	    	Select sel=new Select(dr.findElement(select_columnname_field));
		    sel.selectByVisibleText("First Name");
		    Thread.sleep(5000);
		    dr.findElement(Search_button).click();    	
	    	Thread.sleep(5000);
	    	dr.findElement(Edit_user_icon).click();
	    	Thread.sleep(4000);
	    	dr.findElement(First_Name).click();
	    	dr.findElement(First_Name).sendKeys(first_name_update);
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	        js.executeScript("window.scrollBy(0,1000)");	    	
	    	dr.findElement(Update_user).click();
	    	Thread.sleep(5000);
	    	dr.findElement(Clear_button).click();
	    	Thread.sleep(4000);
	    	dr.findElement(Search_field).sendKeys(first_name_update);
	    	Thread.sleep(4000);
	    	dr.findElement(Search_button).click();
	    	String expected_updated_data_display_on_user_home_page=dr.findElement(first_name_result_after_apply_search).getText();
	    	Assert.assertEquals(first_name_update, expected_updated_data_display_on_user_home_page);
     
	    }
	    
	    
	    //check Add user page : mandatory field contain mandatory error message
	    @Test(priority = 47)
	    public void Add_user_page_mandatory_field_contain_mandatory_error_message() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Users_button).click();
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	        js.executeScript("window.scrollBy(0,1000)");	
	        Thread.sleep(5000);
	        dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String Actual_username_required_msg=dr.findElement(username_required_msg_element).getText();
	    	Assert.assertEquals(Actual_username_required_msg, "Username is required.");
	    	String Actual_firstname_required_msg=dr.findElement(firstname_required_msg_element).getText();
	    	Assert.assertEquals(Actual_firstname_required_msg, "First Name is required.");
	    	String Actual_lastname_required_msg=dr.findElement(lastname_required_msg_element).getText();
	    	Assert.assertEquals(Actual_lastname_required_msg, "Last Name is required.");
	    	String Actual_email_required_msg=dr.findElement(email_required_msg_element).getText();
	    	Assert.assertEquals(Actual_email_required_msg, "Email is required.");
	    	String Actual_phonenum_required_msg=dr.findElement(phonenumber_required_msg_element).getText();
	    	Assert.assertEquals(Actual_phonenum_required_msg, "Phone Number is required.");
	    	String Actual_role_required_msg=dr.findElement(role_required_msg_element).getText();
	    	Assert.assertEquals(Actual_role_required_msg, "Role is required.");
	    	String Actual_state_required_msg=dr.findElement(state_required_msg_element).getText();
	    	Assert.assertEquals(Actual_state_required_msg, "State is required.");
	    	String Actual_city_required_msg=dr.findElement(city_required_msg_element).getText();
	    	Assert.assertEquals(Actual_city_required_msg, "City is required.");
	    	String Actual_zipcode_required_msg=dr.findElement(zipcode_required_msg_element).getText();
	    	Assert.assertEquals(Actual_zipcode_required_msg, "Zipcode is required.");
	    	String Actual_birthdate_required_msg=dr.findElement(birthdate_required_msg_element).getText();
	    	Assert.assertEquals(Actual_birthdate_required_msg, "Birth Date is required.");
	    }
	    
	    
	    //check error message for invalid email
	    @Test(priority = 48)
	    public void check_error_message_for_invalid_email() throws InterruptedException {
	    	dr.navigate().refresh();
	    	dr.findElement(Email).sendKeys(input_for_invalid_email);
	    	dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String invalid_email_error=dr.findElement(error_msg_for_invalid_email_msg_element).getText();
	    	String expected="Please enter valid email address";
	    	Assert.assertEquals(invalid_email_error, expected);
	    }
	    
	  //check error message for invalid lessthan_ninedigit phone_number
	    @Test(priority = 49)
	    public void check_error_message_for_lessthan_ninedigit_phone_number() throws InterruptedException {
	    	dr.navigate().refresh();
	    	//dr.findElement(Phone_Number).sendKeys(input_for_invalid_phoneNo_nine_digits);
	    	dr.findElement(Phone_Number).sendKeys("123456789");
	    	dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String invalid_phoneNo_error=dr.findElement(error_msg_for_invalid_phoneNo_msg_element).getText();
	    	String expected="Please enter 10 digit Phone Number.";
	    	Assert.assertEquals(invalid_phoneNo_error, expected);
	    }
	    
	    /*
	  //check error message for invalid morethan 10 digit phone_number
	    @Test(priority = 50)
	    public void check_error_message_for_morethan_tendigit_phone_number() throws InterruptedException {
	    	dr.navigate().refresh();
	    	//dr.findElement(Phone_Number).sendKeys(input_for_invalid_phoneNo_nine_digits);
	    	dr.findElement(Phone_Number).sendKeys("12345678901");
	    	dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String invalid_phoneNo_error=dr.findElement(error_msg_for_invalid_phoneNo_msg_element).getText();
	    	String expected="Please enter 10 digit Phone Number.";
	    	Assert.assertEquals(invalid_phoneNo_error, expected);
	    }*/
	    
	    
	  //check error message for invalid lessthan_6 digit zipcode
	    @Test(priority = 51)
	    public void check_error_message_for_lessthan_sixdigit_zipcode() throws InterruptedException {
	    	dr.navigate().refresh();
	    	//dr.findElement(Phone_Number).sendKeys(input_for_invalid_phoneNo_nine_digits);
	    	dr.findElement(Zipcode).sendKeys("12345");
	    	dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String invalid_zipcode_error=dr.findElement(error_msg_for_invalid_zipcode_msg_element).getText();
	    	String expected="Please enter 6 digit Zipcode.";
	    	Assert.assertEquals(invalid_zipcode_error, expected);
	    }
	    
	    /*
	  //check error message for invalid morethan 6 digit zipcode
	    @Test(priority = 52)
	    public void check_error_message_for_morethan_sixdigit_zipcode() throws InterruptedException {
	    	dr.navigate().refresh();
	    	//dr.findElement(Phone_Number).sendKeys(input_for_invalid_phoneNo_nine_digits);
	    	dr.findElement(Phone_Number).sendKeys("1234567");
	    	dr.findElement(Save).click();
	    	Thread.sleep(5000);
	    	String invalid_zipcode_error=dr.findElement(error_msg_for_invalid_zipcode_msg_element).getText();
	    	String expected="Please enter 6 digit Zipcode.";
	    	Assert.assertEquals(invalid_zipcode_error, expected);
	    }*/
	    
	    
	    //Check Add user functionality on User Profile page
	    @Test(priority =53)
	    public void Add_new_user() throws InterruptedException {
	    	dr.get("https://portal-dev.waiu.co.in/admin/user");
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Users_button).click();
	    	Thread.sleep(5000);
	    	dr.findElement(User_Name).sendKeys("Vishal");
	    	dr.findElement(First_Name).sendKeys("Vishal");
	    	dr.findElement(Last_Name).sendKeys("Dighe");
	    	dr.findElement(Email).sendKeys("abh@abh.com");
	    	dr.findElement(Phone_Number).sendKeys("1111111121");
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
	    
	   
	    
	    
	    
}
