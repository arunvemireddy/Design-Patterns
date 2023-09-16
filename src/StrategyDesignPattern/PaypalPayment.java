package StrategyDesignPattern;

public class PaypalPayment implements PaymentStrategy{
	
	private String email;
	
	

	public PaypalPayment(String email) {
		this.email = email;
	}



	@Override
	public void payment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("amount paid using paypal\s"+amount);
		
	}

}
