public class Main {
    public static void main(String[] args) {
        changeArray();
        fullArray();
        calculateSix();
        createAr();
    }

    //Task 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeArray() {
        System.out.println("Task 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }

    //Task 2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fullArray() {
        System.out.println("Task 2 ");
        int[] array = new int[8];
        array[0] = 0;
        System.out.println(array[0]);
        for (int j = 1; j < array.length; j++) {
            array[j] = array[j - 1] + 3;
            System.out.println(array[j]);
        }
    }

    //Task 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void calculateSix() {
        System.out.println("Task 3");
        int[] ar = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int t = 0; t < ar.length; t++) {
            if (ar[t] < 6) {
                ar[t] = ar[t] * 2;
            } else if (ar[t] > 6) {
                ar[t] = ar[t] * 1;
            }
            System.out.println(ar[t]);
        }
    }

    //Task 4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    public static void createAr() {
        System.out.println("Task 4");
        int[][] array2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            array2[i][i] = 1;
            for (int j = 0; j < 5; j++) {
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
    }
}