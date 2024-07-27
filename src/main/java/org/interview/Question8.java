package org.interview;

public class Question8
{

    public static void main(String[] args) {

        String name="shubham pandit puri";
        int []count=new int[256];
        char[]chars=name.toCharArray();
        for(char c:chars)
        {
            count[c]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>0)
            {
                System.out.println((char)i+"="+count[i]);
            }
        }
        int cnt=0;
        for(char c:chars)
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                ++cnt;
            }
        }
        System.out.println("No Of Vowels:"+cnt);
    }
}
