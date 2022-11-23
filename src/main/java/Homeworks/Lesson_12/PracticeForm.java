package Homeworks.Lesson_12;

import Homeworks.Drivers.DriversSet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PracticeForm extends DriversSet {

    public static void main(String[] args) {
        DriversSet.createDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        formFilling();
        DriversSet.closeDriver();
    }

    public static void formFilling() {
        By subject = By.id("subjectsInput");
        driver.findElement(By.id("firstName")).sendKeys("Diana");
        driver.findElement(By.id("lastName")).sendKeys("Ofitserova");
        driver.findElement(By.id("userEmail")).sendKeys("diana.ofitserova@gmail.com");
        driver.findElement(By.id("userNumber")).sendKeys("0676885588");
        driver.findElement(subject).sendKeys("Economics");
        driver.findElement(subject).sendKeys(Keys.ENTER);
    }
}
