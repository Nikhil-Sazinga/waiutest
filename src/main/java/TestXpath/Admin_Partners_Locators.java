package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Partners_Locators extends Testbase2{
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Partners_menu=By.xpath("//span[contains(text(),'Partners')]");
	public By Partners_pege_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By Add_Partner_button=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-partner[1]/div[1]/div[1]/a[1]");
	public By Add_Partner_icon=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-partner[1]/div[1]/div[1]/a[1]/i[1]");
    public By Edit_partner=By.xpath("//tbody/tr[1]/td[8]/span[1]/i[1]");
    
    //Viiew partner field
    public By View_partner=By.xpath("//tbody/tr[1]/td[8]/span[2]/i[1]");
    public By back_to_list=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-partner[1]/div[1]/a[1]");
    public By View_partner_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
    public By Partner_type_field=By.xpath("//select[@id='typeId']");
    public By Back_to_list=By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/app-admin[1]/app-add-partner[1]/div[1]/a[1]");

}
