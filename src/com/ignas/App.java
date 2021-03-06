package com.ignas;

public class App {

    public static void main(String[] args) {

        printBonusDatesBetween(0, 10000);
    }

    static void printBonusDatesBetween (int fromYear, int toYear){

        while (fromYear < toYear ){

            if(fromYear<1000){
                fromYear++;
                continue;
            }else if(fromYear >9999){
                break;
            }

            int dayUnit = fromYear /1000;
            int dayDecimal = fromYear %1000 /100;
            int monthUnit = fromYear %100 /10;
            int monthDecimal = fromYear %10 ;
            
            if(dayDecimal*10 + dayUnit > 0 &&
                    dayDecimal*10 + dayUnit <32 &&
                    monthDecimal*10 +monthUnit <13 &&
                    monthDecimal*10 +monthUnit >0 ){
                System.out.println(fromYear+"-"+monthDecimal+monthUnit+"-"+dayDecimal+dayUnit);
            }
            fromYear++;
        }
    }
}