//throws: is used to throw an exception manually
// it is used to warn the programmer that this program may 
// throw a particular kind of exception
// this is used in development



public class throwsException {
    // function for example of throws keyword
    
    static int getNumber(int arr[]) throws ArithmeticException {
        return arr[8];
    }
    
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        try {
            getNumber(arr);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
