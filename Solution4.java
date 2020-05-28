import java.util.*;
public class Solution4{
    public static void main(String args[]){
        
        int array[]= {34, 203, 16, 46, 34, 432, 342, 124, 33, 188, 12};
        int sum=0;
        double avg=0;
        for(int i=0;i<array.length;i++)
            sum+= array[i];
        avg = (double) sum/array.length;
        System.out.println(avg);
    }

    
}