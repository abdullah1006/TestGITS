package com.company;

public class nomer4 {
    public static void reverse(String value){
        String revWords ="";
        for (int i = value.length() -1 ; i>=0; i--){
            revWords += value.charAt(i);
        }
        System.out.println(revWords);
    }

}
