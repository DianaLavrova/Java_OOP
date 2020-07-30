import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 5;
    static final int WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        iNeedMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Победа!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
            compTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            isFull();
        }
    }

    static void iNeedMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }
        }

    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");

            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCallValid(y, x));
        map[y][x] = DOT_X;
    }

    static boolean isCallValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }

        return map[y][x] == DOT_EMPTY;
    }

    static void compTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCallValid(y, x));
        map[y][x] = DOT_O;
    }


    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char c) {
        int winRows = 0, winColums = 0, winDiag = 0;

        for (int row = 0; row < SIZE; row++) {
            winColums = 0;
            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == c){
                    winColums++;
                }
                if (row==column && map[row][column] == c){
                    winDiag++;
                }
            }
            if (winColums == WIN || winDiag == WIN){
                return true;
            }
        }

        for (int column = 0; column < SIZE; column++) {
            winRows = 0;
            for (int row = 0; row < SIZE; row++) {
                if (map[row][column] == c){
                    winRows++;
                }
            }
            if (winRows == WIN){
                return true;
            }
        }

        return false;
    }

}