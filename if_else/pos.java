package if_else;
import java.util.Scanner;
public class pos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int a =sc.nextInt();
        if(a>=0){
            System.out.println("it is positive");
        }
        else {
            System.out.println("it is negative");
        }
    }
}
