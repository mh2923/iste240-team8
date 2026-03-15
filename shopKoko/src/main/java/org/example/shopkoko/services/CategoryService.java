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
        Category Mouse = new Category("Mouse", "Device used to move cursor on computer screen.");
        Category Keyboard = new Category("Keyboard", "Device used to input characters on computer screen.");
        Category Monitor = new Category("Monitor", "");
        Category Laptop = new Category("Laptop", "");
        Category Mobile = new Category("Mobile", "");
        Category Headphones = new Category("Headphones", "");
        Category Tablets = new Category("Tablets", "");

        //Adding all the main categories to the list
        categoryList.add(Mouse);
        categoryList.add(Keyboard);
        categoryList.add(Monitor);
        categoryList.add(Laptop);
        categoryList.add(Mobile);
        categoryList.add(Headphones);
        categoryList.add(Tablets);

        //Sub categories
        Category OfficeWirelessmouse = new Category("OfficeWirelessmouse", "", Mouse);
        Category OfficeWiredmouse = new Category("OfficeWiredmouse", "", Mouse);
        Category OfficeWirelesskeyboard = new Category("OfficeWirelesskeyboard", "", Keyboard);
        Category OfficeWiredkeyboard = new Category("OfficeWiredkeyboard", "", Keyboard);
        Category GamingWirelessmouse = new Category("GamingWirelessmouse", "", Mouse);
        Category GamingWiredmouse = new Category("GamingWiredmouse", "", Mouse);
        Category GamingWirelesskeyboard = new Category("GamingWirelesskeyboard", "", Keyboard);
        Category GamingWiredkeyboard = new Category("GamingWiredkeyboard", "", Keyboard);
        Category OfficeLaptop = new Category("OfficeLaptop", "", Laptop);
        Category GamingLaptop = new Category("GamingLaptop", "", Laptop);
        Category InEarHeadphones = new Category("InEarHeadphones", "", Headphones);
        Category OverEarHeadphones = new Category("OverEarHeadphones", "", Headphones);
        Category OnEarHeadphones = new Category("OnEarHeadphones", "", Headphones);

        //Adding all the subcategories to the list as well
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

    public void AddCategories(Category category) {
        categoryList.add(category);
    }
    }