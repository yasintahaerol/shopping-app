package com.yasin.shoppingapp.product.domain.es;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.web.bind.annotation.GetMapping;

@Document(indexName = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductEs {

    // Elasticsearch içindeki bir nesneyi verecek
    private String id;
    private String name;
    private Boolean active;
    private String description;
    private CompanyEs seller; // Duplicate ediyoruz
    private String features;
    private CategoryEs category;
    private String code;
}
