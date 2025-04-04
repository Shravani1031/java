import java.util.Scanner;
public class java_04_Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int mul = a*b;
        int sub = a-b;
        int add = a+b;
        int div = a/b;
        System.out.println("The multiplication of these numbers is " +mul);
        System.out.println("The Subtraction of these numbers is " +sub);
        System.out.println("The Addition of these numbers is " +add);
        System.out.println("The division of these numbers is " +div);
        sc.close();
    }
}