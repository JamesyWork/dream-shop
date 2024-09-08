package com.example.dreamshops.request;

import com.example.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private String description;
    private int inventory;
    private Category category;
}
