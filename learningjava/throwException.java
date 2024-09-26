import java.util.*;

public class throwException {

    public void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");

        try {
            int age = sc.nextInt();
            if (age > 100) {
                throw new MyException("My error!!");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }

    class MyException extends Exception {

        public MyException(String message) {
            super(message);
        }
    }
}
