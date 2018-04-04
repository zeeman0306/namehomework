package randNum;

import java.util.Scanner;

import java.util.Random;

public class NumMain {
    public static void main(String[] args) {

        Scanner numScan = new Scanner(System.in);
        Random randNum = new Random();

        System.out.println("Give me a number");
        int numOne = numScan.nextInt();

        for (int i = 0; i < numOne; i++){
            int numTwo = 1 + randNum.nextInt(numOne);
            System.out.println("You entered " +  + " number is " + numTwo);
        }



    }
}
