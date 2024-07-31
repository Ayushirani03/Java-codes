import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements of an array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<size;i++){
          arr[i]=arr[i]*2;

        }
        for(int i=0;i<size;i++){
        System.out.println(arr[i]);
        }
    }
}
