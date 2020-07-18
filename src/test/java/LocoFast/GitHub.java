package LocoFast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\goeshu01\\workspace\\Challenge\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://github.com/");
		 driver.findElement(By.cssSelector(".HeaderMenu-link.no-underline.mr-3")).click();
		 driver.findElement(By.id("login_field")).sendKeys("shubhamgoel9871@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("black@2020");
		 driver.findElement(By.cssSelector(".btn.btn-primary.btn-block")).click();
		 driver.findElement(By.xpath("//a[@data-hydro-click-hmac='df0822fef580426203554bb8ce2d7cbd90d3b6821ae196a96881d4e1b8c0f03a']")).click();
		 driver.findElement(By.id("repository_name")).sendKeys("ShubhamRepo 18");
		 driver.findElement(By.id("repository_description")).sendKeys("Creating Repository for challenge 1");
		 driver.findElement(By.cssSelector(".btn.btn-primary.first-in-line")).click();
		 driver.findElement(By.xpath("//a[contains(@data-tab-item,'issues')]")).click();
		 driver.findElement(By.cssSelector(".d-none.d-md-block")).click();
		 driver.findElement(By.id("issue_title")).sendKeys("This is my First Issue");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 driver.findElement(By.xpath("//a[contains(@data-ga-click,'new issue,')]")).click();
		 driver.findElement(By.id("issue_title")).sendKeys("This is the reference of First Issue");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 driver.findElement(By.id("new_comment_field")).sendKeys("Adding Comments on Created Issue");
		 driver.findElement(By.xpath("//div[@class='bg-gray-light ml-1']/button")).click();
		 driver.findElement(By.xpath("//div[@class='timeline-comment-actions flex-shrink-0']/details[1]")).click();
		 driver.findElement(By.xpath("//g-emoji[@alias='+1']")).click();

		 driver.findElement(By.xpath("//div[@class='timeline-comment-actions flex-shrink-0']/details[2]")).click();
		Thread.sleep(2000);
		 // driver.findElement(By.cssSelector(".octicon.octicon-kebab-horizontal,[aria-label='Show options']")).click();
		 //driver.findElement(By.xpath("//summary[contains(@class,'action link-gray')]")).click();
		 driver.findElement(By.xpath("//clipboard-copy[contains(@for,'-permalink') and @class='dropdown-item btn-link']")).click();
		driver.findElement(By.xpath("//a[contains(@data-tab-item,'issue')]")).click();
		driver.findElement(By.id("issue_1_link")).click();
		driver.findElement(By.id("new_comment_field")).sendKeys(Keys.CONTROL,"v");
		 driver.findElement(By.xpath("//div[@class='bg-gray-light ml-1']/button")).click();
		 driver.findElement(By.cssSelector(".issue-link.js-issue-link")).click();
		 driver.findElement(By.xpath("//a[@data-tab-item='settings-tab']")).click();
		 driver.findElement(By.xpath("//div[@class='Box Box--danger']/ul/li[4]/details/summary")).click();
		driver.findElement(By.xpath("//input[@aria-label='Type in the name of the repository to confirm that you want to delete this repository.']")).
		sendKeys("ShubhamGoel9871/ShubhamRepo-18");
		 driver.findElement(By.xpath("//button[text()='I understand the consequences, delete this repository']")).click();
	}
	 
}
