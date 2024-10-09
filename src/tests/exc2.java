package tests;

import java.util.Arrays;
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        String[] nums = input.split(" ");
        Arrays.sort(nums);

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);


    }
}
