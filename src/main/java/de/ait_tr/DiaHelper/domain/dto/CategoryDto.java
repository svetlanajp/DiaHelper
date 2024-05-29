package de.ait_tr.DiaHelper.domain.dto;

import java.util.Objects;

    public class CategoryDto {

        private Long id;
        private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductTitle() {
        return title;
    }

    public void setProductTitle(String productTitle) {
        this.title = productTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDto category = (CategoryDto) o;
        return Objects.equals(id, category.id) && Objects.equals(title, category.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return String.format("Category: ID - %d, title - %s",
                id,title);
    }
}
