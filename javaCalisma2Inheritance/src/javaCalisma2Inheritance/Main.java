package javaCalisma2Inheritance; 

public class Main {

	public static void main(String[] args) {
		IndividualCustomer rabia=new IndividualCustomer();
		rabia.customerNumber="12344";
		
		CorporateCustomer hepsiBurada= new CorporateCustomer();
		hepsiBurada.customerNumber="66678";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager=new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(rabia);
		Customer[] customers = {rabia,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
