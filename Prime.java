import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
        if (num%2==0) {
            System.out.println("it is not a prime number");
        }else{
            System.out.println("it is a prime number");
        }
        break;
    }
        sc.close();
    }
}
