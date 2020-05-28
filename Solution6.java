import java.util.*;
public class Solution6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        char ch1[]=new char[a];

        int b=sc.nextInt();

        char ch2[]=new char[b];

        for(int i=0;i<a;i++)
        ch1[i]=sc.next().charAt(0);

        for(int i=0;i<b;i++)
        ch2[i]=sc.next().charAt(0);

        int c1[]=new int[26];
        int c2[]=new int[26];

        for(int i=0;i<a;i++)
        c1[ch1[i]-'a']+=1;

        for(int i=0;i<b;i++)
        c2[ch2[i]-'a']+=1;

        int c3[]=new int[26];

        for(int i=0;i<26;i++)
        c3[i]=Math.min(c2[i],c1[i]);

        String s="";
        for(int i=0;i<26;i++){
            while(c3[i]-->0)
            s+= (char)(i+'a') + " ";
        }

        System.out.println(s);


    }
}