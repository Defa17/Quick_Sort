import java.util.Stack;

class Interval {
    public int low;
    public int high;

    public Interval(int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException("low > high");
        }
        this.low = low;
        this.high = high;
    }

    // вычисляем среднее
    public int average() {
        return (low + high) / 2;
    }
}

class MyQuickSort {
    public static void quickSort(int[] a, int size) {
        Stack<Interval> stack = new Stack<>();
        stack.push(new Interval(0, size - 1));

        while (!stack.isEmpty()) {
            // текущий интервал
            Interval interval = stack.pop();
            int low = interval.low;
            int high = interval.high;
            int i = low;
            int j = high;

            int pivot = a[interval.average()];

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
            // Добавляем новый интервал в стек
            if (low < j) {
                stack.push(new Interval(low, j));
            }
            if (i < high) {
                stack.push(new Interval(i, high));
            }
        }
    }
}