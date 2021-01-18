import java.util.Stack;

public class StringReverser {
    // We can use stack DS to reverse a String Cause it is LIFO Structured
    public String reverse(String input){
        if (input==null)
            throw new IllegalArgumentException();
        Stack<Character> stack2 = new Stack<>();
        /* One Way using traditional For loop
        for(int i=0;i<input.length();i++)
        stack2.push(input.charAt(i));
        * */
        //but for each loop is better and tricky
        for(char ch : input.toCharArray()){//input.toCharArray() is written cause in java for each loop we can't iterate through String thats why first we make it in chararry
            stack2.push(ch);
        }
        // Now half of the operation is done just left popping the elements from stacks
        // But if we declare a String var and everytime concatanating it with new characters
        // it will become a more time consuming cause in JAVA String is immutable
        // That means we can't directly manipulate the String using same memory
        // Every time String changes new memory will be allocated for the same operations
        // So we can use StringBuffer class . It is best for String Manipulation when too much string manipulation is needed
        StringBuffer reversed = new StringBuffer();
        while(!stack2.empty())// all characters will be popped and string will be reversed
            reversed.append(stack2.pop());// all charactes popped doing like concatanation but in same memory. Memory is saved now.
        return reversed.toString();// charecter converted to String and then returned
    }
}
