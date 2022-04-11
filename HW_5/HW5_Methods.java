package HW_5;

public class HW5_Methods {
    public static int getSum (int a, int b) {
        return a + b;
    }
    public static int getSub (int a, int b) {
        return a - b;
    }
    public static int getMult (int a, int b) {
        return a * b;
    }
    public static double getDiv (double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        System.out.println(getSum(8,23));
        System.out.println(getSub(6,34));
        System.out.println(getMult(4,5));
        System.out.println(getDiv(79,6));
    }
}
