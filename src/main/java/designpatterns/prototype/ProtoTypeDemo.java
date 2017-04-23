package designpatterns.prototype;

import static designpatterns.prototype.FoodCache.getFood;
import static designpatterns.prototype.FoodCache.loadCache;

/**
 * Created by zhxia on 23/04/2017.
 */
public class ProtoTypeDemo {
    public static void main(String[] args) {
        loadCache();
        Food seaFood = getFood(1);
        Food noddleFood = getFood(2);
        Food riceFood = getFood(3);

        seaFood.smell();
        noddleFood.smell();
        riceFood.smell();
    }
}
