package JavaSlm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingLanguage {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace"
			+ "\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement UserLogin = driver.findElement(By.id("email"));
	UserLogin.sendKeys("YokeshRaj");
	
	WebElement txtBox = driver.findElement(By.id("pass"));
	txtBox.sendKeys("1234567");
	
	WebElement LoginBtn = driver.findElement(By.name("login"));
	LoginBtn.click();
		
	}
}
 