package mypack1;

interface MyLambdas
{
    //public void display(String str);
    public int add(int x,int y);
}

public class LamdaDemo1 {

    public static void main(String[] args) {
      
        /*MyLambda m=(s)->{System.out.println(s);};
        m.display("Hello World");*/
        
        /*MyLambda m=(a,b)->{return a+b;};
        System.out.println(m.add(20,30));*/
        
        MyLambdas m=(a,b)->a+b;
        int r=m.add(20, 30);
        System.out.println(r);
    }
    
}