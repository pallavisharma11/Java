import java.util.*;
import java.util.Scanner;
public class swapTwoNumber
{
    Scanner sc = new Scanner(System.in);
    
    void swaps()
    {
        System.out.println("the value of a : ");
        int a = sc.nextInt();
        System.out.println("the value of b : ");
        int b = sc.nextInt();
        b = b+a;
        a = b-a;
        b = b-a;
        
        
        
        System.out.println("value of a is :" +a);
        System.out.println("value of b is :" +b);
        
        
    }
    public static void main(String[] args)
    {
        swapTwoNumber obj = new swapTwoNumber();
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        
        obj.swaps();
        //System.out.println("value of a is :" +a);
        //System.out.println("value of b is :" +b);
        
        
        
        
    }
    
}
