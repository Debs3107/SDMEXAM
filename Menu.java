import java.util.Scanner;

public class Menu {
    
    public static void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c= a+b;
        System.out.println("sum= "+c);
    }

    public static void subtract() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c= a-b;
        System.out.println("Subtraction= "+c);
    }

    public static void multiply() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c= a*b;
        System.out.println("sum= "+c);
    }

    public static void divide() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c= a/b;
        System.out.println("sum= "+c);
    }










    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }



    }

}
