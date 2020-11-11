import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class Console  //Author: Jonas & Ole & Nicholas & Kim

{
    PizzaMenu pm = new PizzaMenu();
    boolean running = true;
    boolean completed = false;
    int orderNumber = 0;
    ArrayList<Order> orders = new ArrayList<Order>();
    double totalPrice;
    int p = 1;
    public void addOrder(Order a)
    {
        orders.add(a);
    }
    public void startConsole()
    {
        pm.start();

        Scanner sc = new Scanner(System.in);

        while (running)
        {
            System.out.println(
                    "\n " +
                    "\n " +
                    "\nMario's Pizzabar" +
                    "\n----------------" +
                    "\n1) Show Menu" +
                    "\n2) Create order" +
                    "\n3) Show orders" +
                    "\n4) Show: End of day" +
                    "\n5) Exit" +
                    "\n----------------" +
                    "\n(Please choose an option 1-5)");

            String cmd = sc.nextLine();
            if (cmd.equals("1"))
            {
                System.out.println(" 1.  Vesuvio:      tomatsauce, ost, skinke og oregano                             -  57,-\n" +
                        " 2.  Amerikaner:   tomatsauce, ost, oksefars og oregano                           -  53,-\n" +
                        " 3.  Cacciatora:   tomatsauce, ost, pepperoni og oregano                          -  57,-\n" +
                        " 4.  Carbona:      tomatsauce, ost, kødsauce, spghetti, coktailpølser og oregano  -  63,-\n" +
                        " 5.  Dennis:       tomatsauce, ost, bacon og oregano                              -  65,-\n" +
                        " 6.  Bertil:       tomatsauce, ost, bacon og oregano                              -  57,-\n" +
                        " 7.  Silvia:       tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano  -  61,-\n" +
                        " 8.  Victoria:     tomatsauce, ost, skinke, ananas, champignon, løg og oregano    -  61,-\n" +
                        " 9.  Toronfo:      tomatsauce, ost, skinke, bacon, kebab, chili og oregano        -  61,-\n" +
                        " 10. Capricciosa:  tomatsauce, ost, skinke, champignon og oregano                 -  61,-\n" +
                        " 11. Hawai:        tomatsauce, ost, skinke, ananas og oregano                     -  61,-\n" +
                        " 12. Le Blissola:  tomatsauce, ost, skinke, rejer og oregano                      -  61,-\n" +
                        " 13. Venezia:      tomatsauce, ost, skinke, bacon og oregano                      -  61,-\n" +
                        " 14. Mafia:        tomatsauce, ost, pepperoni, bacon, løg og oregano");
            }
            if (cmd.equals("2"))
            {
                double totalPrice = 0;
                System.out.println("Input desired pizzas, separated by space");
                String pizzas = sc.nextLine();
                String[] temp = pizzas.split(" ", 50); // String temp[pizzas]
                for (int i = 0; i < temp.length; i++)
                {
                    int tempNumb = Integer.parseInt(temp[i]) - 1;
                    totalPrice += pm.pizzaMenu.get(tempNumb).getPrice();

                }
                System.out.println("Pizza ordered : "
                        + Arrays.toString(temp));


                System.out.println("type pickup time, use military time ie. 1930");
                int pickUpTime = sc.nextInt();
                Order o = new Order(p ,pizzas, pickUpTime, false, totalPrice);
                orders.add(o);
                System.out.println(orders);
                cmd = "0";
                p++;
            }
            if (cmd.equals("3"))
            {
                System.out.println(
                        "\n " +
                                "\n----------------" +
                                "\n1) Show all orders" +
                                "\n2) Complete order" +
                                "\n3) Show unfinnished orders" +
                                "\n----------------" +
                                "\n(Please choose an option 1-3)");
                cmd = sc.nextLine();
                if (cmd.equals("1"))
                {
                    System.out.println(orders);
                }
                cmd = sc.nextLine();
                if (cmd.equals("2"))
                {
                    System.out.println(orders);
                    System.out.println("Select order to complete");
                    cmd = sc.nextLine();
                    int tempNumb = Integer.parseInt(cmd);
                    orders.get(tempNumb-1).completed = true;
                }
                if (cmd.equals("3"))
                {
                    System.out.println("Showing all unfinished orders:");
                    for ( Order s : orders )
                    {
                        if (s.completed = false)
                            System.out.println(s);
                    }
                }
            }
            if (cmd.equals("4"))
            {
                System.out.println("Showing all finished orders:");
                for ( Order s : orders )
                {
                    if (s.completed)
                        System.out.println(s);
                }
            }
            if (cmd.equals("5"))
            {
            running = false;
            }
        }
    }

}