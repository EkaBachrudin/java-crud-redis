package com.danafix.com.services;

import com.danafix.com.models.entites.Product;
import com.danafix.com.models.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findOne(Long id){
            return productRepository.findById(id).get();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void removeOne(Long id){
        productRepository.deleteById(id);
    }
}
