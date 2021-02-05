package homeworks.hw05.task02;

public class Item {
    private double price;
    private double weight;
    private String name;

    @Override
    public String toString() {
        return name + ": " + price + "$/" + weight+"kg";
    }

    public Item(double price, double weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
