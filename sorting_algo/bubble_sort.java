public class bubble_sort {

    private static void bubble(int[] array){
        int iteration = 0;
        int swap =0;
        while(iteration < array.length-1){
            for(int i=0; i < array.length-1-iteration; i++){
                if(array[i]>array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    swap++;
                }
            }
            if(swap ==0 ) break;
            iteration++;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{13,46,24,52,20,9};
        bubble(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
