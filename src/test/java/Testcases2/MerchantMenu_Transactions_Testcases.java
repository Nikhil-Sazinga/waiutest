package Testcases2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestXpath.MerchantMenu_Transactions_Locators;

public class MerchantMenu_Transactions_Testcases extends MerchantMenu_Transactions_Locators {

	
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
	
	
	//Check Transactions menu display
	@Test(priority =3)
	public void Check_Transactions_menu_display() {
		dr.findElement(Transactions_menu).isDisplayed();
	}
	
	
	//Check Transactions menu clickable
	@Test(priority=4)
	public void Check_Transactions_menu_Clickable() throws InterruptedException {
		dr.findElement(Transactions_menu).click();
		Thread.sleep(5000);
		
	}
	
	
	
	//Check  Merchant-Transactions webpage title
	@Test(priority =5)
	public void Check_Merchants_Transactions_webpage_title() {
		String Actual_Merchants_webpage_title=dr.getTitle();
		String Expected_Merchants_webpage_title="WAIU - Transactions (v-1.0.6)";
		Assert.assertEquals(Actual_Merchants_webpage_title, Expected_Merchants_webpage_title);		
	}
	
	
	//Check Merchant-Transactions  page header
    @Test(priority =6)
    public void check_Merchant_Transactions_page_header() {
    	String Actual_page_header=dr.findElement(Transactions_Page_Header).getText();
    	String Expexted_page_header="Transactions";
    	Assert.assertEquals(Actual_page_header, Expexted_page_header);
    }
    
    
  //Check Start_Date_label_text
    @Test(priority =7)
    public void Start_Date_field_label_text() {
    	String Start_Date_field_label_actaul_text=dr.findElement(Start_Date_Label).getText();
    	String Expected_label="Start Date";
    	Assert.assertEquals(Start_Date_field_label_actaul_text, Expected_label);
    }
    
    //Check_Start Date_field_display
    @Test(priority =8)
    public void Check_Start_Date_field_display() {
    	dr.findElement(Start_Date).isDisplayed();
     }
    
    
  //Check Start Date_field clickable
	@Test(priority =9)
	public void Check_Start_Date_field_clickable() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(Start_Date).click();
		Thread.sleep(5000);
		dr.findElement(Start_Date).sendKeys("02-02-2022");
	}
	
    
	//Check End_Date_label_text
    @Test(priority =10)
    public void End_Date_field_label_text() {
    	String End_Date_field_label_actaul_text=dr.findElement(End_Date_Label).getText();
    	String Expected_label="End Date";
    	Assert.assertEquals(End_Date_field_label_actaul_text, Expected_label);
    }
    
    //Check_End Date_field_display
    @Test(priority =11)
    public void Check_End_Date_field_display() {
    	dr.findElement(End_Date).isDisplayed();
     }
    
    
  //Check End Date_field clickable
	@Test(priority =12)
	public void Check_End_Date_field_clickable() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(End_Date).click();
		Thread.sleep(5000);
		dr.findElement(End_Date).sendKeys("02-05-2022");
	}
	
	
	//Check State label text
    @Test(priority =13)
    public void State_field_label_txt() {
    	String State_field_label_actaul_text=dr.findElement(State_Label).getText();
    	String Expected_label="State";
    	Assert.assertEquals(State_field_label_actaul_text, Expected_label);
    }
    
    //Check_State_field_display
    @Test(priority =14)
    public void Check_State_field_displayed() {
    	dr.findElement(State).isDisplayed();
     }
    
    
  //Check State_field clickable
	@Test(priority =15)
	public void Check_State_field_clickable() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(State));
		se.selectByVisibleText("Maharashtra");
		String st=se.getFirstSelectedOption().getText();
		String Expected_state_text="Maharashtra";
		Assert.assertEquals(st,Expected_state_text);
	}
	
	
	//Check City label text
    @Test(priority =16)
    public void City_field_label_txt() {
    	String City_field_label_actaul_text=dr.findElement(City_Label).getText();
    	String Expected_label="City";
    	Assert.assertEquals(City_field_label_actaul_text, Expected_label);
    }
    
    //Check_City_field_display
    @Test(priority =17)
    public void Check_City_field_displayed() {
    	dr.findElement(City).isDisplayed();
     }
    
    
  //Check City_field clickable
	@Test(priority =18)
	public void Check_City_field_clickable() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(City));
		se.selectByVisibleText("Pune");
		String st=se.getFirstSelectedOption().getText();
		String Expected_city_text="Pune";
		Assert.assertEquals(st, Expected_city_text);
	}
	
    
	//Check Transaction Types label text
    @Test(priority =19)
    public void Transaction_Types_field_label_txt() {
    	String Transaction_Types_field_label_actaul_text=dr.findElement(Transaction_Types_Label).getText();
    	String Expected_label="Transaction Types";
    	Assert.assertEquals(Transaction_Types_field_label_actaul_text, Expected_label);
    }
    
    //Check_Transaction_Types_field_display
    @Test(priority =20)
    public void Check_Transaction_Types_field_displayed() {
    	dr.findElement(Transaction_Types).isDisplayed();
     }
    
    
  //Check Transaction_Types_field select Payment Gateway option
	@Test(priority =21)
	public void Check_Transaction_Types_field_select_Payment_Gateway_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Transaction_Types));
		se.selectByVisibleText("Payment Gateway");
		String st=se.getFirstSelectedOption().getText();
		String Expected_city_text="Payment Gateway";
		Assert.assertEquals(st, Expected_city_text);
	}
	
	//Check Transaction_Types_field select Wallet option
	@Test(priority =22)
	public void Check_Transaction_Types_field_select_Wallet_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Transaction_Types));
		se.selectByVisibleText("Wallet");
		String st=se.getFirstSelectedOption().getText();
		String Expected_city_text="Wallet";
		Assert.assertEquals(st, Expected_city_text);
	}
	
	//Check Transaction_Types_field select Lender option
	@Test(priority =23)
	public void Check_Transaction_Types_field_select_Lender_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Transaction_Types));
		se.selectByVisibleText("Lender");
		String st=se.getFirstSelectedOption().getText();
		String Expected_city_text="Lender";
		Assert.assertEquals(st, Expected_city_text);
	}
	
	//Check status label text
    @Test(priority =24)
    public void Status_field_label_txt() {
    	String Status_field_label_actaul_text=dr.findElement(Status_Label).getText();
    	String Expected_label="Status";
    	Assert.assertEquals(Status_field_label_actaul_text, Expected_label);
    }
    
    //Check_Status_field_display
    @Test(priority =25)
    public void Check_Status_field_displayed() {
    	dr.findElement(Status).isDisplayed();
     }
    
    
  //Check Status_field select Success option
	@Test(priority =26)
	public void Check_Status_field_select_Success_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Status));
		se.selectByVisibleText("Success");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Status_text="Success";
		Assert.assertEquals(st, Expected_Status_text);
	}
	
	//Check Status_field select Wallet option
	@Test(priority =27)
	public void Check_Status_field_select_InProgress_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Status));
		se.selectByVisibleText("InProgress");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Status_text="InProgress";
		Assert.assertEquals(st, Expected_Status_text);
	}
	
	//Check Status_field select Pending option
	@Test(priority =28)
	public void Check_Status_field_select_Pending_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Status));
		se.selectByVisibleText("Pending");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Status_text="Pending";
		Assert.assertEquals(st, Expected_Status_text);
	}
	
	
	//Check Status_field select Fail option
	@Test(priority =29)
	public void Check_Status_field_select__Fail_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Status));
		se.selectByVisibleText("Fail");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Status_text="Fail";
		Assert.assertEquals(st, Expected_Status_text);
	}
	
	//Check Status_field select Cancelled option
	@Test(priority =30)
	public void Check_Status_field_select_Cancelled_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Status));
		se.selectByVisibleText("Cancelled");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Status_text="Cancelled";
		Assert.assertEquals(st, Expected_Status_text);
	}
	
	
	//Check Merchants label text
    @Test(priority =31)
    public void Merchants_field_label_txt() {
    	String Merchants_field_label_actaul_text=dr.findElement(Merchants_Label).getText();
    	String Expected_label="Merchants";
    	Assert.assertEquals(Merchants_field_label_actaul_text, Expected_label);
    }
    
    //Check_Merchants_field_display
    @Test(priority =32)
    public void Check_Merchants_field_displayed() {
    	dr.findElement(Merchants).isDisplayed();
     }
    
    
  //Check Merchants_field select option
	@Test(priority =33)
	public void Check_Merchants_field_select_option() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(Merchants).click();
		dr.findElement(Merchants).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		dr.findElement(Merchants).sendKeys(Keys.ENTER);
		Select se=new Select(dr.findElement(Merchants));
		String st=se.getFirstSelectedOption().getText();
		System.out.println("Selected option in merchants dropdown : "+st );
	}
	
	
	//Check Lenders label text
    @Test(priority =34)
    public void Lenders_field_label_txt() {
    	String Lenders_field_label_actaul_text=dr.findElement(Lenders_Label).getText();
    	String Expected_label="Lenders";
    	Assert.assertEquals(Lenders_field_label_actaul_text, Expected_label);
    }
    
    //Check_Lenders_field_display
    @Test(priority =35)
    public void Check_Lenders_field_displayed() {
    	dr.findElement(Lenders).isDisplayed();
     }
    
    
  //Check Merchants_field select option
	@Test(priority =36)
	public void Check_Lenders_field_select_option() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(Lenders).click();
		dr.findElement(Lenders).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		dr.findElement(Lenders).sendKeys(Keys.ENTER);
		Select se=new Select(dr.findElement(Lenders));
		String st=se.getFirstSelectedOption().getText();
		System.out.println("Selected option in Lenders dropdown : "+st );
	}
	
	
	//Check Customer Name label text
    @Test(priority =37)
    public void Customer_Name_field_label_txt() {
    	String Customer_Name_field_label_actaul_text=dr.findElement(Customer_Name_Label).getText();
    	String Expected_label="Customer Name";
    	Assert.assertEquals(Customer_Name_field_label_actaul_text, Expected_label);
    }
    
    //Check_Customer Name_field_display
    @Test(priority =38)
    public void Check_Customer_Name_field_displayed() {
    	dr.findElement(Customer_Name).isDisplayed();
     }
    
    
  //Check Customer Name field send input
	@Test(priority =39)
	public void Check_Customer_Name_field_send_input() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(Customer_Name).sendKeys("A");
		Thread.sleep(5000);
		
	}
	
	
	//Check Search by keyword label text
    @Test(priority =40)
    public void Search_by_keyword_field_label_txt() {
    	String Search_by_keyword_field_label_actaul_text=dr.findElement(Serach_by_keyword_Label).getText();
    	String Expected_label="Search by keyword";
    	Assert.assertEquals(Search_by_keyword_field_label_actaul_text, Expected_label);
    }
    
    //Check_Search by keyword_field_display
    @Test(priority =41)
    public void Check_Search_by_keyword_field_displayed() {
    	dr.findElement(Serach_field).isDisplayed();
     }
    
    
  //Check Search functionality
	@Test(priority =42)
	public void Check_Search_field_placeholder() throws InterruptedException {
		Thread.sleep(5000);
		
		String Search_field_placeholder_actaul_text=dr.findElement(Serach_field).getAttribute("placeholder");
    	String Expected_text="Search Keyword ";
    	Assert.assertEquals(Search_field_placeholder_actaul_text, Expected_text);
	
	}
	
	//Check Settlement label text
    @Test(priority =43)
    public void Settlement_field_label_txt() {
    	String Settlement_field_label_actaul_text=dr.findElement(Settelment_Label).getText();
    	String Expected_label="Settlement";
    	Assert.assertEquals(Settlement_field_label_actaul_text, Expected_label);
    }
    
    //Check_Settlement_field_display
    @Test(priority =44)
    public void Check_Settlement_field_displayed() {
    	dr.findElement(Settelment).isDisplayed();
     }
    
	
  //Check Settlement_field select Settle option
	@Test(priority =45)
	public void Check_Settlement_field_select_Settle_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Settelment));
		se.selectByVisibleText("Settle");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Settlement_text="Settle";
		Assert.assertEquals(st, Expected_Settlement_text);
	}
	
	
	//Check Settlement_field select Unsettle option
	@Test(priority =46)
	public void Check_Settlement_field_select_Fail_option() throws InterruptedException {
		Thread.sleep(5000);
		Select se=new Select(dr.findElement(Settelment));
		se.selectByVisibleText("Unsettle");
		String st=se.getFirstSelectedOption().getText();
		String Expected_Settlement_text="Unsettle";
		Assert.assertEquals(st, Expected_Settlement_text);
	}
	
	
	
    
    //Check_Clear button_display
    @Test(priority =47)
    public void Check_Clear_button_displayed() {
    	dr.findElement(Clear_button).isDisplayed();
     }
    
    
  //Check Clear functionality
	@Test(priority =48)
	public void Check_Clear_functionality() throws InterruptedException {
		Thread.sleep(5000);				
		dr.findElement(Clear_button).click();
		Thread.sleep(5000);
		
     }
	
	//Check Search functionality
		@Test(priority =49)
		public void Check_Search_functionality() throws InterruptedException {
			Thread.sleep(5000);
			dr.navigate().refresh();
			Thread.sleep(5000);
			String input_for_search=dr.findElement(take_data_from_table_for_search_functinality_verify).getText();
			dr.findElement(Serach_field).sendKeys(input_for_search);
			Thread.sleep(5000);
			String Search_result_data_from_table=dr.findElement(take_data_from_table_for_search_functinality_verify).getText();
	    	Assert.assertEquals(Search_result_data_from_table, input_for_search);
		
		}
	
	
}
