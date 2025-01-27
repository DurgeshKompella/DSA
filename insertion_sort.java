public class insertion_sort {
    private static void insertion(int[] array){
        int iteration = 1;
        while(iteration < array.length){
            for (int i = 0; i < iteration; i++) {
                if(array[iteration-i]<array[iteration-i-1]){
                    int temp = array[iteration-i];
                    array[iteration-i] = array[iteration-i-1];
                    array[iteration-i-1] = temp;
                }
            }
            iteration++;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{13,46,24,52,20,9};
        insertion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
