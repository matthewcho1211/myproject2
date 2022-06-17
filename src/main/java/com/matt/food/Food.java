package com.matt.food;

import java.util.ArrayList;
import java.util.Random;

public class Food {
    String food[] = {"麥當勞", "林立便當", "7-11", "鬍鬚張", "羊肉炒麵", "肉圓"};
    String breakfast[] = {"豬排蛋餅", "培根蛋餅","鐵板麵", "火腿蛋吐司","原味蛋餅", "蔥抓餅"};
    String seven_food[] = {"飯", "麵", "特殊類"};
    Random random = new Random();

    ArrayList<String> list = new ArrayList<>();

    public Food(){
    }

    public String getFood(){
        for (String f : food) {
            list.add(f);
        }
        int choose = random.nextInt(food.length);
        if(list.get(choose) == "7-11"){
            int seven_choose = random.nextInt(seven_food.length);
            return "7-11的 "+seven_food[seven_choose];
        }
        String result = list.get(choose);
        return result;
    }

    public String getBreakfast(){
        int choose = random.nextInt(food.length);
        return breakfast[choose];
    }

}
