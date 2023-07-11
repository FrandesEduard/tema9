package org.fasttrackit.ex2;

public class DatabaseAdmin extends Employee implements Person{
    private String dbTechnology;

    public DatabaseAdmin(String position,String dbTechnology) {
        super(position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAdress(){
        String prefix = "db admin";
        return prefix;
    }

}
