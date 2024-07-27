package org.interview.wipro;

import java.util.Scanner;

public class EmployeeOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1.The maximum salary among all employees.");
        System.out.println("2.The minimum salary among all employees.");
        System.out.println("3.The maximum salary department-wise.");
        System.out.println("4.Filter employees with status ");
        System.out.println("5.Filter Employees with department");
        System.out.println("6.Count of Employees in Each Department");
        System.out.println("------------------------------------------------------------------------");

        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:Utility.maxSalaries();
                break;
            case 2:Utility.minSalaries();
                break;
            case 3:Utility.departmentWiseMaxSalary();
                break;
            case 4:Utility.status();
                break;
            case 5:Utility.departmentWiseEmployee();
                break;
            case 6:Utility.countOfEmployees();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
