import java.util.Stack;

public class MyQuickSort {
    public static void quickSort(int[] a, int size) {

        // Создаем стек для хранения нижних и верхних границ
        Stack<Integer> lows = new Stack<>();
        Stack<Integer> highs = new Stack<>();

        lows.push(0);
        highs.push(size - 1);

        while (!lows.isEmpty()) {
            // текущие границы
            int low = lows.pop();
            int high = highs.pop();
            int i = low;
            int j = high;

            // Выбираем pivot элемент
            int pivot = a[low + (high - low) / 2];

            do {
                // Находим элементы для перестановки
                while (a[i] < pivot) {
                    i++;
                }
                while (a[j] > pivot) {
                    j--;
                }

                // Переставляем элементы, если необходимо
                if (i <= j) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                    i++;
                    if (j > 0) {
                        j--;
                    }
                }
            } while (i <= j);

            // Добавляем новые границы в стек
            if (i < high) {
                lows.push(i);
                highs.push(high);
            }
            if (j > low) {
                lows.push(low);
                highs.push(j);
            }
        }
    }
}