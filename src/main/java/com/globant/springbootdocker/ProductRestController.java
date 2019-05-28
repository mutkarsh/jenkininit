

package com.globant.springbootdocker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	List<Product> products = new ArrayList<Product>();
	public ProductRestController() {
	
		products.add(new Product(1, "pen", 10));
		products.add(new Product(2, "book", 50));
		products.add(new Product(3, "pencil", 5));
		System.out.println("constructor running");
		
	}
	
	@GetMapping("/products")
	public List<Product> getproducts(){
		System.out.println("HIT");
		return products;
	}

}
