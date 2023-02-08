package Task1;

import java.util.Scanner;

import static Task1.Expression.Expression.*;

public class Task1 {
    public static void Task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1 \n");
        System.out.println("Expression= (n+1)/(n*n*m+2)+(m+n)/(m-n)+n*n*n;");
        System.out.println("Select input data type: int/ double ");
        String datain = input.nextLine();
        System.out.println("Select output data type: int/ double ");
        String dataOut = input.nextLine();
        switch (datain) {
            case "int": {
                System.out.println("Input int m");
                int mi = input.nextInt();
                System.out.println("Input int n");
                int ni = input.nextInt();
                System.out.println("m= " + mi + " n= " + ni);
                if (dataOut.equals("int")) {
                    System.out.println("Result =  " + ExpressionIntegerInteger(ni, mi));
                } else if (dataOut.equals("double")) {
                    System.out.println("Result =  " + ExpressionIntegerDouble(ni, mi));
                }
                break;
            }
            case "double": {
                System.out.println("Input double m");
                double md = input.nextDouble();
                System.out.println("Input double n");
                double nd = input.nextDouble();
                System.out.println("m= " + md + " n= " + nd);
                System.out.println("Result =  " + ExpressionDoubleDouble(nd, md));
                break;
            }
        }
    }

}
