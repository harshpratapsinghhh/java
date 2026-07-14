public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reverse Array: ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int arr[], int start, int end){
        // int start = 0;
        // int end = arr.length-1;
        while(start < end){
            int tmp = arr[start];

            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }
    }
}