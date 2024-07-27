package org.interview.wipro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question10
{
    public static void minMaxSalaries(List<Employee> employees)
    {
            Optional<Employee> employeeMaxSal = employees.stream().max(Comparator.comparing(Employee::getSalary));
        employeeMaxSal.ifPresent(System.out::println);
            Optional<Employee>employeeMinSal=employees.stream().min(Comparator.comparing(Employee::getSalary));
            employeeMinSal.ifPresent(System.out::println);

    }
    public static void main(String[] args)
    {
        List<Employee> employees=Utility.getEmployees();
        minMaxSalaries(employees);
    }
}
