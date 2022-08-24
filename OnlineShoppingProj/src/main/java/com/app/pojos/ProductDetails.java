package com.app.pojos;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "product_tbl")
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(name = "product_name")
	@JsonProperty
	private String productName;
	
	@Column(name = "product_price")
	private int price;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "product_category")
	private ProductCategoryE p_category;
	
	@Column(name = "prodDes")
	private String productDescription;
	
	
	
	private int  quantity;
	
	@Lob
	@Column(name = "product_Image")
	@JsonProperty
	private byte[] productImage;

	
	@Column(length = 30,name = "image_content_type")
	@JsonProperty
	private String imageContentType;


	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public ProductCategoryE getP_category() {
		return p_category;
	}

	public void setP_category(ProductCategoryE p_category) {
		this.p_category = p_category;
	}

	
	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
	
	

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", brandName=" + brandName + ", p_category=" + p_category + ", productDescription="
				+ productDescription + ", quantity=" + quantity + ", imageContentType=" + imageContentType + "]";
	}




	

	



	
	
	
	
	
	
	
	
}
