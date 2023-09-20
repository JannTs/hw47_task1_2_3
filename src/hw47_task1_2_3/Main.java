package hw47_task1_2_3;

/**
 * 1.Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
 * int a = 40/0
 *
 * 2.Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
 * String s =null;
 * String m = s.toLowerCase()
 *
 * 3.Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
 * int[] m = new int[2]
 * m[8]=5
 */

public class Main {
    public static void main(String[] args) {
        try {
// Task 1
            int a = 40 / 0;
        } catch (ArithmeticException e1) {
            System.out.println("1.Exception type (Class): " + e1.getClass().getSimpleName());
            System.out.println("exception message: " + e1.getMessage());
        } finally {
            try {
// Task 2
                String s = null;
                String m = s.toLowerCase();
            } catch (NullPointerException e2) {
                System.out.println("2.Exception type (Class): " + e2.getClass().getSimpleName());
                System.out.println("exception message: " + e2.getMessage());
            } finally {
                try {
// Task 3
                    int[] m = new int[2];
                    m[8] = 5;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    System.out.println("3.Exception type (Class): " + e3.getClass().getSimpleName());
                    System.out.println("exception message: " + e3.getMessage());
                }
            }
        }
    }
}

