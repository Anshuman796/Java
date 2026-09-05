package Vector;

import java.util.Vector;

public class KeyWordsOfVector{
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<>();

        vec.add(10);              // add is used to add Elemnt Into Vector
        vec.add(20);
        vec.add(30);

        vec.remove(2);        // remove is used to remove element from vector

        vec.get(0);          // get is used to acces Element by particular index

        vec.set(2,100);           // set is used to chengr the element of a particular index

        vec.capacity();             // total space of a vector

        vec.size();                 // space occupied inside vector

        vec.clear();                 // clear all element from vector

        vec.firstElement();        // give the first element of vector

        vec.lastElement();         // give the last element of array

        vec.isEmpty();             // check that the element is empty or not 

    }
}