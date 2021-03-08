import java.util.Arrays;
public class gnome {
    public static void main(String[] args) {
        int[] array = {7,8,2,8,1,6,78,1};
        for (int k = 0; k < array.length; k++){
            System.out.print(array[k] + " ");
        }
        boolean isSorted = true;      //insert mark
        while(isSorted){
            isSorted = false;
            for (int i =1; i < array.length; i++){
                if (array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = true;
                }
            }
        }
        System.out.println();
        for (int p = 0; p < array.length; p++){
            System.out.print(array[p] + " ");
        }
    }
}
