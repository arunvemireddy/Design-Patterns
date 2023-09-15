package DecoratorDesignPattern;

public class Main {
	
	public static void main(String[] args) {
		Coffee myCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
		System.out.println("Cost of my Coffee \s"+myCoffee.cost());
	}

}
