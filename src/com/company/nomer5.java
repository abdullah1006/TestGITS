package com.company;

public class nomer5 {
    public static boolean isPalindrome(String words, int i){
        String value = words.toLowerCase();
        if(i < value.length()/2){
            int indexAwal = i;
            int indexAkhir = value.length() -i - 1;

            if(value.charAt(indexAwal)!=value.charAt(indexAkhir)){
                return false;
            }else{
                return isPalindrome(value, i+1);
            }
        }else{
            return true;
        }
    }
}
