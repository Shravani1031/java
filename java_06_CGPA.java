import java.util.Scanner;
public class java_07_greets {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the person: ");
        String name = s.nextLine();
        System.out.println("Hello " +name + " have a good day");
        s.close();

    }
}
