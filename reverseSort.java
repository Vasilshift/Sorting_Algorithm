import java.util.Arrays;
public class reverseSort {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 7, 3};
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

            int[] result = new int[arr.length];
            for (int i = 0, j = result.length-1; i < arr.length; i++, j--){
                result[j] = arr[i];
            }


        System.out.println();
        for (int p = 0; p < result.length; p++) {
            System.out.print(result[p] + " ");
        }
    }
}
