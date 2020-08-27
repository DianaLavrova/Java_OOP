package com.diana.home;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>  {

    private List<T> fruitList = new ArrayList<>();

    public int put(T fruit){
      fruitList.add(fruit);
      return fruitList.size();
    }

    public float getWeight (){
        if (fruitList.size() <= 0){
            return 0;
        }
        return fruitList.size()*fruitList.get(0).getWeight();
    }

    public boolean compareWeight(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void moveFruits(Box box){
        for (T fruit : this.fruitList){
            box.put(fruit);
        }
        fruitList = new ArrayList<>();
    }
}
