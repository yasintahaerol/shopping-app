package com.yasin.shoppingapp.product.repository;

import com.yasin.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product, String> {

}
