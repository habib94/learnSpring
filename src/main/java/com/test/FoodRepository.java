package com.test;

import org.springframework.stereotype.Service;

@Service
public class FoodRepository {


    public Food create(String name) {

        return new Food(name);
    }

    public Food getByName(String name) {
        // call to DB;
        return null;
    }
}
