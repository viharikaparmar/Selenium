package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {
	
	@Test
	public void radiotest() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		System.out.println(System.getProperty("user.dir"));
		Properties p1 = new Properties();
		FileInputStream f1 = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\config.properties");
		p1.load(f1);
		
		
		System.out.println(p1.get("username"));
		System.out.println(p1.get("password"));
		
 		/*WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAjw-ITqBRB7EiwAZ1c5U42gLkRt070VDrp0J1oYIHhZe4L39ox_5xlZB95ik9-4tYaI7SpcAxoC3skQAvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Responsive|274319138533&s_kwcid=AL!1631!3!274319138533!e!!g!!make%20my%20trip&ef_id=CjwKCAjw-ITqBRB7EiwAZ1c5U42gLkRt070VDrp0J1oYIHhZe4L39ox_5xlZB95ik9-4tYaI7SpcAxoC3skQAvD_BwE:G:s");
		
		By id = By.id("i1");
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(0).getAttribute("src"));
		}
		
		driver.close();*/
		
	}
	
    @Test(groups="Smoke")
    public void vtest() {
    	System.out.println("This is for my test");
    }

}
