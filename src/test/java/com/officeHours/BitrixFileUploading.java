package com.officeHours;

import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class BitrixFileUploading {

    @Test
    public void uploadFile(){
        WebDriver driver = Driver.getDriver(ConfigurationReader.getProperty("browser"));
        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr27@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser", Keys.ENTER);

        driver.findElement(By.id("microoPostFormLHE_blogPostForm_inner")).click();

        driver.findElement(By.id("bx-b-uploadfile-blogPostForm")).click();

        String path=System.getProperty("user.dir")+"/VytrackTestUsers.xlsx";
        driver.findElement(By.name("bxu_files[]")).sendKeys(path);

        driver.close();

    }
}
