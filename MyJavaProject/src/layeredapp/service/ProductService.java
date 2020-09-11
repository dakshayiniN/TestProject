package layeredapp.service;

import java.util.List;

import layeredapp.dal.ProductDAO;
import layeredapp.domain.Product;

public class ProductService {
	
	ProductDAO dao = new ProductDAO();
	
	public void createNewProduct(Product p) {
		if(p.getPrice() * p.getQoh() < 10000) {
			throw new IllegalArgumentException("Monetory value too low.");
		}
		dao.save(p);
	}
	
	
	public List<Product> findAll(){
		return dao.findAll();
	}

}
