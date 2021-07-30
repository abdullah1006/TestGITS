package com.company;



public class Main {

    public static void main(String[] args) {
        //Jawaban Nomer 1
        //nomer1.helloWorld(10);
        //Jawaban Nomer 4
        //nomer4.reverse("Ayes");
        //Jawaban Nomer 5
        //System.out.println(nomer5.isPalindrome("Kodok",0));

        // Masih ngesplit Timenya, trus jika PM hournya nambah 12 -24
        String string = "12:00:00 AM";
        String[] parts = string.split(" ");
        String time = parts[0];
        String AMPM = parts[1];

        String[] timeParts = time.split(":");
        String hours = timeParts[0];
        String minutes = timeParts[1];
        String seconds = timeParts[2];

        if(AMPM.equals("PM")){

        }

    }

}

