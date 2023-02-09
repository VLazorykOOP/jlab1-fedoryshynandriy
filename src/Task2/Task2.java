package Task2;
import java.util.*;
public class Task2 {
    public static void Task2(){
        int[] array = new int[] { 5, 50, 50, 4, 5 , 5};
        int[] arrayWithout3 = new int[array.length];
        int[] arrayWithoutDuplicates = new int[array.length];
        if(array!=null && array.length!=0) {
            int size = array.length;
            arrayWithoutDuplicates[0] = array[0];
            for (int i = 0; i < size; i++) {
                for (int j = 1; j < size; j++) {
                    if (arrayWithoutDuplicates[i] != array[j]) {
                        arrayWithoutDuplicates[j] = array[j];
                        break;
                    }
                }
                int counter = 0;
                for (int j = 0; j < size; j++) {
                    if (arrayWithoutDuplicates[i] != array[j]) {
                    }
                    else if (arrayWithoutDuplicates[i] == array[j]) {
                        counter++;
                        System.out.println(arrayWithoutDuplicates[i] + " counter= " + counter);
                    }
                }
                if(counter<3){
                    arrayWithout3[i]=arrayWithoutDuplicates[i];
                }
                counter = 0;
                System.out.println("-------------------------------");
            }
        }
        System.out.println("array"+ Arrays.toString(arrayWithout3));
    }
}
