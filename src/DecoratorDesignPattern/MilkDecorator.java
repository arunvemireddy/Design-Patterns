package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	@Override
	 public double cost() {
		 return super.cost()+0.5;
	 }

}
