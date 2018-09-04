package createPattern.builderPattern.builder;

import createPattern.builderPattern.actualFoods.ChickenBurger;
import createPattern.builderPattern.actualFoods.Coke;
import createPattern.builderPattern.actualFoods.Pepsi;
import createPattern.builderPattern.actualFoods.VeBurger;
import createPattern.builderPattern.meal.Meal;

/**
 * @author zxf
 * @date 2018/9/4 9:38
 */
//6. 创建一个MealBuilder类，实际的builder类负责创建Meal对象
public class MealBuilder {
    //准备素食食物
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VeBurger());
        meal.addItem(new Coke());
        return meal;
    }
    // 准备非素食食物
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

