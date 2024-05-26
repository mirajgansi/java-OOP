package Week7;

import javax.print.DocFlavor.STRING;

public class FirstOOP {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.name="Ram";
        person1.age=10;
        person1.gender='M';
        
        System.out.println(person1.name);
        person1.introduction();
    
        //task create two object fo person and call introduction function

        Person person2= new Person();
        person2.name="miraj";
        person2.age=18;
        person2.gender='M';
        
        System.out.println(person2.name);
        person2.introduction();
        
        Rectangle rec1= new Rectangle();
        rec1.lenght=10;
        rec1.breath=30;
        int areaRec1=rec1.areaOfRectangle();
            System.out.println("Area of recangle"+ areaRec1);

            //create a class create
    /* attribute
     * -name
     * -color
     * -year
     * functions 
     * -starts*()-> print acr name i starting 
     * -stop()-> retrun 100 added to year
     *create 3 object of car
     stat all object/car
     stop only 1st object/car
     print the expiry of last 2 oject/car
     */

     Car car1= new Car();
     car1.name="BMW";
     car1.Color='R';
     car1.year=100;

        System.out.println(car1.name);
            car1.start();
            /*Task 2
             * Create a class student
             * attribute
             * firstnmae
             * last name
             * studentId
             * AGE
             * FUNCTIONS
             * fullName()-> retrun full name+last name
             * description()-> print fulname and student id
             * overEighteen()=> return boolean of wheater student is over 18
             * Make object of your detail
             * print your fullname
             * call descriptin
             * print if you areovereighteen or not
             */
        Student stud1=new Student();
        stud1.FirstName="Miraj";
        stud1.LastName="Gansi";
        stud1.age=19;
        stud1.studentId=1001;
        System.out.println();
            

    }
}

class Person{
    String name;
    int age;
    char gender;

        void introduction(){
            System.out.println("Name"+name+"age"+age+"gender"+gender);
        }
}

class Rectangle{
    int lenght;
    int breath;

    int areaOfRectangle(){
        int area=lenght*breath;
        return area;
    }
}

class Car{
    String name;
    char Color;
    int year;

    int Caryear(){
        int years=year+100;
        
        return years;
    }
    void start(){
        System.out.println("Name"+name+"Color of car"+Color+"year"+Caryear() );
    }
}

class Student{
    String FirstName;
    String LastName;
    int studentId;
    int age;

    String Fullname(){
        return FirstName+""+LastName;
    }
    void descriptin(){
        System.out.println(Fullname()+""+studentId);
    }
boolean overEighteen(){
    return age>18;
}

}
