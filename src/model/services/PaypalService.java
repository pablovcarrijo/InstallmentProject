package model.services;

public class PaypalService implements OnlineService {

	public double paymentFree(double amount) {
		return amount * 0.02;
	}
	
	public double interest(double amount, Integer months) {
		return amount * 0.01 * months;
	}
	
}
