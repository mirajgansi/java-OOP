public class JavaArgument {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Not enogh ars");
            return;
        }
        System.out.println("First args is"+ args[0]);
        System.out.println("second arg is "+args[1]);
        /* converts string into integers/ mmust pass number in 2nd args */
        int argInt= Integer.parseInt(args[1]);
        
    }
}
