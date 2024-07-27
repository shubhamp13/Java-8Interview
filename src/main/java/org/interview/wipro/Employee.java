package org.interview.wipro;

import java.util.Date;

public class Employee
{
    private int id;
    private String name;
    private int age;
    private String active;
    private String department;
    private Date yearOfJoining;
    private double salary;

    public Employee(String name, int id, int age, String department, String active, double salary, Date yearOfJoining) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.department = department;
        this.active = active;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

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

    public   double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(Date yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "active='" + active + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}
