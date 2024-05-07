package weeek6;

public class ArrayClass {
    public static void main(String[] args) {
            /* to create an arrau define datatype followed bt[] */
            int[] myFirstArray;
            /*INitiallizing the aray we need new refrence  */
            myFirstArray=new int [6];// here the  new  int[6] -> refers to the sie of array
            /*the size of an array can be futher by length*/
            int myFirstArrayLength= myFirstArray.length ;
            System.out.println("My first array size is"+myFirstArrayLength);

            /*Using index for aray operation */
            myFirstArray[0]=10;
            myFirstArray[1]=20;
            myFirstArray[2]=30;
            /* to print the array use the same index */
            System.out.println(" The first element is in 0 index"+myFirstArray[0]);
            /* can also create a new int value */
            int secondArrayIndex= myFirstArray[1];
            System.out.println("the second element stored"+secondArrayIndex);
            /* declearation and INtialization */
            int[] mySecondArryay= new int[6];
            /* Declearation, Initializarion and Value assign */
            int[] myThirdArray={10,20,30,40,50};
            /* or using constructor */
            int[]myFourtharray= new int[]{1,2,3,45};

            /* Task
             * Create a array of int alled myFifth array
             * with size of 5
             * insert the value of 10,20,30,40,50
             * print te value of an array as well as the multiplied by 2
             * eg: 10 20
             * 20 40
             * 30 60
             * 40 80
             * 50 100
             */
            int myFifthArray[] = {10, 20, 30, 40, 50};
            for (int i = 0; i < myFifthArray.length; i++) {
                myFifthArray[i] *= 2;
                System.out.println(myFifthArray[i] + " ");
            }   
}
}