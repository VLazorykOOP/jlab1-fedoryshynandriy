package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void Task2() {
        System.out.println("Task 2 \n");
        System.out.println("Задано масив цілих чисел <=500. Розробити програму, яка вилучає із A всі числа, які\n" +
                "повторюються більше трьох разів, а масив ущільнює. \n");
        Scanner input = new Scanner(System.in);
        int n=501;
        int badInput=0;
        while (n>500)
        {
            System.out.println("Input SIZE of array <= 500");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("ONLY NUMBERS");
                badInput++;
                if(badInput>5){
                    System.exit(0);
                    badInput=0;
                }
            }
            n=input.nextInt();
        }
        System.out.println("Input array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+i+"]= ");
            while (!input.hasNextInt()) {
                input.next();
                System.out.println("ONLY NUMBERS");
                badInput++;
                if(badInput>5){
                    System.exit(0);
                    badInput=0;
                }
            }
            array[i]=input.nextInt();
        }
//        int[] array = new int[]{5,5,5,5,4,4,4,5,4,3,3,3,2,2,1};
//        int n=array.length;
//        System.out.print("Your array: [");
        System.out.print("Your array:");
        for (int i = 0; i < n-1; i++) {
            System.out.print(array[i] +", ");
        }
        System.out.print(array[n-1]+"] ");

        System.out.println();
        int maxValue = array[0];
        for (int i = 0; i < n; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        int[] counter = new int[maxValue + 1];
        for (int i = 0; i < n; i++) {
            counter[array[i]]++;                //збільшення значення array[i] індексу у counter
        }
        int countof3 = 0;
        int single=0;
        for (int i = 0; i < maxValue + 1; i++) {
            if (counter[i] >= 3) {
                countof3+=counter[i];
                single++;
            }
        }
        System.out.println("Count of Triplication= "+ countof3);
        int[] arrayOfTriplication = new int[single];
        int sizeWithout3 = n-countof3;
        int[] arrayWithoutTriplication = new int[sizeWithout3];
        System.out.println("Size of array without Triplication= " +sizeWithout3);

        int temp = 0;
        int j = 0;
        for (int i = 0; i < maxValue + 1; i++) {
            if (counter[i] >= 3) {
                temp = i;
                arrayOfTriplication[j] = temp;
                j++;
            }
        }
        System.out.println("Array of Triplication: " + Arrays.toString(arrayOfTriplication));
        int l=0;
        for (int i = 0; i < n; i++) {
            int element=array[i];
 //            System.out.println("element= "+ element);
            boolean present=false;                     //if the element is present in array of Triplication?
            for (int k = 0; k < single; k++) {
                if(element==arrayOfTriplication[k]){
                    present=true;
                }
            }
            if (present==false){
                    arrayWithoutTriplication[l]=element;
                    l++;
            }
        }
 //      System.out.println("Array without Triplication: " + Arrays.toString(arrayWithoutTriplication));
        System.out.print("Array without Triplication: [");
        for (int i = 0; i < sizeWithout3-1; i++) {
            System.out.print(arrayWithoutTriplication[i] +", ");
        }
        System.out.print(arrayWithoutTriplication[sizeWithout3-1]+"] ");
    }
}
