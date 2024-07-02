package week11;

public class task {
    public static void main(String[] args) {
        Spreadsheet ss= new Spreadsheet();
        ss.filetype="Spreadsheet ms excel";
        ss.addColumn(2);
        ss.addRow(1);

        MathOperation mathOp = new MathOperation();
        System.out.println("Subtraction of 10 and 5: " + mathOp.subtraction(10, 5));
        System.out.println("Subtraction of 10.5, 5.5 and 2.5: " + mathOp.subtraction(10.5, 5.5, 2.5));
        mathOp.subtraction(10.5);
        mathOp.subtraction(10);
        System.out.println("Subtraction of 10, 5 and 2.5: " + mathOp.subtraction(10, 5, 2.5));
    }
}

// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object
class Spreadsheet{
    String filetype;
    Spreadsheet(){
        filetype = "Spreadsheet";
    }
    public int addRow(int row){
        return row;
    
    }
    public int addColumn(int coloumn){
        return coloumn;
        
    }
    class MsExcel extends Spreadsheet{
        @Override
        public int addRow(int row){
            return 2;
    }
    @Override
    public int addColumn(int coloumn){
        return 4;
    }
}
}

// Task
// Make a function subtraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object
class MathOperation{
    public int subtraction(int a, int b){
    return a-b;
    }
    public double subtraction(double a, double b, double c){
        return a-b-c;
    }
    void subtraction(double a){
        System.out.println("invalid operation");
    }
    void subtraction(int a){
    System.out.println("invalid operation");
    }

    public double subtraction(int a, int b, double c){
        return a-b-c;
    }
}