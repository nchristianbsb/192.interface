package services;

public interface OnlinePaymentService {

	Double paymentFee(Double amount);
	Double interest(double amount, int months);
	
}
