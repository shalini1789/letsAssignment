package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.ProductDetails;
import com.app.repo.IProductRepo;

@Service
@Transactional
public class ProductDaoImpl  implements IProduct{
	
	@Autowired
	private IProductRepo productrepo;

	@Override
	public List<ProductDetails> getAllProductDetails() {
		
		return productrepo.findAll();
	}

	@Override
	public ProductDetails saveProductDetails(ProductDetails p) {
	
		return productrepo.save(p);
	}

	@Override
	public Optional<ProductDetails> getProductById(int productId) {
		
		return productrepo.findById(productId);
	}

	

}
