package be7.project01;

import java.util.Scanner;

public class WeatherController {
    private WeatherView view;
    private WeatherService service;
    public WeatherController(WeatherService service, WeatherView view) {
        this.service=service;
        this.view=view;
    }
    // 주소를 입력 받아서 위도와 경도를 추출하는 메서드
    public void processUserInput() {
        while(true){
            view.displayMenu();
            String menuSelection = getUserSelection();
            if (menuSelection.equalsIgnoreCase("I")) {
                String address = view.getUserAddress();
                AddressData adata = service.getAddressData(address);
                WeatherData wdata = service.getWeatherData(adata);
                view.displayWeatherInfo(address, wdata);
            } else if (menuSelection.equalsIgnoreCase("E")) {
                view.displayExitMessage();
                break;
            } else {
                view.displayInvalidSelectionMessage();
            }
       }
    }
    private String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
