package de.ait_tr.DiaHelper.controller;

import de.ait_tr.DiaHelper.domain.dto.ProductDto;
import de.ait_tr.DiaHelper.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    // GET - localhost:8080/products/5
    @GetMapping("/products/{id}")
    public ProductDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // GET - localhost:8080/products/all

    @GetMapping("/products/all")
    public List<ProductDto> getAll() {
        return service.getAll();
    }


    // Сохранять новый продукт в базе данных
    // может только администратор (пользователь с ролью ADMIN) return service.save(product);
    @PostMapping("/products/save/{id}")
    public ProductDto save(@RequestBody ProductDto product) {
        return service.save(product);
    }

    @PutMapping("/products/update/{id}")
    public void update(@RequestBody ProductDto product) {
        service.update(product);
    }

    @DeleteMapping("/products/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping("/products/title/{productTitle}")
    public void deleteByProductTitle(@PathVariable String productTitle) {
        service.deleteByProductTitle(productTitle);
    }
}