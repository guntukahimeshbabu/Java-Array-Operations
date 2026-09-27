package for_loop;
import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.println(i);
        }
        
    }
}
