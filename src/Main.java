import Task1.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lab 1 Java");

        Scanner input = new Scanner(System.in);
        System.out.println("Select what task to do?");
        System.out.println("1- First task");
        System.out.println("2- Second task");
        System.out.println("3- Third task");
        System.out.println("4- Fourth task");

        int task=input.nextInt();
        switch (task){
            case 1:
                Task1.Task1();
        }

    }
}
