package model;

public class Product {
    private int id;
    private String name;
    private double calorie;
    private double price;

    public Product() {

    }

    public Product(int id, String name, double calorie, double price) {
        this.id = id;
        this.name = name;
        this.calorie = calorie;
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

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}