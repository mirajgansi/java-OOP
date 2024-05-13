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
            // twoDArray[0];
            /* To access the value in the first inner array, use internal index */
            twoDArray[0][0]=10;
            twoDArray[0][1]=20;
            twoDArray[1][2]=100;
            twoDArray[2][4]=200;
            /*Fill the arrat like the followin
             * [
             * 
             * [10,20,30,40,50],
             * [80,90,100,110,120],
             * [150,160,170,180,200]
             * ]
             */
           
            twoDArray[0][0]=10;
            twoDArray[0][1]=20;
            twoDArray[0][2]=30;
            twoDArray[0][3]=40;
            twoDArray[0][4]=50;
            twoDArray[1][0]=80;
            twoDArray[1][1]=90;
            twoDArray[1][2]=10;
            twoDArray[1][3]=110;
            twoDArray[1][4]=120;
            twoDArray[2][0]=150;
            twoDArray[2][1]=160;
            twoDArray[2][2]=170;
            twoDArray[2][3]=180;
            twoDArray[2][4]=200;

            /*Now print the 1th index array index
             * array in 1th index
             * 80
             * 90
             * 100
             * 110
             * 120
             * Note: without using loop
             */
            oneDArray= new int[5];
            oneDArray[0]=80;
            oneDArray[1]=90;
            oneDArray[2]=100;
            oneDArray[3]=110;
            oneDArray[4]=120;

            /* Mulit Dim Array memory alloc and assingment */
            int[][] arrayTwo={
                {10,20,30},
                {20,30,40,},
                {100,200,300},
                {3,4,5}
            };
        }         
    }