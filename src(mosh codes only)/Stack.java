import java.util.Arrays;

public class Stack {
    // Basically we will be going to implement the stacks using array
    // where below methods should be there
    //push
    //pop
    //peek
    //isEmpty
    private int count;
    int [] items = new int[5];// stack size limit 5
    public void push(int item){
        if (count==items.length)
            throw new StackOverflowError();

        items[count++]=item;
    }
    public int peek(){
        if(count==0)
            throw new IllegalStateException();
        return items[count-1];// cause top er value count er cheye 1 kom
        //kenona item add hoye count er value 1 bere jabe but last item jeta
        // stack e add hoise seta toh count - 1 ei thakbe
    }
    public int pop(){
        if(count==0)
            throw new IllegalStateException();

        return items[--count];// cause top er value count er cheye 1 kom
    }
    public boolean isEmpty(){
        return count==0;
    }
    @Override
    public String toString(){
        var contents = Arrays.copyOfRange(items,0,count);// eikhane count porjonto joto gula items ase seigula copy holo
       return Arrays.toString(contents);
    }
}
