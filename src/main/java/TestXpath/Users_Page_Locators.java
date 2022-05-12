package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Users_Page_Locators extends Testbase2{
	
	
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Users_menu=By.xpath("//span[contains(text(),'Users')]");
	public By Users_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Roles_field_label_text=By.xpath("//label[contains(text(),'Roles')]");
	public By Roles_field=By.id("filter");
	
	public By Search_field=By.cssSelector("input[placeholder='Search Keyword']");
	public By Search_button=By.xpath("//button[contains(text(),'Search')]");
	
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	public By Add_Users_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-user[1]/div[1]/div[5]/a[1]");
	public By Add_Users_Icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-user[1]/div[1]/div[5]/a[1]/i[1]");
	
	public By pagination_element=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-user[1]/div[2]/div[1]/app-grid[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/p-dropdown[1]");
	public By table_records_edit_icon=By.xpath("//tbody/tr[1]/td[8]");
	public By No_Data_found_element=By.xpath("//td[contains(text(),'No data found.')]");
	 
	public By User_profile_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Back_To_List=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-profile[1]/div[1]/a[1]");
	
	public By Edit_user_icon=By.xpath("//tbody/tr[1]/td[8]/span[1]/i[1]");
	//public By Back_To_List=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-profile[1]/div[1]/a[1]");
    
	
	//Add user
	public By User_Name=By.xpath("//input[@id='userName']");
	public By First_Name=By.xpath("//input[@id='firstName']");
	public By Last_Name=By.xpath("//input[@id='lastName']");
	public By Email=By.xpath("//input[@id='email']");
	public By Phone_Number=By.xpath("//input[@id='phoneNumber']");
	public By Role=By.xpath("//select[@id='roleId']");
	public By State=By.xpath("//select[@id='state']");
	
	public By City=By.xpath("//select[@id='city']");
	public By Zipcode=By.xpath("//input[@id='zipCode']");
	public By Date=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-profile[1]/div[2]/div[1]/form[1]/div[10]/div[2]/input[1]");				
	public By Save=By.xpath("//button[contains(text(),'Save')]");
	
	//Update user
	public By Update_user=By.xpath("//button[contains(text(),'Update')]");
	
	public By first_row_user_name=By.xpath("//tbody/tr[1]/td[2]/span[1]");
	

}
