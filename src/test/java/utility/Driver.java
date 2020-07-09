package utility;

public enum Driver {

    Chrome("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver.exe"),
    Firefox("webdriver.firefox.driver","./src/test/resources/Drivers/geckodriver.exe"),
    InternetExplorer("webdriver.ie.driver","./src/test/resources/Drivers/IEDriverServer.exe"),
    Edge("webdriver.edge.driver","./src/test/resources/Drivers/msedgedriver.exe"),
    ;

    private String browserName;
    private String driverPath;
    Driver(String name, String path) {
        this.browserName=name;
        this.driverPath=path;
    }
    public String getBrowserName()
    {
        return browserName;
    }
    public String getDriverPath()
    {
        return driverPath;
    }
}
