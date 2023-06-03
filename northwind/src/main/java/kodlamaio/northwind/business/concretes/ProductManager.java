package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; //javada bean proje classı demek
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //bu class servis görevi görecek diyoruz.
public class ProductManager implements ProductService{
	
	private ProductDao productDao; //productDao ve arkasındaki JpaRepository interfacedir
	
	
    @Autowired //çok kullanılır bağımlılık oluşturur 
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
