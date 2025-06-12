/*
capacity : 4
pushed 
"apple"
"orange"
"banana"
"mango"

*/

public class Stack_49
{
    String st[]=new String[50];
    int size,top,ctr,f;
    public Stack_49(int cap)
    {
        size=cap;
        f=0;
        top=-1;
        st=new String[size];
    }

    public void pushname(String n)
    {
        if(top< size)
        {
            top=top+1;
            st[top]=n;
        }
        else
        {
            System.out.println("OVERFLOW");
        }
    }

    public String popname()
    {
        String v;
        if(top>=0)
        {
            top=top-1;
            v=st[top];
            return v;
        }
        else
        {
            System.out.println("UNDERFLOW");
            return " ";
        }
    }

    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(st[i]);
        }
    }
}
