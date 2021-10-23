package com.syntax.class25.Polymorphysim;

public class WebDriver {
    void openBrowser(){
        System.out.println("Opening Browser ");
    }
    void loadWebsite(String website){
        System.out.println("Load the website inside the browser"+website);
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login");
    }
   void Test2(){
       System.out.println("Click on buy button and make sure you can place order ");
   }
   void TestFileDownload(){
       System.out.println("Testing file DOwnload ");
   }
   void closeBrowser(){
       System.out.println("close browser");
   }
}
class GoogleChrome extends WebDriver{
    void openBrowser(){
        System.out.println("Opening Browser in Google Chrome");
    }
    void loadWebsite(String website){
        System.out.println("Load the website inside the browser using Google Chrome"+website);
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in Google Chrome");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in Google Chrome");
    }
    void TestFileDownload(){
        System.out.println("Testing file Download in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("close browser in Google Chrome");
    }
}
class FireFox extends WebDriver{
    void openBrowser(){
        System.out.println("Opening Browser in FireFox");
    }
    void loadWebsite(String website){
        System.out.println("Load the website inside the browser using FireFox"+website);
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in FireFox");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in FireFox");
    }
    void TestFileDownload(){
        System.out.println("Testing file Download in FireFox");
    }
    void closeBrowser(){
        System.out.println("close browser in FireFox");
    }
}
class Safari extends WebDriver{
    void openBrowser(){
        System.out.println("Opening Browser in Safari");
    }
    void loadWebsite(String website){
        System.out.println("Load the website inside the browser using Safari"+website);
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in Safari");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in Safari");
    }
    void TestFileDownload(){
        System.out.println("Testing file Download in Safari");
    }
    void closeBrowser(){
        System.out.println("close browser in Safari");
    }
}
class IE extends WebDriver{
    void openBrowser(){
        System.out.println("Opening Browser in IE");
    }
    void loadWebsite(String website){
        System.out.println("Load the website inside the browser using IE"+website);
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in IE");
    }
    void Test2(){
        System.out.println("Click on buy button and make sure you can place order in IE");
    }
    void TestFileDownload(){
        System.out.println("Testing file Download in IE");
    }
    void closeBrowser(){
        System.out.println("close browser in IE");
    }
}