package org.interview;

import java.util.Arrays;
import java.util.Optional;

public class Question2
{
    public static void main(String[] args) {
        Integer[]num={1,2,3,4,5};
        if(num!=null)
        {
            Integer mul=Arrays.stream(num).reduce((a,b)->a*b).get();
            System.out.println(mul);
        }
    }
}
