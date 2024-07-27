package org.interview.wipro;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question13
{
    public static  void  departmentWiseEmployee(List<Employee> employees)
    {
     Map<String,List<Employee>>m= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
     m.forEach((key,value)-> System.out.println(key+" "+value));

    }

    public static void main(String[] args) {
        departmentWiseEmployee(Utility.getEmployees());
    }

}
