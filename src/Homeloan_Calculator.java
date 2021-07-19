import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homeloan_Calculator {
	@Test
public void homeLoan() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbkon\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("80000");
	driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("10000");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("500");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("100");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("10000");
	driver.findElement(By.id("btnBorrowCalculater")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/button/span")).click();
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("1");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("0");
	driver.findElement(By.id("btnBorrowCalculater")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/button/span")).click();
	}
}