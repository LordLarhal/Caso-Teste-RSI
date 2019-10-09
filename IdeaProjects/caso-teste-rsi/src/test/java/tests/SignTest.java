package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit() {
        //ChromeDriverManager.getInstance().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\Ampacattu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("htpp://www.juliodelima.com.br/taskit");

        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("signinbox")).findElement(By.name("Login")).sendKeys("TesteRSI");
        navegador.findElement(By.id("signinbox")).findElement(By.name("Password")).sendKeys("123");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        assertEquals( "Hi, Luiz", saudacao);

        navegador.quit();
    }
}
