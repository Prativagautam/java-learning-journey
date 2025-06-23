/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1_basics;
import java.util.Scanner;

public class Userinputdemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What are you learning lately?");
        String course = sc.nextLine();
        System.out.println("Great! you are learning "+ course);
        System.out.println("How long do you invest daily?");
        int x = sc.nextInt();
        System.out.println("So you invest" + x + "hours daily in learning java");
    }
}
