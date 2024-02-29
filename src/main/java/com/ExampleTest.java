import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CyA\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Set up Chrome options for emulating devices
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=375,812"); // Emulate iPhone X
        // Set the path to the WebDriver executable
        options.addArguments("--user-agent=your_user_agent_string"); // Set user-agent string

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Example usage: open a website
        driver.get("https://www.example.com");

        // Example usage: find an element and interact with it

        // Close the browser window
        driver.quit();
    }
}
