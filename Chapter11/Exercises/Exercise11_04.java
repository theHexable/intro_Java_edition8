package Chapter11.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 11.4
 * @Title Implementing MyStack using inheritance
 */
public class Exercise11_04 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 strings... ");
        for (int i = 0; i < 5; i++) {
            stack.push(scan.next());
        }
        System.out.println("Displaying them in reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}

class MyStack extends ArrayList<Object> {

    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }

}
