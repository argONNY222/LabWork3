package sort;

public class LabSort {
    public int[] sort(int[] source) {
        int tmp, n = source.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (source[j] > source[j + 1]) {
                    tmp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = tmp;
                }
            }
        }

        return source;
    }
}
