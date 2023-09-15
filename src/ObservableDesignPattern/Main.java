package ObservableDesignPattern;

public class Main {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
		
		weatherStation.addObserver(temperatureDisplay);
		weatherStation.setTemperature(30);
		weatherStation.setTemperature(35);
	}
}
