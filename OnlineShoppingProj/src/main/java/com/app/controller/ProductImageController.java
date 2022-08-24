package com.app.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.dto.ResponseDTO;
import com.app.pojos.ProductDetails;
import com.app.repo.IProductRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/productimage")
public class ProductImageController {

	
	@Value("${file.upload.location}")
	private String location;

	@Autowired
	private IProductRepo productrepo;
	
	
	@CrossOrigin
	@PostMapping("/upload")
	public ResponseDTO fileUploadWithParams( @RequestParam MultipartFile imageFile,@RequestParam String product_dtls)/*seller_id*/ {
		
		System.out.println(product_dtls);
		System.out.println("product data_______" + product_dtls + " " + imageFile.getOriginalFilename());
		try {
			System.out.println("bytes_______"+imageFile.getBytes());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		//System.out.println("seller id_______" +  prod_dtls + " " + seller_id);
		try {
			//un marshalling json--> java
			ProductDetails p = new ObjectMapper().readValue(product_dtls, ProductDetails.class);
			System.out.println("product _data  "+p );
			
			p.setProductImage(imageFile.getBytes());
			p.setImageContentType(imageFile.getContentType());
			
		
			//store it on server side location
			imageFile.transferTo(new File(location, imageFile.getOriginalFilename()));
			//Seller s = new ObjectMapper().readValue(seller_dtls, Seller.class);
			/*
			 * Optional<Seller> s = sellerRepo.findById(seller_id); if(s.isPresent())
			 * c.setCarSeller(s.get()); else System.out.println("Seller Id Not found.....");
			 */

			// imageFile.transferTo(new File(location, imageFile.getOriginalFilename()));
			// System.out.println("user dtls " + u);
			//carRepo.save(c);
			productrepo.save(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseDTO("File uploaded :" + imageFile.getOriginalFilename() + " @ ", LocalDateTime.now());
	}

	
	
	
}
