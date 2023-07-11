package org.fasttrackit.ex1;

public class Fridge extends Electronics{
    private int temperature;

    public Fridge(int price, String name, String description, int quantity, String type, double lenght, double width, double height, double weight, int temperature) {
        super(price, name, description, quantity, type, lenght, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
