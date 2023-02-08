package Task1.Expression;

public class Expression {

//    За введеними значеннями обчислити та вивести на екран значення виразу. Обчислення
//    виконати у трьох варіантах: 1) вхідні дані дійсного типу, результат – дійсного; 2) вхідні дані
//    цілого типу, результат – дійсного; 3) вхідні дані дійсного типу, результат – цілого.
    public static double ExpressionDoubleDouble(double n, double m){
        double resultDouble=0;
        resultDouble=((n+1)/(n*n*m+2))+((m+n)/(m-n))+n*n*n;;
        return resultDouble;
    }
    public static double ExpressionIntegerDouble(int n, int m){
        double resultDouble=0;
        resultDouble=((n+1)/(n*n*m+2))+((m+n)/(m-n))+n*n*n;;
        return resultDouble;
    }
    public static int ExpressionIntegerInteger(int n, int m){
        int resultInt=0;
        resultInt=((n+1)/(n*n*m+2))+((m+n)/(m-n))+n*n*n;
        return resultInt;
    }
}
