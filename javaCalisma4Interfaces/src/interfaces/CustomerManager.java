package interfaces;

public class CustomerManager {

	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer added"+ customer.getFirstName());
////	DatabaseLogger logger = new DatabaseLogger();
////	logger.log(customer.getFirstName()+ "Sucessfully sent database log");
////	this.logger.log(customer.getFirstName());
//
//		for(Logger logger: loggers) {
//			logger.log(customer.getFirstName());
//		}
		
//		Utils utils = new Utils();

		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted"+ customer.getFirstName());
////		DatabaseLogger logger = new DatabaseLogger();
////		logger.log(customer.getFirstName()+ "Sucessfully sent database log");
////	
//		for(Logger logger: loggers) {
//			logger.log(customer.getFirstName());
//		}
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
