package com.yasin.shoppingapp.product.service;

import com.yasin.shoppingapp.product.domain.MoneyTypes;
import com.yasin.shoppingapp.product.domain.es.ProductEs;
import com.yasin.shoppingapp.product.model.ProductResponse;
import com.yasin.shoppingapp.product.model.ProductSaveRequest;
import com.yasin.shoppingapp.product.model.ProductSellerResponse;
import com.yasin.shoppingapp.product.repository.mongo.ProductRepository;
import com.yasin.shoppingapp.product.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.util.List;


@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;
    private final ProductPriceService productPriceService;
    private final ProductDeliveryService productDeliveryService;
    private final ProductAmountService productAmountService;
    private final ProductImageService productImageService;

    public Flux<ProductResponse> getAll() {
        productEsRepository.findAll().map(this::mapToDto);
        // 1 - es den sorgula

        // 4 - response nesnesine donusur
        return null;
    }



    List<ProductResponse> save() {
        // 1 - mongoya yaz
        // 2 - elasticten guncelle
        // 3 - redisten guncelle
        // 4 - Es den cevap don
        // 5 - response nesnesine dondur
        return null;
    }
    //  - Calc fieldları isle
    //  - redisten ihtiyac alanlar,n, getir
    private ProductResponse mapToDto(ProductEs item) {
        if (item == null) {
            return null;
        }
        BigDecimal productPrice =  productPriceService.getByMoneyType(item.getId(), MoneyTypes.USD);
        return ProductResponse.builder()
                .price(productPrice)
                .name(item.getName())
                .features(item.getFeatures())
                .id(item.getId())
                .description(item.getDescription())
                .deliveryIn(productDeliveryService.getDeliveryInfo(item.getId()))
                .categoryId(item.getCategory().getId())
                .available(productAmountService.getByProductId(item.getId()))
                .freeDelivery(productDeliveryService.freeDeliveryCheck(item.getId(), productPrice))
                .moneyType(MoneyTypes.USD)
                .image(productImageService.getProductMainImage(item.getId()))
                .seller(ProductSellerResponse.builder().id(item.getSeller().getId()).name(item.getName()).build())
                .build();
    }





}