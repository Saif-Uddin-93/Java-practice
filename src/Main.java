public class Main {
    public static void main(String[] args){
        System.out.println("This is the main");

        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples", 20);
        Item item2 = new Item("Oranges", 10);

        inventory.addItem(item1);
        inventory.addItem(item2);

        inventory.displayInventory();
    }
}
