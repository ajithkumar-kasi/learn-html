
public class insertelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[10];
		a[0]=1;
		a[1]=3;
		a[2]=6;
		a[3]=43;
		a[4]=5;
		a[5]=8;
		
		int n=6;
		
		for(int i=0;i<n;i++)
		
			System.out.print(a[i]+" ");
			System.out.println("");
		
		
		int x=34;
		int index=4;
		for(int i=n;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=x;
		
		for(int i=0;i<a.length;i++)
		
			System.out.print(a[i]+" ");
		    System.out.println("");
		}
		
		
		
	}


