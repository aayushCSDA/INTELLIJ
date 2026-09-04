import java.util.Scanner;

public class VOTE_PROJECT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");

        int a = sc.nextInt();
        System.out.println("ENTER YOUR NAME");
        String b = sc.next();

        if (a>=18) {

            System.out.println("ENTER YOUR DOB");
            String d = sc.next();
            System.out.println("ENTER YOUR FATHER NAME");
            String f = sc.next();
            System.out.println("ENTER YOUR ADDRESS");
            String A = sc.next();
            System.out.println(b+" IS ELIGIBLE FOR VOTE");

            System.out.println(b);
            System.out.println(d);
            System.out.println(a);
            System.out.println(f);
            System.out.println(A);

        }
        else {
            System.out.println(b+" IS NOT ELIGIBLE FOR VOTE");


        }



    }
}
