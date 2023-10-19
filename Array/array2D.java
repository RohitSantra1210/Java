package Array;

public class array2D {
    public static void main(String[] args) {
        
        // Array construction
        // int nums[][] = new int[3][2];

        // value insertion
        // nums[0][0] = 2;
        // nums[0][1] = 3;
        // nums[1][0] = 4;
        // nums[1][1] = 5;
        // nums[2][0] = 6;
        // nums[2][1] = 7;
        // OR


        int nums[][] = {

                        {2,3},
                        {4,5},
                        {9,4}

                        };


        // loop for output generation
        for(int i=0; i<=2; i++){
            for(int j=0; j<=1;j++){
                System.err.print(nums[i][j] + " ");
            }
            System.err.println();
        }










    }
}
