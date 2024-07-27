package org.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Question1
{
    public static void main(String[] args)
    {
//        List<Employee >employees=EmployeeDb.employeeList();
//       Map<String,List<Employee>>map= employees.stream().collect(Collectors.groupingBy(Employee::getCity));
//       map.forEach((key,value)-> System.out.println(key+"  "+value));
        List<Employee>employees=EmployeeDb.employeeList();
        Map<String,List<Employee>> map=new HashMap<>();
        List<Employee>puneCity=new ArrayList<>();//value
        List<Employee>bangloreCity=new ArrayList<>();//value
        long puneEmps=employees.stream().filter(i->i.getCity().equalsIgnoreCase("pune")).count();
        System.out.println(puneEmps);


        Iterator itr=employees.iterator();
        while (itr.hasNext())
        {
           Employee e=(Employee) itr.next();
           if(e.getCity().equalsIgnoreCase("pune"))
           {
               puneCity.add(e);
           } else if (e.getCity().equalsIgnoreCase("Banglore"))
           {
               bangloreCity.add(e);
           }
        }
//        System.out.println(puneCity.size());
//        System.out.println(bangloreCity.size());
        map.put("Pune",puneCity);
        map.put("Banglore",bangloreCity);
        Set<Map.Entry<String,List<Employee>>>set=map.entrySet();
        Iterator itr2=set.iterator();
        while (itr2.hasNext())
        {
            Map.Entry m=(Map.Entry)itr2.next();
            System.out.println("City:="+m.getKey());
            System.out.println("Employees:\n"+m.getValue());
            System.out.println("________________________________________________________");
        }



    }
}
