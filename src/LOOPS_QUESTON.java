import java.util.Scanner;
public class LOOPS_QUESTON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A INITIAL NUMBER");
        int a = sc.nextInt();

        System.out.print("ENTER A FINAL NUMBER");
        int b = sc.nextInt();

        for(int i=a; i<=b; i=i+1) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
