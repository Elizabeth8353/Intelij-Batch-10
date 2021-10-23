package com.syntax.class27.task1;

public class Tester {
    public static void main(String[] args) {
        Webdriver webdriver=new ChromeDriver();
        webdriver.openBrowser();
        webdriver.findElement();
        webdriver.maximizeWindow();
        webdriver.closeBrowser();
    }
}
