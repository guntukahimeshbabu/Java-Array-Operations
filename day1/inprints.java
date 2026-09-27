package day1;
import java.util.Scanner;
public class inprints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int  a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        int sum;
        sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int rem=a%b;
        System.out.println("Addition of a & b:"+sum);
        System.out.println("subtraction of a & b:"+sub);
        System.out.println("multiplication of a & b:"+mul);
        System.out.println("remainder of a & b:"+rem);

        

    }
}
