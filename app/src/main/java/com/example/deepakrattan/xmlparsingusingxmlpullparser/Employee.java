package com.example.deepakrattan.xmlparsingusingxmlpullparser;

/**
 * Created by deepak.rattan on 5/9/2017.
 */

public class Employee {
    private int id;
    private String name;
    private float salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " Id= "+id + "\n Name= " + name + "\n Salary= " + salary;
    }
}
