package Array;

public class jaggedArray {
    public static void main(String[] args) {
        
        // int nums[][] = {
        //     {5,1,8},
        //     {2,3},
        //     {9,6,4,7}
        // };

        // Alternative
        int nums[][] = new int[3][];
            nums[0] = new int[3];
            nums[1] = new int[2];
            nums[2] = new int[4];


        for(int i =0;i<=2;i++){
            for(int j =0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }




    }
}
