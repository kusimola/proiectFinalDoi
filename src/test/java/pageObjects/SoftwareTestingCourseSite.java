package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SoftwareTestingCourseSite {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartEnrollmentButton;

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement homepageHeader;

    //Fundamentals section - locators
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement ReadMoreFundamentalsButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsHeader;

    //Faq section - locators
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement FaqHeader;


    @FindBy(css = ".accordion-flush")
    private WebElement FaqSection;

    //Newsletter section - locators
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement newsletterField;


    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;




    public SoftwareTestingCourseSite(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void clickOnStartEnrollmentButton() {
        this.StartEnrollmentButton.click();
    }

    public void clickOnReadMoreFundamentalsButton() {
        this.ReadMoreFundamentalsButton.click();
    }

    public WebElement getFundamentalsHeader() {
        return this.fundamentalsHeader;
    }

    public WebElement getFaqHeader() {
        return this.FaqHeader;
    }


    private List<WebElement> selectQuestionFromFaq(int questionNumber) {
        return FaqSection.findElements(By.cssSelector(".accordion-item"));
    }

    private WebElement getQuestionButton(int questionNumber) {
        List<WebElement> element = selectQuestionFromFaq(questionNumber);
        return element.get(questionNumber).findElement(By.cssSelector(".accordion-item h3 > button"));
    }

    public void clickOnQuestionButton(int questionNumber) {
        WebElement element = getQuestionButton(questionNumber);
        element.click();
    }


    public String getHomepageHeader() {
        return this.homepageHeader.getText();
    }

    public void inputNewsletterField(String string) {
        this.newsletterField.sendKeys(string);
    }


    public void clickSubmitButton() {
        this.submitButton.click();
    }
}
