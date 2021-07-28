package com.daniela.apis;

public class Example2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "London", 5000);

        System.out.println(employee1);

        Manager manager1 = new Manager();
        System.out.println(manager1);

        Manager manager2 = new Manager("Mary", "London", 5000, "IT");
        System.out.println(manager2);
        String stringRepresentationForManager2 = manager2.toString();
        System.out.println(stringRepresentationForManager2);

        System.out.println(manager2.getClass());

        Employee employee2 = new Employee("John", "London", 5000);
        System.out.println("employee1.equals(employee2): " + employee1.equals(employee2));

        Manager manager3 = new Manager("Mary", "London", 5000, "IT");
        System.out.println("manager2.equals(manager3): " + manager2.equals(manager3));
    }
}
