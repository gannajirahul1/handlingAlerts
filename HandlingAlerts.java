package testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//Handling alerts
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//simple alert :which will get pop up notification and when you accept it will close
		/*
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		*/
		//getting text from alert
		/*
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Alert txt=driver.switchTo().alert();
		System.out.println(txt.getText());
		txt.accept();
		*/
		
		
	     
		//confirmation alert box :In this we can accept or decline(close)
		/*
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();//accepting ok button
		//driver.switchTo().alert().dismiss();//pressing the cancel button
		 */
		//getting text from the confirmation box
		/*
		Alert conAlert=driver.switchTo().alert();
		System.out.println(conAlert.getText());
		//conAlert.accept();
		//Alert.dismiss();
		*/
		
		//promt alert:In this we should enter some values and click on accept then only it will close
		/*
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Thread.sleep(2000);
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("rahul welcome");
		System.out.println(prompt.getText());
		prompt.accept();
		driver.quit();
		 */
}

}