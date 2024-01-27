package cinemark.tasks.util;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HideKeyboard implements Task {

    public static HideKeyboard hide() {
        return instrumented(HideKeyboard.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver<?> appiumDriver = (AppiumDriver<?>) actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        appiumDriver.hideKeyboard();
    }
}
