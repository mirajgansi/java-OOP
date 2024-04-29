package week4;
public class ForLoop {
    public static void main(String[] args) {
        /*use for loop when caondition is fixed */
        for(int index=0; index<5; index++){
            System.out.println("Loop running" +index);
        }
        /*Decrement loop*/
        for(int index=10; index>=0; index--){
            System.out.println("Loop reunning" +index);
        }
        /* make the loop table for this */
        /*task
         * make a multiplication table of 2
         * print like the following
         * 2*1=2
         * 2*2=4
         * '
         * 
         * ''
         * 
         * note:initialize 1 
         * condition <=10 or 11 
         * increment ++
         */

         for(int i=1; i<=10;i++){
            System.out.println("2 x" + i+ "=" +2 *i);
         }
         /*nested loop */
         for(int outer=0; outer<3; outer++){
            for(int inner=2; inner>=0; inner--){
                System.out.println("Inner" +inner);
            }
            System.out.println("Outer"+outer);
            }
         /*task use nested loop to do the following
          * make multiplication table from 1-10
          eg:
          1x1=1


          1x10=10

          multiplication of 1-
          10x1=10


          10x10=100
          */
          for(int mi=1;mi<=10;mi++){
            for(int ji=1;ji<=10;ji++){
                System.out.println(+mi+"x"+ji+"="+ 1*ji);
               
            }
            System.out.println("x"+mi+"="+ 10*mi);
          }
    }
}
