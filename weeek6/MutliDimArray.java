    package weeek6;

    public class MutliDimArray {
        public static void main(String[] args) {
            /*Create N-Dimension array by adding the number of square brackets */
            /*1d Array */
            int[] oneDArray;
            /*2D Array */
            int[][] twoDArray;
            /*3D Array */
            int[][][] threeDArrray;
    
            /*Allocation memory/size */
            twoDArray = new int[3][5];
            /*first size 3 represents how many inner arrays */
            /*second size 5 represents how many values in each inner array */
            /*[
                [10,20,0,0,0],
                [0,0,100,0,0],
                [0,0,0,0,200]
            ] 
            */
            /* To access the first inner array, use index */
            twoDArray[0];
            /* To access the value in the first inner array, use internal index */
            twoDArray[0][0]=10;
            twoDArray[0][1]=20;
            twoDArray[1][2]=100;
            twoDArray[2][4]=200;
        }
    }