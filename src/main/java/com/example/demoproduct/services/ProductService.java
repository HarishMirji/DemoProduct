package com.example.demoproduct.services;

import com.example.demoproduct.exceptions.ProductNotFoundException;
import com.example.demoproduct.models.Product;

public interface ProductService {

    Product getProductById(long id) throws ProductNotFoundException;
}
