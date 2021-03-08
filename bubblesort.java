// работает для чисел если вводить как строку, не работает для массива


// не работает для чисел

public class bubblesort {
    public static void main(String[] args) {

        String str = "12324564748741514564";
        System.out.println(str);
        byte[] array = str.getBytes();        //convert string to another type of string (array)

        boolean isSorted = true;      //insert mark

        while(isSorted){

            isSorted = false;
            for (int i =1; i < array.length; i++){
                if (array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = (byte) temp;
                    isSorted = true;
                }

            }


        }
        System.out.println(new String(array));
    }

}
