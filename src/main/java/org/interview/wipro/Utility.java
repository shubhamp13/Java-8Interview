package org.interview.wipro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


public class Utility
{
    public static Date getDate(String date)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date d = null;
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public  static  List<Employee>getEmployees()
    {
        List<Employee> list = new ArrayList<Employee>();
        // Developer Department
        list.add(new Employee("Shubham Puri", 101, 26, "Developer", "Yes", 85000, getDate("20-08-2024")));
        list.add(new Employee("Amit Patel", 102, 29, "Developer", "No", 83000, getDate("25-07-2024")));
        list.add(new Employee("Rakesh Kumar", 103, 27, "Developer", "Yes", 84000, getDate("15-06-2024")));
        list.add(new Employee("Sneha Verma", 104, 25, "Developer", "Yes", 82000, getDate("10-05-2024")));

        // Tester Department
        list.add(new Employee("Riya Sharma", 105, 28, "Tester", "Yes", 78000, getDate("15-09-2024")));
        list.add(new Employee("Neha Gupta", 106, 31, "Tester", "Yes", 76000, getDate("01-12-2024")));
        list.add(new Employee("Arjun Rao", 107, 26, "Tester", "No", 77000, getDate("18-11-2024")));
        list.add(new Employee("Kavita Singh", 108, 29, "Tester", "Yes", 75000, getDate("21-10-2024")));

        // Networking Department
        list.add(new Employee("Rahul Mehta", 109, 30, "Networking", "No", 80000, getDate("10-10-2024")));
        list.add(new Employee("Sejal Patankar", 110, 21, "Networking", "Yes", 92000, getDate("20-01-2025")));
        list.add(new Employee("Rohit Sharma", 111, 28, "Networking", "No", 81000, getDate("25-09-2024")));
        list.add(new Employee("Anita Kumar", 112, 27, "Networking", "Yes", 79000, getDate("30-08-2024")));

        // Cyber Security Department
        list.add(new Employee("Priya Singh", 113, 27, "Cyber Security", "Yes", 87000, getDate("05-11-2024")));
        list.add(new Employee("Alok Kumar", 114, 33, "Cyber Security", "No", 89000, getDate("17-02-2025")));
        list.add(new Employee("Suresh Verma", 115, 30, "Cyber Security", "Yes", 88000, getDate("12-03-2025")));
        list.add(new Employee("Manisha Reddy", 116, 29, "Cyber Security", "No", 86000, getDate("08-04-2025")));
        return list;
    }
    public static void maxSalaries()
    {
        List<Employee> employees= getEmployees();
        Optional<Employee> employeeMaxSal = employees.stream().max(Comparator.comparing(Employee::getSalary));
        employeeMaxSal.ifPresent(System.out::println);
    }
    public static void minSalaries()
    {
        List<Employee> employees= getEmployees();
        Optional<Employee>employeeMinSal=employees.stream().min(Comparator.comparing(Employee::getSalary));
        employeeMinSal.ifPresent(System.out::println);
    }
    public static void departmentWiseMaxSalary()
    {
        List<Employee>employees= getEmployees();
        Map<String,Optional<Employee>>map= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        map.forEach((key,value)-> System.out.println(key+"="+value.get()));
    }
    public static  void status()
    {
        List<Employee> employees= getEmployees();
        Map<String,List<Employee>>m= employees.stream().collect(Collectors.groupingBy(Employee::getActive));
        m.forEach((key,value)-> System.out.println(key+" "+value));
    }
    public static  void  departmentWiseEmployee()
    {
        List<Employee> employees= getEmployees();
        Map<String,List<Employee>>m= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        m.forEach((key,value)-> System.out.println(key+" "+value));

    }
    public static void countOfEmployees()
    {
        List<Employee> employees= getEmployees();
        Map<String,Long>map=   employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        map.forEach((key,value)->System.out.println(key+" "+value));
    }
}
