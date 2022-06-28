package TestXpath;

import org.openqa.selenium.By;

import Utilities.Testbase2;

public class Admin_Feedback_Locators extends Testbase2{
	
	public By Username_field=By.xpath("//input[@id='userName']");
	public By Password_field=By.xpath("//input[@id='password']");
	public By LogIn_Button=By.xpath("//button[contains(text(),'Log in')]");
	//
	public By Dashboard_menu=By.xpath("//span[contains(text(),'Dashboard')]");
	public By Admin_menu=By.xpath("//span[contains(text(),'Admin')]");
	public By Feedback_menu=By.xpath("//span[contains(text(),'Feedback')]");
	public By Feedback_page_header=By.xpath("//app-header/nav[1]/a[1]/h5[1]");
	public By select_status=By.xpath("//select[@id='filter']");
	public By Search_field=By.cssSelector("input[placeholder='Search by Keyword']");
	
	public By Search_button=By.xpath("//button[contains(text(),'Search')]");
	public By Clear_button=By.xpath("//button[contains(text(),'Clear')]");
	
	public By username_from_table=By.xpath("//tbody/tr[2]/td[3]");
	
	public By reply_icon=By.xpath("//tbody/tr[1]/td[11]/span[1]/i[1]");
		
	//reply page
	public By replyDescription=By.xpath("//textarea[@id='replyDescription']");
    public By Back_to_list=By.xpath("//a[@class='btn btn-secondary btn-sm']");
 
	public By customerName=By.xpath("//input[@id='customerName']");
	

	//reply form
	public By clear_button=By.xpath("//button[contains(text(),'Clear')]");
	public By sendreply_button=By.xpath("//button[contains(text(),'Send Reply')]");
	
	//input[@id='customerName']
	public By customer_name_field=By.xpath("//input[@id='customerName']");
	
}
