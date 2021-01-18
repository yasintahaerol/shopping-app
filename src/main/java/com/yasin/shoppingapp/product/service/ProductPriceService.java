package com.yasin.shoppingapp.product.service;

import com.yasin.shoppingapp.product.domain.MoneyTypes;
import com.yasin.shoppingapp.product.repository.mongo.ProductPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@RequiredArgsConstructor
public class ProductPriceService {

    private final ProductPriceRepository productPriceRepository;

    public BigDecimal getByMoneyType(String id, MoneyTypes usd) {
        return  BigDecimal.TEN;
    }
    /*
    todo
     */
}
