package de.ait_tr.DiaHelper.domain.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductDto {
    private Long id;
    private String productTitle;
    private BigDecimal glucose;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public BigDecimal getGlucose() {
        return glucose;
    }

    public void setGlucose(BigDecimal glucose) {
        this.glucose = glucose;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return Objects.equals(id, that.id) && Objects.equals(productTitle, that.productTitle) && Objects.equals(glucose, that.glucose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productTitle, glucose);
    }

    @Override
    public String toString() {
        return String.format("Product: ID - %d, productTitle - %s, glucose - %.2f  ",
                id, productTitle, glucose);
    }
}