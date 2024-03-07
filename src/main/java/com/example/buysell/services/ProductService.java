package com.example.buysell.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.buysell.models.Product;

@Service
public class ProductService {
	private List<Product> products = new ArrayList<>();
	private long id = 0;
	
	{
		products.add(new Product(++id, "PlayStation 5", "Simple description", 67000, "Krasnoyarsk", "Tomas"));
		products.add(new Product(++id, "Iphone 8", "Simple description", 24000, "Moscow", "Artmcoder"));
	}
	
	public List<Product> listProducts(){
		return products;
	}
	
	public void saveProduct(Product product) {
		product.setId(++id);
		products.add(product);
	}
	
	public void deleteProduct(Long id) {
		products.removeIf(product -> product.getId().equals(id));
	}

	public Product getProductById(Long id) {
		for (Product product : products) {
			if (product.getId().equals(id)) return product;
		}
		return null;
	}
	
}
