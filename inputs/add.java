package inputs;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a =sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of a and b is:"+sum);
    }
    
}
