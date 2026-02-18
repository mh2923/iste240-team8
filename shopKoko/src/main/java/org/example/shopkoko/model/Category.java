package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private String CategoryName;
    private String description;

    //Constructor
    public Category() {

    }
    public Category(String CategoryName, String description) {
        this.CategoryName = CategoryName;
        this.description = description;
    }

    //Getters
    public String getCategoryName() {
        return CategoryName;
    }

    public String getDescription() {
        return description;
    }

    //Setters

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
