package com.yasin.shoppingapp.product.repository.mongo;

import com.yasin.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
