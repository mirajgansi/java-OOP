package weeek6;

public class MultiDimArrayLoop {
    public static void main(String[] args) {
        /*Creating an array with [4][2] */
        int[][] arr= new int[4][2];
        arr [0][0]=10;
        arr[1][0]=20;
        arr[1][0]= -10;
        arr[1][1]=-20;
        arr[2][0]=100;
        arr[2][1]=200;
        arr[3][0]=-100;
        arr[3][1]=-200;
        /*visual representation
         * [
         * [10,20],
         * [-10,-20],
         * [100,200],
         * [-100,-200]
         * ]
         */

        /*Loop outter array */
        int outerlenght=arr.length;//4
        for(int outer=0;outer<outerlenght;outer++){
            System.out.println("Array in index"+outer++);
            // System.out.println(arr[outer][0]);  
            // System.out.println(arr[outer][1]);
            int inneArrayLenght= arr[outer].length;
            for(int inner=0; inner<inneArrayLenght; inner++){
                System.out.println(arr[outer][inner]);//inner loop froms 0,1;
            }
            }
            /*Make an array of String names
             * ["Sansakriti","Nikita","Anji"]->0
             * ["Miraj","Niraj","Oskar"],->1
             */
            /*Loop each names */
            /*Task 2 on the same loop, the on which array is Osakr in
             * Anser should be 1
             */
            String[][]names= new String[2][3];
            String[][]names={
            {"Sansakriti","Nikita","Anji"},
            { "Miraj","Niraj","Oskar"}
            };
            int namesLenght= names.length;
            for(int outer=0;outer<namesLenght;outer++){
                System.out.println("Names in array"+outer);
                int innerLenght=names[outer].length;
                for(int inner =0; inner<innerLenght;inner++){
                    System.out.println(names[outer][inner]);
                    if(names[outer][inner]=="oskar"){
                        System.out.println("oskar is in"+outer +"Array");
                    }
                }
            }
    }

}
