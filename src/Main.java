import Task1.Task1;
import Task2.Task2;
import Task3.Task3;
import Task4.Task4;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lab 1 Java");

        System.out.println("Select what task to do?");
        System.out.println("1- First task");
        System.out.println("2- Second task");
        System.out.println("3- Third task");
        System.out.println("4- Fourth task");
       //int task=sc.nextInt();
       int task=4;
        switch (task){
            case 1:
                Task1.Task1();
                break;
            case 2:
                Task2.Task2();
                break;
            case 3:
                Task3.Task3();
                break;
            case 4:
                Task4.Task4();

        }

    }
}
