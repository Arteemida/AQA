package Homeworks.Lesson_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        printTitle();
        //driver.quit();
    }

    public static void printTitle() {
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
    }
}
