package org.interview;

import java.util.List;
import java.util.stream.Collectors;

public class Question5
{
    public static void main(String[] args) {
        List<Employee>employees=EmployeeDb.employeeList();

      List<Employee>emps=employees.stream()
                .filter(e->Integer.parseInt(e.getAge())>25)
                .collect(Collectors.toList());
      emps.forEach(System.out::println);

        var list = employees.stream().map(Employee::getName).toList();
        list.forEach(System.out::println);


    }

}
