package weeek6;
import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        /*  to use ArrayList import at the top og like scanne from java.utils */
        ArrayList<String> animals= new  ArrayList<>();
        /*Size is automatically allocated according to the element */
        /*To add data in animals */
        animals.add("Cat");
        animals.add("dog");
        animals.add("elephant");
        System.out.println(animals);
        /*Can addd elemes directly to index, iy will shift rest to +1 of index */
        animals.add(1,"Tiger");
        System.out.println(animals);
        /*NOtice  how the precios 1 and rest are shifted by 1 index*/
        /*To remote use .remove(index) */
        animals.remove(2);
        System.out.println(animals);
        /*It wll remove the item/elemet in 2nd index */
        /*to update .set(index,) */
        animals.set(1,"Snake");
        System.out.println(animals);
        /* to access cannot use[index]-> square bracket, user .get(index) */
        System.out.println(animals.get(0));// get 0th indexed element

        /*Task
         * Make an arrayList of int
         * [100,200,300,400,500]
         * remove the value 300
         * add-100 at the frst of arra list
         * change 200 -210
         * change 2-- -420
         * print arraylist
         */
        ArrayList<Integer> intArrayList= new ArrayList<>();
        intArrayList.add(100);
        intArrayList.add(200);
        intArrayList.add(300);
        intArrayList.add(400);
        intArrayList.add(500);
        System.out.println(intArrayList);
        intArrayList.add(0, -100);
        System.out.println(intArrayList);
        intArrayList.remove(3);
        System.out.println(intArrayList);
        intArrayList.set(2,210);
        intArrayList.set(3, 420);
        System.out.println(intArrayList);
    }
    
}
