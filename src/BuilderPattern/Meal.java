package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0;
        for (Item item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){
        for (Item item:items){
            System.out.print("Item: "+item.name());
            System.out.print(",Packing: "+item.packing().pack());
            System.out.print(",Price: "+item.price());
        }
    }
}
