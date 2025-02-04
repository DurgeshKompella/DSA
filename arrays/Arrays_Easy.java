package arrays;

public class Arrays_Easy {

    private static int question1(int[] array){
        int max_num = 0;
        for(int i=0; i< array.length; i++){
            if(max_num < array[i]) max_num = array[i];
        }
        return max_num;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,3,0};
        System.out.println("Question 1 : "+ question1(arr));
    }
}
