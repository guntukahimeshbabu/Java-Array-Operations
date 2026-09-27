package switchcase;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.print("Enter Your Choice:");
        int choice=sc.nextInt();
        System.out.println("enter a & b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        switch(choice){
            case 1:System.out.println("result:"+(a+b));
            break;
            case 2:System.out.println("result:"+(a-b));
            break;
            case 3:System.out.println("result:"+(a*b));
            break;
            case 4:System.out.println("result:"+(a/b));
            break;
            default:
                System.out.println("Invalid choice");
            
        }

        

    }
    
}
