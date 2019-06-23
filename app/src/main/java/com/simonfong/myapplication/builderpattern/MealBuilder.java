package com.simonfong.myapplication.builderpattern;

import com.simonfong.myapplication.builderpattern.food.ChickenBurger;
import com.simonfong.myapplication.builderpattern.food.Coke;
import com.simonfong.myapplication.builderpattern.food.Meal;
import com.simonfong.myapplication.builderpattern.food.Pepsi;
import com.simonfong.myapplication.builderpattern.food.Rice;
import com.simonfong.myapplication.builderpattern.food.VegBurger;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareMeal3() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareMeal4() {
        Meal meal = new Meal();
        meal.addItem(new Rice());
        meal.addItem(new Coke());
        return meal;
    }
}
