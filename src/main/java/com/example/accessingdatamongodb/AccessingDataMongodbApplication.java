package com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    /**
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {


        // Update a user
        Customer jia = new Customer("Jia", "Jia",
            new Hobby("Running", "2")
        );
        jia.addHobby(new Hobby("Shopping", "5"));
        jia.setId("60b840c267fdee2d0d13f765");
        repository.save(jia);


        // repository.deleteAll();
        //
        // // save a couple of customers
        // repository.save(new Customer("Alice", "Smith"));
        // repository.save(new Customer("Bob", "Smith"));
        //
        // Customer jia = new Customer("Jia", "Jia",
        //     new Hobby("Running", "2")
        // );
        // jia.addHobby(new Hobby("Sleep", "8"));
        // jia.addHobby(new Hobby("Eating", "3"));
        // repository.save(jia);
        //
        // System.out.println("-------- jia saved ------------");
        // jia.addHobby(new Hobby("Push Ups", "0.5"));
        // repository.save(jia);
        //
        // // fetch all customers
        // System.out.println("\nCustomers found with findAll():");
        // System.out.println("-------------------------------");
        // for (Customer customer: repository.findAll()) {
        //     System.out.println(customer);
        // }
        // System.out.println();
        //
        // // fetch an individual customer
        // System.out.println("\nCustomer found with findByFirstName('Alice'):");
        // System.out.println("--------------------------------");
        // System.out.println(repository.findByFirstName("Alice"));
        //
        // System.out.println("\nCustomers found with findByLastName('Smith'):");
        // System.out.println("--------------------------------");
        // for (Customer customer: repository.findByLastName("Smith")) {
        //     System.out.println(customer);
        // }
        // System.out.println("");

    }

}