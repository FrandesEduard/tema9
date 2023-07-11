package org.fasttrackit.ex2;

import java.time.LocalDateTime;

public class Employee implements Person {

    @Override
    public String firstName() {
        return null;
    }

    @Override
    public String lastName() {
        return null;
    }

    @Override
    public LocalDateTime birthday() {
        return Person.super.birthday();
    }

    @Override
    public String getAdress() {
        String getAdress = "db admin";
        return getAdress;
    }

    private LocalDateTime dateOfEmployment() {
        return LocalDateTime.now();
    }

    private String position;

    public Employee(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
