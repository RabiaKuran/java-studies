package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
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
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);		
		
	}
	
	@GetMapping("/getByProductName") // kullanıcıdan yapılan bir istek
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId") 
	public DataResult<Product> 
	getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameContains") 
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	@GetMapping("/getAllByPage") 
	DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo,pageSize);
	}
	
	@GetMapping("/getAllDesc") 
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
		
	}

}
