public class If_statement {
    public static void main(String[] args) {
        /* Simple if example */
        if(true){
            System.out.println("True statement ");
        }
        /*If takes an expression with boolean value */
        int num1=10, num2=20;
        if(num1>num2){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser");
        }
        /*If else id, two condtion */
        if(num1==num2){
            System.out.println("Equals");
        }else if(num1<num2){
            System.out.println("lesser num2");
    }else{
        System.out.println("Greater");
    }

/* Note that else should be at last and is not mandatory */
/* If else ladder multiple condition */
if(num1<0){
    System.out.println("Num1 is negaive");
}else if(num2<0){
    System.out.println("Numeis negative");
}else if(num1!=num2){
    System.out.println("not equal");
}else if(num1>num2){
    System.out.println("Greater");
}else{
    System.out.println("Default satatmetn");
}/* If aby condition matches it will ski all te reamainig condtion including lse, condition will be checked from  top-bottom */
/*Nested if condition */
if(num1>0){
    if(num1>num2){
        System.out.println("Positive and Greater");
    }else{
        System.out.println("Positive and lesser");
    }
}else{
    if(num1>num2){
        System.out.println("Negatve and greater");
    }else{
        System.out.println("Negative and lesser");
    }
}

}
}