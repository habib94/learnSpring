package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food create(String name) {
       return foodRepository.create(name);
    }

    public Food getByName(String name) {
        return foodRepository.getByName(name);
    }
}
