package Arrays;

public class InitilizationOfArray {
    public static void main(String[] args){

        // int [] arr = new int[7];     // default values are zero

        int [] arr = {10,20,30,40,50};
        int n = arr.length;

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
