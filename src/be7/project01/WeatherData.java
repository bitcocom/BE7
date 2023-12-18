package be7.project01;

public class WeatherData {
    private double temperature; // Celsius
    private int humidity; // Percentage
    private String weatherDescription;

    public WeatherData(double temperature, int humidity, String weatherDescription) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherDescription = weatherDescription;
    }

    // Getters and setters for temperature, humidity, and weather description
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
}
