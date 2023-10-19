import java.util.Scanner;

public class patternPrinting
{
    public static void main(String[] args) {
        //  simple pattern printing
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n :");
        // int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0||j==0||i==n-1||j==n-1){
        //             System.out.print("*");
        //         }
        //         else System.out.print(" ");
        //     }

        //     System.out.println("");

        // }







        //pattern printing middle 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n :");
        // int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0||j==0||i==n-1||j==n-1||i==(n-1)/2){
        //             System.out.print("*");
        //         }
        //         else System.out.print(" ");
        //     }

        //     System.out.println("");
        // }





        // complex pattern 1

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n :");
        // int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if((i==0 && j>0 && j < (n-1)/2) || (j==0 && i > 0) || ( i==(n-1)/2 && j <=(n-1)/2 ) || (j==(n-1)/2 && i>0 ) || (i==n-1 && j<= (n-1)/2) ){
        //             System.out.print("*");
        //         }
        //         else System.out.print(" ");
        //     }

        //     System.out.println(" ");
        // }





        // complex pattern 2

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(( i==0 && j < (n-1)/2) ||  j==0  || ( i==n-1 && j < (n-1)/2 ) || (j==(n-1)/2 && i > 0 && i < n-1  )  ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }

            System.out.println(" ");
            
        }















    }

}