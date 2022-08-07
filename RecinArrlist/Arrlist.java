import java.util.*;
public class Arrlist {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //in arraylist unlike array you don't need to define the size of the array
        // they can be of any data type integer and string
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size());
        //adding value
        //list.add(element you want to add)
        //or if you want to add it into the specific location then
        //list.add(index, element you want to add)
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "->" + list.size());
        list.add(1,1000);
        System.out.println(list + "->" + list.size());
        //how to get the value from the arraylist
        int val  = list.get(1);
        System.out.println(val);
        //setting the value which will change the value at that definite index
        list.set(1,2000);
        //remove value from the arraylist
        //we give index of the element we want to remove
        list.remove(1);
        System.out.println(list + "->" + list.size());
        //using loop to print the elements of the arraylist
        for(int i = 0 ; i < list.size(); i++){
            int val1 = list.get(i);
            System.out.println(val1);
        }
        //arraylist of the string
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Bello");
        list2.add("Cello");
        System.out.println(list2 + "->" + list.size());
        //if your intent os to print the element of the arraylist you don't need loop 
        System.out.println(list + "->" + list.size());
        //another way of looping
        for(int value: list){
            System.out.println(value);
        }
    }
}