import java.util.ArrayList;

//Author Jonas
public class Pizza {


private int id;
private String name;
private String info;
private double price;

    public Pizza(int id, String name, String info, double price) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}