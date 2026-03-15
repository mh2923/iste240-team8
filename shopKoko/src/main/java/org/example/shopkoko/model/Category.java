package org.example.shopkoko.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private String CategoryName;
    private String description;
    private Category ParentCategory;


    //Constructors
    public Category() {

    }
    public Category(String CategoryName, String description) {
        this.CategoryName = CategoryName;
        this.description = description;
    }

    public Category(String CategoryName, String description, Category ParentCategory) {
        this.CategoryName = CategoryName;
        this.description = description;
        this.ParentCategory = ParentCategory;
    }

    //Getters
    public String getCategoryName() {
        return CategoryName;
    }

    public String getDescription() {
        return description;
    }

    public Category getParentCategory() {return ParentCategory;}

    //Setters

    public void setCategoryName(String categoryName) {CategoryName = categoryName;}

    public void setParentCategoryName(String parentCategoryName) {CategoryName = parentCategoryName;}

    public void setDescription(String description) {
        this.description = description;
    }
}
