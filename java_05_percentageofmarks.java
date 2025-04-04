import java.util.Scanner;
public class java_05_ percentageofmarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths marks: ");
        float maths = sc.nextFloat();
        System.out.println("Enter PPL marks: ");
        float PPL = sc.nextFloat();
        System.out.println("Enter DSA marks: ");
        float DSA = sc.nextFloat();
        System.out.println("Emter MP marks: ");
        float MP = sc.nextFloat();
        System.out.println("Enter SE marks: ");
        float SE = sc.nextFloat();
        float totalMarks =  maths+PPL+DSA+MP+SE;
        float maxMarks = 500;
        float percentage = (totalMarks / maxMarks) * 100;
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.printf("percentage: %.2f%%\n",percentage);
        sc.close();

}
}
