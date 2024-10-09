package tests;


import java.util.Scanner;

public class exc2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();


        if (x < y) {
            if (x < z) {
                if (y < z) {
                    System.out.println(x + " " + y + " " + z);
                } else {
                    System.out.println(x + " " + z + " " + y);
                }
            } else {
                System.out.println(z + " " + x + " " + y);
            }
        } else {
            if (y < z) {
                if (x < z) {
                    System.out.println(y + " " + x + " " + z);
                } else {
                    System.out.println(y + " " + z + " " + x);
                }
            } else {
                System.out.println(z + " " + y + " " + x);
            }
        }
    }
}
