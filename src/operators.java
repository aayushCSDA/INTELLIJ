public class operators {
        public static void main(String[] args) {
            //arithmetic operator
            int a=12;
            int b=6;
            boolean c = a>b;
            boolean d = a<b;
            System.out.println("sum of given number: "+(a+b));
            System.out.println("diff of given number: "+(a-b));
            System.out.println("multi of given number: "+(a*b));
            System.out.println("remainder of given number: "+(a%b));
            System.out.println("Quoteint of given number: "+(a/b));
            //relational operator
            System.out.println("sum of given number: "+(a>b));
            System.out.println("sum of given number: "+(a<b));
            System.out.println("sum of given number: "+(a>=b));
            System.out.println("sum of given number: "+(a<=b));
            System.out.println("sum of given number: "+(a==b));
            System.out.println("sum of given number: "+(a!=b));
            //LOGICAL OPERATOR
            System.out.println("sum of given number: "+(c&&d));
            System.out.println("sum of given number: "+(c||d));
            System.out.println("sum of given number: "+!c);
            //ASSIGNMENT OPERATOR
            int e = 50;
            e+=25;

            System.out.println("first: "+e);
            e-=155;
            System.out.println("second: "+e);
            e*=12;
            System.out.println("third: "+e);
            e/=6;
            System.out.println("fourth: "+e);
            e%=50;
            System.out.println("fifth: "+e);



        }


}
