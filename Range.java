import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find its range");
        int x=sc.nextInt();
        if (x>=1 && x<=10) {
           System.out.println("Number lies between 1 to 10"); 
        }else if (x>=11 && x<=20) {
            System.out.println("Number lies between 11 to 20 ");
        }else if (x>=21 && x<=30) {
            System.out.println("Number lies beween 21 o 30 ");
        }else{
            System.out.println("Number is greater than 30");
        }
        sc.close();

    }
}
