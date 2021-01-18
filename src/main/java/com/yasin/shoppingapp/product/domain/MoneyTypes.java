package com.yasin.shoppingapp.product.domain;

public enum MoneyTypes {
    USD("Dollar", "$"),
    EUR("Euro", "£"),
    TL("Tl", "₺");

    private String label;  // Dollar
    private String symbol; // $

    MoneyTypes(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }
}
