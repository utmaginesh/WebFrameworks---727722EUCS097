package com.example.cw3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

import com.example.cw3.model.Product;
import com.example.cw3.service.ProductService; 

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService; 

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product Product) {
        Product emp = productService.createProduct(Product);
        if(emp != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(emp);
         else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable("productId") int productId){
        return productService.getProductByid(productId);
    }
    
    @GetMapping("/product/{offset}/{pagesize}")
    public List<Product> getProduct(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize){
        return productService.getProducts(offset,pagesize);
    }
    @GetMapping("/product/{offset}/{pagesize}/{field}")
    public List<Product> getProduct(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize, @PathVariable("field") String field){
        return productService.getProductsSorted(offset,pagesize,field);
    }


}