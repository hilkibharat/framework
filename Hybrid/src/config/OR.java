package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class OR  {
	
	protected static WebDriver driver;
	public OR(WebDriver driver) {
		this.driver = driver;
		}
	@FindBy(name="q")
	protected WebElement searchField;

	@FindBy(name="btnG")
	protected WebElement searchButton;
	
	//Login
	/*@FindBy(id="loginusername") protected WebElement username;
	@FindBy(id="loginpassword") protected WebElement password;
	@FindBy(id="loginformsubmit") protected WebElement login;
	@FindBy(xpath="//span[@id='logout']/a/img") protected WebElement logout;*/
	@FindBy(className="salt") protected WebElement icon_salt;
	@FindBy(className="icon company") protected WebElement icon_company;
	@FindBy(className="setting") protected WebElement icon_modules;
	@FindBy(className="onward-image quick-navigation-circle") protected WebElement icon_onward;
	@FindBy(className="pagegrid-home")
	public static WebElement icon_home;
	//Bank Login
	@FindBy(name="userName") protected WebElement username;
	@FindBy(name="password") protected WebElement password;
	@FindBy(xpath="//input[@value='Login']") protected WebElement login;
	@FindBy(linkText="Log Out") protected WebElement logout;
	@FindBy(xpath="//ul[@id='home']/li/a/h4") protected WebElement fundtranser;
	@FindBy(linkText="Make a Payment") protected WebElement makepayment;
	@FindBy(name="payeeName") protected WebElement selectpayydd;
	@FindBy(name="transactionAmount") protected WebElement transamt;
	@FindBy(name="transactionRemarks") protected WebElement tranremarks;
	@FindBy(name="transactionPassword") protected WebElement transpass;
	@FindBy(name="//input[@value='Submit']")protected WebElement submitbtn;
	
	//gmail Login
	@FindBy(id="Email") protected WebElement searchEmail;
	@FindBy(id="Passwd") protected WebElement searchPassword;
	@FindBy(id="signIn") protected WebElement searcSignhButton;
	@FindBy(xpath="//div/a/span") protected WebElement gmaillogout;
	
	
	//designmodo Regisratino
	@FindBy(id="reg_username") protected WebElement rusername;
	@FindBy(id="reg_firstname") protected WebElement rfirstname;
	@FindBy(id="reg_lastname") protected WebElement rlastname;
	@FindBy(id="reg_email") protected WebElement regemail;
	@FindBy(id="reg_password") protected WebElement rpassword;
	@FindBy(id="reg_password2")protected WebElement rcpassword;
	@FindBy(id="register") protected WebElement register;
	
	
	//automation selenium pracite
	@FindBy(className="login") protected WebElement bsignInBtn;
	@FindBy(id="email_create") protected WebElement bemailAddress;
	@FindBy(id="SubmitCreate") protected WebElement bsubmitCreate;
	@FindBy(id="customer_firstname") protected WebElement cfirstname;
	@FindBy(id="customer_lastname") protected WebElement clastname;
	@FindBy(id="email") protected WebElement cemailaddress;
	@FindBy(id="id_gender1") protected WebElement mrtitleradio;
	
		
}