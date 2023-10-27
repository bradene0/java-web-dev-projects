
import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Create menu items
        MenuItem item1 = new MenuItem(9.99, "Spicy chicken wings", "Appetizer", true);
        MenuItem item2 = new MenuItem(24.99, "Grilled sirloin steak", "Main Course", false);
        MenuItem item3 = new MenuItem(6.99, "Decadent chocolate cake", "Dessert", true);

        // Create ArrayList of menu items
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

        // Create menu
        Date lastUpdated = new Date(); // Set the actual date here
        Menu menu = new Menu(lastUpdated, menuItems);

        // Display menu items and their details
        System.out.println("Menu Last Updated: " + menu.getLastUpdated());
        for (MenuItem menuItem : menu.getItems()) {
            System.out.println("Item: " + menuItem.getDescription());
            System.out.println("Price: $" + menuItem.getPrice());
            System.out.println("Category: " + menuItem.getCategory());
            System.out.println("New: " + (menuItem.getNew() ? "Yes" : "No"));
            System.out.println("-------------------------");
        }
    }
}