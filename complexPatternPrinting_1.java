
import java.util.Scanner;
public class complexPatternPrinting_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j || i+j == n-1 || i+j == (n-1)/2 || i == 0 || j==0 || i == n-1 || j == n-1 || i -j == (n-1)/2 || i+j == n+(n-1)/2 || j-i == (n-1)/2 ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }

            System.out.print("           ");

            for(int j=0;j<n;j++){
                if(i+j == (n-1)/2 || i == 0 || j==0 || i == n-1 || j == n-1 || i -j == (n-1)/2 || i+j == n+(n-1)/2 || j-i == (n-1)/2 ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }

            System.out.print("     ");

            for(int j=0;j<n;j++){
                if(i == 0 && j <= (n-1)/2 || j==0 && i <= (n-1)/2 || i+j <= (n-1)/2){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }



             System.out.print("     ");

            for(int j=0;j<n;j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1 || i+j <=(n-1)/2 || i-j >=(n-1)/2 || i+j >= n + (n-1)/2 || j-i >= (n-1)/2 ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }






            System.out.println(" ");
            
        }








    }
}
