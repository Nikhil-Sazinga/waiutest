package Testcases2;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.Admin_Customer_Locators;

public class Admin_Customer_Testcases extends Admin_Customer_Locators{
	
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
		
		
		//Check Admin menu display
		@Test(priority =1)
		public void Check_Merchant_menu_display() {
			dr.findElement(Admin_menu).isDisplayed();
		}
		
		//Check Admin menu clickable
		@Test(priority =2)
		public void Check_Merchant_menu_clickable() throws InterruptedException {
			Thread.sleep(5000);
			dr.findElement(Admin_menu).click();
			Thread.sleep(5000);
		}
		
		
		//Check Customer menu display
		@Test(priority =3)
		public void Check_Customer_menu_display() {
			dr.findElement(Customer_menu).isDisplayed();
		}
		
		
		//Check Customer menu clickable
		@Test(priority=4)
		public void Check_Customer_menu_Clickable() throws InterruptedException {
			dr.findElement(Customer_menu).click();
			Thread.sleep(5000);
			
		}
		
		
		
		//Check  Merchant-Customer webpage title
		@Test(priority =5)
		public void Check_Customer_webpage_title() {
			String Actual_Customer_webpage_title=dr.getTitle();
			String Expected_Customer_webpage_title="WAIU - Customers (v-1.0.18)";
			System.out.println("Webpage title : "+Actual_Customer_webpage_title);
			Assert.assertEquals(Actual_Customer_webpage_title, Expected_Customer_webpage_title);		
		}
		
		
		//Check Merchant-Customers  page header
	    @Test(priority =6)
	    public void check_Merchant_Customers_page_header() {
	    	String Actual_page_header=dr.findElement(Customers_Page_Header).getText();
	    	String Expexted_page_header="Customers";
	    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
	    }
	    
	  //Check State label text
	    @Test(priority =7)
	    public void State_field_label_txt() {
	    	String State_field_label_actaul_text=dr.findElement(State_Label).getText();
	    	String Expected_label="State";
	    	Assert.assertEquals(State_field_label_actaul_text, Expected_label);
	    }
	    
	    //Check_State_field_display
	    @Test(priority =8)
	    public void Check_State_field_displayed() {
	    	dr.findElement(State).isDisplayed();
	     }
	    
	    
	  //Check State_field clickable
		@Test(priority =9)
		public void Check_State_field_clickable() throws InterruptedException {
			Thread.sleep(5000);
			Select se=new Select(dr.findElement(State));
			se.selectByVisibleText("Maharashtra");
			String st=se.getFirstSelectedOption().getText();
			String Expected_state_text="Maharashtra";
			Assert.assertEquals(st,Expected_state_text);
		}
		
		
		//Check City label text
	    @Test(priority =10)
	    public void City_field_label_txt() {
	    	String City_field_label_actaul_text=dr.findElement(City_Label).getText();
	    	String Expected_label="City";
	    	Assert.assertEquals(City_field_label_actaul_text, Expected_label);
	    }
	    
	    //Check_City_field_display
	    @Test(priority =11)
	    public void Check_City_field_displayed() {
	    	dr.findElement(City).isDisplayed();
	     }
	    
	    
	  //Check City_field clickable
		@Test(priority =12)
		public void Check_City_field_clickable() throws InterruptedException {
			Thread.sleep(5000);
			Select se=new Select(dr.findElement(City));
			se.selectByVisibleText("Pune");
			String st=se.getFirstSelectedOption().getText();
			String Expected_city_text="Pune";
			Assert.assertEquals(st, Expected_city_text);
		}
		
	    
	    
	    
	  //Check Start_Date_label_text
	    @Test(priority =13)
	    public void Start_Date_field_label_text() {
	    	String Start_Date_field_label_actaul_text=dr.findElement(Start_Date_Label).getText();
	    	String Expected_label="Start Date";
	    	Assert.assertEquals(Start_Date_field_label_actaul_text, Expected_label);
	    }
	    
	    //Check_Start Date_field_display
	    @Test(priority =14)
	    public void Check_Start_Date_field_display() {
	    	dr.findElement(Start_Date).isDisplayed();
	     }
	    
	    
	  //Check Start Date_field clickable
		@Test(priority =15)
		public void Check_Start_Date_field_clickable() throws InterruptedException {
			Thread.sleep(5000);
			dr.findElement(Start_Date).click();
			Thread.sleep(5000);
			dr.findElement(Start_Date).sendKeys("02-02-2022");
		}
		
	    
		//Check End_Date_label_text
	    @Test(priority =16)
	    public void End_Date_field_label_text() {
	    	String End_Date_field_label_actaul_text=dr.findElement(End_Date_Label).getText();
	    	String Expected_label="End Date";
	    	Assert.assertEquals(End_Date_field_label_actaul_text, Expected_label);
	    }
	    
	    //Check_End Date_field_display
	    @Test(priority =17)
	    public void Check_End_Date_field_display() {
	    	dr.findElement(End_Date).isDisplayed();
	     }
	    
	    
	  //Check End Date_field clickable
		@Test(priority =18)
		public void Check_End_Date_field_clickable() throws InterruptedException {
			Thread.sleep(5000);
			//dr.findElement(End_Date).click();
			//Thread.sleep(5000);
			dr.findElement(End_Date).sendKeys("02-05-2022");
		}
		
		
		//Check_select_columnName field_display
	    @Test(priority =19)
	    public void Check_select_columnName_field_visibility() {
	    	dr.findElement(select_by_column_name_).isDisplayed();
	     }
	    
	    
	  //Check select_columnName field placeholder
		@Test(priority =20)
		public void Check_select_columnName_field_placeholder() throws InterruptedException {
			String select_columnname_field_placeholder=dr.findElement(select_by_column_name_).getAttribute("placeholder");
			String expect="Select By Column Name";
			Assert.assertEquals(select_columnname_field_placeholder, expect);
		
		}
		
		 
	    //Check_Search field_display
	    @Test(priority =21)
	    public void Check_Search_field_displayed() throws InterruptedException {
	    	Thread.sleep(5000);
	    	dr.findElement(Search_field).isDisplayed();
	     }
	    
	    
	  //Check Search field editable
		@Test(priority =22)
		public void Check_Search_field_editable() throws InterruptedException {
			Thread.sleep(5000);
			String input_for_search="Active";
			dr.findElement(Search_field).sendKeys(input_for_search);
			
		
		}
		
		//Check search field placeholder
				@Test(priority =23)
				public void Check_search_field_placeholder() throws InterruptedException {
					dr.findElement(Clear_button).click();
					Thread.sleep(5000);
					String search_field_placeholder=dr.findElement(Search_field).getAttribute("placeholder");
					String expect="Search By Keyword";
					Assert.assertEquals(search_field_placeholder, expect);
				
				}
		
		
		//Check_search button_display
			  @Test(priority =24)
			  public void Check_search_button_visibility() {
			  dr.findElement(Search_button).isDisplayed();
			     }
		    
	    //Check_Clear button_display
	    @Test(priority =25)
	    public void Check_Clear_button_displayed() {
	    	dr.findElement(Clear_button).isDisplayed();
	     }
	    
	    
	  //Check Clear functionality
		@Test(priority =26)
		public void Check_Clear_functionality() throws InterruptedException {
			Thread.sleep(5000);
			Select sel=new Select(dr.findElement(select_by_column_name_));
			sel.selectByVisibleText("First Name");
			String input_for_search=dr.findElement(text_for_search_field).getText();
			dr.findElement(Search_field).sendKeys(input_for_search);
			dr.findElement(Clear_button).click();		
			Thread.sleep(5000);
			String search_field_placeholder=dr.findElement(Search_field).getAttribute("placeholder");
			String expect_search_placeholder="Search By Keyword";
			Assert.assertEquals(search_field_placeholder, expect_search_placeholder);
			String select_columnname_field_placeholder=dr.findElement(select_by_column_name_).getAttribute("placeholder");
			String expect="Select By Column Name";
			Assert.assertEquals(select_columnname_field_placeholder, expect);
			
	     }
		
		
		//Check Search functionality
				@Test(priority =27)
				public void Check_Search_functionality() throws InterruptedException {
					Thread.sleep(5000);
					dr.findElement(Clear_button).click();
					Thread.sleep(5000);
					Select sel=new Select(dr.findElement(select_by_column_name_));
					sel.selectByVisibleText("First Name");
					Thread.sleep(4000);
					String input_for_search=dr.findElement(text_for_search_field).getText();
					dr.findElement(Search_field).sendKeys(input_for_search);
					Thread.sleep(5000);
					String Expected_text=dr.findElement(text_for_search_field).getText();
			    	Assert.assertEquals(input_for_search, Expected_text);
				
				}
				
				
		//Check View customer icon visibility
				@Test(priority=28)
				public void Check_View_customer_icon_visibility() {
					dr.findElement(view_customer_icon).isDisplayed();
				}

		//Check View customer icon clickable
				@Test(priority=29)
				public void Check_View_customer_icon_clickable() throws InterruptedException {
					Thread.sleep(4000);
					dr.findElement(view_customer_icon).click();
					Thread.sleep(6000);
					dr.findElement(back_to_list_button).isDisplayed();
				}

}
