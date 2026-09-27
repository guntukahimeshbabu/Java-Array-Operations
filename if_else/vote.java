
package if_else;
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int a =sc.nextInt();
        if(a>18){
            System.out.println("eligible to vote");
        }
        else {
            System.out.println("not eligble to vote");
        }
    }
}
