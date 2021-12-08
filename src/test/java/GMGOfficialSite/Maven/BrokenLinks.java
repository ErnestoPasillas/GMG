package GMGOfficialSite.Maven;

import Actions.AccountActions;
import Actions.HomeActions;
import Actions.LoginActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BrokenLinks extends PadreClassGMG {

    LoginActions loginActions = new LoginActions();
    HomeActions homeActions = new HomeActions();
    AccountActions accountActions = new AccountActions();


    /*  protected static ChromeDriver driver; */
    WebDriver driver = getDriver();
    String URL = "https://eddiebygiddy.com/";
    public static String status = "passed";
    String username = "user-name";
    String access_key = "access-key";

    String url = "";
    HttpURLConnection urlconnection = null;
    int responseCode = 200;

    @BeforeClass
    public void testSetUp() throws MalformedURLException {
        /*
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        */
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("build", "[Java] Finding broken links on a webpage using Selenium");
        capabilities.setCapability("name", "[Java] Finding broken links on a webpage using Selenium");
        capabilities.setCapability("platform", "Mac OS X");
        capabilities.setCapability("browserName", "Chrome");
         capabilities.setCapability("version","96.0.4664.55");
        capabilities.setCapability("tunnel", false);
        capabilities.setCapability("network", true);
        capabilities.setCapability("console", true);
        capabilities.setCapability("visual", true);

       /* driver = new RemoteWebDriver(new URL("http://" + username + ":" + access_key + "@hub.lambdatest.com/wd/hub"), capabilities);
        System.out.println("Started session");*/
    }




    @Test
    public void test_Selenium_Broken_Links () throws InterruptedException {
        driver.navigate().to("https://eddiebygiddy.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("img"));
        Iterator<WebElement> link = links.iterator();

        /* For skipping email address */
        String mail_to = "mailto";
        String tel = "tel";
        String LinkedInPage = "https://eddiebygiddy.com/";
        int valid_links = 0;
        int broken_links = 0;
        Boolean bLinkedIn = false;
        int LinkedInStatus = 999;

        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat;



        while (link.hasNext()) {
            url = link.next().getAttribute("src");
            System.out.println(url);
            bLinkedIn = false;

            if ((url == null) || (url.isEmpty())) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            /* String str="mailto:support@LambdaTest.com"; */
            if ((url.startsWith(mail_to)) || (url.startsWith(tel))) {
                System.out.println("Email address or Telephone detected");
                continue;
            }

            if (url.startsWith(LinkedInPage)) {
                System.out.println("URL starts with LinkedIn, expected status code is 999");
                bLinkedIn = true;
            }

            try {
                urlconnection = (HttpURLConnection) (new URL(url).openConnection());
                urlconnection.setRequestMethod("HEAD");
                urlconnection.connect();
                responseCode = urlconnection.getResponseCode();
                if (responseCode >= 400) {
                    /* https://stackoverflow.com/questions/27231113/999-error-code-on-head-request-to-linkedin */
                    if ((bLinkedIn == true) && (responseCode == LinkedInStatus)) {
                        System.out.println(url + " is a LinkedIn Page and is not a broken link");
                        valid_links++;
                    } else {
                        System.out.println(url + " is a broken link");
                        broken_links++;
                    }
                } else {
                    System.out.println(url + " is a valid link");
                    valid_links++;
                }
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Detection of broken links completed with " + broken_links + " broken links and " + valid_links + " valid links\n");
    }

/*
    @AfterClass
    public void tearDown ()
    {
        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
        }
    }*/

}
