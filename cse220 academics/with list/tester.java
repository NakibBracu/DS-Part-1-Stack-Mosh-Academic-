public class tester{
    public static void main(String [] args){
    listStack a1 = new listStack();
    a1.push(10);
    a1.push(20);
    a1.push(30);
    System.out.println(a1.peek());
    System.out.println(a1.pop());
    System.out.println(a1.peek());
    }
}