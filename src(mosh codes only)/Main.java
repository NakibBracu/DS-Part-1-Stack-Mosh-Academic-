import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Stack <Integer> stack = new Stack<>();
//        stack.push(10);// [10] -> top -> 10
//        stack.push(20);// [10,20] -> top -> 20
//        stack.push(30);// [10,20,30] -> top -> 30
//        System.out.println(stack);
//        var pop = stack.pop();// pop store 30 as 30 is in the top of the stack
//        System.out.println(pop);
//        System.out.println(stack);// [10, 20] -> top -> 20
//        stack.pop(); // 20 will be popped as 20 is in the top
//        System.out.println(stack.peek()); // it will return the top value without removing any items form stack.
//          StringReverser s = new StringReverser();
//          var reverse = s.reverse("hsedalgnaB");
        //       System.out.println(reverse);
        // exp for isBalanced method 1
//        Expression exp = new Expression();
//        var input = sc.next();
//        var result = exp.isBalanced(input);
//        System.out.println(result);
        // exp1 for isBalanced method 2

//        Expression exp1 = new Expression();
//      var input1 = sc.next();
//        var result1 = exp1.isBalanced2(input1);
//        System.out.println(result1);
//exp2 for isBalanced method 3
//        Expression exp2 = new Expression();
//        var input2 = sc.next();
//        var result2 = exp2.isBalanced3(input2);
//        System.out.println(result2);
//        Stack test = new Stack();
//        test.push(10);
//        test.push(20);
//        test.push(30);
//        System.out.println(test);;
//        System.out.println(test.pop());// 30 pop hobe kenoa 30 last e asche
//        System.out.println(test);
//        System.out.println(test.peek());
//        System.out.println(test.isEmpty());
        TwoStacks s1 = new TwoStacks(5);
        s1.push1(10);// to push in the first stack
        s1.push2(20); // to push in the second stack
        System.out.println(s1);
        s1.pop1();
        System.out.println(s1);
        s1.pop2();
        System.out.println(s1);
        s1.isEmpty1();
        s1.isEmpty2();
        s1.isFull1();
        s1.isFull2();
    }
}