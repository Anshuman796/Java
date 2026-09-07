package ExceptionHandling;

public class ThrowsKeyword {
    public  static int Change(int [] brr) throws ArrayIndexOutOfBoundsException{
        return brr[8]=100;
    }                      // throws keyword give warning that this function can give Exception
    public static void main(String[] args){
        int [] arr = new int[5];

        System.out.println(arr[2]);
        
        try{
            Change(arr);
            System.out.print(arr[8]);
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}
