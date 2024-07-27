package org.interview;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;

public class Question9
{
    public static void main(String[] args)
    {
        int []arr={5,3,4,1,3,7,2,9,9,4};
       Map<Integer,Long>map= Arrays.stream(arr).mapToObj(i->i).collect(Collectors.groupingBy(j->j,Collectors.counting()));
       map.forEach((key,value)->System.out.println(key+"-"+value));


       String []names={"Shubham","Shrikant","Sejal","Shubham","Shrikant","Sejal"};
       Map<String,Long>namesFrequency= Arrays.stream(names).collect(Collectors.groupingBy(s->s,Collectors.counting()));
     namesFrequency.forEach((key,value)->System.out.println(key+"="+value));
    }
}
