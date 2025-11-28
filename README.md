# Lambda Test Selenium Automation Suite

A comprehensive Selenium WebDriver test automation framework for testing various web UI interactions and functionalities on the LambdaTest Selenium Playground.

## Test Coverage

This test suite covers the following test scenarios:

-  **Clickable Links** - Web element interactions and navigation
-  **Dropdowns and Buttons** - Element selection and click interactions
-  **Forms with Input Fields** - Form filling and submission
-  **Hover Effects** - UI changes triggered by mouse hover actions
-  **Alerts** - JavaScript alert handling and validation
-  **File Uploads** - File upload functionality testing
-  **Delays (Wait Strategies)** - Implicit and explicit waits
-  **Deep Scrolling** - Page scrolling and element visibility
-  **Modals** - Modal dialog interactions
-  **Keys** - Keyboard input and key press events

##  Technologies & Stack

| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 17+ | Programming language |
| **Selenium WebDriver** | 4.38.0 | Browser automation |
| **TestNG** | 7.10.2 | Test framework & runner |
| **Maven** | 3.6+ | Build & dependency management |
| **WebDriverManager** | 5.9.2 | Automatic driver management |
| **Chrome Browser** | Latest | Test browser |

##  Base URL

```
https://www.lambdatest.com/selenium-playground
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Chrome browser installed

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd lambdaTestSelenium
   ```

## Running Tests

### Run All Tests
```bash
mvn test
```

## Resources

- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/doc/)
- [LambdaTest Playground](https://www.lambdatest.com/selenium-playground)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
