package Array;

public class Reverse {
    public static void print(int arr[]){
        for(int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void reverse(int arr[]){
        int temp;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            //swap arr[i] with arr[j]
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int marks[] = {2,4,6,8,10};
        print(marks);
        reverse(marks);
        print(marks);
    }
}
