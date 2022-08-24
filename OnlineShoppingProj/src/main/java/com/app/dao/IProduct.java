package com.app.dao;

import java.util.List;
import java.util.Optional;

import com.app.pojos.ProductDetails;

public interface IProduct  {

	public List<ProductDetails> getAllProductDetails();
		
	public ProductDetails saveProductDetails(ProductDetails p); 
	
	public Optional<ProductDetails> getProductById(int productId);
}
