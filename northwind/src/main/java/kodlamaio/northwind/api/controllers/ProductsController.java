package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //bunlar scripten geliyor, sen bir controllsün demek 
@RequestMapping("/api/products") //farklı bölümlerin controlleri için bunu kullanıyoruz
//buradan bir istek gelirse bu controllir karar verecek

public class ProductsController { //Controller: itsek geliyor ve ne yapılacağına karar veriyor.
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
	super();
	this.productService = productService;
}

	//veri istediğimiz zaman kullanmak için GetMapping kullanıyoruz.
	@GetMapping("/getall")//kodlama.io/api/products/getall diyince bu çalışacak
	public List<Product> getAll(){
		return this.productService.getAll();
		
	}
	

}
