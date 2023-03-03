package builder;

import java.util.*;

public class Meal {
    private List<Item> items = new ArrayList();
    public void addItem(Item item){
        items.add(item);
    }
    public double getCost(){
        double cost = 0;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for(Item item : items){
            System.out.println("Name: " + item.name());
            System.out.println("Packing: " + item.pack().pack());
            System.out.println("Price: " + item.price());
        }
    }
}
