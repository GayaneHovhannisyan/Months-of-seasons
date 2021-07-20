package com.company;


import com.company.months.Months;

import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {
        Scanner inputMonth = new Scanner(System.in);
        System.out.println("Input months : ");
        String inputM =  inputMonth.next();
        inputM = Months.JAN.getMonthsName();

        switch (inputM){
            case "january":
                System.out.println(Months.JAN.getMonthsName()
                        +" is season of "+Months.JAN.getSeason()+
                        ", it has a "+Months.JAN.getDeyOfMonths()+ " day");
        break;


        }
    }

}











