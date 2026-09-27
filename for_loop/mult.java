package for_loop;
import java.util.Scanner;
public class mult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
    
}
