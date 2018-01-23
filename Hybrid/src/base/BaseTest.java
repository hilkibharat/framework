 package base;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import config.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import datatable.Xls_Reader;
import static org.testng.Assert.*;
public class BaseTest extends OR 
{
		
	public static Xls_Reader datatable_suite1=null;
	protected static BaseTest page;
	public BaseTest(WebDriver driver)
	{
		super(driver);
	}
	
	public static void initialize() throws Exception
	{
		datatable_suite1=new Xls_Reader(System.getProperty("user.dir")+"//src//config//TestData.xlsx");
		//datatable_suite1=new Xls_Reader("F:\\Selenium_Scripts_Nov14\\DataDrivenframework\\src\\config\\TestData.xlsx");
	}
	//Login
	public void fillLogin(String uname, String upwd)
	{
		username.sendKeys(uname);
		password.sendKeys(upwd);
		login.click();
	}
	public void fundTransfer( String selpay, String amt, String trremarks, String tranpass )
	{
	
		Select dd=new Select(selectpayydd);
		dd.selectByVisibleText(selpay);
		transamt.sendKeys(amt);
		tranremarks.sendKeys(trremarks);
		transpass.sendKeys(tranpass);
		submitbtn.click();
		}
	
	public void moveTransfer()
	{
		fundtranser.click();
		makepayment.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
	public void openURL(String url)
	{
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
		driver.get(url);
	}
			
	
	public void gMailLogin(String guname, String gpass)
	{
		searchEmail.sendKeys(guname);
		searchPassword.sendKeys(gpass);
		searcSignhButton.click();
		
	}
	
	public void designmodoreg(String runame, String rfname, String rlname, String remail, String rpass, String rcpass)
	{
		rusername.sendKeys(runame);
		rfirstname.sendKeys(rfname);
		rlastname.sendKeys(rlname);
		regemail.sendKeys(remail);
		rpassword.sendKeys(rpass);
		rcpassword.sendKeys(rcpass);
		register.click();
		
	}
	public void gamilLogout()
	{
		gmaillogout.click();
	}

		public String getTitle()
		{
		return driver.getTitle();
		}

		public void searchFor(String searchTerm) {
		searchField.sendKeys(searchTerm);
		searchButton.click();
		}

		public void typeSearchTerm(String searchTerm) {
		searchField.sendKeys(searchTerm);
		}

		public void clickOnSearch() {
		searchButton.click();
		}
	
	public void stopDriver()
	{
		
		driver.quit();
	}
	
		
	public static void takeScreenShots(String fileName) throws IOException{
		
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+".png"));
	}
	public String randNumGen(int i) 
	{
		return RandomStringUtils.randomNumeric(i);
	}

	public String randNameGen(int i) 
	{
		return RandomStringUtils.randomAlphabetic(i).toLowerCase();
	}

	public String randUserGen() 
	{
		Date d = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmm");
		String strUser = ft.format(d);
		return strUser;
	}
		
	public void clickSalt()
	{
		icon_salt.click();
	}
	public void verifyCompanyIcon()
	{
		assertTrue(icon_company.isDisplayed());
	}
	public void clickModules()
	{
		icon_modules.click();
	}
	public void clickOnward()
	{
		icon_onward.click();
	}
	public void verifyElementPresent(WebElement e)
	{
		assertTrue(e.isDisplayed());
	}
	
	public void selectDropdown(WebElement xpath, String dropdownValue )
	{
		Select dd=new Select(xpath);
		dd.selectByVisibleText(dropdownValue);
	}
	
	//registerationform etnering
	
	//Password,Date_DOB,Month_DOB,Year_DOB,Afname,Alname,Acompany,A_address1,A_address2,Acity,Astate,Azip,Acountry,AAI,
	//Ahphone,Amphone,Aalias
	public void automationseleniumRegister(String email,String fn, String ln, String cemail, String Password, String Date_DOB, String Month_DOB, String Year_DOB, String Afname, String Alname, String Acompany, String A_address1, String A_address2, String Acity, String Astate, String Azip, String Acountry, String AAI, String Ahphone, String Amphone, String Aalias)
	{
		bsignInBtn.click();
		System.out.println("Clickedon singn in button");
		bemailAddress.sendKeys(email);
		System.out.println("Entered email id");

		bsubmitCreate.click();
		System.out.println("Clickedon Create button");

		//registerationform etnering 
		mrtitleradio.click();
		System.out.println("Clickedon Salutation button");

		cfirstname.sendKeys(fn);
		System.out.println("Entered FirstName");
		clastname.sendKeys(ln);
		System.out.println("Entered LastName");
		cemailaddress.clear();
		System.out.println("Clickedon singn in button");
		cemailaddress.sendKeys(cemail);
		System.out.println("Re Entered Email address");
		password1.sendKeys(Password);
		System.out.println("Entered Password");
		selectDropdown(date_DOB,Date_DOB);
		System.out.println("Selected Date");
		selectDropdown(month_DOB, Month_DOB);
		System.out.println("Selected Month");
		selectDropdown(year_DOB, Year_DOB);
		System.out.println("Selected Year");
		NewsletterButton.click();
		System.out.println("Clickedon News Letter button");
		Sploffer.click();
		System.out.println("Clickedon Special offer button");
		afname.sendKeys(Afname);
		System.out.println("Entered First Name");
		alname.sendKeys(Alname);
		System.out.println("Entered Last Name");
		acompany.sendKeys(Acompany);
		System.out.println("Filled Company Name");
		a_address1.sendKeys(A_address1);
		System.out.println("Filled Address first line");
		a_address2.sendKeys(A_address2);
		System.out.println("Filled Address second line");
		acity.sendKeys(Acity);
		System.out.println("Filled City");
		astate.sendKeys(Astate);
		System.out.println("Filled State");
		azip.sendKeys(Azip);
		System.out.println("Filled Zip Code");
		acountry.sendKeys(Acountry);
		System.out.println("Filled Country");
		aAI.sendKeys(AAI);
		System.out.println("Filled Additional Information");
		ahphone.sendKeys(Ahphone);
		System.out.println("Filled Home Phone Number");
		amphone.sendKeys(Amphone);
		System.out.println("Filled Mobile Phone number");
		aalias.sendKeys(Aalias);
		System.out.println("Filled Alias");
		
		
	}
	
}
