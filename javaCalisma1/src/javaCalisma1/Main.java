package javaCalisma1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo", 1500,"16GB Ram",10);//ornek olusturma, referans olusturma,intance	
		Product product2 = new Product();
		
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
			
		Product product3 = new Product();	
		
		Product[] products = {product1,product2,product3};
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("içecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		/*
		for (Product product : products) {
			System.out.println(product.name);
		}
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev Bahçe";
		
		Category[] categorys = {category1,category2};
		
		for (Category category : categorys) {
			System.out.println(category.id);
			System.out.println(category.name);
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);*/
		/*String[] krediler = {
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi"
		};
		double dolarDun=8.15;
		double dolarBugun=8.18;
		int vade = 36;
		boolean  dustuMu = false;	
		String internetSubeButonu="İnternet Şubesi"; 
		
		//System.out.println(internetSubeButonu);
		if(dolarBugun<dolarDun) { 
			
		}
		//foreach mantığı
		for(String kredi : krediler) {//elimdeki diziyi tek tek dolas
			System.out.println(kredi);
			
		}
		/*for(int i=0; i<krediler.length;i++) {
		   //yukarıdaki ile aynı işlemmmm
			System.out.println(krediler[i]);
		}*/
		//productManager.addToCart(product3);//productın bellek adresini yollamış oluyoruz
		

	}

}
