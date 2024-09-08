package com.example.dreamshops.dto;

import com.example.dreamshops.model.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private String description;
    private int inventory;
    private Category category;
    private List<ImageDTO> images;
}
