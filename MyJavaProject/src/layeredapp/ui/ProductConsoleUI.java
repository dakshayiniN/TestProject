package layeredapp.ui;

import java.util.List;
import java.util.Scanner;

import layeredapp.domain.Product;
import layeredapp.service.ProductService;

public class ProductConsoleUI {
	
	ProductService service = new ProductService();
	
	public void createProductWithUI() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = kb.nextLine();
		System.out.println("Enter price: ");
		float price = Float.parseFloat(kb.nextLine());
		System.out.println("Enter QoH:");
		int qoh = Integer.parseInt(kb.nextLine());
		
		Product toBeCreated = new Product(name, price, qoh);
		service.createNewProduct(toBeCreated);
	}

	public void displayAllProducts() {
		List<Product> all = service.findAll();
		//print it
		System.out.println("There are "+all.size()+" products found!");
	}
}
