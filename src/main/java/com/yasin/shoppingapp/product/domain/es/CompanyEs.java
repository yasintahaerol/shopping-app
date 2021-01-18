package com.yasin.shoppingapp.product.domain.es;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class CompanyEs {
    private String id;
    private String name;
    private String code;

}
