package lesson1;

public class MainLesson_1 {
    public static void main(String[] args) {
        newLesson_1 lesson1 = new newLesson_1();
        int a = 4;
        int b = 1111111;
        String str = "lesson number1";
        int yers = 2024;
        int[] array10 = new int[10];
        int[] array100 = new int[100];
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arrTwo = new int[5][5];


        lesson1.printThreeWords();
        lesson1.checkSumSing(a, b);
        lesson1.printColor();
        lesson1.compareNumbers();
        lesson1.methodNumber5(a, b);
        lesson1.methodNumber6(b);
        lesson1.methodNumber7(a);
        lesson1.methodNumber8(str, a);
        lesson1.year(yers);
        lesson1.inputArray(array10);
        lesson1.inputArray100(array100);
        lesson1.inputArrayYmnoshiti(arr);
        lesson1.twoMassiv(arrTwo);
        lesson1.methodNumber14(10, 15);

    }
}
