package StrategyDesignPattern;

public class Main {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		PaymentStrategy creditcart_payment = new CreditCardPayment("1234 5678 9101 1121", "arun");
		
		shoppingCart.setPaymentStrategy(creditcart_payment);
		shoppingCart.checkout(100);
		
		PaymentStrategy paypal_payment = new PaypalPayment("arun.vemi@email.com");
		shoppingCart.setPaymentStrategy(paypal_payment);
		shoppingCart.checkout(1000);
		
		
	}
}
