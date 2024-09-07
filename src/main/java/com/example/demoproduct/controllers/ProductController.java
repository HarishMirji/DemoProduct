package com.example.demoproduct.controllers;

import com.example.demoproduct.exceptions.ProductNotFoundException;
import com.example.demoproduct.models.Product;
import com.example.demoproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET /products/{id}
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productId) throws ProductNotFoundException {
//        if (productId < 1 || productId > 20) {
//            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
//        }
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/products/name/{name}")
    public ResponseEntity<Product> getProductByName(@PathVariable("name") String name) throws ProductNotFoundException {
//        if (productId < 1 || productId > 20) {
//            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        //Hi Hello
//        }
        Product product = productService.getProductByName(name);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }

}
