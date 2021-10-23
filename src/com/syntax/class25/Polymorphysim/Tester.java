package com.syntax.class25.Polymorphysim;

public class Tester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new GoogleChrome(),new FireFox(),new IE(),new Safari()};
        for(WebDriver driver:webDrivers){
            testOnAllBrowsers(driver);//for each iteration method in class being called
            // for each child class
        }
    }

    static void testOnAllBrowsers(WebDriver webDriver){ //WebDriver webDriver=new GoogleChrome();
        webDriver.openBrowser();// webDriver =driver wil
        webDriver.loadWebsite("www.google.com");
        webDriver.Test1();
        webDriver.Test2();
        webDriver.TestFileDownload();
        webDriver.closeBrowser();
    }
}
