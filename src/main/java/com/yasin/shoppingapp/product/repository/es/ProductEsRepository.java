package com.yasin.shoppingapp.product.repository.es;

import com.yasin.shoppingapp.product.domain.es.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;



public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs, String> {

}
