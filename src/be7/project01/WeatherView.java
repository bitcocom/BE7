package be7.project01;

import java.util.Scanner;

public class WeatherView {

    public void displayMenu() {
        System.out.print("메뉴선택 (입력: I  종료: E): ");
    }
    public String getUserAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주소를 입력하세요: ");
        return scanner.nextLine();
    }

    public void displayWeatherInfo(String address, WeatherData weatherData) {
        System.out.println("입력한 주소: " + address);

        System.out.println("현재 날씨: " + weatherData.getWeatherDescription());
        System.out.println("현재 온도: " + weatherData.getTemperature());
        System.out.println("현재 습도: " + weatherData.getHumidity());
        // 추가적인 날씨 관련 정보를 표시할 수 있습니다.
    }
    // 프로그램 종료 메시지를 표시하는 메서드
    public void displayExitMessage() {
        System.out.println("프로그램을 종료합니다...");
    }

    // 잘못된 선택 시 메시지를 표시하는 메서드
    public void displayInvalidSelectionMessage() {
        System.out.println("잘못된 선택입니다. 다시 시도하세요.");
    }

}
