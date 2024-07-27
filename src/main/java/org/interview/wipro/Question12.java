package org.interview.wipro;


import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Question12
{
    public static  void status(List<Employee> employees)
    {
        Map<String,List<Employee>>m= employees.stream().collect(Collectors.groupingBy(Employee::getActive));
        m.forEach((key,value)-> System.out.println(key+" "+value));
    }

    public static void main(String[] args) {
        status(Utility.getEmployees());
    }
}
