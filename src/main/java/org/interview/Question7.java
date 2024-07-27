package org.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class Question7
{
    public static void main(String[] args) {
        String name="Shubham Pandit Puri";
        long cnt=name.chars().filter((s)->{
          return   s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
        }).count();
        System.out.println("No Of Vowels "+cnt);
        Map<Character,Long> map=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(map);

    }
}
