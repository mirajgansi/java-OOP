package Week7;

public class SecondOOP {
    public static void main(String[] args) {
        newPerson p= new newPerson();
        p.name="Ram";
        p.age=10;
        
        p.peronsInfo();

        newPerson p2= new newPerson();
        p2.name="Shyam";
        p2.age=12;
        p2.peronsInfo();
        p2.setphNumber();
        
         Football football= new Football();
         football.hometeam="england";
         football.awayteam="spain";
        //  football.time=90;
         football.setGoal(3);
         football.deatail();
    }   
}
class newPerson{
    String name;
     int age;
    //acess modified, it is "default" if not specified

    private String phNumber;
    public int salary;

    void peronsInfo(){
        System.out.println(name);

    }
    void setphNumber(){
        this.phNumber="90099";
    }
    void setNewPhNumber(String num){
        this.phNumber=num;
    }
    String getPhNUmber(){
        return phNumber;
    }

    void setThisNumber(String phNumber){
        this.phNumber= phNumber; //this means  calling  own class
    }
}
// Task
//create a class Football
/*
 * String homeTeam and  awayteam
 * make another attribute time
 * make print attribute goal
 * make a getter for goal
 * make private attribute winner as String
 * make only settert  for winner
 * make function
 * make object of football and fill al the atribute
 * make function detail()-> print winner name, time and total goal
 * make object of fooft and fill a the atribute */

 class Football{
    String hometeam;
    String awayteam;

    private int time;
    private int goal;
    String winner;
    void setGoal(int goal){
        this.goal=goal;
    }
    void FootballInfo(){
        System.out.println();
    }

    int getGoal(){
        return this.goal;
    }

    void setWinner(String winner){
        this.winner=winner;
    }
    void deatail(){
        System.out.println("Winner:"+winner+"Time"+time+"Goals:"+goal);
    }
 }