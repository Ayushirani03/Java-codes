public class HollowSquare {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
             System.out.print("*");
            }
            System.out.println();
            for(int i=2;i<=4;i++){
                for(int j=2;j<=i;j++){
                    System.out.print("*"+" "+" "+" "+"*");
                    j++;
                    break;
                }
              System.out.println();
                
            }
           for(int i=1;i<=5;i++){
            System.out.print("*");
           }
        }
    }

