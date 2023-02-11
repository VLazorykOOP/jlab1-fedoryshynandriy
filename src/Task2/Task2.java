package Task2;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void Task2() {
        System.out.println("Task 3 \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Input SIZE of array");
        int n=input.nextInt();
        System.out.println("Input array");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+i+"]= ");
            array[i]=input.nextInt();
        }
        System.out.println("Your array: "+Arrays.toString(array));
        int maxValue = 0;
        int l=0;
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
        for (int i = 0; i < maxValue + 1; i++) {
            if (counter[i] > 2) {
                countof3++;
            }
        }
//        System.out.println("Count of Triplication= "+ countof3);
        int[] arrayOfTriplication = new int[countof3];
        int sizeWithout3 = n - countof3 * 3;
        int[] arrayWithoutTriplication = new int[sizeWithout3];
        System.out.println("Size of array without Triplication= " +sizeWithout3);
        int temp = 0;
        int j = 0;
        for (int i = 0; i < maxValue + 1; i++) {
            if (counter[i] > 2) {
                temp = i;
                arrayOfTriplication[j] = temp;
                j++;
            }
        }
//        System.out.println("Array of Triplication: " + Arrays.toString(arrayOfTriplication));
        for (int i = 0; i <n; i++) {
            int element=array[i];
//            System.out.println("element= "+ element);
            boolean present=false;                     //if the element is present in array of Triplication?
            for (int k = 0; k < countof3; k++) {
                if(element==arrayOfTriplication[k]){
                    present=true;
                }
            }
            if (present==false){
                    arrayWithoutTriplication[l]=element;
                    l++;
            }
        }
        System.out.println("Array without Triplication: " + Arrays.toString(arrayWithoutTriplication));
    }
}
