package lesson1;

import java.util.Random;
import java.util.Scanner;

public class newLesson_1 {


    public void printThreeWords() {
        System.out.println("Orange\n" + "Banan\n" + "Apple\n");
    }

    public void checkSumSing(int a, int b) {
        int sum = a + b;
        if (sum > 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }


    public void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input number");
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value <= 100) {
            System.out.println("yelow");
        } else if (value > 100) {
            System.out.println("green");
        }
    }


    public void compareNumbers() {
        int a = 666666;
        int b = 9000;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public void methodNumber5(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void methodNumber6(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public void methodNumber7(int a) {
        if (a >= 0) {
            System.out.println("false ");
        } else {
            System.out.println("true");
        }
    }

    public void methodNumber8(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public boolean year(int yers) {
        if (yers % 400 == 0) {
            System.out.println("true");
            return true;
        } else if (yers % 100 == 0) {
            System.out.println("false");
            return false;
        } else if (yers % 4 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }


    public void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(2);
            System.out.println("old massiv= " + arr[i]);
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.println("massiv = " + arr[i]);
        }
    }

    public void inputArray100(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("massi_100 =" + arr[i]);
        }

    }


    public void inputArrayYmnoshiti(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println("massiv *2 = " + arr[i]);
        }

    }

    public void twoMassiv(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void methodNumber14(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
    }


}
