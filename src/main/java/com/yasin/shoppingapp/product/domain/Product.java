package com.yasin.shoppingapp.product.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collection = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Builder
public class Product {
    // Bu product ı dışarı açmıyoruz. Çünkü dışardan erişim olmasın istiyoruz.
    private String id;
    private String name;
    private Boolean active;
    private String description;
    private String companyId;
    private String features;
    private String categoryId;
    private List<ProductImage> productImage;
    private String code; // name+model ex: iphone/12 url path için belki

    /*
    document - ES elasticsearch
    description
    id : mongo
    freeDelivery: false  - Service if price >50
    money : enum ()
    available : kalan adet -redis document
    feature(ürün üzellikleri): html olacak document ES
    seller: document: ES
    image : https://....//... farklı resim işlemleri  sub-document (mongo)
    price: --> Bu sürekli degisecegi icin burada tutmak mantıklı degil
     */


}
