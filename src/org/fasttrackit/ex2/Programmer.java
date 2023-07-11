package org.fasttrackit.ex2;

public class Programmer extends Employee{
    private String language;


    public Programmer(String position,String language) {
        super(position);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
