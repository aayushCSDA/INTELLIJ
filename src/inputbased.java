import java.util.Scanner;
public class inputbased {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int a = input.nextInt();
        System.out.println("ENTER SECOND  NUMBER : ");
        int b = input.nextInt();
        System.out.println("MULTIPLICATION OF NUMBER IS : "+(a*b));


    }
}