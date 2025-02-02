package Models;

public class Chocolate {
    private int id;
private String brand;
private String type;
private int quantity;
private float price;

public Chocolate(){
}

    public Chocolate(int id,String brand,String type,int quantity,float price){
    this.brand=brand;
    this.id = id;
    this.type=type;
    this.quantity=quantity;
    this.price=price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
