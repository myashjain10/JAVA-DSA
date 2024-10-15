import java.util.Stack;

public class minStack {
    Stack<Integer> minEle;
    Stack<Integer> s;
    
    // Constructor    
    public void minStack()
	{
        this.minEle = new Stack<>();
	    this.s = new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    if(minEle.isEmpty()) return -1;
	    
	    return minEle.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	    if(s.isEmpty()) return -1;
	    
	    int num = s.pop();
	    if(num == minEle.peek()){
	        minEle.pop();
	    }
	    
	    return num;
    }

    /*push element x into the stack*/
    void push(int value)
    {
	// Your code here	
	    s.push(value);
	    
	    if(minEle.isEmpty() || value <= minEle.peek()){
	        minEle.push(value);
	    }
    }
}
