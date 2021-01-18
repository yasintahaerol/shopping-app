package com.yasin.shoppingapp.product.domain.es;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Document(indexName = "product")
@EqualsAndHashCode(of = "id")
@Builder
public class ProductEs {

    // Elasticsearch içindeki bir nesneyi verecek
    public String id;
    private String name;
    private Boolean active;
    private String description;
    private CompanyEs seller; // Duplicate ediyoruz
    private String features;
    private CategoryEs category;
    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompanyEs getSeller() {
        return seller;
    }

    public void setSeller(CompanyEs seller) {
        this.seller = seller;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public CategoryEs getCategory() {
        return category;
    }

    public void setCategory(CategoryEs category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
