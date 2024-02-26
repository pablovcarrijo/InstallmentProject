package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private double amount;
	private LocalDate dueDate;
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Installment(Double amount, LocalDate dueDate) {
		setAmount(amount);
		setDueDate(dueDate);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		return getDueDate().format(fmt) + " - " + String.format("%.2f", amount);
	}
	
}
