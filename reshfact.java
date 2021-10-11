import java.util.*;
public class Main{
    static int fact(int n){
        if (n==0)
          return 1;
        else
          return(n * fact(n-1));
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int i, factorial=1;
        System.out.println("Enter Num:");
        int number=scan.nextInt();
        factorial=fact(number);
        System.out.println("Fact of"+number+" is: "+factorial);
    }
}