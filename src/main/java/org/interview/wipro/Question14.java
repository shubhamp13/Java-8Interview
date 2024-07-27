package org.interview.wipro;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Question14
{
    public static void countOfEmployees(List<Employee> employees)
    {
     Map<String,Long>map=   employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        map.forEach((key,value)->System.out.println(key+" "+value));
    }

    public static void main(String[] args) {
        countOfEmployees(Utility.getEmployees());
    }
}
