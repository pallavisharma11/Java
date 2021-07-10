import java.util.Scanner;
public class primeNumber
{
    Scanner sc = new Scanner(System.in);
    void prime(){
        int n = sc.nextInt();
        
        if(n==0 || n==1){
            System.out.println("not prime");
        }
        else if(n == 2){
             System.out.println(" prime");
        }
        
        else {
            for(int i = 2;i<n ;i++)
            {
                if(n%i==0){
                    System.out.println("not prime");
                    break;
                }
                else{
                    System.out.println(" prime");
                }
                //System.out.println(" prime");
                
            }
            //System.out.println(" prime");
            
        }
        
    }
    public static void main(String[] args)
    {
        primeNumber obj = new primeNumber();
        obj.prime();
    }
    
}
