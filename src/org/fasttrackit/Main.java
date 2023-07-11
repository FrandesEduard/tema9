package org.fasttrackit;

import org.fasttrackit.ex1.Cosmetics;
import org.fasttrackit.ex1.Electronics;
import org.fasttrackit.ex1.Fridge;
import org.fasttrackit.ex2.DatabaseAdmin;
import org.fasttrackit.ex2.Employee;
import org.fasttrackit.ex2.Programmer;

public class Main {
    public static void main(String[] args) {
        //ex1
        Cosmetics fard = new Cosmetics(300, "Chanell", "fard pentru machiaj", 5, "rosu", 2);
        System.out.println(fard.getColor());
        Electronics televizor = new Electronics(1800, "samsung", "Tv 4k", 5, "TV", 190, 3, 66, 12.5);
        televizor.setHeight(30);
        System.out.println(televizor.getHeight() + " " + televizor.getName());
        Fridge bekoFridge = new Fridge(3000, "Beko Fridge", "frigider", 1, "electronics", 1, 2, 3, 32, -5);
        System.out.println("Oferta frigider " + bekoFridge.getName() + " " + bekoFridge.getPrice() + " RON!");
        System.out.println("--------------------------");
        //ex2
        Employee marci = new Employee("programmer");
        System.out.println(marci.birthday());
        Programmer andrei = new Programmer("junior","idk");
        System.out.println(andrei.getPosition());
        DatabaseAdmin dorel = new DatabaseAdmin("database admin","MySQL");
        System.out.println(dorel.getAdress());

    }
}