package PO;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Initial extends BasePO{

    public Initial(AppiumDriver<?> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItBTN;

    @FindBy(id = "action_done")
    private WebElement takeMeToGmailBTN;

    public Initial clickGotItBTN(){
        gotItBTN.click();
        return this;
    }

    public Initial clickTakeMeToGmailBTN(){
        takeMeToGmailBTN.click();
        return this;
    }

}
