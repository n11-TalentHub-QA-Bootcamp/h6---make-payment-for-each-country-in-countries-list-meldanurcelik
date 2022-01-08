package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.GoToPayment;
import tasks.LoginToEriBank;
import tasks.MakePayment;

public class PaymentEachCountrySteps {
    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName = "melda";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("I login with the correct username and password")
    public void ı_login_with_the_correct_username_and_password() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company", "company"));
    }

    @Then("I should see the home page and go to payment page")
    public void ı_should_see_the_home_page_and_go_to_payment_page() {
        actor.attemptsTo(GoToPayment.goTo());
    }

    @Then("Pay with {string}, {string}, {string} and {string}")
    public void pay_with_and(String phone, String name, String amount, String country) {
        actor.attemptsTo(MakePayment.pay(phone, name, amount, country));
    }

}
