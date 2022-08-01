package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testbase2 {
	
	
	protected WebDriver dr;
    public String url="https://portal-dev.waiu.co.in/";
    public String printOpTextFile="No"; 
    
    
    /*
    @BeforeSuite
	public void printOutputTextFile() throws IOException, InterruptedException
	{
		
		Runtime.getRuntime().exec("Drivers\\chromedriver-terminate.bat");
		Thread.sleep(5000);
		

		if (printOpTextFile.equalsIgnoreCase("No")) {
			
			PrintStream out = new PrintStream(new FileOutputStream("output.txt", true), false);
			System.setOut(out);

			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

			
			System.out.println("*************");
		}
		}
		*/
		
    
    @BeforeTest
    public void launchbrowser() throws InterruptedException{
   	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium apps\\chromedriver.exe");
   	 dr=new ChromeDriver();
   	 dr.manage().window().maximize();
   	 dr.get(url);
    }
    
    
    @AfterTest
    public void teardown() {
   	// dr.close();
    }


}
