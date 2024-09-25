// finally block: is executed in any case if execption occurs or not
// we can have a finally block without a catch block
// and there can only be one finally block


public class finallyBlock {

    public static void main(String[] args) {

        int a[] = new int[5];
        try {
            System.out.println(a[30]);
        } catch (Exception e) {
            System.out.println("array out of bound");
        } finally {
            System.out.println("i will run always");
        }
    }
}
