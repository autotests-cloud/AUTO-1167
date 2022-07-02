package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("IBS-tests")
    void generatedTest() {
        step("Open url https://ibs.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("click on Accept cookies button", () -> {
            step("// todo: just add selenium action");
        });

        step("click on ENG button", () -> {
            step("// todo: just add selenium action");
        });

        step("click on Technology Partners", () -> {
            step("// todo: just add selenium action");
        });

        step("page should have modal ROBIN Partner", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://ibs.ru/'", () ->
            open("https://ibs.ru/"));

        step("Page title should have text 'IBS — ведущая российская IT-сервисная компания'", () -> {
            String expectedTitle = "IBS — ведущая российская IT-сервисная компания";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://ibs.ru/'", () ->
            open("https://ibs.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}