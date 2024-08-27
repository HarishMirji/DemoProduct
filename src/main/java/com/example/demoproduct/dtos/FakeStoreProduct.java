package com.example.demoproduct.dtos;

import lombok.Data;

@Data
public class FakeStoreProduct {

    long id;
    String title;
    String price;
    String description;
    String category;
    String image;

}
