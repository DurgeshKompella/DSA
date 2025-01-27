
public class selection_sort {

    private static void selection(int[] array){
        int iteration = 0;
        while (iteration < array.length){
            int min_val_index = iteration;
            for(int i=0; i<array.length-iteration; i++){
                if(array[iteration+i]<array[min_val_index]){
                    min_val_index = iteration+i;
                }
            }
            int temp = array[min_val_index];
            array[min_val_index] = array[iteration];
            array[iteration] = temp;
            iteration++;
        }
    } 
    public static void main(String[] args){
        int[] array = new int[]{13,46,24,52,20,9};
        selection(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
