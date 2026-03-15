package org.example.shopkoko.services;

import org.example.shopkoko.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    private List<Category> categoryList = new ArrayList<Category>();
    public CategoryService() {

        /*
        * There will be main categories. This will be holding all the subcategories together.
        * Example can be of Mouse lets say.
        * Mouse can be of 2 types- Wired and wireless.
        * They can be a normal office mouse or gaming mouse.
        * Office and wireless mouse both will be wireless or wireless.
        * Adding them to sub categories will make it structured properly
        */

        //Main categories
        Category Mouse = new Category(
                "Mouse",
                "Device used to move cursor on computer screen.");
        Category Keyboard = new Category(
                "Keyboard",
                "Device used to input characters on computer screen.");
        Category Monitor = new Category(
                "Monitor",
                "Device used to see computer screen.");
        Category Laptop = new Category(
                "Laptop",
                "Handheld device which can be carried around.");
        Category Mobile = new Category(
                "Mobile",
                "Handheld device which can be used to communicate, click photographs and much more.");
        Category Headphones = new Category(
                "Headphones",
                "Device which can be used to hear audio output from any electronic device");
        Category Tablets = new Category(
                "Tablets",
                "Device similar to a mobile but with a bigger screen.");

        //Adding all the main categories to the list
        categoryList.add(Mouse);
        categoryList.add(Keyboard);
        categoryList.add(Monitor);
        categoryList.add(Laptop);
        categoryList.add(Mobile);
        categoryList.add(Headphones);
        categoryList.add(Tablets);

        //Sub categories
        Category OfficeWirelessmouse = new Category(
                "OfficeWirelessmouse",
                "Wireless mouse which can be used in offices. It focuses more on looks and cost rather than performance. ",
                Mouse);
        Category OfficeWiredmouse = new Category(
                "OfficeWiredmouse",
                "Wired mouse which can be used in offices. It focuses more on looks and cost rather than performance",
                Mouse);
        Category OfficeWirelesskeyboard = new Category(
                "OfficeWirelesskeyboard",
                "Wireless keyboard which can be used in offices. It focuses more on looks and cost rather than performance.",
                Keyboard);
        Category OfficeWiredkeyboard = new Category(
                "OfficeWiredkeyboard",
                "Wired keyboard which can be used in offices. It focuses more on looks and cost rather than performance.",
                Keyboard);
        Category GamingWirelessmouse = new Category(
                "GamingWirelessmouse",
                "Wireless mouse which can be used for gaming. It focuses on performance above anything.",
                Mouse);
        Category GamingWiredmouse = new Category(
                "GamingWiredmouse",
                "Wired mouse which can be used for gaming. It focuses on performance above anything.",
                Mouse);
        Category GamingWirelesskeyboard = new Category(
                "GamingWirelesskeyboard",
                "Wireless keyboard which can be used for gaming. It focuses on performance above anything.",
                Keyboard);
        Category GamingWiredkeyboard = new Category(
                "GamingWiredkeyboard",
                "Wired keyboard which can be used for gaming. It focuses on performance above anything.",
                Keyboard);
        Category OfficeLaptop = new Category(
                "OfficeLaptop",
                "A movable computer which focuses on weight and sleekness over performance",
                Laptop);
        Category GamingLaptop = new Category(
                "GamingLaptop",
                "A movable computer which focuses on performance over weight and looks",
                Laptop);
        Category InEarHeadphones = new Category(
                "InEarHeadphones",
                "Headphones which are put inside the ear similar to airpods.",
                Headphones);
        Category OverEarHeadphones = new Category(
                "OverEarHeadphones",
                "Headphones which cover the entire ear promising best sound cancellation and immersive experience.",
                Headphones);
        Category OnEarHeadphones = new Category(
                "OnEarHeadphones",
                "Headphones which are on the ear. They dont provide best sound cancelling but provide a good experience.",
                 Headphones);

        //Adding all the sub-categories to the list as well
        categoryList.add(OfficeWirelessmouse);
        categoryList.add(OfficeWiredmouse);
        categoryList.add(OfficeWirelesskeyboard);
        categoryList.add(OfficeWiredkeyboard);
        categoryList.add(GamingWirelessmouse);
        categoryList.add(GamingWiredmouse);
        categoryList.add(GamingWirelesskeyboard);
        categoryList.add(GamingWiredkeyboard);
        categoryList.add(OfficeLaptop);
        categoryList.add(GamingLaptop);
        categoryList.add(InEarHeadphones);
        categoryList.add(OverEarHeadphones);
        categoryList.add(OnEarHeadphones);
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    //Function for adding categories to the list
    public void AddCategories(Category category) {
        categoryList.add(category);
    }

    //Function for searching for a particular category from the list.
    public Category findCategorybyname(String categoryname) {
        //For each loop to find out each category.
        for (Category category : categoryList) {
            if (category.getCategoryName() == categoryname) {
                // If the category needed is the category needed. The result should be returned
                return category;
            }
        }
        // If the category needed is not the category needed. The result should be null.
        return null;
    }}
