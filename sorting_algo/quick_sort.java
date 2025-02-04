public class quick_sort {

    public static void quick(int[] arr, int start, int end){
        if(start>=end) return;
        int part = sort(arr, start, end);
        quick(arr, start, part-1);
        quick(arr, part+1, end);
    }
    public static int sort(int[] arr,int start,int end){
        int pivot = arr[start];
        int i= start;
        int j = end;
        while(i<j){
            while(arr[i]<=pivot && i<end){
                i++;
            }
            while(arr[j]>=pivot && j>start){
                j--;
            }
            if(i>j) break;
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        arr[start]=arr[j];
        arr[j]=pivot;
        return j;
    }
    public static void main(String[] args) {
        int[] array = new int[]{13,46,24,52,20,9};
        quick(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
