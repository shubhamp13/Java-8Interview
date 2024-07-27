package org.interview;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Question4
{
    public static void main(String[] args) {
        String[]name={"Shrikant","Shubham","Sejal","Shubham","Akshay","Omkar"};
        Stream<String> stream = Arrays.stream(name);
        long cnt= stream.filter(s->s.equals("Shubham")).count();
        System.out.println(cnt);
//        //We can not use stream again as stream is single use in nature
//        stream.forEach(System.out::println);

        //Way to get
        Supplier <Stream>supplier=()->Arrays.stream(name);
        supplier.get().forEach(System.out::println);
    }
}
