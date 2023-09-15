package ObservableDesignPattern;

public class TemperatureDisplay implements Observer {

	@Override
	public void update(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("temperature is \t"+temperature);
	}

}
