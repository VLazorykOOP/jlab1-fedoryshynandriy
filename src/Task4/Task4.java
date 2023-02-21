package Task4;

import java.util.Scanner;

public class Task4 {
    public static void Task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task 4 \n");
        System.out.println("Задано текст, слова в якому розділені пробілами і розділовими знаками. \n " +
                "Розробити програму, яка знаходить і друкує всі слова, букви в яких не повторюються.\n");
        System.out.println("Input text");
        String text = sc.nextLine();
        System.out.println("Entered text: \n"+text);
        System.out.println("Text without words with duplicates of letters: ");
        for(String word : text.split(" ")){
            char[] x = word.toCharArray();
            boolean duplicates = false;
            if ((x[0] >= 'a' && x[0] <= 'z') || (x[0] >= 'A' && x[0] <= 'Z')||(x[0] >= 'а' && x[0] <= 'я')||(x[0] >= 'А' && x[0] <= 'Я')) {
                for (int j = 0; j < x.length; j++) {
                    for (int k = j + 1; k < x.length; k++) {
                        if (x[k] == x[j]) {
                            duplicates = true;
                        }
                    }
                }
                if(duplicates==false){
                    System.out.print(word+ " ");
                }
            }
        }
    }
}
