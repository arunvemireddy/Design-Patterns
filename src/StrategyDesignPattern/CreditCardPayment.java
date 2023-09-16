package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{
	
	private String cardNumber;
	private String name;
	
	

	public CreditCardPayment(String cardNumber, String name) {

		this.cardNumber = cardNumber;
		this.name = name;
	}



	@Override
	public void payment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("amount paid using credit card\s"+amount);
		
	}

}
