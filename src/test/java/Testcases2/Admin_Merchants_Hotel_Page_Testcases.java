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

import TestXpath.Admin_Merchants_Hotel_Page_Locators;

public class Admin_Merchants_Hotel_Page_Testcases extends Admin_Merchants_Hotel_Page_Locators{

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
				String Expected_Merchants_webpage_title="WAIU - Merchants (v-1.0.6)";
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
		    
		  //Check Hotel_option text of merchant_field
		    @Test(priority =10)
		    public void Select_Hotel_Merchant_Type() {
		    Select sel_merchant=new Select(dr.findElement(Merchant_field));
		    sel_merchant.selectByVisibleText("Hotel");
			String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Hotel";
			System.out.println("Slected option Text displayed in merchant dropdown :"+Selected_Dropdown_text);
			Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		  //Check Status_field_label_text
		    @Test(priority =11)
		    public void Status_field_label_text() {
		    	String Status_field_label_actaul_text=dr.findElement(Status_field_Label).getText();
		    	String Status_field_label_Expected_text="Status";
		    	Assert.assertEquals(Status_field_label_actaul_text, Status_field_label_Expected_text);
		    }
		    
		    //Check_Status_field_display
		    @Test(priority =12)
		    public void Check_Status_field_display() {
		    	dr.findElement(Status_field).isDisplayed();
		     }
		    
		    
		    //Ckeck placeholder text of Status_field
		    @Test(priority =13)
		    public void placeholder_text_of_Status_field() {
		    Select sel_status=new Select(dr.findElement(Status_field));
		    sel_status.selectByVisibleText("Select Status");
			String default_Dropdown_text=sel_status.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Select Status";
			System.out.println("Default option Text displayed in Status dropdown :"+default_Dropdown_text);
			Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		  //Check Active_option text of Status_field
		    @Test(priority =14)
		    public void Select_Active_Status_Type() {
		    Select sel_merchant=new Select(dr.findElement(Status_field));
		    sel_merchant.selectByVisibleText("Active");
			String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Active";
			System.out.println("Slected option Text displayed in Status dropdown :"+Selected_Dropdown_text);
			Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		  //Check In-Active_option text of Status_field
		    @Test(priority =15)
		    public void Select_InActive_Status_Type() {
		    Select sel_merchant=new Select(dr.findElement(Status_field));
		    sel_merchant.selectByVisibleText("In-Active");
			String Selected_Dropdown_text=sel_merchant.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="In-Active";
			System.out.println("Slected option Text displayed in merchant dropdown :"+Selected_Dropdown_text);
			Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		  //Check State_field_label_text
		    @Test(priority =16)
		    public void State_field_label_text() {
		    	String State_field_label_actaul_text=dr.findElement(State_field_Label).getText();
		    	String State_field_label_Expected_text="State";
		    	Assert.assertEquals(State_field_label_actaul_text, State_field_label_Expected_text);
		    }
		    
		    //Check_State_field_display
		    @Test(priority =17)
		    public void Check_State_field_display() {
		    	dr.findElement(State_field).isDisplayed();
		     }
		    
		    
		    //Ckeck placeholder text of State_field
		    @Test(priority =18)
		    public void placeholder_text_of_State_field() {
		    Select sel_status=new Select(dr.findElement(State_field));
		    sel_status.selectByVisibleText("Select State");
			String default_Dropdown_text=sel_status.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Select State";
			System.out.println("Default option Text displayed in State dropdown :"+default_Dropdown_text);
			Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		  //Check Select_option for state_field from_dropdownlist
		    @Test(priority =19)
		    public void Select_state_option_from_dropdownlist() {
		    Select sel_state=new Select(dr.findElement(State_field));
		    sel_state.selectByVisibleText("Maharashtra");
			String Selected_Dropdown_text=sel_state.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Maharashtra";
			System.out.println("Slected option Text displayed in State dropdown :"+Selected_Dropdown_text);
			Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		  //Check City_field_label_text
		    @Test(priority =20)
		    public void City_field_label_text() throws InterruptedException {
		    	Thread.sleep(7000);
		    	String City_field_label_actaul_text=dr.findElement(City_field_Label).getText();
		    	String City_field_label_Expected_text="City";
		    	Assert.assertEquals(City_field_label_actaul_text, City_field_label_Expected_text);
		    }
		    
		    //Check_City_field_display
		    @Test(priority =21)
		    public void Check_City_field_display() {
		    	dr.findElement(City_field).isDisplayed();
		     }
		    
		    
		    //Ckeck placeholder text of City_field
		    @Test(priority =22)
		    public void placeholder_text_of_City_field() {
		    Select sel_City=new Select(dr.findElement(City_field));
		    sel_City.selectByVisibleText("Select City");
			String default_Dropdown_text=sel_City.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Select City";
			System.out.println("Default option Text displayed in City dropdown :"+default_Dropdown_text);
			Assert.assertEquals(default_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		  //Check Select_option for City_field from_dropdownlist
		    @Test(priority =23)
		    public void Select_City_option_from_dropdownlist() {
		    Select sel_city=new Select(dr.findElement(City_field));
		    sel_city.selectByVisibleText("Pune");
			String Selected_Dropdown_text=sel_city.getFirstSelectedOption().getText();
			String expected_value_in_dropdown="Pune";
			System.out.println("Slected option Text displayed in City dropdown :"+Selected_Dropdown_text);
			Assert.assertEquals(Selected_Dropdown_text,expected_value_in_dropdown);
		    }
		    
		    
		    //Check_Search_field_display
		    @Test(priority =24)
		    public void Check_Searh_field_display() throws InterruptedException {
		    	Thread.sleep(7000);
		    	dr.findElement(Search_field1).isDisplayed();
		     }
		    
		    
		  //Check_Search_icon_display
		    @Test(priority =25)
		    public void Check_Searh_icon_display() {
		    	dr.findElement(Search_icon).isDisplayed();
		     }
		    
		    //Ckeck placeholder text of Search_field
		    @Test(priority =26)
		    public void placeholder_text_of_Search_field() throws InterruptedException {
		    Thread.sleep(10000);
		    
		    String Actual_text_in_search_field=dr.findElement(Search_field1).getText();
		    System.out.println("Placeholder of Search field :"+Actual_text_in_search_field+":");
			String expected_text_in_search_field="Search By Keyword";
			System.out.println("Default Text displayed in Search :"+Actual_text_in_search_field);
			Assert.assertEquals(Actual_text_in_search_field,expected_text_in_search_field);
		    }
		    
		    //Search functionality
		    @Test(priority =24)
		    public void Search_functionlity() {
		    	dr.findElement(Search_field1).sendKeys("1");
		    	
		    }
		    
		  //Check_Clear_field_display
		    @Test(priority =25)
		    public void Check_Clear_field_display() throws InterruptedException {
		    	Thread.sleep(10000);
		    	dr.findElement(Clear_Button).isDisplayed();
		     }
		    
		    

		    //Clear functionality
		    @Test(priority =25)
		    public void Clear_functionlity() throws InterruptedException {
		    	Thread.sleep(5000);
		    	dr.findElement(Search_field1).sendKeys("1");
		    	Thread.sleep(5000);
		    	String text_before_use_clear=dr.findElement(Search_field1).getText();
		    	System.out.println("Before use of clear text in search field :"+text_before_use_clear);
		    	dr.findElement(Clear_Button).click();
		    	Thread.sleep(3000);
		    	String text_after_use_clear=dr.findElement(Search_field1).getText();
		    	System.out.println("After use of clear text in search field :"+text_after_use_clear);
		    	Assert.assertNotEquals(text_before_use_clear, text_after_use_clear);
		    }
		    
		    
		  //Check_Add merchant button display
		    @Test(priority =26)
		    public void Check_Add_merchant_button_display() {
		    	dr.findElement(Add_Merchant_button).isDisplayed();
		     }
		    
		  //Check_Add merchant icon display
		    @Test(priority =27)
		    public void Check_Add_merchant_icon_display() {
		    	dr.findElement(Add_Merchant_icon).isDisplayed();
		     }
		    
		  //Check_Add merchant button clickable
		    @Test(priority =28)
		    public void Check_Add_merchant_button_clickable() throws InterruptedException {
		    	dr.findElement(Add_Merchant_button).click();
		    	Thread.sleep(5000);
		    	String Actual_popup_header=dr.findElement(popup_box_header).getText();
		    	String Expected_popup_header="Merchant Type";
		    	Assert.assertEquals(Actual_popup_header, Expected_popup_header);
		    	dr.findElement(popup_box_close_icon).click();
		    	
		     }
		    
		  //Check_Add merchant icon display
		    @Test(priority =29)
		    public void Check_Add_merchant_icon_clickable() throws InterruptedException {
		    	Thread.sleep(5000);
		    	dr.findElement(Add_Merchant_icon).click();
		    	Thread.sleep(5000);
		    	String Actual_popup_header=dr.findElement(popup_box_header).getText();
		    	String Expected_popup_header="Merchant Type";
		    	Assert.assertEquals(Actual_popup_header, Expected_popup_header);
		    	dr.findElement(popup_box_close_icon).click();
		     }
		    
		   //Check Add restaurant
		    @Test(priority =30)
		    public void add_restaurant() throws InterruptedException, AWTException {
		    	Thread.sleep(5000);
		    	dr.findElement(Add_Merchant_button).click();
		    	Thread.sleep(5000);
		    	Select select_Merchant_type=new Select(dr.findElement(Popup_dropdowm_box));
		    	select_Merchant_type.selectByVisibleText("Hotel");
		    	dr.findElement(Proceed_button).click();
		    	Thread.sleep(5000);
		    	dr.findElement(Hotel_Name).sendKeys("Aai Hotel");
		    	dr.findElement(Email).sendKeys("fff@ff.com");
		    	dr.findElement(Description).sendKeys("The Aai Hotel is located near Tiantan Park, just a 10-minute walk from the National Center for the Performing Arts and Tian'anmen Square. Built in 1956 it has old school charm and many rooms still feature high, crown-molded ceilings. ");
		    	dr.findElement(Tagline).sendKeys("Stay & Enjoy");
		    	dr.findElement(Website).sendKeys("www.Aaihotel.com");
		    	//Scroll down page
		    	JavascriptExecutor js = (JavascriptExecutor) dr;
		        js.executeScript("window.scrollBy(0,1000)");
		    	
		    	dr.findElement(Address).sendKeys("2nd Floor, Signet Corner S. No. 134/5+6, Baner, Pune, Maharashtra 411045");
		    	Select sel_state=new Select(dr.findElement(State));
		    	sel_state.selectByVisibleText("Maharashtra");
		    	Thread.sleep(15000);
		    	dr.findElement(City).click();
		    	Select sel_city=new Select(dr.findElement(City));
		    	Thread.sleep(15000);
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
		        
		        //Restaurant's Detail Form : Reastaurant Images
		        JavascriptExecutor jsex = (JavascriptExecutor) dr;
		        jsex.executeScript("window.scrollBy(0,1000)");
                //Upload image
		        Actions act=new Actions(dr);
		    	act.moveToElement(dr.findElement(Upload_menu_card_image));
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
