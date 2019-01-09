package com.fpt.redis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.fpt.redis.controller.ProductController;
import com.fpt.redis.entity.Product;

@Service
public class ProductService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Cacheable(value = "product", key = "#id", unless = "#result == null")
	public Product getProduct(String id) {
		System.out.println("getProduct called for id {}" + id);
		Product product = new Product();
		product.setId(id);
		product.setEan("0826663141405");
		product.setName("The Angry Beavers: The Complete Series");
		return product;
	}
	
	@CacheEvict(cacheNames="product", key ="#root.args[0].id")
	public void updateProduct(Product product) {
		LOGGER.info("updateProduct called for id {}", product.getId());
		// do nothing, we just simulate the update
	}
}
