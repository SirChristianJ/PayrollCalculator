package com.pluralsight;
import java.util.*;

public class PayrollCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter hours worked: ");
        Float hoursWorked = scanner.nextFloat();
        System.out.print("Enter your pay rate: $");
        Float payRate = scanner.nextFloat();
        scanner.nextLine();

        Float extraHours = hoursWorked - 40;          //get overtime hours
        Float normalHours = hoursWorked - extraHours; //get normal hours not including OT

        System.out.print("Your calculated gross pay is: $");
        if(hoursWorked > 40){
            System.out.print(((normalHours*payRate)+(extraHours)*(payRate*1.5)));
        }

        else
            System.out.print(hoursWorked*payRate);

    }
}
