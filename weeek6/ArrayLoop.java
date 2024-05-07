package weeek6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] data= {10,20,30,40};
        int arrayLenght=data.length;
        /*first apraoch */
        for(int index=0; index<arrayLenght;index++){
          System.out.println("index"+index+"value"+data[index]);
        }
        System.out.println("Using lenght -1");
          /* second appraoch */
           for(int index=0; index<=arrayLenght -1;index++){
            System.out.println("Index"+ index + "value"+  data[index]);
           }  
          // data(100); this will cash, no index acceseible
          /* task maske an array of length 10
           * add the value as 10,20,30,40,50,60,70,80,90,100
           * Make another array with he same lenght 10
           * ADD THE VALUE OF FIRST ARRAY IN NEGATIVE
           * use the loop on the fist array to comple this
           * second array should be -10,-20,-30,-40,-50,-60,-70,-80,-90,-100
           * Print the second array
           */
          int []firstArray={10,20,30,40,50,60,70,80,90,100};
          int firstArrayLenght=firstArray.length;
          int[] secondArray= new int[10];
          for(int index=0; index<=firstArrayLenght;index++){
            secondArray[index]=-firstArray[index];
            System.out.println(secondArray[index]);
          }
          /* task
           * print the second array in descending
           * should be:-100,-90...-10
           * note: start loop from length -1 to 0
           */
          for(int i = firstArray.length - 1; i >= 0; i--) {
            secondArray[firstArray.length - 1 - i] = firstArray[i];
            System.out.println(secondArray[firstArray.length - 1 - i]);
        }

          
    }
}
