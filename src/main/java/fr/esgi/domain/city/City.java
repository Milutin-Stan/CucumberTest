package fr.esgi.domain.city;

public class City {
    private final String cityName;
    private int infectionLevel;


    public String getCityName() {
        return cityName;
    }

    public City(String cityName) {
        this.cityName = cityName;

    }

    public int getInfectionLevel() {
        return infectionLevel;
    }

    public void infect(){
        infectionLevel++;
    }

    public void setInfectionLevel(int infectionLevel) {
        this.infectionLevel = infectionLevel;
    }
}
