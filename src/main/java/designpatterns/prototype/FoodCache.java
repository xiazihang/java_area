package designpatterns.prototype;

import java.util.HashMap;

/**
 * Created by zhxia on 23/04/2017.
 */
public class FoodCache {
    public static HashMap<Integer, Food> foodCache = new HashMap<Integer, Food>();

    public static void loadCache() {
        SeaFood seaFood = new SeaFood();
        seaFood.setId(1);
        seaFood.setType("sea food");

        Noddle noddle = new Noddle();
        noddle.setId(2);
        noddle.setType("noddle");

        Rice rice = new Rice();
        rice.setId(3);
        rice.setType("rice");

        foodCache.put(1, seaFood);
        foodCache.put(2, noddle);
        foodCache.put(3, rice);
    }

    public static Food getFood(int id) {
        Food cachedFood = foodCache.get(id);
        return (Food) cachedFood.clone();
    }
}
