package org.fasttrackit.ex2;

import java.time.LocalDateTime;

public interface Person {
    String firstName();

    String lastName();

    default LocalDateTime birthday() {
        return LocalDateTime.now();
    }

    String getAdress();

}
