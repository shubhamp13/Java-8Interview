package org.interview;

import java.util.StringJoiner;

public class Question6
{
    public static void main(String[] args) {
        String name="Shubham Pandit Puri";
        StringBuilder sb=new StringBuilder();
        String[]words=name.split(" ");
        sb.append("[");
        for(int i=0;i<words.length;i++)
        {
            if(i==words.length-1)
            {
                sb.append(words[i]+"]");
            }
            else
            {
                sb.append(words[i]+"-");
            }
        }
        System.out.println(sb);
        StringJoiner sj=new StringJoiner("-","[","]");
        for(String w:words)
        {
            sj.add(w);
        }
        System.out.println(sj);
    }
}
