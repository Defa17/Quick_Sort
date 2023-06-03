import java.util.Stack;

class MyQuickSort {
    public static void quickSort(int[] a, int size) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(size - 1);


        while (!stack.isEmpty()) {
            // текущие границы
            int high = stack.pop();
            int low = stack.pop();
            int i = low;
            int j = high;

            // Выбираем pivot элемент
            int pivot = a[low + (high - low) / 2];

            while (i <= j) {
                while (a[i] < pivot) {
                    i++;
                }
                while (a[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                    i++;
                    j--;
                }
            }
            // Добавляем новые границы в стек

            if (low < j) {
                stack.push(low);
                stack.push(j);
            }
            if (i < high) {
                stack.push(i);
                stack.push(high);
            }
        }
    }
}