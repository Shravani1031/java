import java.util.Scanner;

public class GradeEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        int encryptedGrade = grade + 8;
        System.out.println("Encrypted grade: " + encryptedGrade);
        
        int decryptedGrade = encryptedGrade - 8;
        System.out.println("Decrypted grade: " + decryptedGrade);
        
        scanner.close();
    }
}
