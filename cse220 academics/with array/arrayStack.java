public class arrayStack implements stack{
Object a[];
int size;
public arrayStack(){
a = new Object[5];
}
public  void push(Object e){
    if(size==a.length){
    System.out.println("Stack OverFlow Exception!!");
    return;//this returns nothing
    }
    a[size] = e;
    size++;
}
public  Object peek(){
    if(size==0){
    System.out.println("Stack Underflow Exception!!");
    return null;
    }
    Object val = a[size-1];
    return val;//top element [size-1] index ei thake sob somoi
}
public Object pop(){
if(size==0){
    System.out.println("Stack Underflow Exception!!");
    return null;
    }
Object val = a[size-1];
a[size-1]=null;//elementta stack theke delete korlam
size--;
return val;//top element [size-1] index ei thake sob somoi
}
}