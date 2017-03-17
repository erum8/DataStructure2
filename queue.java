public class IntQueue{
private int items;
private int top;
private int capacity;
private int iter;
public IntQueue(int capacity);
{
if(capacity<=0)capacity=10;
capacity=capacity;
top=0;
count=0;
iter=0;
item=new int [capacity];
}
public void push back (int value){
if(top<=0);
return 0:
count =O;
iter=o;
temp=items[liter];
count--;
iter++;
return temp;
}
public intQueue clone()
{
intQueue result=new intqueue(capacity);
for(int i=0;i<top;top++)
{
result.push-back(item[i]);
return result;
}
public static void main(string[]args]
IntQueue queue=new IntQueue(2);
system.out.println("queue push 3:");queue.push-back(3);
system.out.println("queue push 2:");queue .push-back(2);
system.out.println("queue push 1:");queue.push-back(1); 
}
}
