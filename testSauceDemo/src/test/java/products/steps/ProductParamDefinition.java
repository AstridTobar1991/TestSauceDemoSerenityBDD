package products.steps;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ProductParamDefinition {
    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }
    @ParameterType(".*")
    public String user(String userName) {
        return userName;
    }
    @ParameterType(".*")
    public String password(String passwordName) {
        return passwordName;
    }
    @ParameterType(".*")
    public String nombre(String firstnombre) {
        return firstnombre;
    }
    @ParameterType(".*")
    public String apellido(String lastname) {
        return lastname;
    }
    @ParameterType(".*")
    public String zip(String zipcode) {
        return zipcode;
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
