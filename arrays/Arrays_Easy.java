package arrays;

public class Arrays_Easy {

    private static int question1(int[] array){
        // Problem Statement: Given an array, we have to find the largest element in the array.
        int max_num = Integer.MIN_VALUE;
        for(int i=0; i< array.length; i++){
            if(max_num < array[i]) max_num = array[i];
        }
        return max_num;
    }

    private static String question2(int[] array){
        // Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
        int min_num_1 = Integer.MAX_VALUE;
        int min_num_2 = Integer.MAX_VALUE;
        int max_num_1 = Integer.MIN_VALUE;
        int max_num_2 = Integer.MIN_VALUE;
        for(int i=0; i< array.length; i++){
            if(max_num_1 < array[i]){max_num_2 = max_num_1; max_num_1 = array[i];}
            if(max_num_2 < array[i] && max_num_1 > array[i]){max_num_2 = array[i];}
            if(min_num_1 > array[i]){min_num_2 = min_num_1; min_num_1 = array[i];}
            if(min_num_2 > array[i] && min_num_1 < array[i]){min_num_2 = array[i];}
        }
        String result =  "second min value : "+ Integer.toString(min_num_2) + " second max value : "+ Integer.toString(max_num_2) ;
        return result;
    }

    private static String question3(int[] array){
        // Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
        for(int i=0; i<array.length-1; i++){
            if(array[i+1] < array[i]) return "Array is not sorted in ASC";
        }
        return "Array is sorted in ASC";
    }

    private static String question4(int[] array){
        // Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
        int j=0;
        for(int i=0; i< array.length; i++){
            if(array[i] > array[j]){
                j++;
                array[j] = array[i];
            }
        }
        String result = "";
        for(int i=0; i<=j; i++){
            result = result + Integer.toString(array[i]) + " ,";
        }
        return result;
    }
    private static String question5(int[] array){
        // Problem Statement: Given an array of N integers, left rotate the array by one place.
        int temp = array[array.length-1];
        for(int i=1; i<array.length; i++){
            int temp_1 = array[array.length-1-i];
            array[array.length-1-i] = temp;
            temp = temp_1;
        }
        array[array.length-1] = temp;
        String result = "";
        for(int i=0; i<array.length; i++){
            result = result + Integer.toString(array[i]) + " ,";
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3};
        System.out.println("Question 1 : "+ question1(arr));
        System.out.println("Question 2 : "+ question2(arr));
        System.out.println("Question 3 : "+ question3(arr));
        System.out.println("Question 4 : "+ question4(arr));
        System.out.println("Question 5 : "+ question5(arr));
    }
}
