import java.util.ArrayList;

public class PizzaMenu
    // Author Nicholas
{
    ArrayList<Pizza> pizzaMenu = new ArrayList<>();
    public void start()
    {
    pizzaMenu.add(new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke og oregano", 57));
    pizzaMenu.add(new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53));
    pizzaMenu.add(new Pizza(3, "Cacciatora", "tomatsauce, ost, pepperoni og oregano", 57));
    pizzaMenu.add(new Pizza(4, "Carbona", "tomatsauce, ost, kødsauce, spghetti, coktailpølser og oregano", 63));
    pizzaMenu.add(new Pizza(5, "Dennis", "tomatsauce, ost, bacon og oregano", 65));
    pizzaMenu.add(new Pizza(6, "Bertil", "tomatsauce, ost, bacon og oregano", 57));
    pizzaMenu.add(new Pizza(7, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61));
    pizzaMenu.add(new Pizza(8, "Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61));
    pizzaMenu.add(new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61));
    pizzaMenu.add(new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61));
    pizzaMenu.add(new Pizza(11, "Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61));
    pizzaMenu.add(new Pizza(12, "Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61));
    pizzaMenu.add(new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61));
    pizzaMenu.add(new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61));
    }

}
