package com.company;

public class nomer1 {
    public static void helloWorld(int total){
        for (int i = 0; i<= total; i++){
            if(i%3==0){
                System.out.println("Hello");
            }else if(i%5==0){
                System.out.println("World");
            }else if(i%3==0 && i%5==0){
                System.out.println("Hello World");
            }else{
                System.out.println(i);
            }
        }
    }
}
