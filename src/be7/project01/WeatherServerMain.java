package be7.project01;

public class WeatherServerMain {
    public static void main(String[] args) {
        WeatherService service=new WeatherService();
        WeatherView view=new WeatherView();
        WeatherController controller=new WeatherController(service, view);
        controller.processUserInput();
    }
}
