import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        int max = 100;
        int min = 1;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            array[i] = randomNumber;

        }

        System.out.println("Неотсоритрованный массив: ");
        System.out.println(Arrays.toString(array));

        MyQuickSort.quickSort(array, 10);

        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
    }

}