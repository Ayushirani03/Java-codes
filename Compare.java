
 import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if (a>b) {
            System.out.println(a+" is greater than "+b);
          }
          else if (a<b) {
            System.out.println(b+" is greater than "+a);
          }
          else{
            System.out.println("both are equal");
          }
          sc.close();
}
}

