package com.example.demoproduct.services;

import com.example.demoproduct.dtos.FakeStoreProduct;
import com.example.demoproduct.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class fakeStoreproductImpl implements ProductService{
    @Override
    public Product getProductById(long id) {
        /*
            Take id from input and pass it to the fakestore api
            https://fakestoreapi.com/products/{id}
        */
        String url = "https://fakestoreapi.com/products/"+id;
        RestTemplate restTemplate  = new RestTemplate(); // rest template is used for calling 3rd party apis
        FakeStoreProduct fakeStoreProductdto = restTemplate.getForObject(url, FakeStoreProduct.class);
        return convertfakeStoreProdutToProduct(fakeStoreProductdto);
    }

    private  Product convertfakeStoreProdutToProduct(FakeStoreProduct dto){
        Product product = new Product();
        product.setName(dto.getTitle());
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        return product;
    }
}
