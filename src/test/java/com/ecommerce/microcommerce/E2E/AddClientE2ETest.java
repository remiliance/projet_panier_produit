package com.ecommerce.microcommerce.E2E;

import com.ecommerce.microcommerce.web.controller.ClientController;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith({SpringExtension.class})
@SpringBootTest(
        classes = ClientController.class,
                webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AddClientE2ETest {

 /*   @LocalServerPort
    private Integer port;

    private WebDriver webDriver=null;
    private String baseUrl;

    @BeforeAll
    public static void setUpFirefoxDriver() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    public void setUpWebDriver() {
        webDriver = new ChromeDriver();
        baseUrl = "http://localhost:" + port + "/addClient";
    }
    @AfterEach
    public void quitWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    @DisplayName("Test ajout client E2E")
    public void AddClientE2E() {
        // GIVEN
        webDriver.get(baseUrl);
        final WebElement FieldNom = webDriver.findElement(By.id("nom"));
        final WebElement SubmitEnvoyer = webDriver.findElement(By.id("submit"));
        // WHEN
        FieldNom.sendKeys("Liance");
        SubmitEnvoyer.click();
        // THEN
        final WebDriverWait waiter = new WebDriverWait(webDriver, 5);
        final WebElement solutionElement = waiter.until(
                ExpectedConditions.presenceOfElementLocated(By.id("solution")));
        final String solution = solutionElement.getText();
      assertThat(solution).isEqualTo("Liance");

    }*/
}
