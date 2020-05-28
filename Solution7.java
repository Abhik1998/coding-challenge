import java.util.*;
public class Solution7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println("Enter the list separated with space and please end the list with value 0");
        List<Integer> l=new ArrayList<>();
        while(true){
            int a=sc.nextInt();
            if(a==0)
            break;
            l.add(a);
        }
        
        display(target,l);
        sc.close();
    }
    public static void display(int a,List<Integer> l){
        int sum_remaining=a;
        for(int i=0;i<l.size();i++)
        {
            int d = a/l.get(i);
            a=a%l.get(i);
            System.out.print(l.get(i)+": "+d+" ");
            sum_remaining-=d*l.get(i);
        }
        System.out.println();
        System.out.println("Left out is: "+sum_remaining);

    }
    
}