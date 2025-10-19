package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PageOpenedTests extends BaseTest {

    @Test
    public void pageIsOpenedTest() {
        webDriver.get(getPageUrl("/food"));
        assertFalse(webDriver.findElements(By.xpath(".//a[text()='QualIT']")).isEmpty());
    }
}