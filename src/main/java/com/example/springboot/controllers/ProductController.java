package com.example.springboot.controllers;

import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


}
