import java.util.Scanner;
public class SqCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if (num<5) {
            System.out.println("number is less than 5 and the square of the number is: "+num*num);
        }
        else{
            System.out.println("number is greater than 5 and the cube of the number is: "+num*num*num);
        }
        sc.close();

    }
}
