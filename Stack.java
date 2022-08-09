import java.io.*;
class Stack
{
    int arr [] , top , cap;
    Stack(int size)
    {
        arr = new int[size];
        top = -1;
        cap = size;
    }
    void push(int n)
    {
        if(top == cap - 1)
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        else
        {
            System.out.println("Inserting Element :" + n);
            arr[++top] = n;
        }

    }
    int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        
            return arr[top--];
        
    }
    int Stacksize()
    {
        return top + 1 ;
    }
    void display()
    {
        for(int i = 0; i <= top; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the stack :");
        int n = Integer.parseInt(br.readLine());
        Stack st = new Stack(n);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("The size of the Stack is :");
        st.display();
        st.pop();
        System.out.println("Stack after poping the elements :");
        st.display();

    }
}