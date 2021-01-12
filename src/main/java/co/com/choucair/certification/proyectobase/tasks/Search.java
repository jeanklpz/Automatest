package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Search implements Task {

    private String course;

    //public Search(String course) {
      //  this.course = course;
    //}

    public static Search the(String course) {
        return Tasks.instrumented(Search.class, course);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue("Analista Bancolombia").into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_SEARCH),
                Click.on(SearchCoursePage.SELECT_COURSE)
                );

    }
}