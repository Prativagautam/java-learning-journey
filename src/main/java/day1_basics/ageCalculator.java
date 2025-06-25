/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1_basics;
import java.util.Scanner;
import java.time.LocalDate;

public class ageCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese let me know your birth year");
        int dob = sc.nextInt();
        sc.nextLine();
//   so that scanner reads other input in future.
        int CurrentYear = LocalDate.now().getYear();
        int age =  CurrentYear - dob;
        System.out.println("You are "+age +" years old.");
        sc.close();
    }
}
