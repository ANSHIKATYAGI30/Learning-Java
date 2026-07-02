//ArrayList : dynamic array of objects.
//arraylist is an added class.
//arraylist can grow and shrink.
//arraylist can hold objects.
//object type must be specified using <> when creating an arraylist.
//ArrayList<String> list1 = new ArrayList<>()
//the integer wrapper class was used in place of a primitive data type

import java.util.ArrayList;

public class dsa4 {
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original : " + list);

        list.add(1,40);
        System.out.println("After add : " + list);

        System.out.println("Element at index 2 : " + list.get(2));

        list.set(2,50);
        System.out.println("After set : " + list);

        list.remove(2);
        System.out.println("After remove : " + list);

        System.out.println("Size : " + list.size());

        System.out.println("Index of 40 : " + list.indexOf(40));

        System.out.println("Contains 30? " + list.contains(30));

        RemoveEven(list);

        System.out.println("After removing evens : " + list);

        list.clear();

        System.out.println("After clear : " + list);

        //add(value) - appends value at end of list
        //add(index, val) - inserts given value just before the given index, shifting subsequent values to the right
        //clear() - removes all elements of the list
        //indexOf(val) - returns 1st index where given value is found(-1 if nothing found)
        //get(index) - return val at given index
        //remove(index) - removes/returns value at given index, shifting subsequent values to the left
        //set(index, val) - replaces value at given index with given value
        //size() - returns the no. of elements in list
        //toString() - returns a string representation of list
    }

    public static void RemoveEven(ArrayList<Integer> list){
        for (int i = list.size() - 1;i >= 0; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
    }
}
