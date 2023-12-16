package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@PostMapping("/product")
	public String createProduct(@RequestBody Product p) {
		System.out.println(p);
		return "product saved";
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) {
		Product p = null;
		if (id == 101) {
			p = new Product(1, "HDD", 1200.00);
		} else if (id == 102) {
			p = new Product(2, "Mouse", 300.00);
		}
		return p;
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		Product p1 = new Product(1, "HDD", 1200.00);
		Product p2 = new Product(2, "Mouse", 300.00);

		List<Product> products = Arrays.asList(p1, p2);
		return products;

	}
}
