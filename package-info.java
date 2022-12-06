
package mypack1;


class Demo1
{
    int a=10;
    //private.
    public int b=20;
    protected int c=30;
    public int d=40;
    
    public void display()
    {
        System.out.println(a+b+c+d);
    }
}


public class MyPack1 {

    
    public static void main(String[] args) 
    {
      Demo1 d1=new Demo1();
      d1.display();
      System.out.println(d1.a+d1.b+d1.c+d1.d);
      
    }
    
}