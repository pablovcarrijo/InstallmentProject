package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlineService onlineService;
	
	public ContractService(OnlineService onlineService) {
		this.onlineService = onlineService;
	}
	
	public void processContract(Contract contract, int months) {
		double valuePerMonth = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i ++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlineService.interest(valuePerMonth, i);
			double paymentFree = onlineService.paymentFree(valuePerMonth);
			double totalPerParcela = interest + paymentFree + valuePerMonth;
			contract.getList().add(new Installment(totalPerParcela, dueDate));
			
		}
	}
	
}
