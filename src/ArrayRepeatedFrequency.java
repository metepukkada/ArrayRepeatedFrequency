import java.util.Arrays;

public class ArrayRepeatedFrequency {

    public static int isFind(int[] arr, int value, int start) {
        int count = 1;
        int tempStart = start;
        for (; start + 1 < arr.length; start++) {
            if (arr[start + 1] == value) {
                // System.out.println(arr[start + 1]);
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int[] array = {0, -33, 44, 44, 44, 1, 1, 1, 5, 5, 10, 10, 20, 20, 40, 40, 40};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                System.out.println(array[i] + " Sayısı " + isFind(array, array[i], i) + " Defa Tekrar Etmektedir.");
            }
            if (i != 0 && i != array.length - 1) {
                if (array[i] != array[i - 1]) {
                    System.out.println(array[i] + " Sayısı " + isFind(array, array[i], i) + " Defa Tekrar Etmektedir.");

                }
            }
        }
    }
}
