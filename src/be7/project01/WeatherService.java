package be7.project01;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class WeatherService {

    private static final String API_KEY = "a54a36319b90f654c4c8fd41d472693b"; // Replace with your API key
    public AddressData getAddressData(String address) {
        try {
            String encodedAddress = URLEncoder.encode(address, "UTF-8");
            // Kakao API endpoint for address search
            String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query=" + encodedAddress;

            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "KakaoAK ddcaeaee21f163c58818ca2db1820c67"); // Replace with your Kakao API key

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Parse JSON response to get latitude and longitude
                String jsonResponse = response.toString();
                System.out.println(jsonResponse);
                JSONObject jsonObject = new JSONObject(jsonResponse);
                JSONArray documents = jsonObject.getJSONArray("documents");

                JSONObject firstDocument = documents.getJSONObject(0);
                String latitude = firstDocument.getJSONObject("road_address").getString("y");
                String longitude = firstDocument.getJSONObject("road_address").getString("x");

                System.out.println("Latitude: " + latitude);
                System.out.println("Longitude: " + longitude);

                AddressData addressData=new AddressData();
                addressData.setAddress(address);
                addressData.setLatitude(Double.parseDouble(latitude));
                addressData.setLongitude(Double.parseDouble(longitude));
                return  addressData;
            }else {
                System.out.println("Error in HTTP request, response code: " + responseCode);
            }
            connection.disconnect();

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public WeatherData getWeatherData(AddressData adata) {
        try {
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?lat=" + adata.getLatitude() + "&lon=" + adata.getLongitude() + "&appid=" + API_KEY;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder weatherData = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                weatherData.append(line);
            }
            reader.close();
            System.out.println(weatherData.toString());

            JSONObject jsonObject = new JSONObject(weatherData.toString());

            // Extract temperature and humidity from JSON
            JSONObject main = jsonObject.getJSONObject("main");
            double temperature = main.getDouble("temp");
            int humidity = main.getInt("humidity");

            JSONArray weatherArray = jsonObject.getJSONArray("weather");
            JSONObject weatherObject = weatherArray.getJSONObject(0);
            String weatherDescription = weatherObject.getString("description");

            // Convert temperature from Kelvin to Celsius
            double temperatureCelsius = temperature - 273.15;

            connection.disconnect();

            return new WeatherData(temperatureCelsius, humidity, weatherDescription);

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
