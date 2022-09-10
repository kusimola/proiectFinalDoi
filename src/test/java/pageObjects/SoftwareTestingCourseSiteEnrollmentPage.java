package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class SoftwareTestingCourseSiteEnrollmentPage {
        @FindBy(xpath = "//*[@id=\"firstName\"]")
        private WebElement FirstNameField;

        @FindBy(xpath = "//*[@id=\"lastName\"]")
        private WebElement LastNameField;

        @FindBy(xpath = "//*[@id=\"username\"]")
        private WebElement UsernameField;

        @FindBy(xpath = "//*[@id=\"password\"]")
        private WebElement PasswordField;

        @FindBy(xpath = "//*[@id=\"cpassword\"]")
        private WebElement ConfirmPasswordField;

        @FindBy(xpath = "//*[@id=\"email\"]")
        private WebElement EmailField;

        @FindBy(xpath = "//*[@id=\"phone\"]")
        private WebElement PhoneField;

        @FindBy(xpath = "//*[@id=\"country\"]")
        private WebElement CountryField;

        @FindBy(xpath = "//*[@id=\"city\"]")
        private WebElement CityField;

        @FindBy(xpath = "//*[@id=\"postCode\"]")
        private WebElement PostcodeField;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
        private WebElement NextButton;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
        private WebElement NextButtonSecond;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
        private WebElement contactInformationHeader;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
        private WebElement personalInformationHeader;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
        private WebElement courseOptionHeader;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
        private WebElement paymentHeader;

        @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
        private  WebElement thirdCourseRadioButton;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
        private  WebElement NextButtonThird;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
        private WebElement NextButtonFourth;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
        private WebElement cardHolderField;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
        private WebElement cardNumberField;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
        private WebElement cvcField;

        @FindBy(xpath = "//*[@id=\"month\"]/option[4]")
        private WebElement expiryMonth;

        @FindBy(xpath = "//*[@id=\"year\"]/option[8]")
        private WebElement expiryYear;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
        private WebElement successHeader;

        @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
        private WebElement returnButton;





        public SoftwareTestingCourseSiteEnrollmentPage(WebDriver driver) {
            PageFactory.initElements(driver, this);

        }

        public void inputStringInFields() {
            this.FirstNameField.sendKeys("Imola");
            this.LastNameField.sendKeys("kus");
            this.UsernameField.sendKeys("kusimola");
            this.PasswordField.sendKeys("dasdas");
            this.ConfirmPasswordField.sendKeys("dasdas");
        }

        public void inputFieldOne(String string){this.FirstNameField.sendKeys(string);}

        public void inputFieldTwo(String string){this.LastNameField.sendKeys(string);}

        public void inputFieldThree(String string){this.UsernameField.sendKeys(string);}

        public void inputFieldFour(String string){this.PasswordField.sendKeys(string);}

        public void inputFieldFive(String string){this.ConfirmPasswordField.sendKeys(string);}

        public void inputFieldOneContact(String string){this.EmailField.sendKeys(string);}

        public void inputFieldTwoContact(String string){this.PhoneField.sendKeys(string);}

        public void inputFieldThreeContact(String string){this.CountryField.sendKeys(string);}

        public void inputFieldFourContact(String string){this.CityField.sendKeys(string);}

        public void inputFieldFiveContact(String string){this.PostcodeField.sendKeys(string);}

        public String getContactInformationHeader() {return this.contactInformationHeader.getText();}

        public String getPersonalInformationHeader() {return this.personalInformationHeader.getText();}

        public String getCourseOptionHeader() {return this.courseOptionHeader.getText();}

        public String getPaymentHeader() {return this.paymentHeader.getText();}

        public void clickOnNextButton(){ this.NextButton.click();}
        public void clickOnNextButtonSecond(){this.NextButtonSecond.click();}

        public void clickOnRadioButton(){this.thirdCourseRadioButton.click();}

        public boolean isButtonChecked() { return this.thirdCourseRadioButton.isSelected(); }

        public void clickOnNextButtonThird(){this.NextButtonThird.click();}

        public void clickOnNextButtonFourth(){this.NextButtonFourth.click();}

        public void inputFieldOnePayment(String string){this.cardHolderField.sendKeys(string);}

        public void inputFieldTwoPayment(String string) {this.cardNumberField.sendKeys(string);}

        public void inputFieldThreePayment(String string) {this.cvcField.sendKeys(string);}

        public void selectMonth(){this.expiryMonth.click();}

        public void selectYear(){this.expiryYear.click();}

        public String getSuccessHeader() {return this.successHeader.getText();}

        public void clickReturnButton(){this.returnButton.submit();}






        public void fillPersonalInformation() {
                inputFieldOne("test");
                inputFieldTwo("test");
                inputFieldThree("test");
                inputFieldFour("test");
                inputFieldFive("test");
                clickOnNextButton();
        }

        public void fillContactInformation() {
                inputFieldOneContact("test");
                inputFieldTwoContact("test");
                inputFieldThreeContact("test");
                inputFieldFourContact("test");
                inputFieldFiveContact("test");
                clickOnNextButtonSecond();
        }

        public void fillCourseOption() {
                clickOnRadioButton();
                clickOnNextButtonThird();
        }

        public void fillPayment() {
                inputFieldOnePayment("test");
                inputFieldTwoPayment("test");
                inputFieldThreePayment("test");
                selectMonth();
                selectYear();
        }

    }

