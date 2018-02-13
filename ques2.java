package questions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Users/Guest/Desktop/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Guest/workspace/SeleniumTest/src/questions/question2.html");

		List<WebElement> item1=(List<WebElement>) driver.findElements(By.cssSelector("span[class='title ng-binding']"));
		List<WebElement> item2=(List<WebElement>) driver.findElements(By.cssSelector("span[class='description ng-binding']"));

		 Map maps = new LinkedHashMap();//use linked hash map as it preserves the insertion order
		 System.out.println("3rd and 5th elements");
		 System.out.println();
		 for(int i=0;i<item1.size();i++){

			 //store the name and price as key value pair in map
			 if(i == 2 || i == 4){
				 System.out.println(item1.get(i).getText());
			 }
			 maps.put(item1.get(i).getText(), item2.get(i).getText());
		    }
		 System.out.println();
		 System.out.println("All elements from map");
		 System.out.println();
		 Set<String> keys = maps.keySet();
		 for (String key : keys) {
			System.out.println(key + " " + maps.get(key));
		}
	}
}
