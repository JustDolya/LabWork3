import java.util.*;

public class Main {
    public static int[][] inputArr(int n) {
        Random random = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }

    public static void printArr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] array = inputArr(8);
        printArr(array);
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i][i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j][j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j][j];
                }
            }
            array[pos][pos] = array[i][i];
            array[i][i] = min;    // меняем местами наименьший с array[i]
        }
        System.out.println("Массив с отсортированной главной диагональю:");
        printArr(array);
    }
}