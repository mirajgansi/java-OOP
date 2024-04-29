package week_3;

public class JumpStatement{
    public static void main(String[] args) {
    
    /*break and continue are jump statemetn in java */
    /* break will terminate the loop */
    for(int index=0; index<5;index++)
    {
        if(index==3){
            break;// this line will break the loop
        }
        System.out.println("Index"+index);

    }
    /* can be used in any loop */
    int count=0;
    while(count<=10){
        if(count==1){
            break;
        }
        System.out.println("Count"+count);
        count++;
    }
    /* continue statemtn will skip the loop */
    for(int index=0;index<5;index++){
        if(index==3){
            continue;
        }
        System.out.println("Continue index"+index);
    }
    /* task wap to run to loop for -5 to 5
     * break the loop id the index is positive
     */
    for(int index=-5;index<=5;index++){
        if (index==0) {
            break;
        }
        System.out.println("index:" +index);
    }
    /* task 2
     * loop from 1 -20 using any loop
     * only print the calue if it is even
     * use the contniue to do this task
     */
    for(int index=0; index<=20;index ++){
         if(index%2!=0){
            continue;
        }
        System.out.println("even number"+index);
    }
}
}
