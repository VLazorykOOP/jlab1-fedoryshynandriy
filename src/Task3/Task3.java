package Task3;

import java.util.Scanner;

public class Task3 {
    public static void Task3() {
        System.out.println("Task 3 \n");
        System.out.println("Задана цілочислова матриця <= 20*20. Розробити програму, яка здійснює циклічний\n" +
                "зсув стовпців так, щоб першим став стовпчик, у якому знаходиться мінімальний елемент\n" +
                "матриці (вважається, що він єдиний).\n");
        Scanner input=new Scanner(System.in);
        int n=21;
        int badInput=0;
        while (n>20)
        {
            System.out.println("Input n= SIZE of matrix[n;n] <= 20");
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
        int [][]matrix=new int[n][n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]=");
                while (!input.hasNextInt()) {
                    input.next();
                    System.out.println("ONLY NUMBERS");
                    badInput++;
                    if(badInput>5){
                        System.exit(0);
                        badInput=0;
                    }
                }
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int min =99999;
        int col=0;
        for(int i=0; i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    col = j;
                }
            }
        }
        int c=0;
        while (c!= col) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    int temp = matrix[i][j - 1];
                    matrix[i][j - 1] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
            c++;
        }

        System.out.println("Minimum element= "+ min+" in column: "+ col);
        System.out.println("New matrix: ");
        for(int i=0; i<n;i++){
            for(int y=0; y<n; y++) {
                System.out.print(matrix[i][y] + "  ");
            }
            System.out.println();
        }

    }
}
