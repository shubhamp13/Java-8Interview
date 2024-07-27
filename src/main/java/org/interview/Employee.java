package org.interview;

public class Employee
{
    private String name;
    private String id;
    private  String city;
    private String age;

    public Employee(String name, String id,String age, String city) {
        this.city = city;
        this.id = id;
        this.name = name;
        this.age=age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", city='" + city +"\n";
    }
}
