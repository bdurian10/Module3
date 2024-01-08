package module3Option1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Withholding {
	
	public static void main(String[] args) {
	
		//declare double for withholding
		double withholding;
		
		//create customer list
		List<Customer> customers = new ArrayList<>();
		try {
			//create customers to test each income bracket
			Customer customer1 = new Customer(200, "Doe, John", UUID.randomUUID());
			Customer customer2 = new Customer(500, "Doe, Jane", UUID.randomUUID());
			Customer customer3 = new Customer(1500, "Doe, Justin", UUID.randomUUID());
			Customer customer4 = new Customer(2500, "Doe, Rich", UUID.randomUUID());
			
			//Add customers to list
			customers.add(customer1);
			customers.add(customer2);
			customers.add(customer3);
			customers.add(customer4);
		}
		catch (Exception e) {
			System.out.println("Error during customer creation\n" + e);
		}
			
		

		//Loop through customers in list
		for (Customer customer : customers) {
		//if statements to calculate withholding amount based on income
			if(customer.income >= 2500) {
				
				withholding = customer.income * 0.30;
			}
			else if(customer.income >=1500) {
				
				withholding = customer.income * 0.20;
			}
			else if(customer.income >= 500) {
				
				withholding = customer.income * 0.15;
			}
			else {
				
				withholding = customer.income * 0.10;
			}
			
			System.out.println("Average Weekly Tax Withholding for " + customer.name + " is: " + withholding);
			
		}

		
		
		
	}


}
