import java.util.*;
public class Solution4{
    public static void main(String args[]){
        
        char array[]= {'a', 'b', 'c', 'd', 'c', 'b', 'b', 'c', 'a', 'e', 'b', 'e'};
        HashMap<Character,Integer> h=new HashMap<>();

        for(int i=0;i<array.length;i++)
            if(h.containsKey(array[i]))
                h.put(array[i],1);
            else
                h.put(array[i], h.get(array[i])+1);
        
\        int max=0,min=Integer.MAX_VALUE;
        char ch1,ch2;
        for(int i=0;i<array.length;i++)
        {
            if(h.get(array[i])>max)
            {
                max=h.get(array[i]);
                ch1=array[i];
            }
            if(h.get(array[i])<min)
            {
                min = h.get(array[i]);
                ch2=array[i];
            }

        }
        System.out.println("The most frequent item is: "+ch1);
        System.out.println("The least frequent item is: "+ch2);
    }

    
}