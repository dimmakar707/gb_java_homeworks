package ru.geekbrains.lesson_4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';

    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    private static int scoreHuman;
    private static int scoreAI;



    public static void main(String[] args) {
        while(true) {
            playRound();
            System.out.printf("SCORE IS: HUMAN   AI\n            %d     %d\n", scoreHuman, scoreAI);
            System.out.println("Wanna play again? Y or N >>> ");
            if(!SCANNER.next().toLowerCase().equals("y")) break;
        }

    }

    private static void playRound() {
        initField(3,3);
        printField();
        while(true) {
            humanTurn();
            printField();
            if(gameCheck(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if(gameCheck(DOT_AI)) break;
        }
    }


    private static boolean gameCheck(char dot) {
        if(checkDraw()) {
            System.out.println("DRAW!!!");
            return true;
        }

        if(checkWin(dot)) {
            if(dot == DOT_HUMAN) {
                System.out.println("HUMAN wins!!!");
                scoreHuman++;
            } else {
                System.out.println("AI wins!!!");
                scoreAI++;
            }
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(isCellEmpty(y,x)) return false;
            }
        }
        return true;
    }

    /*
    Сделать проверку победы с помощью циклов на поле 3 на 3
    ** Сделать проверку победы на поле 5 на 5 и длина последовательности 4
    *** Сделать проверку на любой произвольный размер поля и произвольную длину последовательности
     */
    private static boolean checkWin(char dot) {

        //Horizontal lines
        int dotsInLine = 0;
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if(field[i][j] == dot) {
                    dotsInLine++;
                }
            }
            if(dotsInLine == fieldSizeX) return true;
            dotsInLine = 0;
        }

        //Vertical lines
        dotsInLine = 0;
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                if(field[j][i] == dot) {
                    dotsInLine++;
                }
            }
            if(dotsInLine == fieldSizeY) return true;
            dotsInLine = 0;
        }

        //Diagonal lines
        dotsInLine = 0;
        int dotsInLine2 = 0;
        for (int i = 0; i < fieldSizeX; i++) {
            if(field[i][i] == dot) dotsInLine++;
            if(field[i][fieldSizeX - i - 1] == dot) dotsInLine2++;
        }
        if(dotsInLine == fieldSizeX || dotsInLine2 == fieldSizeX) return true;


        return false;
    }
    /*
     ***** Сделать более умный AI
     */
    private static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while(!isCellEmpty(y, x));

        field[y][x] = DOT_AI;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.print("Please enter coordinates of your turn x & y with whitespace >>>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while(!isCellValid(y,x) || !isCellEmpty(y, x));


        field[y][x] = DOT_HUMAN;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField(int sizeX, int sizeY) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? "-" : i/2 + 1);
        }
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();

//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " ");
//            }
//            System.out.println();
//        }
    }

}
