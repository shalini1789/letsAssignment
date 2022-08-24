package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.ProductDetails;

public interface IProductRepo extends JpaRepository<ProductDetails, Integer>
{

}
