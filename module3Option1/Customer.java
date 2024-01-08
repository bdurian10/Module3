package module3Option1;

import java.util.UUID;

public class Customer {
	
	//Declare variables for customer
	public double income;
	public String name;
	public UUID id;
	
	public Customer(double customerIncome, String customerName, UUID customerID) {
		if (customerIncome < 0) {
			throw new IllegalArgumentException("Customer Income is negative");
		}
		if (customerName == null || Double.isNaN(customerIncome) || customerID == null)
		{
			throw new IllegalArgumentException("Customer has null arguments");
		}
		income = customerIncome;
		name = customerName;
		id = customerID;
		
	}
	

}
