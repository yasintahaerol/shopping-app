package com.yasin.shoppingapp.product.api;

import com.yasin.shoppingapp.product.domain.Product;
import com.yasin.shoppingapp.product.model.ProductResponse;
import com.yasin.shoppingapp.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;
    @GetMapping
    public Flux<ProductResponse> getAll() {
        return productService.getAll();
    }
}
