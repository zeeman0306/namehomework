package names;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    Scanner nameScan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = nameScan.nextLine();
        String bob = "Bob";
        String alice = "Alice";


        if(name.equalsIgnoreCase(bob)){
            System.out.println("Welcome Bob");

        }else if(name.equalsIgnoreCase(alice)){
            System.out.println("Welcome Alice");

        }else{
            System.out.println("wrong name");

        }



    }
}

