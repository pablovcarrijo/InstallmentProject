package model.services;

public class PaypalService implements OnlineService {

	private static final double FRE_PARCENTAGE = 0.02;

	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double paymentFree(double amount) {
		return amount * FRE_PARCENTAGE;
	}
	
	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}
	
}
