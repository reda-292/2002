import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        GroceryList groceryList = new GroceryList();

        GroceryItemOrder item1 = new GroceryItemOrder("Apples", 0.5);
        item1.setQuantity(10);
        groceryList.add(item1);

        GroceryItemOrder item2 = new GroceryItemOrder("Bread", 2.0);
        item2.setQuantity(2);
        groceryList.add(item2);

        GroceryItemOrder item3 = new GroceryItemOrder("Milk", 1.5);
        item3.setQuantity(3);
        groceryList.add(item3);

        System.out.println(groceryList);


    }
}