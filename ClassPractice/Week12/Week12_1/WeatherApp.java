package ClassPractice.Week12.Week12_1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class WeatherApp {

    public static class WeatherData {
        @SerializedName("current")
        private CurrentWeather current;

        public CurrentWeather getCurrent() {
            return current;
        }
    }

    private static class CurrentWeather {

        private double temperature;
        private int humidity;

        @SerializedName("weather_descriptions")
        private List<String> weatherDescriptions;

        public double getTemperature() {
            return temperature;
        }

        public int getHumidity() {
            return humidity;
        }

        public List<String> getWeatherDescriptions () {
            return weatherDescriptions;
        }
    }

    public static WeatherData getWeatherData(String city, String apikey) throws IOException {

        String apiUrl = "http://api.weatherstack.com/current?access_key=" +apikey +"&query=" + city;

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {

            connection.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {

                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                Gson gson = new Gson();
                return gson.fromJson(response.toString(), WeatherData.class);
            }
        } finally {
            connection.disconnect();
        }
    }

    public static void main(String[] args) {

        String city = "Oshawa";
        String apikey = "64811c6967377ca84d6e3c1c0fb4dccf";

        try {

            WeatherData weatherData = getWeatherData(city, apikey);
            CurrentWeather currentWeather = weatherData.getCurrent();
            System.out.println("Temperature: " + currentWeather.getTemperature());
            System.out.println("Humidity: " + currentWeather.getHumidity());
            System.out.println("Weather descriptions: " + currentWeather.getWeatherDescriptions());
        } catch (IOException e) {
            System.err.println("An error occurred " + e.getMessage());
        }
    }
}
