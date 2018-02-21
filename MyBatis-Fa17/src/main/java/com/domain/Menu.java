package com.domain;

import java.math.BigDecimal;

public class Menu extends MenuKey {
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}