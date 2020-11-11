
import java.util.ArrayList;
import java.util.List;

//Author Ole
public class Order
{
    String pizzaer;
    int pickUpTime;
    boolean completed;
    double totalPrice;
    int orderNr = 1;

    public Order(int orderNr, String pizzaer, int pickUpTime, boolean completed, double totalPrice)
    {
        this.pizzaer = pizzaer;
        this.pickUpTime = pickUpTime;
        this.completed = completed;
        this.totalPrice = totalPrice;
        this.orderNr = orderNr;
    }

    public String getPizzaer()
    {
        return pizzaer;
    }

    public void setPizzaer(String pizzaer)
    {
        this.pizzaer = pizzaer;
    }

    public int getPickUpTime()
    {
        return pickUpTime;
    }

    public void setPickUpTime(int pickUpTime)
    {
        this.pickUpTime = pickUpTime;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString()
    {
        return  "Nr: " + orderNr +
                ", pizzas: " + pizzaer +
                ", pickUpTime: " + pickUpTime +
                ", completed: " + completed +
                ", totalPrice: " + totalPrice +
                "\n";
    }
}
