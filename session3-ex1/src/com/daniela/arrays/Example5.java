package com.daniela.arrays;

import com.daniela.apis.*;

public class Example5 {
    public static void main(String[] args) {
        Employee [] employees = new Employee[3];
        employees[0] = new Employee("John", "London", 5000);

        for(Employee e : employees) {
            System.out.println(e);
        }


        Manager m1 = new Manager("Leo", "Bucharest", 4000, "IT");
        Manager m2 = new Manager("Mary", "London", 6000, "HR");
        Employee e1 = new Employee("Anne", "London", 3000);

        Employee [] allEmployees = new Employee[3];
        allEmployees[0] = m1; //Employee e = new Manager();
                              // -> POLIMORFISM: pot sa accesez o instanta cu
                              // o referinta de clasa superioara
        allEmployees[1] = m2;
        allEmployees[2] = e1;

        System.out.println("All employees: ");
        for(Employee e : allEmployees) {
            System.out.println(e.toString());
        }
    }
}
