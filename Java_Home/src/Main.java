import java.util.Scanner;

// Task 1
public class Main {
    public static void main(String[] args) {

        // Task 2
        //byte a = 127;
        //int b = 5;
        //double c = 1.4;
        //float d = 1.8790f;
        //long e = 123467890l;
        //String f = "Montana";
        //boolean g = true;
        //char h = '\uffff';

        isPositiveOrNegative(5);
        greetings("Diana");
        System.out.println(value(10, 5, 10, 2));
        System.out.println(check());
        System.out.println(Negative(6));

    }


    //Task 3
    public static int value (int a, int b, int c, int d) {
        int e = a * (b + (c / d));
        return e;
    }
    //Task 4
    public static boolean check () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
    int first = scanner.nextInt();

    System.out.println("Введите второе число");
    int second = scanner.nextInt();

    int third = first + second;

    if ((third <= 10)|| (third >=20)) {
     return true;
    } else {
    return false;
    }
}

    //Task 5
    public static void isPositiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Task 6
    public static boolean Negative(int p){
       if (p < 0) {
           return true;
       } else {
           return false;
       }

       //Task 7
    }
    public static void greetings(String name) {
        System.out.println("Привет" + " " + name);
    }

}

