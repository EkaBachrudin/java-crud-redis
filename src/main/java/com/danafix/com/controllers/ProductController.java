package com.danafix.com.controllers;

import com.danafix.com.models.entites.Product;
import com.danafix.com.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public Iterable<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable(value = "product",key = "#id")
    public Product findOne(@PathVariable("id") Long id){
        return productService.findOne(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping
    public void delete(Long id){
        productService.removeOne(id);
    }
}
