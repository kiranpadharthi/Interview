package com.rocket.question1;

import java.util.*;

public class IBM {

    public static void main(String[] args) {
        List<Long> boxes = Arrays.asList(1,1);
        List<Long> unitsPerBox = new ArrayList<Long>();
        unitsPerBox.add((long)9);
        unitsPerBox.add((long)6);
        //unitsPerBox.add((long)4);
        int truckSize = 1   ;

        System.out.println("Ans: "+getMaxUnits(boxes,unitsPerBox,truckSize));
    }

    public static long getMaxUnits(List<Long> boxes,List<Long> unitsPerBox,int truckSize){
        long ans = 0;
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        for(int i  = 0;i<unitsPerBox.size();i++){
            map.put(unitsPerBox.get(i),i);
        }
        Collections.sort(unitsPerBox,Collections.reverseOrder());
        int j = 0;
        while(truckSize>0 && j<unitsPerBox.size()){
            long units = unitsPerBox.get(j);
            long numOfBoxes = boxes.get(map.get(units));
            if(truckSize>=numOfBoxes) {
                ans+=(units*numOfBoxes);
                truckSize-=numOfBoxes;
            }
            else{
                ans+=(units*truckSize);
                truckSize=0;
            }
            j++;
        }

        return ans;
    }
}
