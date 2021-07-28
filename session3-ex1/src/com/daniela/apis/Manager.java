package com.daniela.apis;

public class Manager extends Employee {
    private String department;

    public Manager() {
        System.out.println("Default constructor " +
                "for Manager was called.");
    }

    public Manager(String name, String address,
                   double salary, String department) {
        super(name, address, salary);//must be on the first line
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + department;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Manager) {
            Manager manager = (Manager) object;
            if(super.equals(manager) && this.department.equals(manager.department)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
