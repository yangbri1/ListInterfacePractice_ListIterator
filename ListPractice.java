// import 'List' interface & 'ArrayList' class from java.util package
import java.util.*;

public class ListPractice {
     
    /* Recall: Generally, 'array' is thought to have a fixed length & data type determined at array declaration
     * however its still considered mutable as you can change the element's value after declaring.
     * Also arrays can contain either primitives or Object data type as long as it's just one (ex. all 'int')
     */
    public void practiceList(){
        /* on the contrary, 'ArrayList' only contains Object data type & size is mutable 
         * -- when 'ArrayList' fills up, size increases by 50% under the hood
        */

        // 1st way to create 'List' interface:
        /* 'List' interface followed by Object type (String, Int, etc.) enclosed within Generics <> & 'List' name outside ...
         w/ 'new' keyword & an implementation class 'ArrayList' to create 'List' */
        List<String> aespaSongs = new ArrayList<>();

        /* Side Note: Collections need to hold Object type (Integer, Double, Character, etc.) -- NOT primitives (int, double, char) */
        // 2nd way to create 'List' interface: (Both below ways works!)
        // ArrayList<Integer> btsSongs = new ArrayList<>();
        // ArrayList<Integer> btsSongs = new ArrayList<Integer>();

        // .add() method to add elements to List 'aespaSongs'
        aespaSongs.add("Whiplash");
        aespaSongs.add("Black Mamba");
        aespaSongs.add("Me Gusta Tu");
        aespaSongs.add("New Jeans");
        aespaSongs.add("Hard Carry");

        // can .add() @ given index  --- 'List' accepts duplicate values unlike 'Set'
        aespaSongs.add(4, "Whiplash");

        // implement Collection.addAll() method to add multiple elements to a collection -- can take individual elements or array of elements (shown below)
        Collections.addAll(aespaSongs, "Bang Bang Bang", "Gee", "Sok Sok Sok");

        // .set() method to replace an element's value @ given index
        aespaSongs.set(3, "Next Level");    // replaced "Me Gusta Tu" w/ "Next Level" single

        // .remove() method to remove element @ given index
        aespaSongs.remove(8);   // remove "Sok Sok Sok" as it's not under Aespa

        // call forth Collection.sort() from java.util package -- to sort alphabetically 
        /* -- can be sort using a custom sort method "Comparator" or "Comparable(?)" */
         Collections.sort(aespaSongs);

        // iterate over List using enhanced for-each loop 
        // Note: for-each iterates "forward" -- index: [0, INF)
        for(String elem : aespaSongs){
            // print each individual Aespa song elem output stream to console 
            System.out.println(elem);
        }

        // built-in Collections.reverse() method to reverse List order of Aespa discography
        Collections.reverse(aespaSongs);

        // print out a newline "\n" (formatting -- could use .printf() if wanted ... but hassle as have to use Regex)
        System.out.println();

        // iterate List 'aespaSongs' "backward"
        for(int index = 0; index < aespaSongs.size(); ++index){
            // apply .get() method to retrieve value at iterator 'index'
            System.out.println(aespaSongs.get(index));
        }

        System.out.println();
        // since 'List' allow duplicates --- return index of last "Whiplash" appearance -- if not found return negative
        System.out.println(aespaSongs.lastIndexOf("Whiplash"));

        // return total number of tracks on this album
        System.out.println("\nNumber of Aespa tracks on 'List' aespaSongs: ");
        System.out.println(aespaSongs.size()+1);


        System.out.println("Iterating 'List' aespaSongs in \"forward\" direction using ListIterator");
        /* Iterating 'List' aespaSongs in "forward" direction using ListIterator */
        ListIterator<String> itr = aespaSongs.listIterator();
        // checks if 'itr' in aespaSongs has a next element in "forward" direction ...
        while(itr.hasNext()){
            // if so print out element & move cursor "forward"
            System.out.println(itr.next());
        }

        System.out.println("Iterating 'List' aespaSongs in \"backward\" direction using ListIterator");
        /* Iterating 'List' aespaSongs in "backward" direction using ListIterator -- starting at last index: aespaSongs.size() */
        ListIterator<String> itr2 = aespaSongs.listIterator(aespaSongs.size());
        // checks if 'itr2' in aespaSongs has a previous element in "backward" direction ...
        while(itr2.hasPrevious()){
            // if so print out element & move cursor "backward" towards index 0
            System.out.println(itr2.previous());
        }
    }
}
