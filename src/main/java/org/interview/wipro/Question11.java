package org.interview.wipro;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question11
{
    public static void departmentWiseMaxSalary(List<Employee>employees)
    {
       Map<String,Optional<Employee>>map= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
       map.forEach((key,value)-> System.out.println(key+"="+value.get()));
    }

    public static void main(String[] args) {
        departmentWiseMaxSalary(Utility.getEmployees());
    }
}
