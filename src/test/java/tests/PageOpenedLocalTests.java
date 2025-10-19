package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PageOpenedLocalTests {

    private static final String PAGE_URL = "http://localhost:8080/food";

    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(3, SECONDS));
    }

    @Test
    public void pageIsOpenedTest() {
        webDriver.get(PAGE_URL);

        assertFalse(webDriver.findElements(By.xpath(".//a[text()='QualIT']")).isEmpty());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}