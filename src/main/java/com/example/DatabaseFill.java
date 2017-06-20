package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by student on 5/25/17.
 */
@Component
public class DatabaseFill implements CommandLineRunner {
    @Autowired
    PersonRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Person p = new Person();
        Person p1 = new Person();
        p.setLastName("Petrov");
        p.setFirstName("Petr");
        repository.save(p);
        p1.setLastName("Ivanov");
        p1.setFirstName("Ivan");
        p2.setLastName("Sergeev");
        p2.setFirstName("Sergey");
        repository.save(p1);
    }


}
