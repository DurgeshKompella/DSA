public class merge_sort {

    public static void merge(int[] array, int start, int end){
        if(start==end) return;
        int mid = (start+end)/2;
        merge(array, start, mid);
        merge(array, mid+1, end);
        sort(array, start, mid,end);
    }
    public static void sort(int[] array,int start,int mid,int end){
        int[] tempArray = new int[end-start+1];
        int i=start;
        int j= mid+1;
        while(i<=mid && j<=end){
            if(array[i]>array[j]) {tempArray[i+j-start-mid-1] = array[j]; j++;}
            else{tempArray[i+j-start-mid-1] = array[i]; i++;}
        }
        while(j<=end){
            tempArray[i+j-start-mid-1] = array[j]; j++;
        }
        while(i<=mid){
            tempArray[i+j-start-mid-1] = array[i]; i++;
        }
        for(int k=0; k<tempArray.length; k++){
            array[start+k]= tempArray[k];
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{13,46,24,52,20,9};
        merge(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
