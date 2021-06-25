package ru.geekbrains.lesson_3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        /* Пункт ДЗ 1 */

            int[] binaryDigits = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

            for (int i = 0; i < binaryDigits.length; i++) {
                binaryDigits[i] = (binaryDigits[i] == 0) ? 1 : 0;
            }

        /* Пункт ДЗ 2 */

            int[] hundred = new int[100];

            for (int i = 0; i < 100; i++) {
                hundred[i] = i + 1;
            }

        /* Пункт ДЗ 3 */

            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < arr3.length; i++) {
                if(arr3[i] < 6) {
                    arr3[i] *= 2;
                }
            }

        /* Пункт ДЗ 4 */

            int[][] arr2D = new int[7][7];

            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    if( (i == j) || (i + j == arr2D[i].length - 1) ) {
                        arr2D[i][j] = 1;
                    } else {
                        arr2D[i][j] = 0;
                    }
                }
            }

        /* Пункт ДЗ 6 */

            int[] minMaxArray = {1, 10, 8, 253, -128, 15, 0, -3, 36};
            int min = 0;
            int max = 0;
            for (int i = 0; i < minMaxArray.length; i++) {
                if(minMaxArray[i] < min) min = minMaxArray[i];
                if(minMaxArray[i] > max) max = minMaxArray[i];
            }

            int[] testArr = {1,2,3,4,5,6,7,8,9,10};
            testArr = moveArray(testArr, -3);
            System.out.println(Arrays.toString(testArr));
    }

    /* Пункт ДЗ 5 */

        public static int[] generateArray(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
            return arr;
        }

    /* Пункт ДЗ 7 */

        public static boolean checkArrayForEqualParts(int[] arr) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < arr.length; i++) {
                leftSum += arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    rightSum += arr[j];
                }
                if(leftSum == rightSum) return true;
                rightSum = 0;
            }

            return false;
        }

    /* Пункт ДЗ 8 */

        public static int[] moveArray(int[]arr, int offset) {

            int[] tempArr = new int[arr.length]; //К сожалению без дополнительного массива не допёр как сделать

            for (int i = 0; i < arr.length; i++) {
                int nextInd = i + offset;
                if(nextInd > arr.length - 1) nextInd = nextInd - arr.length;
                if(nextInd < 0) nextInd = arr.length + nextInd;
                tempArr[nextInd] = arr[i];
            }

            return tempArr;
        }

}
