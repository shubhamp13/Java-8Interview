package org.interview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question3
{
    public static void main(String[] args) {

        List<Employee>employees=EmployeeDb.employeeList();

        List<Employee>sortedEmpsByName=employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        sortedEmpsByName.forEach(System.out::println);
        System.out.println("\n\n");
        List<Employee>sortedById=employees.stream().sorted((a,b)->{
            Integer I1=Integer.parseInt(a.getId());
            Integer I2=Integer.parseInt(b.getId());
            return I1.compareTo(I2);
        }).collect(Collectors.toList());
        sortedById.forEach(System.out::println);
    }
}
