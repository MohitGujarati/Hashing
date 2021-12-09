package com.company.A11_Hashing;
/*
 Their are very few example of this SET interface because they are made to be used inside a question
 no particular question like binary Search are there but
 knowing how to use some constructor and methods is the most imp part of it
 Kind of theory part is more means -> internal working ,difference  and common constructor and method
 *///Note
/*

Iterator
        An iterator is an interface used for iterate over a collection.
        It takes the place of Enumeration in Java Collections Framework.
        The difference between iterator and Enumeration is:
        The Iterator can traverse legacy and non-legacy elements whereas
        Enumeration can traverse only legacy elements.
        Iterator is fail-fast whereas Enumeration is not fail-fast

 */ // what is iterator

// HashSet
/*
public class Hashing_Questions {
    public static void main(String[] args) {
        HashSet<Integer> myhashset =new HashSet<>();
        myhashset.add(104);
        myhashset.add(103);
        myhashset.add(105);
        myhashset.add(120);
        myhashset.add(100);
        myhashset.add(110);
        myhashset.remove(110);
        myhashset.add(90);


        System.out.println(myhashset);
        System.out.println(myhashset.isEmpty());
        System.out.println(myhashset.remove(103));
        System.out.println(myhashset.clone());
        System.out.println(myhashset);

    }
}

 */  // most common question in hashmap is "Explain the internal working of hashmap"
/*
class Main {
    public static void main(String[] args) {

        // create first set
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Numbers: " + numbers);

        // create second set
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);

        System.out.println("Prime Numbers: " + primeNumbers);

        // Difference between HashSet1 and HashSet2
        numbers.removeAll(primeNumbers);
        System.out.println("Numbers without prime numbers: " + numbers);
        numbers.containsAll(primeNumbers);
    }
}

 */ //difference between this two arrays
/*
class hasset{
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(103);
        s.add(108);
        s.add(107);
        s.add(106);
        s.add(106);
        System.out.println(s);
        if (s.contains(106)) {
            System.out.println("present");
        } else
            System.out.println("not present");
        s.remove(108);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s.isEmpty());

    }

}

 */ // basic function in hashset
/*
class main{
    public static void main(String[] args) {
        HashSet <Integer>  distinct =new HashSet();

        int a[]={1,2,4,2,5,4,3,5};
        for (int i=0;i<a.length;i++){
           distinct.add(a[i]);
        }
        System.out.println(distinct);
        System.out.println(distinct.size());

    }
}

 */ // distinct elements in a array
/*
class main{
    void union(int[] a, int[] b) {

        HashSet <Integer> myhasset =new HashSet<>();

        for (int i=0;i<a.length;i++) {
            myhasset.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            myhasset.add(b[i]);
        }
        System.out.println(myhasset.size());


    }
    public static void main(String[] args) {
        main call=new main();
        int[] a = { 4, 6, 7, 8,15,29};
        int[] b = {4, 6, 7};


        call.union(a,b);

    }
}

 */ // union of two arrays
/*
class main{
    void Intersection_of_two_arrays(int[] a, int[] b) {
        Set<Integer> set=new HashSet<>();

        int count=0;

        for (int i=0;i<a.length;i++){
            set.add(i);

        }
        for (int i=0;i<b.length;i++) {
            set.add(i);


            if (set.contains(i)){
                 count++;
                 set.remove(i);

            }
        }
        System.out.println(count);

    }
public static void main(String[] args) {
    main call = new main();
    int[] a = {5,11,16,5,10};
    int[] b = {16,11,4};

    call.Intersection_of_two_arrays(a, b);
 }

 */ //Number of unique elements in an array                                         //imp
/*
class Spare_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0, 0, 0, 0};
        int counter = 0;
        HashSet hash = new HashSet();
        for (int i = 0; i < a.length; i++) {

            hash.add(a[i]);
            if (a[i] == 0) {
                counter++;
            }
        }
        System.out.println("no duplicate"+hash);
        if (counter>a.length/2){
            System.out.println("spared");
        }
    }
}

 */ //spared arrays and arrays without duplicates
/*
class hasSet_features{

    void Union(HashSet<Integer> set1, HashSet<Integer>set2){
        set1.addAll (set2);
        System.out.println("Union- "+set1);

    }

    void Intersection(HashSet<Integer> set1, HashSet<Integer> set2){
        set1.retainAll(set2);
        System.out.println("Intersection - "+set1);
    }


    void Subset(HashSet<Integer> set1, HashSet<Integer> set2){
        boolean result = set1.containsAll(set2);
        System.out.println(result);
    }





    public static void main(String[] args) {

        hasSet_features call= new hasSet_features();
        HashSet<Integer> set1=new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("HashSet 1: " + set1);

        HashSet<Integer> set2=new HashSet<Integer>();

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("HashSet 2: "+set2);
        System.out.println("");

        call.Union(set1,set2);
        System.out.println("");
        call.Intersection(set1,set2);
        System.out.println("");
        call.Subset(set1,set2);



    }
}

 */ // Union ,Intersection,subset                                                  //some imp library's of hashset
/*
class main{
    public static void main(String[] args) {
        HashSet set=new HashSet();

        int[]a={1,2,3,5,6,1,2,3};
        int[]b={7,8,9};
        int counter=0;
        for (int i=0;i<a.length;i++){
            counter++;
                set.add(a[i]);
            }
        for (int i=0;i<b.length;i++){
            counter++;
            set.add(b[i]);
        }

        System.out.println(counter);
        System.out.println(set.isEmpty());;
        System.out.println(set.add(22));;
        System.out.println(set.remove(1)); ;
        System.out.println(set);

    }
}

 */// timepass practice

/*

 */ //Do contains duplicate 2,non decreasing subsequence

//  TreeSet
/*
class TreeSet1{
    public static void main(String args[]){
        //Creating and adding elements 
      
        
        TreeSet<String> Ts=new TreeSet<String>();
        Ts.add("Ravi");
        Ts.add("Vijay");
        Ts.add("Ravi");
        Ts.add("Ajay");
        Ts.add("ajay");
        //Traversing elements

// According to natural sorting order of treeSet it sorts the elements in alphabetical order
  //A < a as per unicode so "a" will be printed at the last

        Iterator<String> itr=Ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            // we can also do this

        }
        System.out.println("direct print the set "+Ts);

    }
}

 */ // tree set for Strings
/*
class TreeSet3{
    public static void main(String args[]){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(12);
        set.add(15);
        set.add(1);
        set.add(17);
        set.add(25);
        set.add(1);
        set.add(100);
        System.out.println(set);
        // Tree set follows the acceding order so first value and last value is
        //as shown and no duplicate will be shown

        System.out.println("First Value in TreeSet : "+set.pollFirst());
        System.out.println("Last Value in TreeSet : "+set.pollLast());
        System.out.println("ceil Value in TreeSet : "+set.ceiling(16));
        System.out.println("Floor Value in TreeSet : "+set.floor(16));
      //  System.out.println("Index Value in TreeSet : "+indexOf(set, 17));// this method is mentioned but not working

    }
}

 *///tree set for integers
/*
class operations {
    public static void main(String[] args) {
        TreeSet custom=new TreeSet();

        custom.add("A");
        custom.add("B");
        custom.add("C");
        custom.add("D");

        System.out.println("Initial set :"+custom);
        System.out.println("Reverse set :"+custom.descendingSet());
        System.out.println("Head set :"+custom.headSet("c",true));
        System.out.println("Subset set :"+custom.subSet("A",false,"E",true));
        System.out.println("Tailset set :"+custom.tailSet("C",false));


    }
}

 */// some common operations on Tree set

//Do contains duplicate  3 FROM LEETCODE(IMP)
//leetcode-1675

// HashMap
// how does it work  popular interview question
// used for searching data
/*
 class  HasMap{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        System.out.print("HasMap  values "+ map+"\n");
        map.put(4,"Grapes");//trying to duplicate

        // grapes will not be printed twice because it has same keys
        System.out.print("HasMap without duplicate values "+ map);


//        System.out.println("Iterating Hashmap...");
//        for(Map.Entry m : map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

 *///add values in hashmap
/*
class remove{
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(4,"Grapes");

        System.out.println("initial hasmap "+map);
        // we can remove elements using both key and value or only key one of them

        map.remove(1);//using only key
        System.out.println("new map "+map);
        map.remove(4,"Grapes");// using both
        System.out.println("removing one of the duplicate  value "+ map);
    }
}

 */ //removing the elements
 /*

 */


// Linked Hashmap
/*
class Linked{
    public static void main(String[] args) {
        LinkedHashMap link=new LinkedHashMap();
        link.put(1," hashmap will be completedd today"+"\n");
        link.put(2,"its 10th june 2021 "+"\n");
        link.put(3,"and im going for dinner upstairs "+"\n");
        link.put(4,"its nearly 8 bye thanks "+"\n");

          //same as other just theory part is bit different
        System.out.println(link);
    }
}

 */


































