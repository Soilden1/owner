package tests;

import com.codeborne.selenide.Configuration;
import config.TestConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void setUp() {
        TestConfig config = ConfigFactory.create(TestConfig.class, System.getProperties());
        Configuration.baseUrl = "https://habr.com/";
        Configuration.browser = config.getBrowser();
        Configuration.browserSize = "1920x1080";
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getRemoteUrl();
        Configuration.pageLoadStrategy = "eager";
    }
}
