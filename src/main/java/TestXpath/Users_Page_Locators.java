package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Users_Page_Locators extends Testbase2{
	
	public String first_name_update="Amit";
	//Add user
	public String input_for_invalid_email="aa@";
	//public int inputfor_invalid_phoneNo_ninedigits=123456789;
	public int less_than_5_digit_zipcode=12345;
	public int more_than_6_digit_zipcode=1234567;
	
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Users_menu=By.xpath("//span[contains(text(),'Users')]");
	public By Users_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Roles_field_label_text=By.xpath("//label[contains(text(),'Roles')]");
	public By Roles_field=By.id("filter");
	public By select_columnname_field=By.xpath("//select[@id='searchColumn']");
	public By user_name_search_input_from_table=By.xpath("//tbody/tr[1]/td[2]");
	public By user_name_result_after_apply_search=By.xpath("//tbody/tr[1]/td[2]");
	
	public By first_name_search_input_from_table=By.xpath("//tbody/tr[2]/td[3]");
	public By first_name_result_after_apply_search=By.xpath("//tbody/tr[1]/td[3]");
	
	public By last_name_search_input_from_table=By.xpath("//tbody/tr[2]/td[4]");
	public By last_name_result_after_apply_search=By.xpath("//tbody/tr[1]/td[4]");
	
	public By mobile_no_search_input_from_table=By.xpath("//tbody/tr[2]/td[5]");
	public By mobile_no_result_after_apply_search=By.xpath("//tbody/tr[1]/td[5]");
	
	public By email_search_input_from_table=By.xpath("//tbody/tr[2]/td[6]");
	public By email_result_after_apply_search=By.xpath("//tbody/tr[1]/td[6]");
	
	public By Search_field=By.xpath("//input[@placeholder='Search Keyword']");
	public By Search_button=By.xpath("//button[contains(text(),'Search')]");
	
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	public By no_data_found_mesg_element=By.xpath("//td[contains(text(),'No data found.')]");
	public By Add_Users_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-user[1]/div[1]/div[6]/a[1]");
	public By Add_Users_Icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-user[1]/div[1]/div[6]/a[1]/i[1]");
	
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
	
	public By username_required_msg_element=By.xpath("//small[contains(text(),'Username is required.')]");
	public By firstname_required_msg_element=By.xpath("//small[contains(text(),'First Name is required.')]");
	public By lastname_required_msg_element=By.xpath("//small[contains(text(),'Last Name is required.')]");
	public By email_required_msg_element=By.xpath("//small[contains(text(),'Email is required.')]");
	public By phonenumber_required_msg_element=By.xpath("//small[contains(text(),'Phone Number is required.')]");
	public By role_required_msg_element=By.xpath("//small[contains(text(),'Role is required.')]");
	public By state_required_msg_element=By.xpath("//small[contains(text(),'State is required.')]");
	public By city_required_msg_element=By.xpath("//small[contains(text(),'City is required.')]");
	public By zipcode_required_msg_element=By.xpath("//small[contains(text(),'Zipcode is required.')]");
	public By birthdate_required_msg_element=By.xpath("//small[contains(text(),'Birth Date is required.')]");
	
	public By error_msg_for_invalid_email_msg_element=By.xpath("//small[contains(text(),'Please enter valid email address')]");
	public By error_msg_for_invalid_phoneNo_msg_element=By.xpath("//small[contains(text(),'Please enter 10 digit Phone Number.')]");
	public By error_msg_for_invalid_zipcode_msg_element=By.xpath("//small[contains(text(),'Please enter 6 digit Zipcode.')]");
	
	
	//Update user
	public By Update_user=By.xpath("//button[contains(text(),'Update')]");
	
	public By first_row_user_name=By.xpath("//tbody/tr[1]/td[2]/span[1]");
	
	public By role_column_result=By.xpath("//tbody/tr[1]/td[7]");

}
