import java.util.Arrays;

public class gnomeSort {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 7, 3};
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        int index = 1;
        int i = 0;
        for (; i < arr.length - 1; ){
            if (arr[i] <= arr[i+1]){
                i = index;
                index++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i--;
                if (i < 0){
                    i = index;
                    index++;
                }
            }
        }

        System.out.println();
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}
