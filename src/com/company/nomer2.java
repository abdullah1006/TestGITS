package com.company;

import java.util.regex.Pattern;

public class nomer2 {
    public static void checkEmail(String email){
        boolean kondisi1 = Pattern.matches("^(.+)@(.+)$",email);
        String[] partEmail = email.split("@");
        String kata1 = partEmail[0];
        String kata2 = partEmail[1];
        boolean kondisi2 = Pattern.matches(".co.id",kata2);
        boolean kondisi3 = Pattern.matches("^(.+)id$",kata2);

        if(kata1.length()<=20 && kondisi1 && kondisi2 && kondisi3){
            System.out.println("Anda Benar");
        }else{
            System.out.println("Anda Salah Format");
        }
    }
}
