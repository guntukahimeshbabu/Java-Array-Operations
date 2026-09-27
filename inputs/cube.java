package inputs;
import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int a =sc.nextInt();
         int sqaure=a*a;
         int cube=a*a*a;
         System.out.println("sqaure of a is:"+sqaure);
         System.out.println("cube of a is:"+cube);
    }
    
}
