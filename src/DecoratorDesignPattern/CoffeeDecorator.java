package DecoratorDesignPattern;

public class CoffeeDecorator implements Coffee{
	
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return decoratedCoffee.cost();
	}
	
	
}
