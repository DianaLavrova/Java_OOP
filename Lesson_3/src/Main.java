import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            while (true) {
                System.out.println("Вам необходимо угадать число");
                int i = (int) (Math.random() * 10);

                int score = 0;
                for (int tryNumber = 1; tryNumber <= 3; tryNumber++) {
                    int userAnswer = getUserNumber();
                    if (userAnswer < i) {
                        System.out.println("Загаданное число больше. Осталось попыток: " + (3 - tryNumber));
                    } else if (userAnswer > i) {
                        System.out.println("Загаданное число меньше. Осталось попыток: " + (3 - tryNumber));
                    } else {
                        System.out.println("Вы угадали!");
                        score++; break;
                    }
                }
                if (score == 0) {
                    System.out.println("Игра закончена. Число попыток исчерпано.");
                }
                Scanner retry = new Scanner (System.in);
                System.out.println("Хотите попробовать снова? 1 - да, 0 - нет ");

                int retryAnswer = retry.nextInt();

                if (retryAnswer != 1) {
                    break;
                }
            }
        }

        private static int getUserNumber(){
            Scanner myScanner = new Scanner (System.in);
            System.out.println("Введите число от 1 до 10: ");

            return myScanner.nextInt();
        }
    }
