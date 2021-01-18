package com.yasin.shoppingapp.product.repository.mongo;

import com.yasin.shoppingapp.product.domain.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice, String> {

}
