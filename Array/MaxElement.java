package Array;

public class MaxElement {

    public static void max(int arr[]){
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maxNumber = Math.max(maxNumber,arr[i]);
        }
        System.out.println("Maximum element in given array is: " + maxNumber);
    }
    public static void main(String args[]){
        int marks[] = {2,8,90,87,99,3,-12};
        max(marks);
    }
}
