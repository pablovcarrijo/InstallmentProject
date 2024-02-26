package model.services;

public interface OnlineService {

	double paymentFree(double amount);
	
	double interest(double amount, int months);
	
}
