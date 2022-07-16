class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        if(s1.empty()){
            return -1;
        }
	 while(!s1.isEmpty()){
	     s2.push(s1.pop());//push all the elements two stack 2 and top element of stack two will be our first element of stack1 also of queue
	 }
	 int ans = s2.pop();
	 while(!s2.isEmpty()){
	    s1.push(s2.pop());
	 }
	 return ans;
    }
    
}
