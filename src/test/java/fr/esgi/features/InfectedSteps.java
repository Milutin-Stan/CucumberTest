package fr.esgi.features;

import fr.esgi.domain.city.City;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Maps;

import java.util.Map;

public class InfectedSteps {

    Map<String, City> map = Maps.newHashMap("PARIS", new City("PARIS"));

    @Given("{string} has not been infected")
    public void parisHasNotBeenInfected(String cityName) {
        map.get(cityName).setInfectionLevel(0);
    }


    @When("{string} is infected")
    public void parisIsInfected(String cityName) {
        map.get(cityName).infect();
    }

    @Then("{string}' infection level should be increase to {int}")
    public void infectionLevelShouldBeIncreaseTo(String cityName, int infectionLevel) {
        Assertions.assertThat(map.get(cityName).getInfectionLevel()).isEqualTo(infectionLevel);
    }

    @Given("{string} has been infected {int} time")
    public void hasBeenInfectedTime(String cityName, int infectionTimes) {
        for(int i = 0 ; i < infectionTimes ; i++){
            map.get(cityName).infect();
        }
    }
}
