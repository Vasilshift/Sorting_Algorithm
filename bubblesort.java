public class bubblesort {
    public static void main(String[] args) {

        String str1 = "xtraf";
        System.out.println(str1);
        byte[] array = str1.getBytes();

        boolean isSorted = false;

        while(!isSorted){

            isSorted = true;
            for (int i =1; i < array.length; i++){
                if (array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = (byte) temp;
                    isSorted = false;
                }

            }
            System.out.println(new String(array));

        }

    }

}
