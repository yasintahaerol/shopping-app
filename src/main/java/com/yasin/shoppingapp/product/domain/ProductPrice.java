package com.yasin.shoppingapp.product.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "product_price") // -> mondoDb den geliyor.
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductPrice {
    private String id;
    private String productId;
    private String moneyType;
    private String price;

}
