package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_UC = Target.the("BUTTON FOR MODULE ACCESS").located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a"));

    public static final Target INPUT_COURSE = Target.the("INPUT FOR WRITE THE COURSE NAME").located(By.xpath("//*[@id=\"coursesearchbox\"]"));

    public static final Target BUTTON_SEARCH = Target.the("BUTTON FOR SEARCH").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));

    public static final Target SELECT_COURSE = Target.the("BUTTON FOR SELECT COURSE").located(By.xpath("//div[@class=\"search-results\"]/div[1]/h4/a"));

    public static final Target COURSE_NAME = Target.the("CATCH THE NAME OF THE COURSE").located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
