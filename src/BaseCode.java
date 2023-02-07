import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCode {

	
	WebDriver driver = new ChromeDriver();
	
	WebElement login = driver.findElement(By.id("loginbtn"));
	WebElement loginPass = driver.findElement(By.id("passwrd"));
	
	public void login() {
		
		login.click();
		login.sendKeys("P@gmail.com");
		loginPass.click();
		loginPass.sendKeys("1234123");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	}
}





