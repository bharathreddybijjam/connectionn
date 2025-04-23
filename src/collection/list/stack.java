package collection.list;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);           // [A, B, C]
        System.out.println(stack.peek());    // C
        System.out.println(stack.pop());     // C
        System.out.println(stack);           // [A, B]
        System.out.println(stack.empty());   // false
        System.out.println(stack.search("A")); // 2 (from top)
    }

}



    

