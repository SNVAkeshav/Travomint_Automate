package com.newautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationCapt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNVA\\Desktop\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Open the travomint URL");
        driver.get("https://www.travomint.com/");
        
        System.out.println("Maximize the currect window");
        driver.manage().window().maximize();
        
        Thread.sleep(8000);
        
        String title = driver.getTitle();
        System.out.println("The title of the website is "+title);
        
        //Click on roundTrip
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div/div/div[2]/div[1]/label[2]/span[1]")).click();
        System.out.println("Round trip selected successfully");
        
        //Click on traveller and class
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div/div[1]/div/div[1]/div")).click();
        //Add adult
        Thread.sleep(3000);
        for(int i = 2; i < 6; i++) {
        	driver.findElement(By.cssSelector("div.justify-content-between:nth-child(1) > div:nth-child(2) > div:nth-child(3) > svg:nth-child(1) > path:nth-child(1)")).click();
        }
        //Add Child
        for(int j = 1; j < 5; j++) {
        	driver.findElement(By.cssSelector("div.justify-content-between:nth-child(3) > div:nth-child(2) > div:nth-child(3) > svg:nth-child(1)")).click();
        }
        System.out.println("9 PAX selected successfully");
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div/div[1]/div[2]/div/div[6]/button/span")).click();
        //Click on search
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/section[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div/div[2]/button")).click();
        System.out.println("Round Trip flight searched successfully");
        Thread.sleep(25000);
        //Click on book now
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div[2]/div[1]/div/div/div[4]/div/button")).click();
        Thread.sleep(12000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("keshav@snva.com");
		driver.findElement(By.name("phonenumber")).sendKeys("8929659752");
		System.out.println("Contact email id and mobile number successfully entered");
		//Click on continue
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[4]/div[1]/div[2]/div/form/div[2]/input")).click();
		
		 JavascriptExecutor J1 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 
		 //Fill pax details
		 
		 driver.findElement(By.cssSelector("#\\:r18\\:")).sendKeys("Keshav");
		 driver.findElement(By.cssSelector("#\\:r1a\\:")).sendKeys("Mishra");
		 driver.findElement(By.xpath("//*[@id=\":r1b:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[3]/button[2]")).click();
		 System.out.println("Adult 1");
		 
		 JavascriptExecutor J2 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r1k\\:")).sendKeys("Sanket");
		 driver.findElement(By.cssSelector("#\\:r1m\\:")).sendKeys("Mishra");
		 driver.findElement(By.xpath("//*[@id=\":r1g:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/button[2]")).click();
		 
		 System.out.println("Adult 2");
		 
		 JavascriptExecutor J3 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r1j\\:")).sendKeys("Ambar");
		 driver.findElement(By.cssSelector("#\\:r1l\\:")).sendKeys("Singh");
		 driver.findElement(By.xpath("//*[@id=\":r1m:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/button[2]")).click();
		 System.out.println("Adult 3");
		 
		 JavascriptExecutor j4 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r1p\\:")).sendKeys("Smita");
		 driver.findElement(By.cssSelector("#\\:r1r\\:")).sendKeys("Jha");
		 driver.findElement(By.xpath("//*[@id=\":r1s:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/button[2]")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div[4]/div[2]/div[2]/div/form/ol/li[4]/div[2]/div[5]/div/div/div[3]/label/span")).click();
		 System.out.println("Adult 4");
		 
		 JavascriptExecutor j5 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r1v\\:")).sendKeys("Suyash");
		 driver.findElement(By.cssSelector("#\\:r21\\:")).sendKeys("Soni");
		 driver.findElement(By.xpath("//*[@id=\":r22:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/button[2]")).click();
		 System.out.println("Adult 5");
		 
		 JavascriptExecutor j6 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r25\\:")).sendKeys("Rohit");
		 driver.findElement(By.cssSelector("#\\:r27\\:")).sendKeys("Singh");
		 driver.findElement(By.xpath("//*[@id=\":r28:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[5]/button[3]")).click();
		 System.out.println("Child 1");
		 
		 JavascriptExecutor j7 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r2b\\:")).sendKeys("Harsh");
		 driver.findElement(By.cssSelector("#\\:r2d\\:")).sendKeys("Joshi");
		 driver.findElement(By.xpath("//*[@id=\":r2e:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[5]/button[3]")).click();
		 System.out.println("Child 2");
		 
		 JavascriptExecutor j8 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r2h\\:")).sendKeys("Om");
		 driver.findElement(By.cssSelector("#\\:r2j\\:")).sendKeys("Gupta");
		 driver.findElement(By.xpath("//*[@id=\":r2k:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[5]/button[3]")).click();
		 System.out.println("Child 3");
		 
		 JavascriptExecutor j9 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 driver.findElement(By.cssSelector("#\\:r2n\\:")).sendKeys("Umesh");
		 driver.findElement(By.cssSelector("#\\:r2p\\:")).sendKeys("Kumar");
		 driver.findElement(By.xpath("//*[@id=\":r2q:\"]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[5]/button[3]")).click();
		 System.out.println("Child 4");
		 
		 JavascriptExecutor j10 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
			
	}

}
