package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/food")
    public Food create(@RequestParam String name) {
        if (name.length() > 255) {
            throw new IllegalArgumentException("error han smiya ori9dr atzri 255");
        }
        Food food = foodService.create(name);
        return food;
    }

    public void update() {

    }

    public void read() {

    }

    public void delete() {

    }

}
