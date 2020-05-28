import java.util.*;
public class Solution2{
    public static void main(String args[]){
        
        String band[]= {"Kiss", "Aerosmith", "ACDC", "Led Zeppelin", "Nickelback"};
        for(int i=0;i<band.length;i++)
         Invoke(band[i]);
    }
    public static void Invoke(String s){
        System.out.println("I Love "+s);
    }
}