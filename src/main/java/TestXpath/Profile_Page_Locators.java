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
	
	
	public By Profile_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Add_Partner_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-partner[1]/div[1]/div[1]/a[1]");
	public By Add_Partner_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-partner[1]/div[1]/div[1]/a[1]/i[1]");
    public By Edit_partner=By.xpath("//tbody/tr[1]/td[8]/span[1]/i[1]");
    

}
