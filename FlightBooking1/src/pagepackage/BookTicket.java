package pagepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseTest;
import generic.WebDriverCommLib;

public class BookTicket extends BaseTest {
	
	//declaration
	@FindBy(xpath="//span[contains(text(),' Flights ')]")private WebElement flightButton;
	@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")private WebElement roundTripRadioButton;
	@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")private WebElement departureDropdown;
    @FindBy(xpath="//a[contains(text(),' Mumbai (BOM)')]")private WebElement departureLocClick;
    @FindBy(xpath="(//a[@onclick='javascript:$CityDropDown.SetSelectedValue(this);return false;' and contains(text(),' Goa, North Goa (GOX)') ])[2]")private WebElement toLocClick;
    @FindBy(xpath="//a[@data-date='15']")private WebElement dateClick;
    @FindBy(id="divpaxinfo")private WebElement passengerDropdownClick;
    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")private WebElement adultSelectionClick;
    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")private WebElement currencyButtonClick;
    @FindBy(name="ControlGroupSearchView$AvailabilitySearchInputSearchView$ButtonSubmit")private WebElement searchButtonClick;
    @FindBy(xpath="//table[@id='availabilityTable0']/descendant::span[@class='bound-city uppercase']")private WebElement departure_flightText;
    @FindBy(id="ControlGroupSelectView_AvailabilityInputSelectView_ComingNextDay")private WebElement nextDayReturnButton;
    @FindBy(xpath="//div[@id='continue-to-contact-page']")private WebElement continueButton;
    @FindBy(xpath="//div[@class='passengerTabheading']")private WebElement passengerTabheading;
    @FindBy(id="CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName")private WebElement firstNameTextBox;
    @FindBy(id="CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName")private WebElement lastNameTextBox;
    @FindBy(id="CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone")private WebElement phoneNoTextBox;
    @FindBy(id="CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress")private WebElement emailIdTextBox;
    @FindBy(xpath="//select[@name='contact_cities_list_india']")private WebElement townOrCityDD;
    @FindBy(id="CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_DropDownListTitle_0")private WebElement dropdownTitle;
    @FindBy(id="CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxFirstName_0")private WebElement firstName1TextBox;
    @FindBy(id="CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxLastName_0")private WebElement lastName1TextBox;
    @FindBy(xpath="//div[@id='continue-to-addons-page']/descendant::span[@class='button-continue-text']")private WebElement continueButton2;
    @FindBy(xpath="//div[@id='button-continue-text-paynow']/descendant::span[@class='button-continue-text']")private WebElement payButton;
	
    
    //initialization
 
    public BookTicket(WebDriver driver) 
    {
		PageFactory.initElements(driver,this);
	}


    //utilization


	public WebElement getFlightButton() {
		return flightButton;
	}


	public WebElement getRoundTripRadioButton() {
		return roundTripRadioButton;
	}


	public WebElement getDepartureDropdown() {
		return departureDropdown;
	}


	public WebElement getDepartureLocClick() {
		return departureLocClick;
	}


	public WebElement getToLocClick() {
		return toLocClick;
	}


	public WebElement getDateClick() {
		return dateClick;
	}


	public WebElement getPassengerDropdownClick() {
		return passengerDropdownClick;
	}


	public WebElement getAdultSelectionClick() {
		return adultSelectionClick;
	}


	public WebElement getCurrencyButtonClick() {
		return currencyButtonClick;
	}


	public WebElement getSearchButtonClick() {
		return searchButtonClick;
	}


	public WebElement getDeparture_flightText() {
		return departure_flightText;
	}


	public WebElement getNextDayReturnButton() {
		return nextDayReturnButton;
	}


	public WebElement getContinueButton() {
		return continueButton;
	}


	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}


	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}


	public WebElement getPhoneNoTextBox() {
		return phoneNoTextBox;
	}


	public WebElement getEmailIdTextBox() {
		return emailIdTextBox;
	}


	public WebElement getDropdownTitle() {
		return dropdownTitle;
	}


	public WebElement getFirstName1TextBox() {
		return firstName1TextBox;
	}


	public WebElement getLastName1TextBox() {
		return lastName1TextBox;
	}


	public WebElement getContinueButton2() {
		return continueButton2;
	}


	public WebElement getPayButton() {
		return payButton;
	}
    
	
	public void book_Flight_Ticket() throws InterruptedException
	{
		WebDriverCommLib wc=new WebDriverCommLib();
		flightButton.click();
		wc.wait(1000);
		wc.mouseHouver(getRoundTripRadioButton());
		roundTripRadioButton.click();
		wc.wait(2000);
		departureDropdown.click();
		wc.wait(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wc.mouseHouver(getDepartureLocClick());
		departureLocClick.click();
		wc.wait(2000);
		wc.mouseHouver(toLocClick);
		toLocClick.click();
		wc.wait(2000);
		wc.mouseHouver(dateClick);
		dateClick.click();
		wc.wait(2000);
		wc.mouseHouver(passengerDropdownClick);
		passengerDropdownClick.click();
		wc.wait(2000);
		adultSelectionClick.click();
		wc.wait(2000);
		wc.selectOptionsFromDropdown(adultSelectionClick,0);
		wc.mouseHouver(currencyButtonClick);
		wc.wait(2000);
		currencyButtonClick.click();
		wc.selectOptionsFromDropdown(currencyButtonClick,4);
		wc.wait(2000);
		wc.mouseHouver(searchButtonClick);
		wc.wait(2000);
		searchButtonClick.click();
		wc.scrollTillElement(departure_flightText);
		wc.wait(1000);
		wc.mouseHouver(getNextDayReturnButton());
		nextDayReturnButton.click();
		wc.wait(2000);
		wc.scrollTillElement(continueButton);
		wc.wait(1000);
		continueButton.click();
		wc.wait(2000);
		firstNameTextBox.sendKeys("Tousif");
		wc.wait(1000);
		lastNameTextBox.sendKeys("Bargir");
		wc.wait(1000);
		phoneNoTextBox.sendKeys("8149565410");
		wc.wait(1000);
		emailIdTextBox.sendKeys("tousifbargir7@gmail.com");
		wc.wait(1000);
		townOrCityDD.click();
		wc.selectOptionsFromDropdown("Goa", townOrCityDD);
		wc.scrollTillElement(passengerTabheading);
		wc.wait(1000);
		firstName1TextBox.sendKeys("Tousif");
		wc.wait(1000);
		lastName1TextBox.sendKeys("Bargir");
		wc.wait(1000);
		continueButton2.click();
		wc.wait(1000);
		payButton.click();
	
		
		
		
		
		
		
		
		
		
		
		
	}
    
}
