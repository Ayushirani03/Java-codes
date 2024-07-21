import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of a student");
        int marks=sc.nextInt();
        if (marks>=91 && marks<=100) {
            System.out.println("Grade-A+");
        }else if (marks>=81 && marks<=90) {
            System.out.println("Grade-A");
        }else if (marks>=61 && marks<=80) {
            System.out.println("Grade-B+");
        }else if (marks>=41 && marks<=60) {
            System.out.println("Grade-B");
        }else if (marks>=31 && marks<=40) {
            System.out.println("Grade-C");
        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
