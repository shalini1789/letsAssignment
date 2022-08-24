package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IProduct;
import com.app.pojos.ProductDetails;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

	
	@Autowired
private IProduct productService;
	
	
	
	@GetMapping
	public ResponseEntity<?> getAllProduct(){
		System.out.println("in get all details product controller");
		List<ProductDetails> products =productService.getAllProductDetails();
		System.out.println(products);
		if(products.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			
			return new ResponseEntity<>(products,HttpStatus.OK);
			
		}
		
	}
	
	@PostMapping
	public ResponseEntity<?>  saveProducts(@RequestBody ProductDetails p ){
		
		System.out.println("in save product " +p);
		
		try {
			ProductDetails p1 = productService.saveProductDetails(p);
			return new ResponseEntity<>(p1,HttpStatus.CREATED);
			
			
		}catch ( RuntimeException e) {
		System.out.println("error in save " +e);
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		
		
	}
	
	@GetMapping("/{productId}")
	
	public ResponseEntity<?> getProductById(@PathVariable int productId){
		System.out.println("productId" +productId);
		//ProductDetails products =productService.getProductById(productId);
	try {
		
		return  ResponseEntity.ok(productService.getProductById(productId));
		}catch (Exception e) {
		
			System.out.println("Exception" +e);
		}
		
	  return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//method to get product Details 
	
