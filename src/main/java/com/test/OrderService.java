package com.test;

public class OrderService {

    private FoodService foodService = new FoodService();

    public String create(String name, int quantity) {
        Food food = foodService.getByName(name);
        if(food == null){
            return "error : lmakla ortli";
        }
        //
        return null;
    }
}
