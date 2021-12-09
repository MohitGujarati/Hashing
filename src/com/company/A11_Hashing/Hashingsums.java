package com.company.A11_Hashing;

import java.security.Key;
import java.util.*;


/*
class duplicate_elements {
    //aim : to print duplicate elements.
    public static void main(String[] args) {

        int []a={1,4,5,6,2,2,1,7,8,9};

        Set<Integer> set=new HashSet<>();

        for (int DupNo:a){

            if (set.add(DupNo)==false){
                System.out.println("Dupicate number is "+DupNo);
            }
        }


    }
}

 */// Duplicate elements in an array

/*
class main{
    public static void main(String[] args) {
        int []a={3,4,5,2,2,1,3,3,3,3};

        Map<Integer,Integer> hm=new HashMap<>();

        for (int no:a){
         Integer count= hm.get(no);
         if (count==null){
             hm.put(no,1);
                    //no=key,1=value
         }
         else {
             count++;
             hm.put(no,count);
         }
        }
        System.out.println("Duplicate elements are ");
        Set<Map.Entry<Integer,Integer>> hashmapEntry=hm.entrySet();
        for (Map.Entry<Integer,Integer> reciveEntry:hashmapEntry){

            if (reciveEntry.getValue()>1){
                System.out.println(reciveEntry.getKey()+" ");
            }
        }



    }
}

 *///Duplicate elements in an array

/*
Leetcode 216
Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.

Example 1:
   Input: nums = [1,2,3,1]
   Output: true

class contains_duplicate_1 {
    boolean solution(int[] nums) {
        Set<Integer> set = new HashSet();

        for (int num : nums) {
            if (!set.add(num)) {
                System.out.println("true");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        contains_duplicate_1 call=new contains_duplicate_1();
        int[] nums={1,2,3,1};
        call.solution(nums);

    }
}

 */ //contains duplicate 1(IMP)

//Given a string , find first repeated character in the String
//contains duplicate 2,3 leetcode
//count district elements in hashmap in a particular window








