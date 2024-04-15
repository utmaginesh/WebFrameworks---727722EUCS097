package com.example.cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.cw3.model.Product;
import com.example.cw3.repository.ProductRepo;
@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product createProduct(Product Product) {
        return productRepo.save(Product);
    }

    public Product getProductByid(int ProductId) {
        return productRepo.findById(ProductId).orElse(null);
    }

    public List<Product> getProducts(int pg, int sz){
        return productRepo.findAll(PageRequest.of(pg, sz)).getContent();
    }

    public List<Product> getProductsSorted(int pg, int sz, String f){
        return productRepo.findAll(PageRequest.of(pg, sz, Sort.by(f))).getContent();
    }

}

