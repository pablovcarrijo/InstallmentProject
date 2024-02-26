package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados:");
		System.out.print("Number of account: ");
		int number = sc.nextInt();
		
		System.out.print("Data (DD/MM/YYYY): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Total value? ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter how many parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("PARCELAS: ");
		for(Installment installment : contract.getList()) {
			System.out.println(installment);
		}
		
	}
	
}
