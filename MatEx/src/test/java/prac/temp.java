package prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class temp {

	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println(driver.getTitle().toString().trim());
		
	}

}
