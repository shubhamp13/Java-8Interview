package org.interview;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDb
{
    public static  List<Employee>employeeList()
    {
        List<Employee>employees=new ArrayList<>();
        // Adding Pune employees
        // Adding Pune employees
        employees.add(new Employee("Shubham", "101", "26", "Pune"));
        employees.add(new Employee("Shrikant", "102", "21", "Pune"));
        employees.add(new Employee("Sejal", "103", "22", "Pune")); // Added age
        employees.add(new Employee("Ravi", "104", "30", "Pune")); // Added age
        employees.add(new Employee("Anita", "105", "28", "Pune")); // Added age
        employees.add(new Employee("Rohit", "106", "24", "Pune")); // Added age
        employees.add(new Employee("Priya", "107", "29", "Pune")); // Added age

        // Adding Bangalore employees
        employees.add(new Employee("Ashish", "201", "32", "Banglore")); // Added age
        employees.add(new Employee("Nisha", "202", "27", "Banglore")); // Added age
        employees.add(new Employee("Vikram", "203", "35", "Banglore")); // Added age
        employees.add(new Employee("Sita", "204", "31", "Banglore")); // Added age

        return employees;
    }
}
