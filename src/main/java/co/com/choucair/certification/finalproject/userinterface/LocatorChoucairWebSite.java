package co.com.choucair.certification.finalproject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorChoucairWebSite extends PageObject
{
    public static final Target COOKIES_ACEPT = Target.the("")
            .located(By.id("cookie_action_close_header"));
    public static final Target JOB_SECTION = Target.the("")
            .located(By.id("menu-item-550"));
    public static final Target OPTION_BE_CHOUCAIR = Target.the("")
            .locatedBy("//a[contains(text(),'¿Qué es ser Choucair?')]");
    public static final Target OPTION_ANNOUNCEMENT = Target.the("")
            .locatedBy("//a[contains(text(),'Convocatorias')]");
    public static final Target AVAILABLE_JOBS = Target.the("")
            .locatedBy("//div[@class='search_submit']//input");

    public static final Target optionPrepareToApply = Target.the("")
            .locatedBy("//a[@href='#preparse']//img[@class='elementor-animation-grow']");
    public static final Target down = Target.the("")
            .locatedBy("//input[@id='search_keywords']");



}
