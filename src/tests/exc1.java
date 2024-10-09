package tests;

import java.util.Scanner;



public class exc1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();

        if (input >= 0 && input <= 9){
            System.out.println("DIGIT");
        }else if (input >= 10 && input <= 99){
            System.out.println("NUM");
        }else{
            System.out.println("OTHER");
        }
    }
}
