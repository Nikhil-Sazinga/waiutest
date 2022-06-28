package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Profile_Page_Locators extends Testbase2{
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Right_top_corner_profile_name=By.xpath("//app-header/nav[1]/div[1]/ul[1]/li[2]/a[1]");
	public By Profile_icon=By.xpath("//app-header/nav[1]/div[1]/ul[1]/li[2]/a[1]/i[1]");
	
	//Profile submenu
	public By Profile_submenu=By.xpath("//app-header/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]");
	public By Profile_icon_in_submenu=By.xpath("//app-header/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/i[1]");
	
	public By Profile_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By user_details_title=By.xpath("//h5[contains(text(),'Users Details')]");
	
	public By username_field=By.xpath("//input[@id='userName']");	
	public By firstname_field=By.xpath("//input[@id='firstName']");
	public By lastname_field=By.xpath("//input[@id='lastName']");
	public By email_field=By.xpath("//input[@id='email']");
	public By phoneNo_field=By.xpath("//input[@id='phoneNumber']");
	public By role_field=By.xpath("//input[@id='roleName']");
	public By state_field=By.xpath("//select[@id='state']");
	public By city_field=By.xpath("//select[@id='city']");	
	public By zipcode=By.xpath("//input[@id='zipCode']");
	public By birthdate=By.name("birthDate");
	
	public By Update_button=By.xpath("//button[contains(text(),'Update')]");
	public By profile_Update_mesg=By.xpath("//p[contains(text(),'user updated sucessfully')]");
	
	//passwrd_section
	public By passwrd_section_title=By.xpath("//h5[contains(text(),'Password')]");
	public By new_pswd_label=By.xpath("//label[contains(text(),'New Password')]");
	public By new_pswd=By.xpath("//input[@id='password']");
	public By cnfrm_pswd_label=By.xpath("//label[contains(text(),'Confirm Password')]");
	
	
	public By cnfrm_pswd=By.xpath("//input[@id='confirmPassword']");
	public By Save_button=By.xpath("//button[contains(text(),'Save')]");
	
	//login screen
	public By login_page_title=By.xpath("//h1[contains(text(),'Sign In')]");
	
	public By label_for_wrong_pswrd=By.xpath("//p[contains(text(),'Invalid Username or Password!')]");
	public By login_button=By.xpath("//button[contains(text(),'Log in')]");
	
	public By Dashboard_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	
	public By Web_Application_menu=By.xpath("//span[contains(text(),'Web Application')]");
	
	public By profile_menu=By.xpath("(//i[@class='fa fa-user'])[5]");	
	
	//mandatory
	    public By first_name_mandatory_element=By.xpath("//small[contains(text(),'First Name is required.')]");
	    public By last_name_mandatory_element=By.xpath("//small[contains(text(),'Last Name is required.')]");
	    public By state_mandatory_element=By.xpath("//small[contains(text(),'State is required.')]");
	    public By city_mandatory_element=By.xpath("//small[contains(text(),'City is required.')]");
	    public By zipcode_mandatory_element=By.xpath("//small[contains(text(),'Zipcode is required.')]");
	  //small[contains(text(),'Birth Date is required.')]
	    public By birth_date_mandatory_element=By.xpath("//small[contains(text(),'Birth Date is required.')]");
	    

}
