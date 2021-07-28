package com.daniela.apis;
/*
    final applied on a class -> the class cannot be extended (inherited)
    final applied on a method -> the method cannot be overridden in a child class
 */
public /*final*/ class Employee {
    private String name;
    private String address;
    private double salary;

    public Employee() {
        System.out.println("Default constructor " +
                "for Employee was called.");
    }

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        System.out.println("Constructor with args " +
                "for Employee was called.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //suprascriu metoda toString() din clasa parinte Object
    // overriding toString() from parent class Object
    @Override
    public /*final*/ String toString() {
        return name + " / " + address + " / " + salary;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Employee) { //instanceof tests if the object referenced by "object" is of type "Employee"
            Employee employee = (Employee) object; //cast explicit; transform de la tipul Object la tipul Employee
            if (this.name.equals(employee.name) &&
                    this.address.equals(employee.address) &&
                    this.salary == employee.salary) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
