public class listStack implements stack{
    Node head;
    public listStack(){
    head = null;
    }
    public  void push(Object e){
        Node n = new Node(e,head);
        head = n;//list e jehetu array er moton random access nai tai kono Node create kore
//first e tar next e head ke raksi then jei node create korlam setakei head banacci
// ate kore efficient way te jokon pop korbo ba peek korbo tate just head e khujlei kam sesh
        
    }
    public  Object peek(){
        if(head==null){
            System.out.println("Stack underflow");
            return null;
        }
        return head.element;
    }
    public  Object pop(){
        if(head==null){
            System.out.println("Stack underflow");
            return null;
        }
        Node remove = head;//head er element top e ase tai otake ekta node e nilam
        head = head.next;//head update kore dite hobe kenona head remove hoye head.next head hobe
        remove.next = null;//garbage collector
        
        return remove.element;
    }
}