package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC07_TestCasePage {

    public TC07_TestCasePage(){                 //  Constructor
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCaseLink;

    @FindBy(xpath = "//b")
    public WebElement testCasesText;

}
