package Task1;

import java.util.Scanner;

import static Task1.Expression.Expression.*;

public class Task1 {
    public static void Task1()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 1 \n");
        System.out.println("Expression= (n+1)/(n*n*m+2)+(m+n)/(m-n)+n*n*n;");
        System.out.println("Select input data type: int/ double ");
        String datain = input.nextLine();
        System.out.println("Select output data type: int/ double ");
        String dataOut = input.nextLine();
        switch (datain){
            case "int": {
                int mi=0, ni=0;
                while((mi==ni || mi*ni*ni+2==0)){
                    System.out.println("Input m != n");
                    System.out.println("Input int m");
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("ONLY NUMBERS");
                    }
                    mi = input.nextInt();
                    System.out.println("Input int n");
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("ONLY NUMBERS");
                    }
                    ni = input.nextInt();
                    System.out.println("m= " + mi + " n= " + ni);
                }
                if (dataOut.equals("int")) {
                    System.out.println("Result =  " + ExpressionIntegerInteger(ni, mi));
                } else if (dataOut.equals("double")) {
                    System.out.println("Result =  " + ExpressionIntegerDouble(ni, mi));
                }
                break;
            }
            case "double": {
                double md=0, nd=0;
                while((md==nd || md*nd*nd+2==0)){
                    System.out.println("Input m != n");
                    System.out.println("Input int m");
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("ONLY NUMBERS");
                    }
                    md = input.nextInt();
                    System.out.println("Input int n");
                    while (!input.hasNextInt()) {
                        input.next();
                        System.out.println("ONLY NUMBERS");
                    }
                    nd = input.nextInt();
                }

                System.out.println("m= " + md + " n= " + nd);
                System.out.println("Result =  " + ExpressionDoubleDouble(nd, md));
                break;
            }
        }
    }

}
