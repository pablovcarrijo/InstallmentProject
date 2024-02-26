package model.services;

public interface OnlineService {

	public double paymentFree(double amount);
	
	public double interest(double amount, Integer months);
	
}
