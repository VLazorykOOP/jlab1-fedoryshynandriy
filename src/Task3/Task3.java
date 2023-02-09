package Task3;

import java.util.Scanner;

public class Task3 {
    public static void Task3() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int [][]matrix=new int[n][n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]=");
                matrix[i][j] = sc.nextInt();
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

        System.out.println("min = "+ min+" column = "+ col);
        for(int i=0; i<n;i++){
            for(int y=0; y<n; y++) {
                System.out.print(matrix[i][y] + "  ");
            }
            System.out.println();
        }

    }
}
