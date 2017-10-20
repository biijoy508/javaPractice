package javaCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hello {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        System.out.println("my name is monir khan");
/**
 * Continue just skips current iteration, and moves to next iterations, does not breaks loop, break breaks current loop,
 * return ends execution of the method and returns.
 */
        int[]wow = {1,2,3};

        for(int w : wow){
            if(w == 1){
               // continue;
                break; // break is at loop level
              //  return; // return is at method level not only loop breaks also method
            }
            System.out.println(w);
        }
/**
 * Enhanced For loop is very efficient
 */
        ArrayList <Integer> z = new ArrayList<Integer>();
        z.add(1); z.add(2);
        for(Integer g : z){
            System.out.println(g);
        }

        khan:
            // Labled Statement breaks from the point where the Label Starts.
            //UnLabled Statement breaks just exits the inner loop within which it is present.﻿
            for(int i= 0; i< 2; i++){
                for(int q= 0; q< 1; q++){
                    System.out.println(q);
                   // break;
                    //break khan;
                   // continue;
                    continue khan;
                }
                System.out.println(": "+ i);
            }
/**
 * Very important block about deleting array element  while looping, in the "for loop" we copy it and iterate on its copy
 * instead of the original array, so that original array is ready for CRUD operations
 */
        ArrayList<Integer> forDelete =  new ArrayList<Integer>(Arrays.asList(1,2,3,4));

         for(Integer val: forDelete){
             System.out.println("yo" + val);
           //  forDelete.remove(val);
         }
         for(Integer val: new ArrayList<Integer>(forDelete)){
              forDelete.remove(val);
          }
         System.out.println(forDelete.size());
//Shuffling an array, there is tons of methods in Arrays and Collections
    List<String> list = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
    Collections.shuffle(list);
    System.out.println(list);
}
}