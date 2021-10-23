package com.syntax.class27.task1;

public interface Webdriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Google chrome window");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the gloogle Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Find Element in Google Chrome");
    }
}
class FirefoxDriver implements Webdriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in Firefox");
    }
}