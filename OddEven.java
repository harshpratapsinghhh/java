public class OddEven {
    public static void main(String[] args) {
        int arr[] = {2,7,8,5,4,9,10};
        int even = 0,odd = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        // Prints no. of even or odd element in array
        
        System.out.println("No. of Even: "+even);
        System.out.println("No. of Odd: "+odd);
    }
}
