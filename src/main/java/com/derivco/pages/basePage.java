package com.derivco.pages;

public class basePage {

    /**
     * BasePage
     * Base page contains common pages objest and functionality
     * You should create common objects such as WebDrivers and Loggers
     * Methods should be common such as:
     * find()
     * type()
     * open()
     *
     */


//EXAMPLE OF COMMON PAGE OBJECTS AND ACTIONS
//    protected WebDriver driver;
//    protected Logger log;
//
//
//    public basePage(WebDriver driver, Logger log) {
//        this.driver = driver;
//        this.log = log;
//    }
//
//    /**
//     * Open page with given URL
//     */
//    protected void openUrl(String url) {
//        driver.get(url);
//
//    }
//
//    /**
//     * Find element using given locator
//     */
//    protected WebElement find(By locator) {
//        return driver.findElement(locator);
//    }
//
//    /**
//     * Click on element with given locator when its visible
//     */
//    protected void click(By locator) {
//        waitForVisibilityOf(locator, 5);
//        find(locator).click();
//    }
//
//
//    /**
//     * Type given text into element with given locator
//     */
//
//    protected void type(String text, By locator) {
//        waitForVisibilityOf(locator, 5);
//        driver.findElement(locator).sendKeys(text);
//
//    }
//
//
//    /**
//     * Wait for specific ExpectedCondition for the given amount of time in seconds
//     */
//    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
//        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
//        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
//        wait.until(condition);
//    }
//
//    /**
//     * Wait for given number of seconds for element with given locator to be visible
//     * on the page
//     */
//    protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
//        int attempts = 0;
//        while (attempts < 2) {
//            try {
//                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
//                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
//                break;
//            } catch (StaleElementReferenceException e) {
//            }
//            attempts++;
//        }
//    }
//
//    protected String getUrl(){
//
//        return driver.getCurrentUrl();
//    }
//
//    public List<WebElement> findAll(By locator){
//        return driver.findElements(locator);

}
