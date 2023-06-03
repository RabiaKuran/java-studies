package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer userx = new Customer(1,"firstName","lastName");
		customerManager.add(userx);
		
	}

}
