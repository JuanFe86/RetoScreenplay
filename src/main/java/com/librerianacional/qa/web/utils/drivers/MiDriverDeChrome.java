package com.librerianacional.qa.web.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiDriverDeChrome {

    private static WebDriver chromeDriver;

    public static MiDriverDeChrome web(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        return new MiDriverDeChrome();
    }

    public WebDriver enLaUrl(String url){
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }
}
