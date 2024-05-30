package de.ait_tr.DiaHelper.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.util.Objects;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "product_title")
    @NotNull(message = "Product title can not be null")
    @NotBlank(message = "Product title can not be empty")
    @Pattern(
            regexp = "[A-Z][a-z]{2,}",
            message = "Product title should be at least 3 character length, " +
                    " start with capital letter and may contain only latin characters"
    )
    private String productTitle;


    @Column(name = "glucose")
    @NotNull(message = "Can not be null")
    @NotBlank(message = "Can not be blank")
    private BigDecimal glucose;

//    @ManyToOne(fetch = FetchType.EAGER)
////    @JoinTable(
////            name = "category",
////            joinColumns = @JoinColumn(name = "id")
////                )
//    @JoinColumn (name = "category_id")
    private String category;

    public Product() {
    }

    public Product(Long id, String productTitle, BigDecimal glucose, String category) {
        this.id = id;
        this.productTitle = productTitle;
        this.glucose = glucose;
        this.category = category;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(productTitle, product.productTitle) && Objects.equals(glucose, product.glucose) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productTitle, glucose, category);
    }

    @Override
    public String toString() {
        return String.format("Product: ID - %d, product_title - %s, glucose - %.2f, category - %s",
                id, productTitle, glucose, category);
    }
}