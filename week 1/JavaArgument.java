public class JavaArgument {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Not enogh ars");
            return;
        }
        System.out.println("First args is"+ args[0]);
        System.out.println("second arg is "+args[1]);
    }
}
