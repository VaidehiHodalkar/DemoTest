package appium;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.net.MalformedURLException;
import java.net.URL;


public class appium {
	ExtentReports extent;
	
	@Test
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("USER.DIR")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Result");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
		
		extent.createTest("Intial Demo");
        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "D:\\course download\\chromedriver_win32\\chromedriver-win64\\chromedriver.exe");  
       
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch Website  
     driver.navigate().to("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
     System.out.println(driver.getTitle());
     extent.flush();
	}
@Test
public void demo()
{

System.out.println("Day3");
}


@Test
public void demo1()
{

System.out.println("TDay3");
}

@Test
public void demo13()
{

System.out.println("included");
}


	}
	/*public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


public static void openCalculator() throws Exception 



{
	
	//String URL = "https://127.0.0.1:4723/wd/hub";
	
	 DesiredCapabilities cap  = new DesiredCapabilities();  
	    cap.setCapability("deviceName","vivo T2 5G");
	    cap.setCapability("udid","10BD5329PJ0004K");  
	    cap.setCapability("platformName","Android"); 
	    cap.setCapability("platformVersion","13");
	    cap.setCapability("appPackage","com.vivo.calculator");
	    cap.setCapability("appActivity","com.vivo.calculator.Calculator");
	/*DesiredCapabilities cap  = new DesiredCapabilities();  
    cap.setCapability("deviceName","Redmi 9");
    cap.setCapability("udid","SKXKN78TNFJBEIEE");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    cap.setCapability("platformName","Android"); 
    cap.setCapability("platformVersion","10 QP1A.190711.020");
    cap.setCapability("appPackage","com.miui.calculator");
    cap.setCapability("appActivity","com.miui.calculator.CalculatorActivity");
    
   
    

	    
	                                                                                                                               //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    

driver=new AndroidDriver(new URL("http:/127.0.0.1:4723/wd/hub"),cap);
    
    
  


	    System.out.println("Application strated");
	   // driver.findElement(By.name("btnK")).click(); 
		}*/
	


