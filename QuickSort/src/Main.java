import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arraySorted = new int[10];
        int[] array = new int[10];
        Random random = new Random();

        int max = 100;
        int min = 1;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            array[i] = randomNumber;
            arraySorted[i] = randomNumber;
        }

        MyQuickSort.quickSort(array, 10);
        System.out.println("Неотсоритрованный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arraySorted));
    }

}