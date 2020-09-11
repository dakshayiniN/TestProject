package layeredapp;

import layeredapp.ui.ProductConsoleUI;

public class ProductApp {

	public static void main(String[] args) {
		ProductConsoleUI ui = new ProductConsoleUI();
		//ui.createProductWithUI();
		ui.displayAllProducts();
		// main ---> ui ---> service ---> dal
	}

}
