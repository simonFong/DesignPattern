package com.simonfong.myapplication.builderpattern.food;

import com.simonfong.myapplication.builderpattern.base.Item;
import com.simonfong.myapplication.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzimin
 * Created  on  2019/06/08.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            LogUtil.e("商品:" + item.name() + "--packing:" + item.packing().pack() + "--price:" + item.price());
        }
    }
}
