package co.com.choucair.certification.finalproject.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import static co.com.choucair.certification.finalproject.userinterface.LocatorChoucairWebSite.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckQuality implements Task
{
    public static CheckQuality severalSectionsOfThePage()
    {
        return Tasks.instrumented(CheckQuality.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(COOKIES_ACEPT),
                Hit.the(Keys.PAGE_DOWN).into(OPTION_BE_CHOUCAIR),
                Hit.the(Keys.PAGE_UP).into(OPTION_ANNOUNCEMENT),
                WaitUntil.the(OPTION_ANNOUNCEMENT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPTION_ANNOUNCEMENT),
                Hit.the(Keys.PAGE_UP).into(AVAILABLE_JOBS),
                WaitUntil.the(AVAILABLE_JOBS, isVisible()).forNoMoreThan(10).seconds());


        /*WebElement buttonTwo = BrowseTheWeb.as(actor).findBy("//a[contains(text(),'Convocatorias')]");
        //BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].scrollIntoView();", buttonTwo);
        buttonTwo.sendKeys(Keys.PAGE_UP);*/

    }
}
