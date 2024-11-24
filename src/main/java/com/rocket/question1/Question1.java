package com.rocket.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public  static void main(String args[]){
        int[] arr = new int[]{1,3,6,8,10,13,15};
        //checkSum(arr,23);
        //array as input and target
        // target : 23

        int[] nums = new int[]{5, 3, 10, 4, 6, 2};
        findLeaders(nums);

        Employee e1 = new Employee("Kiran", 12);
        Employee e2 = new Employee("Kiran", 12);

        System.out.println("Equals:"+(e1==e2));

        List<Integer> n = Arrays.asList(1,2,4,6,7);


        for(Integer i : n){
            if(i==2){
                n.remove(Integer.valueOf(i));
            }
        }

        String s = "test";

        //O(1)



        //{1,4,6,7}


    }
    static boolean checkSum(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        boolean flag = false;

        while(s<e){
            int currSum = arr[s] + arr[e];
            if(currSum==target){
                System.out.println("Numbers are:"+arr[s]+" "+arr[e]);
                s++;
                e--;
                flag = true;
            }
            else if(currSum>target){
                e--;
            }
            else{
                s++;
            }
        }

        return flag;
    }

    static void findLeaders(int[] arr){

        //TC : O(N)
        int currMax = Integer.MIN_VALUE;
        //System.out.println(currMax);

        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>currMax){
                currMax = arr[i];
                System.out.println(arr[i]);
            }
        }

    }
}
