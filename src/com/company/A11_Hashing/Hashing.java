package com.company.A11_Hashing;

import java.io.OutputStream;
import java.util.*;
//this part has some of the most imp question
// which can be question in knockout rounds

/*

class Myhash{
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    Myhash(int b)
    {
        bucket=b;
        table=new ArrayList<LinkedList<Integer>>();
        for (int i=0;i<b;i++)
            table.add(new LinkedList<Integer>());
    }
    void inset(Integer k)
    {

        int i=k % bucket;
        table.get(i).add(k);
    }

    boolean search(Integer k)
    {
        int i= k % bucket;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i=k% bucket;
        table.get(i).remove(k);

    }

    public static void main(String[] args) {
        Myhash mh=new Myhash(7);
        mh.inset(10);
        mh.inset(15);
        mh.inset(20);
        mh.inset(7);
        mh.inset(56);
        System.out.println(mh.search(10));
        mh.delete(15);
        System.out.println(mh.search(15));
        if(mh.search(56)==true){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}

 */// Implementation_of_chaining and hashing and how does it work

/*
class MyHash{
    int a[];
    int cap,size;
MyHash(int c){
    cap=c;
    size=0;
    a=new int[cap];

    for (int i=0;i<cap;i++){
        a[i]=-1;

    }
}
int hash(int key){
    return key%cap;
}
boolean search(int key) {
    int h = hash(key);
    int i = h;
    while (a[i] != -1) {
        if (a[i] == key)
            return true;
        i = (i + 1) % cap;
        if (i == h)
            return false;
    }
    return false;
}

boolean insert(int key) {
    if (size == cap) return false;
    int i = hash(key);
    while (a[i] != -1 && a[i] != -2 && a[i] != key)
        i = (i + 1) % cap;

    if (a[i] == key)
        return false;

    else {
        a[i] = key;
        size++;
        return true;
    }
}
boolean erase(int key){
    int h=hash(key);
    int i=h;

    while(a[i]!=-1) {
        if (a[i] == key) {
            a[i] = -2;
            return true;
        }
        i = (i + 1) % cap;
        if (i == h)
            return false;
    }
    return false;
}
}

 */// Implementation of Open Addressing

/*
class main{
    private static int  fun(int[] a, int n) {
        HashSet<Integer> hs=new HashSet<>();
        //naive way
//        for(int i=0;i<n;i++)
//            hs.add(a[i]);
//            return hs.size();
        //efficient way
        HashSet<Integer> hss=new HashSet (Arrays.asList(a));
        return hss.size();

    }

    public static void main(String[] args) {
        int a[]={10,20,1,2,3,10,20,3};
        int n=a.length;
        System.out.println(fun(a,n));
    }


}

 *///find distant elements

/*
class main{
    private static void fun(int[] a, int n) {
        for(int i=0;i<n;i++)//traversing the array
        {
            boolean flag=false;//setting a flag

            for (int j=0;j<i;j++)//traversing the a[i] to check if that element is present or not
            {
                if (a[i]==a[j])//if present set ture
                {
                    flag=true;
                    break;
                }
                if (flag=true)//if true then continue in next loop
                    continue;
            }
            int feq=1;//setting frq to 1
            for (int j=i+1;j<n;j++)// checking for the next element if it is present
                if (a[i]==a[j]) //if prent
                {
                    feq++;//increment the frq
                }
                System.out.println(a[i] +" - "+ feq); //print it
        }

    }
    public static void main(String[] args) {
        int a[]={10,20,1,2,3,10,20,3};
        int n=a.length;
        fun(a,n);
    }

}

 *///frequency of elements naive method

/*
//The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map.
This means we can insert a specific key and the value it is mapping to into a particular map.
If an existing key is passed then the previous value gets replaced by the new value.
 If a new pair is passed, then the pair gets inserted as a whole.
        Syntax:
         Hash_Map.put(key, value)

// The getOrDefault(Object key, V defaultValue) method of Map interface,
 implemented by HashMap class is used to get the value mapped with specified key.
  If no value is mapped with the provided key then the default value is returned.

Syntax:
default V getOrDefault(Object key, V defaultValue)+1)
+1 is added if you want to do increment in the default value //not adding +1 is also ok


//Map.Entry and some of this method are given here
https://www.geeksforgeeks.org/map-entry-interface-java-example/

//The java.util.HashMap.entrySet()
method in Java is used to create a set out of the same elements contained in the hash map.
It basically returns a set view of the hash map
or we can create a new set and store the map elements into them.

Syntax:

hash_map.entrySet()



 *///some imp key words before the efficient solution

/*
class main{
    private static void fun(int[] a, int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int x: a){
            hm.put(x,hm.getOrDefault(x,0)+1);

            for (Map.Entry<Integer,Integer> e:hm.entrySet()) {

                System.out.println(e.getKey() + " " + e.getValue());
            }
        }

    }

    public static void main(String[] args) {
        int a[]={10,20,1,2,3,10,20,3};
        int n=a.length;
        fun(a,n);
    }

}

 *///frequency of elements efficient way

/*
class main{
    private static int fun(int[] a, int n, int[] b, int m) {

        Set<Integer> hs=new HashSet<>();
        for (int i=0;i<m;i++)
            hs.add(a[i]);
            int res=0;



        for (int i=0;i<n;i++)
        {
            if (hs.contains(b[i]))
            {
                res++;

                System.out.println(b[i]);
                hs.remove(b[i]);
            }
        }
        return res;

    }

    public static void main(String[] args) {

        int a[]={10,20,1,2,3,7,9,12};
        int b[]={10,20,1,2,3};
        int m=a.length;
        int n=b.length;

        System.out.println (fun(a,n,b,m));
    }
}

 *///Intersection of two unsorted arrays

/*
class main{
    private static int fun(int[] a, int n, int[] b, int m) {
        Set<Integer> h=new HashSet<>();

        for (int x:a)
            h.add(x);
        for (int x:b)
            h.add(x);

        // we all the unique elements so the size is 8
        return h.size();
    }

    public static void main(String[] args) {
    int a[]={10,20,1,2,3,7,9,12};
    int b[]={10,20,1,2,3};
    int m=a.length;
    int n=b.length;

        System.out.println (fun(a,n,b,m));
}
}

 */ //Union of two arrays

/*
class pair{
    public static void main(String[] args) {
        int a[]={8,3,9,4};
       int  sum=13;
        System.out.println(fun(a,sum));
}

    private static boolean fun(int[] a, int sum) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] + a[j] == sum) {
                    return true;
                }
            //else
        return false;
    }
}

 */// find pair naive sol

/*
class main{
    private static boolean fun(int[] a, int sum) {
        Set<Integer>h=new HashSet<>();

        for (int x:a)

            if (h.contains(sum-x)) {
                return true;
            }
        else
            h.add(x);
               return false;
    }
    public static void main(String[] args) {
        int a[]={8,3,9,4};
        int  sum=13;
        System.out.println(fun(a,sum));
    }
}

 *///find pair hashing sol

/*
class main{
    public static void main(String[] args) {
        int a[]={1,4,5,-5,-4,-1};
        System.out.println( fun(a));
    }

    private static boolean fun(int[] a) {
        for (int i=0;i<a.length;i++){
            int sum=0;

            for (int j=i;j<a.length;j++)
                sum=sum+a[j];

                if (sum==0)
                    return true;
        }

        return false;
    }
}

 *///sub_array with sum=0

/*
class main{
    public static void main(String[] args) {
        int []a={1,2,-3,4,-5};
        System.out.println( fun(a));
    }

    private static boolean fun(int[] a) {
        HashSet<Integer> h=new HashSet<>();

        int pre_sum=0;

        for (int i=0;i<a.length;i++){

            pre_sum = pre_sum + a[i];

            if (h.contains(pre_sum))
                return true;

            if (pre_sum==0)
                return true;

            h.add(pre_sum);
        }
        return false;
    }
}

 *///sub_array with sum=0 hashing

                    //* IMP *\\

/*
class main{
    public static void main(String[] args) {
        int []a={5,8,6,13,3,-1};
        int sum=22;
        System.out.println( fun(a,sum));
    }

    private static boolean fun(int[] a,int sum) {
        Set<Integer>h=new HashSet<Integer>();

        int pre_sum=0;
        for (int x:a){
            pre_sum=pre_sum+x;

            if (pre_sum==sum) return true;

            if (h.contains(pre_sum-sum)){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
}

 *///sub_array with given sum hashing

/*
class main{
    public static void main(String[] args) {
    int []a={5,8,6,13,3,-1};
    int sum=22;
        System.out.println( fun(a,sum));
}

    private static int fun(int[] a, int sum) {
        int res=0;
        for (int i =0;i<a.length;i++) {
            int curr_sum = 0;

            for (int j = i; j < a.length; j++) {
                curr_sum += a[j];

                if (curr_sum == sum)
                    res=(Math.max(res, j - i + i));
            }
        }
        return res;
    }

}

 *///longest sub_array with given sum naive method

/*
class main{
    public static void main(String[] args) {
        int []a={5,8,6,13,3,-1};
        int sum=22;
        System.out.println( fun(a,sum));
    }

    private static int fun(int[] a, int sum) {
        int prefix=0;

        HashSet<Integer> hs=new HashSet<>();

            hs.add(0);


        for (int i=0;i<a.length;i++){
            prefix=prefix+a[i];
            if (hs.contains(prefix-sum))
                return 1;
            hs.add(prefix);
        }
        return 0;
    }

}

 *///longest sub_array with given sum hashing

/*
class main{
        private static int fun(int[] a, int n) {
                int res=0;
                for (int i=0;i<n;i++)
                {
                        int count_zero=0;
                        int count_one=0;

                        for (int j=i;j<n;j++)
                        {
                                if (a[j] == 0) ;
                                count_zero++;

                                if (a[i] == 0)
                                count_one++;
                        }
                                if (count_one == count_zero){
                                        res=Math.max(res,count_one+count_zero);
                                }
                        }

                return res;
        }
public static void main(String[]args){
        int a[]={1,0,1,1,1,0,0};
        int n=a.length;

        System.out.println(fun(a,n));

}


}

 *///longest sub_array with equal 0s and 1s

/*
class main{
        public static void main(String[] args) {
                int a[]={1,0,1,1,1,0,0};
                int n=a.length;

                System.out.println(fun(a,n));


        }

        private static int fun(int[] a, int n) {
                Map<Integer,Integer>hm=new HashMap<Integer,Integer>();

                int sum=0,max_leng=0;

                for (int i=0;i<n;i++){
                        if (a[i]==0)
                           a[i]=-1;
                }
                for (int i=0;i<n;i++){
                        sum=sum+a[i];
                        if(sum==0);
                        max_leng=i-1;

                        if (hm.containsKey(sum+n)==true){
                                if (max_leng<i-hm.get(sum + n))
                                        max_leng=i-hm.get(sum+n);
                        }else hm.put(sum+n,i);
                        }
                return max_leng;
        }
}

 *///longest sub_array with equal 0s and 1s hashing need to see again

/*
class main{
        public static void main(String[] args) {
                int a1[]={0,1,0,0,0,0,0};
                int a2[]={1,0,1,0,0,1};

                System.out.println(fun(a1,a2));
        }

        private static int  fun(int[] a1, int[] a2) {
                int n= a1.length,m= a2.length;


                int res=0;
                //iterating  a1
                for (int i=0;i<n;i++){
                        int sum1=0,sum2=0;
               //iterating  a2
                        for (int j=i;j<m;j++){

                                sum1+=a1[j];
                                sum2+=a2[j];

                                if (sum1==sum2)
                                        res=Math.max(res,j-i+1);
                        }
                }
                return res;
        }
}

 */ //Longest common sum naive

/*
class main{
        public static void main(String[] args) {
                int a1[]={0,1,0,0,0,0,0};
                int a2[]={1,0,1,0,0,1};

                System.out.println(fun(a1,a2));
        }

        private static int  fun(int[] a1, int[] a2) {
                int n = a1.length, m = a2.length;

                int a[]=new int[n];
                for (int i=0; i<n-1; i++)
                        a[i]=a1[i]-a2[i];

                HashMap<Integer,Integer> hm=new HashMap<>();

                int sum=0;
                int max_len=0;

                for (int i=0;i<n;i++){
                        sum+=a[i];

                        if (sum==0)
                                max_len=i+1;

                        if (hm.containsKey(sum))
                                max_len=Math.max(max_len,i-hm.get(sum));
                        else {
                                hm.put(sum, 1);
                        }
                }
                return max_len-1;
        }
}

 *///Longest common sum hashing

/*
class main{
        public static void main(String[] args) {
                int a1[]={1,9,3,4,2,20};


                System.out.println(fun(a1));
        }

        private static int fun(int[] a1) {
                Arrays.sort(a1);
                int res=1,cur=1;
                for (int i=1;i< a1.length;i++){
                        if (a1[i]==a1[i-1]+1){
                                cur++;
                        }
                        else if (a1[i]!=a1[i-1]){
                                res=Math.max(res,cur);
                                cur=1;
                        }
                }
                return Math.max(res,cur);
        }
        }

 *///Longest consecutive subsequence

/*
class main{
        public static void main(String[] args) {
                int a1[]={1,9,2,4,3,20};


                System.out.println(fun(a1));
        }

        private static int fun(int[] a1) {
                Set<Integer>h=new HashSet<>();

                for (int x:a1)
                        h.add(x);
                int res=1;

        for(Integer x:h) {
                if (h.contains(x - 1) == false) {
                        int cur = 1;

                        while (h.contains(x + cur))
                                cur++;

                        res = Math.max(res, cur);


                }
        }
                return res;

        }
}

 *///Longest consecutive subsequence hashing

/*
class main{
public static void main(String[]args){
        int a[]={1,9,2,4,3,20};
        int k=4;

            fun(a,k);
        }

        private static void fun(int[] a,int k) {
                int n = a.length;

                for (int i = 0; i < n - k; i++) {
                        int count = 0;

                        for (int j = 0; j < k; j++) {
                                boolean flag = false;

                                for (int p = 0; p < j; p++) {
                                        if (a[i + j] == a[i + p])
                                                flag = true;
                                        break;
                                }

                                if (flag == false) {
                                        count++;
                                }

                                }
                        System.out.println(count+" ");
                        }

                }
}

 *///Count Distinct elements

/*

class Solution
{
        public static void main (String[] args)
        {
                int arr[] = new int[]{10, 10, 5, 3, 20, 5};

                int n = arr.length;
                int k=4;
                printDistinct(arr, n, k);

        }

        static void printDistinct(int arr[], int n, int k)
        {
                HashMap<Integer, Integer> m=new HashMap<>();

                for (int i = 0; i < k; i++) {
                        m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
                }

                System.out.print(m.size()+" ");

                for (int i = k; i < n; i++) {

                        m.put(arr[i - k],  m.get(arr[i - k]) - 1);

                        if (m.get(arr[i - k]) == 0) {
                                m.remove(arr[i-k]);
                        }
                        m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

                        System.out.print(m.size()+" ");
                }
        }
}

 *///Count Distinct elements hashing

/*
class Solution
{
        public static void main (String[] args)
        {
                int arr[] = new int[]{10, 10, 20, 30, 20, 10,10};

                int n = arr.length;
                int k=2;
                printNByK(arr, n, k);

        }

        static void printNByK(int arr[], int n, int k)
        {
                Arrays.sort(arr);
                int i=1,count=1;
                while(i<n){
                        while(i<n&& arr[i]==arr[i-1]){
                                count++;
                                i++;
                        }
                        if(count>n/k)
                                System.out.print(arr[i-1]+" ");
                        count=1;
                        i++;
                }

        }
}

 */// more than n/k occurrences

/*

class Solution
{
        public static void main (String[] args)
        {
                int arr[] = new int[]{10, 10, 20, 30, 20, 10,10};

                int n = arr.length;
                int k=2;
                printNByK(arr, n, k);

        }

        static void printNByK(int arr[], int n, int k)
        {
                HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();

                for(int x:arr)
                        m.put(x,m.getOrDefault(x,0)+1);
                for(Map.Entry <Integer,Integer> e:m.entrySet())
                        if(e.getValue()>n/k)
                                System.out.print(e.getKey()+" ");
        }
}

 */// more than n/k occurrences hashing

/*
class NON {

        static void firstNonRepeating ( int arr[], int n)
      {
            // Insert all array elements in hash
            // table

            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (m.containsKey(arr[i])) {
                    m.put(arr[i], m.get(arr[i]) + 1);
                } else {
                    m.put(arr[i], 1);
                }
            }
            // Traverse array again and return
            // first element with count 1.
            for (int i = 0; i < n; i++)
                if (m.get(arr[i]) == 1)
                    System.out.println(arr[i]);


        }


    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
        firstNonRepeating(arr, n);
    }
}

 *///  find first non-repeating element Efficient way






