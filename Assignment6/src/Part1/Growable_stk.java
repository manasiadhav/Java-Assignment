package Part1;
import java.util.ArrayList;
import java.util.List;
public class Growable_stk implements Interface_STK{
    private List<Integer> stack;

    public Growable_stk() {
        this.stack = new ArrayList<>();
    }


    @Override
    public void push(int element) {
        stack.add(element);
    }

    @Override
    public int pop() {
        if (isUnderflow()) {
            System.out.println("Stack is empty!");
            return 0;
        } else {
            int element = stack.remove(stack.size() - 1);
            return element;
        }
    }

    @Override
    public void displayStack() {
        if (isUnderflow())
            System.out.println("Stack is empty!");
        else
            for (int element : stack) {
                System.out.println(element);
            }
    }

    @Override
    public boolean isOverflow() {
        return false;
    }

    @Override
    public boolean isUnderflow() {
        return stack.isEmpty();
    }
}
