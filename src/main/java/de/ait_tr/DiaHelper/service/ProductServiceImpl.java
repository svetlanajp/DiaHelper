package de.ait_tr.DiaHelper.service;

import de.ait_tr.DiaHelper.domain.dto.ProductDto;
import de.ait_tr.DiaHelper.service.interfaces.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private List<ProductDto> products = new ArrayList<>();

    @Override
    public ProductDto save(ProductDto product) {
        products.add(product);
        return product;
    }

    @Override
    public List<ProductDto> getAll() {
        return new ArrayList<>(products);
    }

    @Override
    public ProductDto getById(Long id) {
        Optional<ProductDto> product = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
        return product.orElse(null);
    }

    @Override
    public void update(ProductDto product) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            products.set(index, product);
        }
    }

    @Override
    public void deleteById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public void deleteByProductTitle(String productTitle) {
        products.removeIf(p -> p.getProductTitle().equalsIgnoreCase(productTitle));
    }

 }