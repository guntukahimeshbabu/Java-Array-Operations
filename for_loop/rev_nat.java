package for_loop;
import java.util.Scanner;
public class rev_nat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i=n;
        for(i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
