import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory(){ // constructor
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayInventory(){
        for (Item item : items){
            System.out.println(String.format("Item: %s\nQuantity:%s", item.getName(), item.getQuantity()));
        }
    }
}