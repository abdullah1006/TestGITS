package com.company;

public class nomer3 {
    public static void convertDate(String string){
        String[] parts = string.split(" ");
        String time = parts[0];
        String AMPM = parts[1];

        String[] timeParts = time.split(":");
        String hours = timeParts[0];
        String minutes = timeParts[1];
        String seconds = timeParts[2];

        int intHours = Integer.parseInt(hours);
        int intMinutes = Integer.parseInt(minutes);
        int intSeconds = Integer.parseInt(seconds);

        if(intSeconds>=60){
            intMinutes+=1;
        }
        if(intMinutes>=60){
            intHours+=1;
            intMinutes-=60;
        }
        if (AMPM.equals("PM")){
            if(intHours < 12){
                intHours +=12;
            }
        }else {
            if(intHours==12){
                intHours = 0;
            }
        }
        if(intHours<10 && intMinutes<10){
            System.out.println("0"+intHours+":0"+intMinutes);
        }else if(intHours<10){
            System.out.println("0"+intHours+":"+intMinutes);
        }else if(intMinutes<10){
            System.out.println(intHours+":0"+intMinutes);
        }

    }
}
