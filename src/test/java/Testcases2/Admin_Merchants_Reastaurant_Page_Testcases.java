package Testcases2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Admin_Merchants_Reastaurant_Page_Locators;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Admin_Merchants_Reastaurant_Page_Testcases extends Admin_Merchants_Reastaurant_Page_Locators{
	
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
		
		//Check Merchants menu display
		@Test(priority =2)
		public void Check_Merchants_menu_display() {
			dr.findElement(Merchants_menu).isDisplayed();
		}
		
		//Check Merchants menu clickable
		@Test(priority=3)
		public void Check_Merchants_menu_Clickable() throws InterruptedException {
			dr.findElement(Merchants_menu).click();
			Thread.sleep(5000);
			
		}
		
	
		//Check  Merchants webpage title
		@Test(priority =4)
		public void Check_Merchants_webpage_title() {
			String Actual_Merchants_webpage_title=dr.getTitle();
			String Expected_Merchants_webpage_title="WAIU - Merchants (v-1.0.5)";
			Assert.assertEquals(Actual_Merchants_webpage_title, Expected_Merchants_webpage_title);		
		}
		
		
		//Check Merchants page header
	    @Test(priority =5)
	    public void check_Merchants_page_header() {
	    	String Actual_page_header=dr.findElement(Merchants_pege_header).getText();
	    	String Expexted_page_header="Merchants";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }
	    
	    //Check Merchants_field_label_text
	    @Test(priority =6)
	    public void Merchants_field_label_text() {
	    	String Merchants_field_label_actaul_text=dr.findElement(Merchant_field_Label).getText();
	    	String Expected_label="Merchant Type";
	    	Assert.assertEquals(Merchants_field_label_actaul_text, Expected_label);
	    }
	    
	    //Check_Merchants_field_display
	    @Test(priority =7)
	    public void Check_Merchant_field_display() {
	    	dr.findElement(Merchant_field).isDisplayed();
	     }
	    
	    
	    //Check placeholder text of Merchants_field
	    @Test(priority =8)
	    public void placeholder_text_of_Merchants_field() {
	    Select sel_merchant=new Select(dr.findElement(Merchant_field));
	    sel_merchant.selectByVisibleText("Select Type");
		String default_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Select Type";
		System.out.println("Default option Text displayed in Merchants dropdown :"+default_Dropdown_text);
		Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	  //Check Reastaurant_option text of merchant_field
	    @Test(priority =9)
	    public void Select_Reastaurant_Merchant_Type() {
	    Select sel_merchant=new Select(dr.findElement(Merchant_field));
	    sel_merchant.selectByVisibleText("Restaurant");
		String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Restaurant";
		System.out.println("Slected option Text displayed in merchant dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	  //To check if select Reastaurant_option then displayed data only Reastaurant
	    @Test(priority=10)
	    public void select_Reastaurant_option_then_only_reastaurant_result_displayed_in_table() throws InterruptedException {
	    	Select sel_merchant=new Select(dr.findElement(Merchant_field));
		    sel_merchant.selectByVisibleText("Restaurant");
			String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
			Thread.sleep(5000);
			String expected_result=dr.findElement(merchant_type_result).getText();			
			Assert.assertEquals(Selected_Dropdown_text,expected_result);
	    }
	    
	    	 
	    
	  //Check Hotel_option text of merchant_field
	    @Test(priority =11)
	    public void Select_Hotel_Merchant_Type() throws InterruptedException {
	    Select sel_merchant=new Select(dr.findElement(Merchant_field));
	    sel_merchant.selectByVisibleText("Hotel");
		String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
		Thread.sleep(5000);
		String expected_result=dr.findElement(merchant_type_result).getText();			
		Assert.assertEquals(Selected_Dropdown_text,expected_result);
	    }
	    
	  
	    //To check if select Hotel_option then displayed data only hotel
	    @Test(priority=12)
	    public void select_Hotel_option_then_only_hotel_result_displayed_in_table() throws InterruptedException {
	    	Select sel_merchant=new Select(dr.findElement(Merchant_field));
		    sel_merchant.selectByVisibleText("Hotel");
			String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
			Thread.sleep(5000);
			String expected_result=dr.findElement(merchant_type_result).getText();			
			Assert.assertEquals(Selected_Dropdown_text,expected_result);
	    }
	    
	  //Check Status_field_label_text
	    @Test(priority =13)
	    public void Status_field_label_text() {
	    	String Status_field_label_actaul_text=dr.findElement(Status_field_Label).getText();
	    	String Status_field_label_Expected_text="Status";
	    	Assert.assertEquals(Status_field_label_actaul_text, Status_field_label_Expected_text);
	    }
	    
	    //Check_Status_field_display
	    @Test(priority =14)
	    public void Check_Status_field_display() {
	    	dr.findElement(Status_field).isDisplayed();
	     }
	    
	    
	    //Ckeck placeholder text of Status_field
	    @Test(priority =15)
	    public void placeholder_text_of_Status_field() {
	    Select sel_status=new Select(dr.findElement(Status_field));
	    sel_status.selectByVisibleText("Select Status");
		String default_Dropdown_text=sel_status.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Select Status";
		System.out.println("Default option Text displayed in Status dropdown :"+default_Dropdown_text);
		Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    
	  //Check Active_option text of Status_field
	    @Test(priority =16)
	    public void Select_Active_Status_Type() {
	    Select sel_status=new Select(dr.findElement(Status_field));
	    sel_status.selectByVisibleText("Active");
		String Selected_Dropdown_text=sel_status.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Active";
		System.out.println("Slected option Text displayed in Status dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    
	  //Check select Active_option then display only active records in table
	    @Test(priority =17)
	    public void Select_Active_Status_Type_then_display_only_active_records_in_table() {
	    Select sel_merchant=new Select(dr.findElement(Status_field));
	    sel_merchant.selectByVisibleText("Active");
		String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
		String expected_value_in_table=dr.findElement(status_result).getText();
		System.out.println("Slected option Text displayed in Status dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value_in_table);
	    }
	    
	    
	  //Check In-Active_option text of Status_field
	    @Test(priority =18)
	    public void Select_InActive_Status_Type() {
	    Select sel_merchant=new Select(dr.findElement(Status_field));
	    sel_merchant.selectByVisibleText("In-Active");
		String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="In-Active";
		System.out.println("Slected option Text displayed in merchant dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
		dr.findElement(Clear_Button).click();
	    }
	    
	    
	  //Check State_field_label_text
	    @Test(priority =19)
	    public void State_field_label_text() {
	    	String State_field_label_actaul_text=dr.findElement(State_field_Label).getText();
	    	String State_field_label_Expected_text="State";
	    	Assert.assertEquals(State_field_label_actaul_text, State_field_label_Expected_text);
	    }
	    
	    //Check_State_field_display
	    @Test(priority =20)
	    public void Check_State_field_display() {
	    	dr.findElement(State_field).isDisplayed();
	     }
	    
	    
	    //Ckeck placeholder text of State_field
	    @Test(priority =21)
	    public void placeholder_text_of_State_field() {
	    Select sel_status=new Select(dr.findElement(State_field));
	    sel_status.selectByVisibleText("Select State");
		String default_Dropdown_text=sel_status.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Select State";
		System.out.println("Default option Text displayed in State dropdown :"+default_Dropdown_text);
		Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    
	  //Check Select_option for state_field from_dropdownlist
	    @Test(priority =22)
	    public void Select_state_option_from_dropdownlist() {
	    Select sel_state=new Select(dr.findElement(State_field));
	    sel_state.selectByVisibleText("Maharashtra");
		String Selected_Dropdown_text=sel_state.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Maharashtra";
		System.out.println("Slected option Text displayed in State dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    
	    //Check if state filter apply then result contain selected state
	    @Test(priority =23)
	    public void result_contain_selected_state() throws InterruptedException {
	    Thread.sleep(3000);
	    Select sel_state=new Select(dr.findElement(State_field));
	    sel_state.selectByVisibleText("Maharashtra");
		String Selected_Dropdown_text=sel_state.getFirstSelectedOption().getText();
		dr.findElement(view_icon).click();
		Thread.sleep(2000);
		JavascriptExecutor jsa = (JavascriptExecutor) dr;
        jsa.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
		String expected_value=dr.findElement(state_matched).getText();
		//System.out.println("Slected option Text displayed in State dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value);
		Thread.sleep(3000);
		JavascriptExecutor jsaa = (JavascriptExecutor) dr;
        jsaa.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);
        dr.findElement(back_button_on_view_page).click();
	    }
	    
	   
	  //Check City_field_label_text
	    @Test(priority =24)
	    public void City_field_label_text() throws InterruptedException {
	    	Thread.sleep(5000);
	    	String City_field_label_actaul_text=dr.findElement(City_field_Label).getText();
	    	String City_field_label_Expected_text="City";
	    	Assert.assertEquals(City_field_label_actaul_text, City_field_label_Expected_text);
	    }
	    
	    //Check_City_field_display
	    @Test(priority =25)
	    public void Check_City_field_display() {
	    	dr.findElement(City_field).isDisplayed();
	     }
	    
	    
	    //Ckeck placeholder text of City_field
	    @Test(priority =26)
	    public void placeholder_text_of_City_field() {
	    Select sel_City=new Select(dr.findElement(City_field));
	    sel_City.selectByVisibleText("Select City");
		String default_Dropdown_text=sel_City.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Select City";
		System.out.println("Default option Text displayed in City dropdown :"+default_Dropdown_text);
		Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    
	  //Check Select_option for City_field from_dropdownlist
	    @Test(priority =27)
	    public void Select_City_option_from_dropdownlist() throws InterruptedException {
	    Thread.sleep(3000);
	    Select sel_state=new Select(dr.findElement(State_field));
	    sel_state.selectByVisibleText("Maharashtra");
	    Thread.sleep(3000);
	    Select sel_city=new Select(dr.findElement(City_field));
	    sel_city.selectByVisibleText("Pune");
		String Selected_Dropdown_text=sel_city.getFirstSelectedOption().getText();
		String expected_value_in_dropdown="Pune";
		//System.out.println("Slected option Text displayed in City dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
	    }
	    
	    
	    	   
	    //Check if city filter apply then result contain selected city
	    @Test(priority =28)
	    public void result_contain_selected_city() throws InterruptedException {
	    Thread.sleep(5000);
	    Select sel_city=new Select(dr.findElement(City_field));
	    Thread.sleep(3000);
	    sel_city.selectByVisibleText("Pune");
		String Selected_Dropdown_text=sel_city.getFirstSelectedOption().getText();
		dr.findElement(view_icon).click();
		Thread.sleep(4000);
		JavascriptExecutor jsa = (JavascriptExecutor) dr;
        jsa.executeScript("window.scrollBy(0,1000)");
		//String expected_value=dr.findElement(city_matched).getText();
        String expected_value="Pune";
		//System.out.println("Slected option Text displayed in State dropdown :"+Selected_Dropdown_text);
		Assert.assertEquals(Selected_Dropdown_text,expected_value);
		JavascriptExecutor jsaa = (JavascriptExecutor) dr;
        jsaa.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);
        dr.findElement(back_button_on_view_page).click();
	    }
	    
	    
 	   
	  //Check_Search_column_name_field_display
	    @Test(priority =29)
	    public void Check_Searh_column_name_field_display() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(search_columnname_field).isDisplayed();
	     }
	    
	    
	  //Check placeholder text of Search_column_name_field
	    @Test(priority =30)
	    public void placeholder_text_of_Search_column_name_field() throws InterruptedException {
	    Thread.sleep(5000);	
	    Select sel=new Select(dr.findElement(search_columnname_field));
	    String Actual_text_in_search_columnname_field=sel.getFirstSelectedOption().getText();
	    //System.out.println("Placeholder of Search columnname field :"+Actual_text_in_search_columnname_field+":");
		String expected_text_in_search_columnname_field="Select a Column Name";
		//System.out.println("Default Text displayed in Search :"+Actual_text_in_search_columnname_field);
		Assert.assertEquals(Actual_text_in_search_columnname_field,expected_text_in_search_columnname_field);
	    }
	    
	  //Check search functionality for Merchant ID option
	    @Test(priority =31)
	    public void Check_search_functionality_for_MerchantID_option() throws InterruptedException {
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(search_columnname_field));
	    sel.selectByVisibleText("Merchant ID");
	    String input_in_search=dr.findElement(Merchant_ID_search_input_from_table).getText();
	    dr.findElement(Search_field1).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(Merchant_ID_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    
	  //Check search functionality for Merchant Name option
	    @Test(priority =32)
	    public void Check_search_functionality_for_MerchantName_option() throws InterruptedException {
	    dr.findElement(Clear_Button).click();
	    Thread.sleep(5000);	
	    Select sel1=new Select(dr.findElement(Merchant_field));
	    sel1.selectByVisibleText("Select Type");
	    Select sel=new Select(dr.findElement(search_columnname_field));
	    sel.selectByVisibleText("Merchant Name");
	    String input_in_search=dr.findElement(Merchant_name_search_input_from_table).getText();
	    dr.findElement(Search_field1).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(Merchant_name_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    
	  //Check search functionality for contact person option
	    @Test(priority =33)
	    public void Check_search_functionality_for_contact_person_option() throws InterruptedException {
	    dr.findElement(Clear_Button).click();
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(search_columnname_field));
	    sel.selectByVisibleText("Contact Person");
	    String input_in_search=dr.findElement(contactperson_search_input_from_table).getText();
	    dr.findElement(Search_field1).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(contactperson_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    //Check search functionality for Contact Number option
	    @Test(priority =34)
	    public void Check_search_functionality_for_Contact_Number_option() throws InterruptedException {
	    dr.findElement(Clear_Button).click();
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(search_columnname_field));
	    sel.selectByVisibleText("Contact Number");
	    String input_in_search=dr.findElement(contactno_search_input_from_table).getText();
	    dr.findElement(Search_field1).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(contactno_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	  //Check search functionality for Referral Code option
	    @Test(priority =35)
	    public void Check_search_functionality_for_Referral_Code_option() throws InterruptedException {
	    dr.findElement(Clear_Button).click();
	    Thread.sleep(5000);	 
	    Select sel=new Select(dr.findElement(search_columnname_field));
	    sel.selectByVisibleText("Referral Code");
	    String input_in_search=dr.findElement(ReferralCode_search_input_from_table).getText();
	    dr.findElement(Search_field1).sendKeys(input_in_search);
	    dr.findElement(Search_button).click();
	    Thread.sleep(5000);
	    String Expect=dr.findElement(ReferralCode_result_after_apply_search).getText();
	    Assert.assertEquals(input_in_search, Expect);
	    
	    }
	    
	    //Check_Search_field_display
	    @Test(priority =36)
	    public void Check_Searh_field_display() throws InterruptedException {
	    	Thread.sleep(7000);
	    	dr.findElement(Search_field1).isDisplayed();
	     }
    
	    //Ckeck placeholder text of Search_field
	    @Test(priority =37)
	    public void placeholder_text_of_Search_field() throws InterruptedException {
	    dr.findElement(Clear_Button).click();
	    Thread.sleep(5000);	    
	    String Actual_text_in_search_field=dr.findElement(Search_field1).getAttribute("placeholder");
	    System.out.println("Placeholder of Search field :"+Actual_text_in_search_field+":");
		String expected_text_in_search_field="Search By Keyword";
		System.out.println("Default Text displayed in Search :"+Actual_text_in_search_field);
		Assert.assertEquals(Actual_text_in_search_field,expected_text_in_search_field);
	    }
	    
	    //Search functionality
	    @Test(priority =38)
	    public void Search_functionlity() throws InterruptedException {
	    	dr.findElement(Clear_Button).click();
	    	Thread.sleep(5000);
	    	Select sel=new Select(dr.findElement(search_columnname_field));
	    	sel.selectByVisibleText("Merchant ID");
	    	Thread.sleep(3000);
	    	String input_for_search=dr.findElement(data_from_table).getText();
	    	dr.findElement(Search_field1).sendKeys(input_for_search);
	    	dr.findElement(Search_button).click();
	    	Thread.sleep(3000);
	    	Assert.assertEquals(input_for_search,dr.findElement(data_from_table).getText());
	    }
	    
	  //Check_Clear_field_display
	    @Test(priority =39)
	    public void Check_Clear_field_display() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Clear_Button).isDisplayed();
	     }
	    
	    

	    //Clear functionality
	    @Test(priority =40)
	    public void Clear_functionlity() throws InterruptedException { 
	    	Thread.sleep(3000);
	    	dr.findElement(Clear_Button).click();
	    	Thread.sleep(5000);
	    	Select sel_merchant=new Select(dr.findElement(Merchant_field));
		    sel_merchant.selectByVisibleText("Hotel");
		    
		    Select sel_status=new Select(dr.findElement(Status_field));
		    sel_status.selectByVisibleText("Active");
		    
		    Select sel_state=new Select(dr.findElement(State_field));
		    sel_state.selectByVisibleText("Maharashtra");
		    Thread.sleep(7000);
		    
		    Select sel_city=new Select(dr.findElement(City_field));
		    sel_city.selectByVisibleText("Pune");
		    
		    Select sel=new Select(dr.findElement(search_columnname_field));
		    sel.selectByVisibleText("Merchant ID");
		    
		    dr.findElement(Search_field1).sendKeys("aaa");
		    dr.findElement(Clear_Button).click();   //click on clear button
		    Thread.sleep(5000);
		    //merchant type field
		    Select sel_merchant1=new Select(dr.findElement(Merchant_field));
		    String actual_text_in_merchant=sel_merchant1.getFirstSelectedOption().getText();
			String expected_text_in_merchant="Select Type";
			Assert.assertEquals(actual_text_in_merchant,expected_text_in_merchant);
		    
			//status field
		    Select sel_status1=new Select(dr.findElement(Status_field));
		    String actual_text_in_status=sel_status1.getFirstSelectedOption().getText();
			String expected_text_in_status="Select Status";
			Assert.assertEquals(actual_text_in_status,expected_text_in_status);
			
			//state field
		    Select sel_state1=new Select(dr.findElement(State_field));
		    String actual_text_in_state=sel_state1.getFirstSelectedOption().getText();
			String expected_text_in_state="Select State";
			Assert.assertEquals(actual_text_in_state,expected_text_in_state);
			
			//city field
		    Select sel_city1=new Select(dr.findElement(City_field));
		    String actual_text_in_city=sel_city1.getFirstSelectedOption().getText();
			String expected_text_in_city="Select City";
			Assert.assertEquals(actual_text_in_city,expected_text_in_city);
			
			//select cloumn name field
		    Select sel_col1=new Select(dr.findElement(search_columnname_field));
		    String actual_text_in_columnname=sel_col1.getFirstSelectedOption().getText();
			String expected_text_in_columnname="Select a Column Name";
			Assert.assertEquals(actual_text_in_columnname,expected_text_in_columnname);
	    	
	    }
	    
	    
	  //Check_Add merchant button display
	    @Test(priority =41)
	    public void Check_Add_merchant_button_display() {
	    	dr.findElement(Add_Merchant_button).isDisplayed();
	     }
	    
	  //Check_Add merchant icon display
	    @Test(priority =42)
	    public void Check_Add_merchant_icon_display() {
	    	dr.findElement(Add_Merchant_icon).isDisplayed();
	     }
	    
	  //Check_edit icon display
	    @Test(priority =43)
	    public void Check_edit_icon_display() {
	    	dr.findElement(edit_icon).isDisplayed();
	     }
	    
	  //Check_view icon display
	    @Test(priority =44)
	    public void Check_view_icon_display() {
	    	dr.findElement(view_icon).isDisplayed();
	     }
	    
	  //Check_scan icon display
	    @Test(priority =45)
	    public void Check_scan_icon_display() {
	    	dr.findElement(scan_icon).isDisplayed();
	     }
	   
	    
	   //check edit icon clickable 
	    @Test(priority=46)
	    public void edit_icon_clickable() throws InterruptedException {
	    	Thread.sleep(5000);
	    	String merchant_name_on_table=dr.findElement(merchant_name_frm_table).getText();
	    	dr.findElement(edit_icon).click();
	    	Thread.sleep(5000);
	    	String restaurant_name=dr.findElement(Restarunt_Name).getText();
	    	//Assert.assertEquals(merchant_name_on_table, restaurant_name);
	    	dr.findElement(back_to_list_buttn).click();
	    	
	    }
	    
	    
	  //check view icon clickable 
	    @Test(priority=46)
	    public void view_icon_clickable() throws InterruptedException {
	    	Thread.sleep(6000);
	    	String merchant_name_on_table=dr.findElement(merchant_name_frm_table).getText();
	    	dr.findElement(view_icon).click();
	    	Thread.sleep(5000);
	    	String merchant_name=dr.findElement(name_on_view_page_element).getText();
	    	Assert.assertEquals(merchant_name_on_table, merchant_name);
	    	dr.findElement(back_to_list_buttn).click();
	    	
	    }
	    
	    
	  //check scan icon clickable 
	    @Test(priority=47)
	    public void scan_icon_clickable() throws InterruptedException {
	    	Thread.sleep(6000);
	    	dr.findElement(scan_icon).click();
	    	Thread.sleep(5000);
	    	dr.findElement(QRcode_image).isDisplayed();
	    }
	    
	  //check upload QRCode button visibility 
	    @Test(priority=48)
	    public void upload_QRCode_button_visibility() throws InterruptedException {
	    	dr.findElement(uploadQR_code_button).isDisplayed();
	    }
	    
	  //check close icon visibility 
	    @Test(priority=49)
	    public void close_icon_visibility() throws InterruptedException {
	    	dr.findElement(close_icon).isDisplayed();
	    }
	    
	    
	  //check close icon functionality
	    @Test(priority=50)
	    public void close_icon_functinality() throws InterruptedException {
	    	dr.findElement(close_icon).click();
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Merchant_button).isDisplayed();
	    }
	    
	  //Check_Add merchant button clickable
	    @Test(priority =51)
	    public void Check_Add_merchant_button_clickable() throws InterruptedException {
	    	dr.findElement(Add_Merchant_button).click();
	    	Thread.sleep(5000);
	    	String Actual_popup_header=dr.findElement(popup_box_header).getText();
	    	String Expected_popup_header="Merchant Type";
	    	Assert.assertEquals(Actual_popup_header, Expected_popup_header);
	    	dr.findElement(popup_box_close_icon).click();
	    	
	     }
	    
	  //Check_Add merchant icon display
	    @Test(priority =52)
	    public void Check_Add_merchant_icon_clickable() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Merchant_icon).click();
	    	Thread.sleep(5000);
	    	String Actual_popup_header=dr.findElement(popup_box_header).getText();
	    	String Expected_popup_header="Merchant Type";
	    	Assert.assertEquals(Actual_popup_header, Expected_popup_header);
	    	dr.findElement(popup_box_close_icon).click();
	     }   
	    
	    
	  //Check edit merchant functionality
	    @Test(priority = 53)
	    public void Check_edit_merchant_functionality() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Admin_menu).click();
	    	dr.findElement(Merchants_menu).click();
	    	Thread.sleep(5000);
	    	dr.findElement(edit_icon).click();
	    	Thread.sleep(5000);
	    	
	    	//basic_info_page
	    	JavascriptExecutor jss = (JavascriptExecutor) dr;
			jss.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			dr.findElement(Update_button_basic_info_page).click();
			
			//restaurant_feature_page
			Thread.sleep(5000);
	    	JavascriptExecutor jss1 = (JavascriptExecutor) dr;
			jss1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			dr.findElement(Update_button_restaurant_feature_page).click();
			
			//restaurant_timeslot_page
			Thread.sleep(5000);
	    	JavascriptExecutor jss2 = (JavascriptExecutor) dr;
			jss2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			dr.findElement(Update_button_restaurant_timeslot_page).click();
						
			//restaurant_images_page
			Thread.sleep(5000);
	    	JavascriptExecutor jss3 = (JavascriptExecutor) dr;
			jss3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			dr.findElement(Update_button_restaurant_images_page).click();
			
			//otherdetails_page
			Thread.sleep(5000);
	    	JavascriptExecutor jss4 = (JavascriptExecutor) dr;
			jss4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			dr.findElement(Update_button_other_details_page).click();
			
			String Actual_merchants_header=dr.findElement(Merchants_pege_header).getText();
	    	String Expected_merchants_header="Merchants";
	    	Assert.assertEquals(Actual_merchants_header, Expected_merchants_header);
			
	    }	    	 
	    
	    
	   //Check Add restaurant
	    @Test(priority =54)
	    public void add_restaurant() throws InterruptedException, AWTException {
	    	Thread.sleep(5000);
	    	dr.findElement(Add_Merchant_button).click();
	    	Thread.sleep(5000);
	    	Select select_Merchant_type=new Select(dr.findElement(Popup_dropdowm_box));
	    	select_Merchant_type.selectByVisibleText("Restaurant");
	    	dr.findElement(Proceed_button).click();
	    	Thread.sleep(5000);
	    	dr.findElement(Restarunt_Name).sendKeys("Aai Restarunt");
	    	dr.findElement(Email).sendKeys("fff@ff.com");
	    	dr.findElement(Description).sendKeys("The Aai Restarunt is located near Tiantan Park, just a 10-minute walk from the National Center for the Performing Arts and Tian'anmen Square. Built in 1956 it has old school charm and many rooms still feature high, crown-molded ceilings. ");
	    	dr.findElement(Tagline).sendKeys("Stay & Enjoy");
	    	dr.findElement(Website).sendKeys("www.Aai.com");
	    	//Scroll down page
	    	JavascriptExecutor js = (JavascriptExecutor) dr;
	        js.executeScript("window.scrollBy(0,1000)");
	    	
	    	dr.findElement(Address).sendKeys("2nd Floor, Signet Corner S. No. 134/5+6, Baner, Pune, Maharashtra 411045");
	    	Select sel_state=new Select(dr.findElement(State));
	    	sel_state.selectByVisibleText("Maharashtra");
	    	Thread.sleep(7000);
	    	dr.findElement(City).click();
	    	Select sel_city=new Select(dr.findElement(City));
	    	Thread.sleep(7000);
	    	sel_city.selectByVisibleText("Achalpur");
	    	dr.findElement(Pincode).sendKeys("411045");
	    	dr.findElement(latitude).sendKeys("18.56375");
	    	dr.findElement(longitude).sendKeys("73.78334");
	    	if(dr.findElement(Checkbox).isSelected()) {
	    		System.out.println("Checkbox is selected");
	    	}
	    	else {
	    		System.out.println("Checkbox is not selected");
	    		dr.findElement(Checkbox).click();
	    		System.out.println("Checkbox is selected after click on checkbox");
	    	}
	    	
	    	dr.findElement(Save_and_Proceed_button).click();
	    	Thread.sleep(5000);
	    	
	    	//Restaurant's Detail Form : Reastaurant Features
	    	dr.findElement(Cuisine).click();
	    	dr.findElement(Veg_Non_veg).click();
	    	dr.findElement(specific_customer_services).click();
	    	//Scroll down page
	    	JavascriptExecutor jse = (JavascriptExecutor) dr;
	        jse.executeScript("window.scrollBy(0,1200)");
	        Thread.sleep(5000);
	        dr.findElement(Save_Proceed).click();
	        Thread.sleep(5000);
	        
	        //Restaurant timeslot
	        Select sel1=new Select(dr.findElement(from_element));
	        sel1.selectByValue("9:00 AM");
	        Thread.sleep(5000);
	        //dr.findElement(from_element).click();
	     // Robot object creation
	       /* Robot r = new Robot();     
	        //pressing TAB
	        r.keyPress(KeyEvent.VK_TAB);
	        //releasing TAB
	        r.keyRelease(KeyEvent.VK_TAB);
	        //pressing ENTER
	        r.keyPress(KeyEvent.VK_ENTER);
	        //releasing ENTER
	        r.keyRelease(KeyEvent.VK_ENTER);
	        */
	       Select sel2=new Select(dr.findElement(To_element));
	       sel2.selectByValue("10:00 PM");
	        //dr.findElement(To_element).click();
	        Thread.sleep(5000);
	        dr.findElement(All_day_checkbox).click();
	        JavascriptExecutor js1 = (JavascriptExecutor) dr;
	        js1.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(5000);
	        dr.findElement(Save_an_Proceed_ontimeslot).click();
	        
	        
	        //Restaurant's Detail Form : Reastaurant Images
	        Thread.sleep(5000);
	        JavascriptExecutor jsa = (JavascriptExecutor) dr;
	        jsa.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(5000);
	        
	        String imagePath = System.getProperty("user.dir") + "/Files/Menu card.jpg";
	    	 dr.findElement(Upload_menu_card_image).sendKeys(imagePath);
	        
	        Thread.sleep(5000);
	        dr.findElement(Save_an_Proceed).click();
	        
	        
	        //Restaurant's Detail Form : Bank Details
	        Thread.sleep(5000);
	        dr.findElement(GST_field).sendKeys("35BBBCC1206D1ZK");
	        dr.findElement(PAN_field).sendKeys("BBBCC1206D");
	        dr.findElement(Bank_name).sendKeys("ICICI");
	        dr.findElement(Account_Number).sendKeys("649301150421");
	        dr.findElement(IFSC).sendKeys("ICIC0004639");
	        JavascriptExecutor jsexe = (JavascriptExecutor) dr;
	        jsexe.executeScript("window.scrollBy(0,1000)");
	        dr.findElement(Contact_Name).sendKeys("Ajay Shinde");
	        dr.findElement(Primary_Contact_number).sendKeys("1111111111");
	        dr.findElement(Secondary_Contact_number).sendKeys("1111111112");
	        dr.findElement(Submit_Button).click();
	        Thread.sleep(5000);
	     }   
	    
	    
}
