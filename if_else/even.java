package if_else;
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("it is even");
        } 
        else{
            System.out.println("it is odd");
        }
    }
}
