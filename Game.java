import java.util.Random;
import java.util.Scanner;

class Game {
    static char[] [] table = new char[3] [3];
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        printTable();
        while(true) {
            turnHuman();
            if (isWin('x')) {
                System.out.println("You won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw!");
                break;
            }
            turnAI();
            printTable();
            if (isWin('o')) {
                System.out.println("Ai win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw!");
                break;
            }
        }
        printTable();
        System.out.println("Game over");
    }

    static void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++ ){
                table[i] [j] = '.';
            }
        }
    }

    static void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++ ){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter coordinates x and y - 1-3");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            table[y] [x] = 'x';
        } while (!isCellValid(x, y));
        table[y] [x] = 'x';
    }

    static boolean isWin(char ch) {

        if (table[0] [0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1] [0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2] [0] == ch && table[2][1] == ch && table[2][2] == ch) return true;

        if (table[0] [0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0] [1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0] [2] == ch && table[1][2] == ch && table[2][2] == ch) return true;

        if (table[0] [0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2] [0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y] [x] == '.';
    }

    static void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
            table[y] [x] = 'x';
        } while (!isCellValid(x,y));
        table[y] [x] = 'o';
    }

    static boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++ ){
                if (table[i] [j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
